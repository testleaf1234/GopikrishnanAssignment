package week4.Day4;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String test = "changeme";


		char[] charArr = test.toCharArray();
		

		for (int i = 0; i < charArr.length; i++) {

			if (i % 2 != 0) {
				charArr[i] = Character.toUpperCase(charArr[i]);
			}
		}
		for (int j = 0; j < charArr.length; j++) {

			System.out.println(charArr[j]);

		}

	}
}