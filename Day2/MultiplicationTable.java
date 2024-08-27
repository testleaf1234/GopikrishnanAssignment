package week2.Day2;

public class MultiplicationTable {

	public static void main(String[] args) {

		int num = 12;

		// 12 *1 =12
		// 12 *2 =24
		// 12 *3 =36

		for (int i = 1; i <= 16; i++) {

			int sum = num * i;

			System.out.println(num + " * " + i + "= " + sum);

		}

	}

}
