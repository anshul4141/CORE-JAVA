package com.rays.exceptionProgram;

public class TestCustomLoginEx {

	public static void main(String[] args) throws LoginException {

		String loginId = "Anshul";

		if (loginId == null || loginId != "Anshul") {

			throw new LoginException();

		}

		else {
			System.out.println("Login Sucessfully");
		}

	}

}
