
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.*;
class MyTab{

    MyTab(){
        JFrame jf=new JFrame();
 
      ImageIcon icon=new ImageIcon("p.png");
   
     
          JLabel jl=new JLabel();
          
              jl.setIcon(icon);
              jl.setBounds(100,180,1000,1000);
        
              
      
       
        
         jf.setLayout(null);
       jf.setSize(600,600);
       jf.add(jl);     
         
       jf.setVisible(true);
      
    }
    public static void main(String[] args) {
        new MyTab();
    }

}