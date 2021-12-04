package Main;

import Department.AdminDepartment;
import Department.HrDepartment;
import Department.TechDepartment;

public class driver {
public static void main(String[] argh) {
		
		
		AdminDepartment admindepartment = new AdminDepartment();		
		System.out.println("Welcome to " + admindepartment.departmentName());
		System.out.println(admindepartment.getTodaysWork());
		System.out.println(admindepartment.getWorkDeadline());
		System.out.println(admindepartment.isTodayAHoliday());
		
		System.out.println();

		HrDepartment hrdepartment = new HrDepartment();
		System.out.println("Welcome to " + hrdepartment.departmentName());
		System.out.println(hrdepartment.doActivity());
		System.out.println(hrdepartment.getTodaysWork());
		System.out.println(hrdepartment.getWorkDeadline());
		System.out.println(admindepartment.isTodayAHoliday());
		
		

		System.out.println();

		TechDepartment techdepartment = new TechDepartment();
		System.out.println("Welcome to " + techdepartment.departmentName());
		System.out.println(techdepartment.getTodaysWork());
		System.out.println(techdepartment.getWorkDeadline());
		System.out.println(techdepartment.getTechStackInformation());
		System.out.println(techdepartment.isTodayAHoliday());
	}
}
