package week2.Day2;

public class SwappingNumberWithTem {

	public static void main(String[] args) {

		int a = 15;

		int b = 30;

		int tmp;

		// op a=15 b=30

		System.out.println("Before Swapping the value of a = " + a);
		System.out.println("Before Swapping the value of b = " + b);

		tmp = a;
		// tmp=15

		a = b;
		// a=30

		b = tmp;
		// b=15
		
		System.out.println("************************************");

		System.out.println("After Swapping the value of a = " + a);
		System.out.println("After Swapping the value of b = " + b);

	}

}
