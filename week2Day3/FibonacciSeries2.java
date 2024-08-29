package week2Day3;

public class FibonacciSeries {
	

	// 1 2 3 4 5 6 7 8 9

	// 0+1 =1
	// 1+1 =2
	// 1+2 =3
	// 2+3 =5
	// 3+5 =8
	// 5+8 =13
	// 8+13 =21
	// 13+21 =34

	// 1st 0 1 1 2 3 5 8 13

	// 2nd 1 1 2 3 5 8 13 21

	// 3rd 1 2 3 5 8 13 21 34

	public static void main(String[] args) {

		int firtNumber = 0;

		int secondNumber = 1;

		int thirdNumber;

		for (int i = 0; i < 8; i++) {

			thirdNumber = firtNumber + secondNumber;

			System.out.println(thirdNumber);

			firtNumber = secondNumber;

			secondNumber = thirdNumber;

		}

	}

}
