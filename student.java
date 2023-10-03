package ss;

public class student {

	Info n = new Info();

	public void students(int m) {

		int students = n.gettotalstudents() + m;
		n.settotalstudents(students);
	}

	public void enrollstudent(String s) {
		String enrollstudent = Info.getEnrollstudent() + s;
		n.setEnrollstudent(enrollstudent);

	}

	public void dropstudent(String string) {
		String dropstudent = Info.getDropstudent() + string;
		n.setDropstudent(dropstudent);
		int tt = n.gettotalstudents() - 1;
		n.settotalstudents(tt);
		System.out.println(n);

	}
}
