package com.notion.hub.log.message;

import org.restlet.Component;
import org.restlet.Server;
import org.restlet.data.Protocol;

public class Driver {

	public static void main(String args[]) throws Exception {
		if(args.length < 0) {
			throw new IllegalArgumentException("Port number of service not provided");
		}
		int port = Integer.valueOf(args[0]);
		Server server = new Server(Protocol.HTTP,port,new LogService());
		
		Component component = new Component();
		component.getServers().add(server);
		component.start();
		while(!component.isStopped()) {
			Thread.sleep(1000);
		}
		
		
	}
}
