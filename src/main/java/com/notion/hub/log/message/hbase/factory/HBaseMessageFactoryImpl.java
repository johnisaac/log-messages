package com.notion.hub.log.message.hbase.factory;

import java.util.UUID;

/**
 * Factory for creation of HBaseMessages.
 */
import com.notion.hub.log.message.hbase.HBaseMessage;

public class HBaseMessageFactoryImpl implements IHBaseMessageFactory {

	public HBaseMessage createMessage(String type, String userId) {
		HBaseMessage message = this.createMessage(UUID.randomUUID(), type, userId);
		return message;

	}

	public HBaseMessage createMessage(UUID messageId, String type, String userId) {
		HBaseMessage message = new HBaseMessage(messageId, type, userId);
		return message;
	}

}
