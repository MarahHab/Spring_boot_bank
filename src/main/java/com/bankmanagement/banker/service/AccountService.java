package com.bankmanagement.banker.service;

import com.bankmanagement.banker.model.Account;
import com.bankmanagement.banker.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    private final AccountRepo accountRepo;
    @Autowired
    public AccountService(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }
    // --> create new account
    public String createNewAccount(){
        Account user = new Account("28953", "Marah", 240.30);
        Account save = accountRepo.save(user);
        return save.toString();
    }

    // --> Retrieve all accounts
    public List<Account> getAllAccounts(){
        return accountRepo.findAll();
    }

    // --> Retrieve Account Information by ID
    public Optional<Account> getAccountById(String id) {
            return accountRepo.findById(id);
    }
}
