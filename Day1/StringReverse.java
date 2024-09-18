package week4.Day1;

public class StringReverse {

	public static void main(String[] args) {

		String input = "Testleaf";

		char[] charArray = input.toCharArray();

		for (int i = charArray.length - 1; i > 0; i--) {

			System.out.println(charArray[i]);
		}

	}
}