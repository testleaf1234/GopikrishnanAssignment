package week4.Day4;

public abstract class Teacher implements Students {
	
	@Override
	public void Homework() {
	
		System.out.println("Home work");
	}

	public abstract void Complain(); 
	
}
