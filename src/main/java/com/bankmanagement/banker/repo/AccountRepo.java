package com.bankmanagement.banker.repo;

import com.bankmanagement.banker.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepo extends MongoRepository<Account,String> {
}
