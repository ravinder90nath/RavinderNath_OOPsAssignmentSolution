package Department;

public class HrDepartment extends SuperDepartment {
	
	public static String departmentName() {		
		String name="Hr Department ";
		return name;
	}
	
	public static String getTodaysWork() {
		String today = "Fill today’s timesheet and mark your attendance";
		return today;
	}
	
	public static String getWorkDeadline() {
		String deadline = "Complete by EOD ";
		return deadline;
	}
	
	public static String doActivity() {
		String activity = "team Lunch";
		return activity;
	}

}
