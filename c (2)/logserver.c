/* logserver.c -- implementation of the log server */
#include <signal.h>
#include <errno.h>
#include "logservice.h"

int queue_id; /* stores queue_id for use in signal handler */

void handler(int sig);


int main()
{
	printf("Please make me useful!\n");
	// exit(0); /* delete this line once you start */
	int msgid, ret;
	// create a new mq or open an exist mq
	// successed: return mq describing number, failed: return -1
	msgid = msgget(KEY, IPC_CREAT | IPC_EXCL | 0666);
	struct message msg;
	/* TODO: initialise the message queue here */
	/* install signal handler to clean up queue
	 * do this after you have created the queue
	 * then you dont need to check if it is valid!
	 */
	signal(SIGINT, handler);
	
	if (msgid == -1) {
    	printf ("\nThe msgget call failed, error number = %d\n", errno);
		return -1;
	}

	while (1)
	{
		/* TODO: receive a message */
		memset(msg.message, 0, MSG_NOERROR + 1);
		/* TODO: display the message */
		if (ret == -1) {
			perror("msgrcv");
			break;
		}
		printf("Read from msgid = 1:%s \n",msg.message);
 	}
	return 0;
}


void handler(int sig)
{
	/* TODO: clean up the queue here */
	if (msgctl(sig, IPC_RMID, NULL) < 0) {
		perror(strerror(errno));
		printf("msgctl failed... ");
		exit(-1);
	}

	printf("Server stopped");
	exit(0);

}
