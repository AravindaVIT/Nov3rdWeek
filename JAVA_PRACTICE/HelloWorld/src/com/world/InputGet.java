package com.world;
import java.util.Scanner;
public class InputGet {
//	public static void main(String[] args) {
//		Scanner s= new Scanner(System.in);
//		System.out.println("enter word: ");
//		String w=s.next();
//		System.out.println("word is: " + w);
//		System.out.println("int: ");
//		int i=s.nextInt();
//		System.out.println("int is: " +i);
//	}
//
//}
// doesnt allw space btw strings,not more than 9 numbers
    public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter word: ");
		int w=s.nextInt();
		System.out.println("word is: " + w);
		System.out.println("int: ");
		int i=s.nextInt();
		System.out.println("int is: " +i);
		System.out.println(i+w);
	}

}