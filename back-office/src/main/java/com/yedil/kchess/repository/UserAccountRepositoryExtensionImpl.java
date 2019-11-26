package com.yedil.kchess.repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UserAccountRepositoryExtensionImpl implements UserAccountRepositoryExtension {

    @PersistenceContext
    private EntityManager entityManager;


}
