package week2.Day2;

public class FactorialNumber {

	public static void main(String[] args) {

		int num = 6;

		int fact = 1;

		for (int i = num; i >= 1; i--) {
			// fact =6
			// fact =30
			// fact =120
			// fact= 360
			// fact =720
			// fact =720

			fact = i * fact;

			// 6 *1== 6
			// 5*6=30
			// 4*30=120
			// 3*120=360
			// 2 *360=720
			// 1*720=720

		}
		System.out.println("The Facatrorial number of " + num + ":" + fact);

	}

}
