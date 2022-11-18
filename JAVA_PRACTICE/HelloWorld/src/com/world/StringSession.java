package com.world;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSession {
	public static void main(String[] args) {
//		System.out.println();
		String s="this is a string ";
		System.out.println(s.length());
		System.out.println(s.contains("n"));
		System.out.println(s.isEmpty());
		System.out.println(s.trim());
		System.out.println(s.strip());
		System.out.println(s.replace("i", "I"));
		System.out.println(Arrays.toString(s.toCharArray()));
		System.out.println(Arrays.toString(s.split("i")));
		
		String k="this is a %s string ";
		String a="formatted";
		String n=String.format(k, a);
		System.out.println(n);
	}
//	public static void main(String[] args) {
//		String gmails= "[a-zA-Z-\\d]+@gmail\\.com";
//		Pattern p = Pattern.compile(gmails);
//		String sample1="Some rand cont gmail address" + "like this some-email@gamil.com. hgfhgfg";
//		Matcher m= p.matcher(sample1);
//		m.find();
//		String gmaila=m.group();
//		System.out.println(gmaila);
//		
//		String sample2 = "kgjg.Yes? ok!";
//		String[] sentences = sample2.split("[\\.!?");
//		System.out.println(Arrays.toString(sentences));
//		
//	}
}
