package com.yedil.kchess.data.entity;

import com.diasonti.descriptiontinder.data.enums.MatchmakingDecision;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MmChoice.class)
public abstract class MmChoice_ extends BaseEntity_ {

	public static volatile SingularAttribute<MmChoice, MatchmakingDecision> decision;
	public static volatile SingularAttribute<MmChoice, UserAccount> source;
	public static volatile SingularAttribute<MmChoice, UserAccount> target;

	public static final String DECISION = "decision";
	public static final String SOURCE = "source";
	public static final String TARGET = "target";

}

