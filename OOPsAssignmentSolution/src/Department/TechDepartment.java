package Department;

public class TechDepartment extends SuperDepartment {

	public static String departmentName() {		
		String name="Tech Department ";
		return name;
	}
	
	public static String getTodaysWork() {
		String today = "Complete coding of module 1";
		return today;
	}
	
	public static String getWorkDeadline() {
		String deadline = "Complete by EOD";
		return deadline;
	}
	
	public static String getTechStackInformation() {
		String info = "core Java";
		return info;
	}
}
