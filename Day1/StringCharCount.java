package week4.Day1;

public class StringCharCount {

	public static void main(String[] args) {

		String input = "Testleaf";

		char[] charArray = input.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			if (charArray[i] == 'e') {

				i++;

			}

		}

		System.out.println("i");
	}

}