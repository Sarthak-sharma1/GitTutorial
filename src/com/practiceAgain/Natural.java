package com.practiceAgain;

import java.util.Scanner;

public class Natural {

	public static void main(String[] args) {
		int n,sum=0;
		System.out.println("Enter any natural no..");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			sum=sum+i;
			
		}
		System.out.println(sum);

	}

}
