package week4.Day4;

public class Student extends Department {

	public void studentsname() {

		System.out.println("Gopikrishnan.G");
	}

	public void studentsdept() {

		System.out.println("Electronics Communication and Engineering");
	}

	public void studentsid() {

		System.out.println("3200972");
	}

	public static void main(String[] args) {

		Student obj = new Student();
		obj.collegename();
		obj.collegecode();
		obj.collegerank();
		obj.Departmentname();
		obj.studentsname();
		obj.studentsdept();
		obj.studentsid();

	}
}
