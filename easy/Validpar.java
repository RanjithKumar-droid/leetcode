class Validpar{
     private HashMap<Character, Character> mappings;

    public Solution(){
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')' , '(');
        this.mappings.put('}' , '{');
        this.mappings.put(']' , '[');
    }
    
    public boolean isValid(String s) {
        
        Stack <Character> stak = new Stack<Character>();
        
        for(int index = 0; index < s.length(); index++){
            char c = s.charAt(index);
            
            if(this.mappings.containsKey(c)){
                char topelement = stak.empty() ? '#' : stak.pop();
                if(topelement != this.mappings.get(c)){
                    return false;
                }
               
            }
             else{
                    stak.push(c);
                }
        }
        return stak.isEmpty();
    }
       public static void main(String args[]) {
            Scanner st = new Scanner(System.in);
          System.out.println("Enter Input");
          String inp = st.nextLine();
            isValid(inp);
}
}
