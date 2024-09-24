package week4.Day4;

public class HeadMaster extends Teacher {

	@Override
	public void Complain() {

		System.out.println("Homework is not completed");

	}

	@Override
	public void Homework() {

		System.out.println("Written");
	}

	public static void main(String[] args) {

		HeadMaster obj = new HeadMaster();
		obj.Complain();
		obj.Homework();

	}

}
