package com.bankmanagement.banker.service;

import com.bankmanagement.banker.model.Account;
import com.bankmanagement.banker.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

    private final AccountRepo accountRepo;
    @Autowired
    public AccountService(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }

    List<Account> accounts = new ArrayList<Account>();

    public AccountService(AccountRepo accountRepo, List<Account> accounts) {
        this.accountRepo = accountRepo;
        this.accounts = accounts;
        Account newAccount1 = new Account("256984","Mhmd",100.0);
        Account newAccount3 = new Account("524874","John",460.0);
        Account newAccount2 = new Account("125423","Marah",900.0);
        Account newAccount4 = new Account("956324","Alex",215.2);
        accounts.add(newAccount1);
        accounts.add(newAccount2);
        accounts.add(newAccount3);
        accounts.add(newAccount4);
    }

    public String Hello(){
        Account mhmd = new Account("256984", "Mhmd", 100.0);
        accountRepo.save(mhmd);
        return accounts.toString();
    }



}
