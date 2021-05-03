class Palindrome{
    public boolean isPalindrome(int x) {
        if (x < 0)
			return false;
 
		// initialize how many zeros
		int div = 1;
		while (x / div >= 10) {
			div *= 10;
		}
 
		while (x != 0) {
			int left = x / div;
			int right = x % 10;
 
			if (left != right)
				return false;
 
			x = (x % div) / 10;
			div /= 100;
		}
 
		return true;
    }
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter input to check palindrome");
		int input = s.nextInt();
		System.out.println(isPalindrome(input));
	}
}