package com.gl.q1.driver;
import java.util.Scanner;
import com.gl.q1.service.MonitorConstruction;

import java.io.IOException;

public class SkyScrapperConstruct {

	public static void main(String args[]) throws IOException {
		//Variable declaration
		int floorCount;
		int[] floors;
		Scanner sc = new Scanner(System.in);
		
		// Accept the user input for the number of floors
		 System.out.println("Enter the number of floors : ");
		 
		 floorCount = sc.nextInt();
		 floors = new int[floorCount];
         
		// Accept the user input for the floor size received on a particular day
		 for(int i = 0; i < floorCount; i++) {
			 System.out.println("Enter floor size given on a day :" +(i+1));
			 floors[i] = sc.nextInt();
		 }
		 
		// Construction implementation for the floors
		 
		 MonitorConstruction monitor =  new MonitorConstruction();
		 monitor.printConstuctionDetails(floors);
		
		 sc.close();
		 
	}
	
}
