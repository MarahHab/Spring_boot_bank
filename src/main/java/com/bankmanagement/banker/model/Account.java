package com.bankmanagement.banker.model;

public class Account {
    private String AccNo ;
    private String custName;
    private Double balance;

    public String getAccNo() {
        return AccNo;
    }

    public void setAccNo(String accNo) {
        AccNo = accNo;
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
        AccNo = accNo;
        this.custName = custName;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "AccNo='" + AccNo + '\'' +
                ", custName='" + custName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
