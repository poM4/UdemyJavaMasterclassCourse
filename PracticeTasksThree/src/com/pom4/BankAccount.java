package com.pom4;

/*
Create a new class for a bank account
Create fields for the account number, balance, customer name, email and phone number.

Create getters and setters for each field
Create two additional methods
1. To allow the customer to deposit funds (this should increment the balance field).
2. To allow the customer to withdraw funds. This should deduct from the balance field,
but not allow the withdrawal to complete if their are insufficient funds.
You will want to create various code in the Main class (the one created by IntelliJ) to
confirm your code is working.
Add some System.out.println's in the two methods above as well.
*/

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public double increaseBalance(double increaseAmount) {
        double currentBalance = getBalance();
        balance = currentBalance + increaseAmount;
        return balance;
    }

    public double withdrawalBalance(double withdrawalAmount) {
        double currentBalance = getBalance();
        if (!insufficientBalanceCheck(currentBalance,withdrawalAmount)) {
            return -1;
        }
        balance = currentBalance - withdrawalAmount;
        return balance;
    }

    private boolean insufficientBalanceCheck(double currentBalance, double withdrawalAmount) {
        if (currentBalance-withdrawalAmount<0) {
            return false;
        }
        return true;
    }

}
