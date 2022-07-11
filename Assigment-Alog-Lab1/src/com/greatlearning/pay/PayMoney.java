package com.greatlearning.pay;

import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) throws Exception {
		int size = 0;
		int targetAmount, targetNumber;
		Scanner sc = new Scanner(System.in);

		// Accept the size of the array for screen
		System.out.println("Enter the total number of amount :");
		size = sc.nextInt();

		// Accept the amounts from the screen
		int[] amount = new int[size];
		System.out.println("Enter the values of the amounts :");
		for (int i = 0; i < size; i++) {
			amount[i] = sc.nextInt();
		}
		
		// Accept the size of the array for screen
		System.out.println("Enter the total no of targets that needs to be achieved :");
		targetNumber = sc.nextInt();

		
		
		while (targetNumber-- !=0) {
			int flag = 0;
			int sum = 0;
			// Accept the target amount from the screen
			System.out.println("Enter the value of target :");
			targetAmount = sc.nextInt();
	
			for (int i = 0; i < size; i++) {
				sum += amount[i];
				if (sum >= targetAmount) {
					flag = 1;
					System.out.println("Target acheived after " + (i+1) + " transaction");
					sum = 0;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("Given target is not achieved");
			}
		}

	}

}
	