package com.notion.hub.log.message.hbase.factory;

import java.util.UUID;

import com.notion.hub.log.message.hbase.HBaseMessage;

public interface IHBaseMessageFactory {

	HBaseMessage createMessage(String type,String userId);
	HBaseMessage createMessage(UUID messageId, String type, String userId);
}
