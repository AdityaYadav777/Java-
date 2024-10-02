class ab1 {
    void test1() {
        System.out.println("I am test 1 from ab1");
    }
    void test1(int a) {
        System.out.println("hii am " + a);
    }
}
class abParent extends ab1 {
    void test1(int a) {
        System.out.println("hii i am test1 from abParent");
    }  
}
class lolo extends abParent {
    void test3() {
        System.out.println("I am  test gogo");
    }   
}
interface tata {
    public void pirint();
}
class tet extends lolo implements tata {
    @Override
    public void pirint() {
        System.out.println("Hello");
    }
}
public class king {
    public static void main(String[] args) {
        tet ob = new tet();
        ob.test1();
        ob.test1(2);
        ob.pirint();
    }
}
