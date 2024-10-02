class meraString{

    public static void main(String[] args) {
        
        String s="Hellow world7ti";
System.out.println(s.length());
        int count=0;
        for(int i=s.length()-1;i>0;i--){
            if(s.charAt(i)!=' '){
             count++;
            }
            else if(count>0){
                break;
            }
        }

        
System.out.println(count);
        
    }

}