package com.rays.StreamAPIProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SteamStartWithT {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Tkh", "Tkjh", "Ahgvh", "Njgj");

		list.stream().filter(e -> e.startsWith("T")).distinct().sorted().forEach(System.out::println);

	}

}
