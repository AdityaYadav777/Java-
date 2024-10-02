import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LalPng {
    LalPng(){
        JFrame jf=new JFrame();
       
        Image img=new  ImageIcon("p.png").getImage();
        Image scalImage=img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
         JLabel jl=new JLabel();
        jl.setBounds(50,50,100,100);
    
        jf.setLayout(null);
        jf.setSize(400,400);
        jf.setVisible(true);

    }
    
}
