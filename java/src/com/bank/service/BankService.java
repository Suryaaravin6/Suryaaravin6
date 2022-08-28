package com.bank.service;

import com.bank.model.Account;
import com.bank.model.Customer;

public interface BankService {
	

	void addNewAccount(Customer custo,Account acct);
	void display(Customer cust);
	void writeSet(Customer cust);
	void populateSet(Customer cust);
	void printCustomer(Customer cust);
}