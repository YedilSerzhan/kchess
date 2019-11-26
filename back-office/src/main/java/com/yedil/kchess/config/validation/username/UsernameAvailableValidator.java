package com.yedil.kchess.config.validation.username;

import com.yedil.kchess.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UsernameAvailableValidator implements ConstraintValidator<UsernameAvailable, String> {

    @Autowired
    private UserAccountService userAccountService;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return userAccountService.isUsernameAvailable(value);
    }
}

