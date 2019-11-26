package com.yedil.kchess.controller.api;

import com.yedil.kchess.config.controller.BaseController;
import com.yedil.kchess.data.form.UserRegistrationForm;
import com.yedil.kchess.data.util.RestMessage;
import com.yedil.kchess.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/registration")
public class UserRegistrationController extends BaseController {

    private final UserAccountService registrationService;

    @Autowired
    public UserRegistrationController(UserAccountService registrationService) {
        this.registrationService = registrationService;
    }

    @GetMapping("/isUsernameAvailable")
    public RestMessage checkUsername(@RequestParam String username) {
        return RestMessage.ok(registrationService.isUsernameAvailable(username));
    }

    @PostMapping("/submit")
    public RestMessage register(@Valid UserRegistrationForm form, Errors errors) {
        if (errors.hasErrors()) {
            return RestMessage.error(getErrorMessages(errors));
        } else {
            registrationService.register(form);
            return RestMessage.ok();
        }
    }

}
