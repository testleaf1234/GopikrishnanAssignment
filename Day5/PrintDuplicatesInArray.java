package week4.Day5;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		int len=arr.length;
		int count;
		
		System.out.println("Duplicates numbers in Array;");
		
		for (int i = 0; i < len; i++) {
			
			count=0;
			
			if(arr[i]!=0) {
				
			for (int j = i+1; j < len; j++) {
				
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]=0;
				}
				
				if(count>0)
				{
					System.out.println(arr[i]);
					break;
				}
				
			}
			}
			
		}
	}
}