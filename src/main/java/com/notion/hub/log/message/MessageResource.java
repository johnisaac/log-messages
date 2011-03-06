package com.notion.hub.log.message;

import org.restlet.data.MediaType;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import com.notion.hub.log.message.hbase.HBaseMessage;

public class MessageResource extends ServerResource {
	
	@Override
	public void doInit() {
		super.doInit();
		//XXX any configuration to be done before hand ,like accessing
		//the HBASE tables.
	}
	@Post
	public void logMessage(HBaseMessage message) {
		//XXX TODO write to HBase
	}
	
	@Get
	public Representation send() {
		return new StringRepresentation("success",MediaType.TEXT_PLAIN);
	}
}
