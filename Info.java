package ss;

public class Info {

	private int student_id = 1234567;
	private static String name = "shrutika";
	private  static int totalstudents=100;
	private  static  String enrollstudent = " ";
	private  static String dropstudent = " ";
	

	public void setstudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int gettotalstudents() {
		return totalstudents;
	}

	public void settotalstudents( int totalstudents) {
		this.totalstudents = totalstudents;
	}


	public static String getEnrollstudent() {
		return enrollstudent;
	}

	public void setEnrollstudent(String enrollstudent) {
		Info.enrollstudent = enrollstudent;
	}


	public static String getDropstudent() {
		return dropstudent;
	}

	public static void setDropstudent(String dropstudent) {
		Info.dropstudent = dropstudent;
	}
	@Override
	public String toString() {
		return "Info [student_id=" + student_id + ", name=" + name + ", totalstudents=" + totalstudents
				+ ", enrollstudent=" + enrollstudent + ", dropstudent=" + dropstudent + "]";
	}
	
	
}
