package com.yedil.kchess.data.entity;

import com.diasonti.descriptiontinder.data.enums.MatchType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MmMatch.class)
public abstract class MmMatch_ extends BaseEntity_ {

	public static volatile SingularAttribute<MmMatch, LocalDateTime> createdAt;
	public static volatile SingularAttribute<MmMatch, UserAccount> firstUser;
	public static volatile SingularAttribute<MmMatch, MmChoice> firstUserChoice;
	public static volatile SingularAttribute<MmMatch, MmChoice> secondUserChoice;
	public static volatile ListAttribute<MmMatch, ChatMessage> messages;
	public static volatile SingularAttribute<MmMatch, UserAccount> secondUser;
	public static volatile SingularAttribute<MmMatch, MatchType> type;

	public static final String CREATED_AT = "createdAt";
	public static final String FIRST_USER = "firstUser";
	public static final String FIRST_USER_CHOICE = "firstUserChoice";
	public static final String SECOND_USER_CHOICE = "secondUserChoice";
	public static final String MESSAGES = "messages";
	public static final String SECOND_USER = "secondUser";
	public static final String TYPE = "type";

}

