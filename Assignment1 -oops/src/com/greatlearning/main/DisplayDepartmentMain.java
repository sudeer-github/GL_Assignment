package com.greatlearning.main;

import com.greatlearning.oops.*;

public class DisplayDepartmentMain {

	public static void main(String[] args) {

		AdminDepartment Admin = new AdminDepartment();
		HrDepartment Hr = new HrDepartment();
		TechDepartment Tech = new TechDepartment();
		// Display Admin Functionality
		System.out.println("Welcome to " + Admin.departmentName());
		System.out.println(Admin.getTodaysWork());
		System.out.println(Admin.getWorkDeadline());
		System.out.println(Admin.isTodayAHoliday());
		System.out.println(" ");
		System.out.println("------------------------------");

		// Display HR Functionality
		System.out.println("Welcome to " + Hr.departmentName());
		System.out.println(Hr.doActivity());
		System.out.println(Hr.getTodaysWork());
		System.out.println(Hr.getWorkDeadline());
		System.out.println(Hr.isTodayAHoliday());
		System.out.println(" ");
		System.out.println("------------------------------");

		// Display Tech Department Functionality
		System.out.println("Welcome to " + Tech.departmentName());
		System.out.println(Tech.getTodaysWork());
		System.out.println(Tech.getWorkDeadline());
		System.out.println(Tech.getTechStackInformation());
		System.out.println(Tech.isTodayAHoliday());
	}
}
