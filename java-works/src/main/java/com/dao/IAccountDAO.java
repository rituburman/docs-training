package com.dao;

import com.beans.Account;

public interface IAccountDAO {
public boolean createAcc(Account account);
public double checkBalance(String accNo);
public String withdraw(double amount, String accNo);
public String deposit(double amount, String accNo);
public Account getAccount(String accNo);

}
