package com.bankmanagement.banker.accountController;

import com.bankmanagement.banker.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    // endpoint testing that all work well
    @GetMapping
    public String hello() {
        return accountService.Hello();
    }
}
