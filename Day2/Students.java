package week3.Day2;

public class Students {
	
	public void Write() {
		
		System.out.println("Students is write");
	}
	
	public void Read() {
		
		System.out.println("Students is read");
	}
	
	public void Trip() {
		
		System.out.println("Students is IV trip");
	}
	
	public static void main(String[] args) {
		
		
		Students s1= new Students();
		Students s2= new Students();
		
		s1.Write();
		s1.Read();
		s2.Trip();
	}
}
