class Revint{
    public static int reverse(int x) {
        int tot = 0;
        while(x != 0){
            int seperate = x % 10;            
            x /= 10;
            if (tot > Integer.MAX_VALUE/10 || (tot == Integer.MAX_VALUE / 10 && seperate > 7)) return 0;
            if (tot < Integer.MIN_VALUE/10 || (tot == Integer.MIN_VALUE / 10 && seperate < -8)) return 0;
            tot = tot * 10 + seperate;
        }
        return tot;
    }

	public static void main(String  args[]) {
	    Scanner s = new Scanner(System.in);
	    int inp = s.nextInt();
	    System.out.println(reverse(inp));
	}
}