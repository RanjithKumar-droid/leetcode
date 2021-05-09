class Staircase{
    public static int climbStairs(int n) {
        if(n < 2) return n;
        
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;
        for(int i=2;i<n;i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n-1];
    }
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter no of steps");
	    int inp = sc.nextInt();
	    System.out.println(climbStairs(inp));
	}
}