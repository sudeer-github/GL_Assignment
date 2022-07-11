package com.greatlearning.service;

public class MergeSort {
	
	void merge(int arr[],int left, int mid, int right) {
		
		int n1  = mid-left+1;
		int n2  = right-mid;
		
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];
		
		for(int i=0;i<n1;i++) {
			leftArray[i] = arr[left+i];
		}
		
		for(int j=0;j<n2;j++) {
			rightArray[j] = arr[mid+1+j];
		}
		
		int i=0;
		int j=0;
		int k = left;
		
		while(i<n1 && j<n2) {
			
			if(leftArray[i]>= rightArray[j])
			{
				arr[k] = leftArray[i];
				i++;
			}
			else
			{
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		while(i<n1) {   // Additional elements or values of left will copied into this array
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		
		
		while(j<n2) {
			arr[k] = rightArray[j]; // Additional elements or values of right will copied into this array
			j++;
			k++;
		}
		
	}
	
	public void sort(int currency[],int left, int right) { 
		if(left < right) {
			
			int mid = (left+right)/2; //Compute the mid value
			
			sort(currency,left,mid);  // Call Recursively the left Sort
			sort(currency,mid+1,right); // Call Recursively the right Sort
			
			merge(currency,left,mid,right); // Merge the left and right part
			
		}
	}

}