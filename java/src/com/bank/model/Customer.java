package com.bank.model;


import java.util.*;

public class Customer {
	private int custNo;
	private String custName;
	private int custPhone;
	private ArrayList<Account> account;
	
	public Customer(int custNo, String custName, int custPhone, ArrayList<Account> account) {
		this.custNo = custNo;
		this.custName = custName;
		this.custPhone = custPhone;
		this.account=account;
	}
	public int getCustNo() {
		return custNo;
	}
	public String getCustName() {
		return custName;
	}
	public int getCustPhone() {
		return custPhone;
	}
	public void setAccount(ArrayList<Account> account) {
		this.account = account;
	}
	public ArrayList<Account> getAccount() {
		return account;
	}
	
}