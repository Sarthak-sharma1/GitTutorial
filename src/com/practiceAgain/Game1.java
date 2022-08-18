package com.practiceAgain;

import java.util.Random;
import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {
		// 0 for rock , 1 for paper , 2 for scissor
		System.out.println(" 0 for rock , 1 for paper , 2 for scissor");
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		
		Random r = new Random();
		int compInput = r.nextInt(3);
		
		if(userInput  ==0 && compInput == 2 || userInput == 1 && compInput == 0 || userInput == 2 && compInput  == 1) {
          System.out.println("You Win..");			
		}
		else {
			System.out.println("you lose.");
		}
		
		if(compInput == 0) 
			System.out.println("computerChoice : Rock");
		else if (compInput == 1) {
			System.out.println("computerChoice : Paper");
		}
		else {
			System.out.println("ComputerChoice: Scissor");
		}

	}

}
