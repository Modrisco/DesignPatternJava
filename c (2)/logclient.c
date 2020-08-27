/* logclient.c -- implements a simple log service client */
#include "logservice.h"

int main(int argc,char **argv)
{
	int id;
	/* Check if arguments are present on command line */
	if (argc < 2)
	{
		fprintf(stderr, "Usage: %s message", argv[0]);
		exit(1);
	}
	
	/* connect to the log service */
	if(-1 == (id = logServiceInit()))
	{
		perror("Connecting to queue");
		exit(1);
	}
	
	/* log the message supplied on the command line */ 
	if(-1 == logMessage(id, argv[1]))
	{
		perror("Sending Message");
		exit(1);
	}

	return 0;
}

