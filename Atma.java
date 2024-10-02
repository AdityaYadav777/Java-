import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Atma implements ActionListener {
    JFrame jf;
    JRadioButton r1,r2,r3;
    JButton btn;
    Atma(){
        jf=new JFrame();
        r1=new JRadioButton("Male");
        r2=new JRadioButton("Female");
        btn=new JButton("Click");
        r3=new JRadioButton("No Say");
        r1.setBounds(100,50,100,20);
        r2.setBounds(100,90,100,20);
        r3.setBounds(100,130,100,30);
        btn.setBounds(100,140,100,70);
        btn.addActionListener(this);
         
        jf.add(r3);
        jf.add(r1);
        jf.add(r2);
        jf.add(btn);
        jf.setLayout(null);
       
        jf.setSize(300,300);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new Atma();
    }

  
    public void actionPerformed(ActionEvent e) {
        if(r1.isSelected()){
            JOptionPane.showInternalMessageDialog(btn, this, "Selected Male", 0);
        }
        if(r2.isSelected()){
            JOptionPane.showMessageDialog(btn, this,"You are Female.", 0);    
        }
        if(r3.isSelected()){
            JOptionPane.showMessageDialog(btn, this,"You are Gay.", 0, null);      
        }
     
    }
    
}
