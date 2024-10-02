
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
class hello{
Frame frame;
TextField tf;
Button btn1;
hello(){
frame =new Frame("Ka Ho");
tf=new TextField();
tf.setBounds(100,20,100,50);
frame.add(tf);
btn1=new Button("1");

frame.add(btn1);
btn1.setBounds(10,30,50,50);




frame.setSize(300,300);
frame.setVisible(true);


}



    public static void main(String[] args) {
        new hello();
    }
}