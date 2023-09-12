package com.projectsubmission.driver;

import com.projectsubmission.models.AdminDepartment;
import com.projectsubmission.models.HrDepartment;
import com.projectsubmission.models.TechDepartment;

public class Main {

	public static void main(String[] args) {
		
		// Create Objects 
		
		HrDepartment hr = new HrDepartment();
		AdminDepartment admin = new AdminDepartment();
		TechDepartment tech = new TechDepartment();
		
		//--------------------------------
		
		
		//Display for Admin Department
		
		System.out.println(" Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		
		//---------------------------------
		
		System.out.println();
		
		//Display for Hr Department
		
		System.out.println(" Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		
		//------------------------------------------
		
		System.out.println();
		
		//Display for Tech Department
		
		System.out.println(" Welcome to " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
		
		//-----------------------------------------
	}
	
	

	

}
