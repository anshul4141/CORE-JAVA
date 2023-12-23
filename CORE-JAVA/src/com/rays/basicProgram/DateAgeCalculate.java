package com.rays.basicProgram;

import java.time.LocalDate;
import java.time.Period;

public class DateAgeCalculate {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();

		LocalDate empBiryth = LocalDate.of(2002, 01, 25);

		Period p = Period.between(empBiryth, today);

		System.out.println("employe age : " + p.getYears());

	}

}
