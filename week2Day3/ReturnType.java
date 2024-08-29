package week2Day3;

public class ReturnType {

	public String cashWithDrawal() {

		// int amount = 20000;

		int cash = 20000;

		String name = "Vasanth";

		System.out.println(name);

		System.out.println(cash);

		return name;
	}

	public static void main(String[] args) {

		ReturnType obj = new ReturnType();

		String abc = obj.cashWithDrawal();

		abc = "Ramesh";

		System.out.println(abc);

		abc = "Mani";

		System.out.println(abc);

		// String cashWithDrawal = obj.cashWithDrawal();

		// System.out.println(Car);

	}

}
