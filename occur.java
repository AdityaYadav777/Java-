public class occur {
    public static void main(String[] args) {
        String h="sadbutsad";
        String n="sad";
               
        int s=n.length()-1;

        System.out.println(s);

        String t="";

        for(int i=0;i<=s;i++){
            
            t+=h.charAt(i);

        }
            System.out.println(t);
            String k=t;

        System.out.println(k==t);
  
    }

    
    
}
