package com.notion.hub.log.message.hbase;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

import org.apache.hadoop.io.Writable;

public class HBaseMessage implements Writable {

	private Map<String, Object> attributes;
	private UUID messageId;

	private String type;

	private String userId;

	public HBaseMessage(UUID messageId, String type, String userId) {
		this.type = type;
		this.messageId = messageId;
		this.userId = userId;
	}

	/**
	 * @return the attributes
	 */
	public Map<String, Object> getAttributes() {
		return attributes;
	}

	/**
	 * @return the messageId
	 */
	public UUID getMessageId() {
		return messageId;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	public void readFields(DataInput dataInput) throws IOException {
		// XXX TODO reading from HBase
	}

	public void write(DataOutput dataOutput) throws IOException {
		// XXX TODO write from HBase

	}

}
