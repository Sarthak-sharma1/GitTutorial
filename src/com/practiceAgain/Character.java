package com.practiceAgain;

import java.util.Scanner;

public class Character {

	public static void main(String[] args) {
		 char ch;
		 System.out.println("Enter any Character..");
		 Scanner sc  = new Scanner(System.in);
		 ch = sc.next().charAt(0);
		 System.out.println(ch);
		 if(ch=='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' || ch =='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U'){
			 System.out.println("Vowels");
		 }
		 else
			 System.out.println("consonant.");
		 

	}
	System.out.println("Sarthak");

}
