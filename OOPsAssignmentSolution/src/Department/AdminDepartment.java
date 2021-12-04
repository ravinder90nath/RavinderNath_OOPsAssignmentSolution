package Department;

public class AdminDepartment extends SuperDepartment {
	
	public static String departmentName() {		
		String name="Admin  Department ";
		return name;
	}
	
	public static String getTodaysWork() {
		String today = "Complete your documents Submission";
		return today;
	}
	
	public static String getWorkDeadline() {
		String deadline = "Complete by EOD ";
		return deadline;
	}
	
}
