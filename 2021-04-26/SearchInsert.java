import java.util.Scanner;
class SearchInsert{
    public static int searchInsert(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length - 1;
        
        while(left <= right) {
            int mid = left + (right - left) / 2;
            
            if(nums[mid] == target) return mid;
            if(nums[mid] < target ) left = mid + 1;
            if(nums[mid] > target ) right = mid - 1;
        }
        return left;
    }
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter len of array");
		int len = sc.nextInt();
		System.out.println("Enter "+len+" no of inputs to an array");

	}
}