class LongesCmnPre{
    public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) return "";
    for (int i = 0; i < strs[0].length() ; i++){
        char c = strs[0].charAt(i);
        for (int j = 1; j < strs.length; j ++) {
            if (i == strs[j].length() || strs[j].charAt(i) != c)
                return strs[0].substring(0, i);             
        }
    }
    return strs[0];
    }

	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    Scanner st = new Scanner(System.in);
	    System.out.println("Enter len of array");
	    int len = sc.nextInt();
	    String arr[] = new String[len];
	    System.out.println("Enter str array of "+len+" inputs");
	    for(int i : arr){
		arr[i] = st.nextLine();
	    }
	    System.out.println(longestCommonPrefix(arr));
	}
}    