package com.world;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
		String gmails= "[a-zA-Z-\\d]+@gmail\\.com";
		Pattern p = Pattern.compile(gmails);
		String sample1="hihihi" + "and araa-email@gmail.com. and";
		Matcher m= p.matcher(sample1);
		m.find();
		String gmaila=m.group();
		System.out.println(gmaila);
		
		String sample2 = "kgjg. Yes? ok!";
		String[] sentences = sample2.split("[\\.!?]");
		System.out.println(Arrays.toString(sentences));
		
		System.out.printf("%.1f%n", Math.PI);
		System.out.printf("%.2f%n", Math.PI);
		System.out.printf("%.3f%n", Math.PI);
		System.out.printf("%.4f%n", Math.PI);
		System.out.printf("%.5f%n", Math.PI);
	}
	 

}


