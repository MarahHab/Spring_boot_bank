package com.bankmanagement.banker.accountController;

import com.bankmanagement.banker.model.Account;
import com.bankmanagement.banker.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {

    private final AccountService accountService;

    // dependency injection
    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    // endpoint in order to create new account
    @PostMapping
    public String createNewAccount() {
        return accountService.createNewAccount();
    }

    // endpoint to fetch all accounts
    @GetMapping("/return-all-accounts")
    public List<Account> returnAllAccounts() {
        //  TO DO  , Retrieve all accounts
        return accountService.getAllAccounts();
    }

    // endpoint to update account details
    @PutMapping("/update-account/{id}")
    public String updateAccount() {
        // TO DO
        return "Account details updated successfully";
    }

    // endpoint to check account status
    @GetMapping("/check-account/{id}")
    public ResponseEntity<Account> getAccountDetails(@PathVariable String id) {
        // TO DO
        Optional<Account> optionalAccount=accountService.getAccountById(id);
        if(optionalAccount.isPresent()){
            Account account=optionalAccount.get();
            return ResponseEntity.ok(account);
        }
        else{
            return ResponseEntity.notFound().build();
        }
       // return "Account details fetched successfully";
    }
}
