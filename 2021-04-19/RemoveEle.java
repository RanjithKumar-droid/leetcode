class RemoveEle{
    public int removeElement(int[] nums, int val) {
        int ptr = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val) nums[ptr++] = nums[i];
        }
        return ptr;
    }
	public static void main(String args[]) {
	   Scanner scan = new Scanner(System.in);
	System.out.println("Enter len of array");
	int len = scan.nextInt();
	int arr[] = new int[len];
	System.out.println("Enter "+len+" no of inputs");
	for(int i=0;i<len;i++) {
		int arr[i] = scan.nextInt();
	}
	System.out.println("Enter value");
	int value= scan.nextLine();
	System.out.println(sum(arr, value));	
	}
}