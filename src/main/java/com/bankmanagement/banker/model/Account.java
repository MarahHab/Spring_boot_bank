package com.bankmanagement.banker.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="account")
public class Account {
    @Id
    private String accNo;
    private String custName;
    private Double balance;

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Account(String accNo, String custName, Double balance) {
        this.accNo = accNo;
        this.custName = custName;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "AccNo='" + accNo + '\'' +
                ", custName='" + custName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
