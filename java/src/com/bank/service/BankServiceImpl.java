package com.bank.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

import com.bank.model.*;



 public class BankServiceImpl implements BankService{
	public void addNewAccount(Customer cust, Account acct) {
		cust.getAccount().add(acct);
		System.out.println("Account added.");
	}
	
	@Override
	public void display(Customer cust) {
		for(Account acct:cust.getAccount()) {
			System.out.println(acct.getAccountNumber());
			System.out.println(acct.getAccountBalance());
			System.out.println(acct.getCheckBookStatus());
		}
		
	}
	
	@Override
	public void writeSet(Customer cust) {
		try {
		FileOutputStream fos=new FileOutputStream("collect.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(cust.getAccount());
		oos.flush();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public void populateSet(Customer cust) {
		try {
		FileInputStream fos=new FileInputStream("collect.txt");
		ObjectInputStream oos=new ObjectInputStream(fos);
		ArrayList<Account> acct=(ArrayList<Account>)oos.readObject();
		cust.setAccount(acct);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public void printCustomer(Customer cust) {
		System.out.println("Enter account no:");
		Scanner sc=new Scanner(System.in);
		String acc=sc.next();
		for(Account acct:cust.getAccount()) {
			if(acct.getAccountNumber().equals(acc)) {
			
				System.out.println(acct.getAccountBalance());
	
			}
		}
		
	}	
}