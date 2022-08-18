package com.practiceAgain;

import java.util.Scanner;

public class Evenfind {

	public static void main(String[] args) {
		int n,t;
		System.out.println("Enter any Number..");
		try {
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			if(n%2==0) {
				System.out.println("Even no");
			}
			else
				System.out.println("Odd no..");
			
			System.out.println("Enter any term.");
			t=sc.nextInt();
			for(int i=0;i<=t;i=i+2) {
				System.out.println("Numbers are :"+ i);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
