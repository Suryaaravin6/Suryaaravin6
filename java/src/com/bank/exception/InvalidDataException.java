package com.bank.exception;

public class InvalidDataException extends Exception{
	public String toString() {
		String str1="Account number should start with ACC";
		String str2="Account balance must be greater than 1000";
		String str3="Check book status should be either Yes or No";
		return str1+"\n"+str2+"\n"+str3;
	}
}
