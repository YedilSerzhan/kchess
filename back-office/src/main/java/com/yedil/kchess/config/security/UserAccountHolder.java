package com.yedil.kchess.config.security;

import com.yedil.kchess.data.entity.UserAccount;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class UserAccountHolder {

    public static UserAccount getCurrentUser() {
        UserAccount userAccount = null;
        final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            final TinderUser user = (TinderUser) authentication.getPrincipal();
            userAccount = user.getUserAccount();
        }
        return userAccount;
    }

    public static Long getCurrentUserId() {
        final UserAccount user = UserAccountHolder.getCurrentUser();
        return user != null ? user.getId() : null;
    }

}
