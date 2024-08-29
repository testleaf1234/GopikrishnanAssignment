package week2Day3;

public class MethodsWithArguments {

	public void clearCache(String str, int a) {

		System.out.println(str);

		System.out.println(a);

	}

	public static void main(String[] args) {

		MethodsWithArguments obj = new MethodsWithArguments();
		obj.clearCache("Cleared", 22);

	}

}
