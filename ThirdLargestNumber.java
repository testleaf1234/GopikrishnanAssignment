package week2Day1;

import java.util.Arrays;

public class ThirdLargestNumber {

	public static void main(String[] args) {

		int num[] = { 20, 44, 55, 77, 88, 221, 6556, 879, 767 , 899 ,988 , 9990 };

		// 20 44 55 77 88 221 767  879 899 988 6556 9990

		Arrays.sort(num);

		int length = num.length;

		System.out.println("ThirdLargestNumber is: " + num[length -3]);

	}

}