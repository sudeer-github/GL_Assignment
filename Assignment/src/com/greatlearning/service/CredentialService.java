package com.greatlearning.service;
import java.util.Random;
import com.greatlearning.model.EmployeeDetails;

public class CredentialService {
   
	char[] password = new char[8];
    Random rnd = new Random(); 
	
    public char[] generatePassword() {
		String strUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String strLowerCase = "abcedfghijklmnopqrstuvwxyz";
		String strNumber = "1234567890";
		String strSplChr = "!@#$%^&*()-+";
		String strAllValues = strUpperCase+strLowerCase+strNumber+strSplChr;
		
		for (int i=0; i < 8; i++) {
			
		    password[i] = strAllValues.charAt(rnd.nextInt(strAllValues.length()));
		    
		}
		
		return password;
    }	
	
    public String createEmail(String strFirstName, String strLastname, String strDept) {
    	String empEmail = strFirstName + strLastname + "@" + strDept + ".xyz.com";  
    	return empEmail;
    }
    
    public void displayCredentials(EmployeeDetails empDetails, String empEmail, char[] password  ) {
    	String pass = new String(password);
    	System.out.println("Dear " + empDetails.getStrFirstName() + ", your generated credentials are as follow :");
        System.out.println("Email ---> " + empEmail);
        System.out.println("Password ---> " + pass);
        
    }
    
  }
