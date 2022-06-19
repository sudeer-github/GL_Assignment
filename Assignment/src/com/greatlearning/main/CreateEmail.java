package com.greatlearning.main;
import com.greatlearning.model.EmployeeDetails;
import com.greatlearning.service.CredentialService;
import java.lang.System;
import java.util.Scanner;

public class CreateEmail {
	public static void main(String [] args) {
		char[] password = new char[8]; 
		String empEmail = new String();
		EmployeeDetails empDetails = new EmployeeDetails("Sudeer", "Kumar"); 
		CredentialService emailCred = new CredentialService();	
		Scanner sc = new Scanner(System.in);
		int option;
		do {
			System.out.println("Please enter the department from the following");
			System.out.println("==============================================");
			System.out.println(          "1. Technical"); 
			System.out.println(          "2. Admin");   
			System.out.println(          "3. Human Resource");
			System.out.println(          "4. Legal");
			System.out.println(          "0. Exit");
			System.out.println("==============================================");
			
			option = sc.nextInt();
			
			switch(option){
			
			case 1:
				empEmail = emailCred.createEmail(empDetails.getStrFirstName(), empDetails.getStrLastName(), "technical");
				break;
			case 2:
				empEmail = emailCred.createEmail(empDetails.getStrFirstName(), empDetails.getStrLastName(), "admin");
				break;
			case 3:
				empEmail = emailCred.createEmail(empDetails.getStrFirstName(), empDetails.getStrLastName(), "hr");
				break;
			case 4:
				empEmail = emailCred.createEmail(empDetails.getStrFirstName(), empDetails.getStrLastName(), "legal");
				break;
			case 0:
				break;	
			default:
				System.out.println("Please enter the valid option");
				break;
				
			} 
			if (option > 0 && option < 5) {
			password = emailCred.generatePassword();
			emailCred.displayCredentials(empDetails, empEmail, password);
			}
		} while (option > 0);
								
	}

}
	
