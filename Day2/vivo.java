package week4.Day2;

public class vivo extends IsmartWatch implements Watch {

	@Override
	public void app() {
		
		System.out.println("Call");
	}

	@Override
	public void normal() {

		System.out.println("Normal Watch");

	}

	@Override
	public void inbulitApp() {

		System.out.println("iamrt watch");

	}

	public static void main(String[] args) {

		vivo obj = new vivo();

		obj.normal();
		obj.inbulitApp();
		obj.app();

	}
}
