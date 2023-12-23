package com.rays.stringProgram;

public final class ImmutableClass {

	private final String account;
	private final int amount;

	ImmutableClass(String account, int amount) {

		this.account = account;
		this.amount = amount;

	}

	public String getAccount() {
		return account;

	}

	public int getAmount() {
		return amount;

	}

	public static void main(String[] args) {
		ImmutableClass im = new ImmutableClass("kosik004bamk", 4000);
		System.out.println(im.getAccount());
		System.out.println(im.getAmount());
	}

}
