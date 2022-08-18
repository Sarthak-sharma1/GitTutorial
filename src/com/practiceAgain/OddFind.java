package com.practiceAgain;

import java.util.Scanner;

public class OddFind {

	public static void main(String[] args) {
		int n,t;
		while(true) {
		System.out.println("Enter any Number..");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
	if(n%2==1) {
		System.out.println("Odd no");
	}
	else {
		System.out.println("Even no..");
	}
	System.out.println("Enter any number of term..");
	t=sc.nextInt();
	   for(int i=1;i<=t;i=i+2) {
		   System.out.println(i);
	   }
			
		}		
		

	}

}
