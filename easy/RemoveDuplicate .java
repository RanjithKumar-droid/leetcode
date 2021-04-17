import java.util.Scanner;
public class RemoveDuplicate {

 public static int removeDup(int[] arr) {
	 
	 if(arr.length == 0) return 0;
	 int i = 0;
	 for(int j=0; j< arr.length; j++ ) {
		 if(arr[j] != arr[i]) {
			 i++;
			 arr[i] = arr[j];
		 }
	 }
	 System.out.println("Length of altered array is "+i+1);
	 return i + 1;
 }
	public static void main(String ars[]) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter len of array");
		int len = s.nextInt();
		
		int nums[] = new int[len];
		System.out.println("Enter "+len+ "no of arrays");
		for(int i=0; i<len; i++) {
			nums[i] = s.nextInt();
		}
		
		removeDup(nums);
		
	}
	
}