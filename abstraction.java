
public class abstraction {

    public static void main(String[] args) {
        maiHuDon m1=new maiHuDon();
        m1.kela();
        m1.lola();
    }
    
}


abstract class apna{
    abstract void kela();
}

interface pola{
    void lola();
    default void maro(){
        System.out.println("maro maro maro");
    }
}



class maiHuDon extends apna implements pola{
 
    
void kela(){

System.out.println("Kela Kha lo na");

}

public void lola(){

System.out.println("Hello Meri Jan");

}

}