class Twosum {
    public static sum() {
    public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int diff = target - nums[i];
        if (map.containsKey(diff)) {
            return new int[] { map.get(diff), i };
        }
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
}
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
	int tar = scan.nextLine();
	sum(arr, tar);
}
    }