class Strstr{
    public static int strStr(String haystack, String needle) {
        
        if(needle.length() == 0 ) return 0;
        for(int i=0; i<haystack.length();i++){
            int j=0;
            
            for(; j<needle.length() && (i+j)< haystack.length();j++){
                
                if(haystack.charAt(i+j) == needle.charAt(j)){
                    continue;
                    
                } else{
                    break;
                    
                }
                
            }
            
            if(j == needle.length())
                return i;
            
        }
         return -1;
    }
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a word");
		String wrd = s.nextLine();
		System.out.println("Enter needle word");
		String ndle = s.nextLine();
		strStr(wrd,ndle);
	}
}