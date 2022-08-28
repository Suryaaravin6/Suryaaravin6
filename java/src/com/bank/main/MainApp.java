package com.bank.main;
import com.bank.exception.InvalidDataException;
import com.bank.model.Account;
import com.bank.model.Customer;
import com.bank.service.*;
import java.util.Scanner;
import java.util.*;

public class MainApp {
	public void launchApp() throws InvalidDataException{
		Customer cust=new Customer(45,"Arvind", 953343787,new ArrayList<Account>());
		while(true) {
		System.out.println("Enter your choice");
		System.out.println("1.addNewAccount");
		System.out.println("2.display");
		System.out.println("3.writeSet");
		System.out.println("4.populateSet");
		System.out.println("5.printCustomer");
		Scanner sc=new Scanner(System.in);
		BankServiceImpl obj=new BankServiceImpl();
		int ch=sc.nextInt();
		switch(ch) {
		case 1:System.out.println("Enter account number:");
			   String ano=sc.next();
			   System.out.println("Enter account balance:");
			   double ab=sc.nextDouble();
			   System.out.println("Enter check book status:");
			   String cbs=sc.next();
			   Account acct=new Account(ano,ab,cbs);
			   obj.addNewAccount(cust,acct);
			   break;
		case 2:obj.display(cust);
			   break;
		case 3:obj.writeSet(cust);
		   break;
		case 4:obj.populateSet(cust);
		   break;
		case 5:obj.printCustomer(cust);
		   break;
		}
		}
	}
	public static void main(String args[]) {
		MainApp ma=new MainApp();
		try {
		ma.launchApp();
		}
		catch(InvalidDataException e) {
			System.out.println(e);
		}
	}
}