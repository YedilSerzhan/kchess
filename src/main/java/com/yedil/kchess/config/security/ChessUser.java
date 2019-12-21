package com.yedil.kchess.config.security;

import com.yedil.kchess.data.entity.UserAccount;
import org.hibernate.engine.internal.CacheHelper;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collections;

public class ChessUser extends User {

    private final UserAccount userAccount;

    ChessUser(UserAccount userAccount) {
        super(userAccount.getUsername(), userAccount.getPassword(),
                Collections.singletonList(new SimpleGrantedAuthority(userAccount.getRole().name())));
        this.userAccount = userAccount;
    }

    //public Long getUserId(){return ;}

    public UserAccount getUserAccount() {
        return userAccount;
    }
}
