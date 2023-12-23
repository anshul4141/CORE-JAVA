package com.rays.oopProgram;

public class Account {

	double balance;

	public Account(double ammount) {
		this.balance = ammount;
	}

	public void deposite(double amt) {
		System.out.println("Total balance : " + balance);
		System.out.println("Deposite Amt : " + amt);
		balance += amt;
		System.out.println("Total Balance After Deposite : " + balance);
	}

	public void withdraw(double amt) {
		System.out.println("Total balance : " + balance);
		System.out.println("withdraw Amt : " + amt);
		balance -= amt;
		System.out.println("Total Balance After withdraw : " + balance);
	}

	public static void main(String[] args) {
		Account a = new Account(5000.0);
		a.deposite(1000.0);
		a.withdraw(500.0);
	}

}
