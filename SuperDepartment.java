package com.gl.fop.departments;

public class SuperDepartment {

	public String departmentName() 
	{
		return "Super Department";
	}
	
	public String getTodaysWork() 
	{
		return "No work as of now";
	}
	
	public String getWorkDeadline() 
	{
		return "Nil";
	}
	
	public String isTodayAHoliday() 
	{
		return "Today is not a holiday";
	}
	
	public static void main(String[] args) 
	{
		AdminDepartment admindept= new AdminDepartment();
		String admin_dept_name = admindept.departmentName();
		String admin_todays_work = admindept.getTodaysWork();
		String admin_work_deadline = admindept.getWorkDeadline();
		String admin_today_holiday = admindept.isTodayAHoliday();
		System.out.println("Welcome to "+ admin_dept_name);
		System.out.println(admin_todays_work);
		System.out.println(admin_work_deadline);
		System.out.println(admin_today_holiday);
		
		System.out.println("*************************************************");
		
		HRDepartment hrdept= new HRDepartment();
		String hr_dept_name = hrdept.departmentName();
		String hr_activity = hrdept.doActivity();
		String hr_todays_work = hrdept.getTodaysWork();
		String hr_work_deadline = hrdept.getWorkDeadline();
		String hr_today_holiday = hrdept.isTodayAHoliday();
		System.out.println("Welcome to "+ hr_dept_name);
		System.out.println(hr_activity);
		System.out.println(hr_todays_work);
		System.out.println(hr_work_deadline);
		System.out.println(hr_today_holiday);
		
		System.out.println("*************************************************");
		
		
		TechDepartment techdept= new TechDepartment();
		String tech_dept_name = techdept.departmentName();
		String tech_todays_work = techdept.getTodaysWork();
		String tech_work_deadline = techdept.getWorkDeadline();
		String tech_tech_info = techdept.getTechStackInformation();
		String tech_today_holiday = techdept.isTodayAHoliday();
		System.out.println("Welcome to "+ tech_dept_name);
		System.out.println(tech_todays_work);
		System.out.println(tech_work_deadline);
		System.out.println(tech_tech_info);
		System.out.println(tech_today_holiday);
		
		
	}
}