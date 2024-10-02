import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Don {

    Don(){
        JFrame jf=new JFrame();
        JTabbedPane jtbp=new JTabbedPane();
        JLabel title=new JLabel("Hero");
        JPanel jp=new JPanel();

        jtbp.add("Kand", title);
        jp.add(title);
            
        

        jf.add(jp);
        jf.setContentPane(jtbp);
        jf.setSize(500,500);
          jf.setLayout(null);
        jf.setVisible(true);
      
    }
    public static void main(String[] args) {
        
        new Don();
    }

}
