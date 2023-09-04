package com.bankmanagement.banker.accountController;

import com.bankmanagement.banker.model.Account;
import com.bankmanagement.banker.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {

    private final AccountService accountService;
    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    // endpoint testing that all work well
    @GetMapping
    public String hello() {
        return accountService.Hello();
    }

    @GetMapping("/return-all-accounts")
    public List<Account> returnAllAccounts(){
        //  TO DO
        return null;
    }
    @PutMapping("/update-account/{id}")
    public String updateAccount(){
        // TO DO
        return "Account details updated successfully";
    }
    @GetMapping("/check-account/{id}")
    public String getAccountDetails(){
        // TO DO
        return "Account details fetched successfully";
    }

}
