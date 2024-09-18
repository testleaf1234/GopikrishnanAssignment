package week4.Day2;

public class SampleProgram {

	public void multi() {

		System.out.println(10 * 6);
	}

	public void multi(int a) {
		System.out.println(a * 10);

	}

	public void multi(int a, int b) {
		System.out.println(a * b);
	}
	
	public void add() {
		System.out.println(10+33);
	}

	public void add(int a) {
		System.out.println(a + 10);
	}
	public static void main(String[] args) {

		SampleProgram obj = new SampleProgram();
		obj.multi();
		obj.multi(20);
		obj.multi(5, 2);
		obj.add();
		obj.add(20);

	}
}