package com.bank.model;


import com.bank.exception.InvalidDataException;

public class Account{
	private String accountNumber;
	private double accountBalance;
	private String checkBookStatus;
	public Account(String accountNumber, double accountBalance, String checkBookStatus) {
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.checkBookStatus = checkBookStatus;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) throws InvalidDataException{
		if(accountNumber.startsWith("ACC")) {
			this.accountNumber = accountNumber;
		}
		else {
			throw new InvalidDataException(); 
		}
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) throws InvalidDataException{
		if(accountBalance>1000) {
			this.accountBalance = accountBalance;
		}
		else {
			throw new InvalidDataException();
		}

	}
	public String getCheckBookStatus() {
		return checkBookStatus;
	}
	public void setCheckBookStatus(String checkBookStatus) throws InvalidDataException{
		if(checkBookStatus=="Yes" || checkBookStatus=="No") {
			this.checkBookStatus = checkBookStatus;
		}
		else {
			throw new InvalidDataException();
		}
	}





}