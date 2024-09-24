package week4.Day4;

public class StudentDetails {

	private static final int Krishna = 0;

	public void studentInfo(int id) {

		System.out.println("ID:" + id);
	}

	public void studentInfo(int id, String name) {

		System.out.println("ID:" + id + "NAME:" + name);
	}

	public void studentsInfo(String email, long phonenumber) {

		System.out.println("EMAIL:" + email + "PHONENUMBER:" + phonenumber);
	}

	public static void main(String[] args) {

		StudentDetails obj = new StudentDetails();

		obj.studentInfo(320092);
		obj.studentInfo(3200972, "Krishna");
		obj.studentsInfo("gopi10042000@gmail.com",994376459);

	}
}
