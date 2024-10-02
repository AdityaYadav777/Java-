import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class test extends WindowAdapter implements ActionListener {
      int n,c,num1,num2;
    Frame frame;
    Label lb;
    Button btn1,btn2,btnAdd,btnEq,btnCls;
    test(){
        frame=new Frame();
        lb=new Label();
        btn1=new Button("1");
        btn2=new Button("2");
        btnAdd=new Button("+");
        btnEq=new Button("=");
        btnCls=new Button("C");
       btn1.setBounds(100,100,50,50);
       btn2.setBounds(160,100,50,50);
       btnAdd.setBounds(100,150,50,50);
       btnEq.setBounds(160,150,50,50);
       btnCls.setBounds(104,210,100,50);
       frame.add(btn1);
       frame.add(btn2);
       frame.add(btnAdd);
       frame.add(btnEq);
       frame.add(btnCls);
         
       btn1.addActionListener(this);
        btn2.addActionListener(this);
        btnAdd.addActionListener(this);
        btnEq.addActionListener(this);
         btnCls.addActionListener(this);

        lb.setBounds(100,50,100,50);
        lb.setForeground(Color.CYAN);
        lb.setBackground(Color.BLACK);
        frame.add(lb);
        frame.setLayout(null);
        frame.setSize(600,600);
        frame.addWindowListener(this);
        frame.setVisible(true);
    }
    
    public void windowClosing (WindowEvent e){
        frame.dispose();
    }



    public void actionPerformed(ActionEvent e) {
    String s1,s2;
        if(e.getSource()==btn1){
       s2= lb.getText();
        s1=s2+"1";
        lb.setText(s1);
    }
       if(e.getSource()==btn2){
       s2= lb.getText();
        s1=s2+"2";
        lb.setText(s1);
    }

       if(e.getSource()==btnAdd){
       s2= lb.getText();
          c=1;  
       
                num1=Integer.parseInt(lb.getText());
        lb.setText("+");
    }
    if(e.getSource()== btnCls){
        s1=null;
        s2=null;

        lb.setText("");
    }

    if(e.getSource()==btnEq){

            num2=Integer.parseInt(lb.getText());
          if(c==1){
            n=num1+num2;
            lb.setText(String.valueOf(n));
          }        


    }

    }


    public static void main(String[] args) {
        new test();
    }


}
