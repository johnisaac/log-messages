package com.notion.hub.log.message;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class LogService extends Application {
	
	private static final String LOG_URI = "/log";
	
	@Override
	public Restlet createInboundRoot() {
		Router router = new Router(getContext());
		router.attach(LOG_URI, MessageResource.class);
		return router;
	}
}
