public class roman {
    

public static void main(String[] args) {
    String s="MCMXCIV";
   int t=0;
    for(int i=0;i<s.length();i++){
        
        if(s.charAt(i) == 'I'){
           t=t+1;
        }
        if(s.charAt(i) == 'V'){
            t=t+5;
        }
        if(s.charAt(i)=='X'){
            t=t+10;
        }
        if(s.charAt(i)=='L'){
            t=t+50;
        }
       
     if(s.charAt(i)== 'C'){
        t=t+100;
     }
       
        if(s.charAt(i)=='D'){
            t=t+500;
        }
        if(s.charAt(i) == 'M'){
            t=t+1000;
        }
        
    
    
    }
    System.out.println(t);
}

}
  


