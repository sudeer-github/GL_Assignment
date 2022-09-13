package com.gl.q1.service;
import java.util.Collections;
import java.util.PriorityQueue;
public class MonitorConstruction {
	
	public void printConstuctionDetails (int floors[]) {
		//Use priority Queue for descending order
		PriorityQueue <Integer> queue = new PriorityQueue<>(Collections.reverseOrder());  
		int max_floors = floors.length;
		
		//Add the floor size received on the day to the queue
		//check the queue for required floor size and pop up the all floors and built
		
		System.out.println("The order of construction is as follows");
		
		for(int i=0; i< floors.length; i++ ) {
			System.out.println("Day " +(i+1));
			queue.add(floors[i]);
			
			while(!queue.isEmpty() && queue.peek() == max_floors  ){
			System.out.print(queue.poll() + " ");
			max_floors--;
		}
			System.out.println();
	  }
	}
}
