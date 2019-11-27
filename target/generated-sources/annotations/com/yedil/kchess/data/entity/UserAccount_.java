package com.yedil.kchess.data.entity;

import com.yedil.kchess.data.enums.UserRole;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserAccount.class)
public abstract class UserAccount_ extends com.yedil.kchess.data.entity.BaseEntity_ {

	public static volatile SingularAttribute<UserAccount, String> password;
	public static volatile SingularAttribute<UserAccount, UserRole> role;
	public static volatile SingularAttribute<UserAccount, String> username;

	public static final String PASSWORD = "password";
	public static final String ROLE = "role";
	public static final String USERNAME = "username";

}

