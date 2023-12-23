package com.rays.exceptionProgram;

public class TestBank {

	public static void main(String[] args) {

		Bank b = new Bank();

		b.setBalance(1000);
		b.deposite(4000);
		System.out.println("amount is deposited");

		try {
			b.withdraw(2000);
			System.out.println(b.getBalance());
		} catch (BankException e) {
			System.out.println(e.getMessage());
		}

	}

}
