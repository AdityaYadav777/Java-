public class testParentesis {
    public static void main(String[] args) {
        String s="(){}";
 boolean check=false;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == '(' ){
                if(s.charAt(i+1)==')'){
                   check=true;
                }
            }

            if(s.charAt(i)=='{'){
                if(s.charAt(i+1)=='}'){
                    check=true;
                }
            }


        }
        System.out.println(check);
    }
    
}
