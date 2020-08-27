/* logservice.c -- implementation of the log service */
#include "logservice.h"
#include <errno.h>

int logServiceInit()
{
	int id;
	int fileRight = 0666;
	/* TODO: connect to message queue here */
	id = msgget(KEY, fileRight);
	// create a new mq or open an exist mq
	// successed: return mq describing number, failed: return -1
	if (id == -1) {
    	printf ("\nThe msgget call failed, error number = %d\n", errno);
		return id;
	}
	printf("open message queue on %d\n", id);
	return id;

}

int logMessage(int serviceId,char *message)
{
	if (message == NULL) {
		printf("No message sent... exit");
		exit(-1);
	}
	int rv;
	struct message msg;
	/* TODO: Validate message length here */
	int msg_len = 0;
	size_t msg_size;
	int copyIdx = 0;

	memset(msg.message, 0, MSG_NOERROR + 1);
	if (strlen(message) > MSG_NOERROR) {
		copyIdx = MSG_NOERROR;
	} else {
		copyIdx = strlen(message) + 1;
	}

	strncpy(msg.message, message, copyIdx);

	/* TODO: Send the message */
	msg.type = getpid();
	rv = msgsnd(serviceId, &msg, strlen(msg.message), 0);
	if (rv == -1) {
		fprintf(stderr,"Msgsnd failed!\n");
		exit(-1);
	}

	printf("The message is \"%s\"\n", message);	
	return rv;
}
