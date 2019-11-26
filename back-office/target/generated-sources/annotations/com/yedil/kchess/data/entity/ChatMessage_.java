package com.yedil.kchess.data.entity;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ChatMessage.class)
public abstract class ChatMessage_ extends BaseEntity_ {

	public static volatile SingularAttribute<ChatMessage, UserAccount> receiver;
	public static volatile SingularAttribute<ChatMessage, UserAccount> sender;
	public static volatile SingularAttribute<ChatMessage, MmMatch> match;
	public static volatile SingularAttribute<ChatMessage, LocalDateTime> sentAt;
	public static volatile SingularAttribute<ChatMessage, String> text;

	public static final String RECEIVER = "receiver";
	public static final String SENDER = "sender";
	public static final String MATCH = "match";
	public static final String SENT_AT = "sentAt";
	public static final String TEXT = "text";

}

