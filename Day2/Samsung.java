package week4.Day2;

public class Samsung extends AndroidTV {

	@Override
	public void mobile() {

		System.out.println("open app");
	}
	
	@Override
	public void inBulitApp() {
		
		System.out.println("in Bulit App");
	}


	public static void main(String[] args) {

		Samsung obj = new Samsung();

		obj.mobile();
		obj.inBulitApp();
	}

	
}
