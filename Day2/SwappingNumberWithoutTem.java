package week2.Day2;

public class SwappingNumberWithoutTem {

	public static void main(String[] args) {

		int a = 20;

		int b = 30;

		System.out.println("Before Swapping the value of a = " + a);
		System.out.println("Before Swapping the value of b = " + b);

		b = b - a;

		// b=30-20=10

		a = a + b;

		// a=20+10

		System.out.println("************************************");

		System.out.println("After Swapping the value of a = " + a);
		System.out.println("After Swapping the value of b = " + b);

	}

}
