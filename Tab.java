import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Tab {
    
    Tab(){
        JFrame jf=new JFrame();

        JLabel AddBookLable=new JLabel("Add Book here");
        JLabel ViewBookLable=new JLabel("View Book Here");
        JLabel AddBookHeader=new JLabel("Add Book");

        AddBookHeader.setBounds(10,10,800,30);

        JPanel AddBookPanel=new JPanel();
        JPanel ViewBookPanel=new JPanel();
        JPanel AddBookHeaderPanel=new JPanel();
        
        AddBookPanel.add(AddBookLable);
        ViewBookPanel.add(ViewBookLable);
        AddBookHeaderPanel.add(AddBookHeader);

        JTabbedPane tabbedPane=new JTabbedPane();
       
     
        tabbedPane.add("View Book",ViewBookPanel);

        jf.setSize(800,800);
        jf.setContentPane(tabbedPane);
        jf.setVisible(true);
        jf.setLayout(null);;
    }
    public static void main(String[] args) {
        new Tab();
    }
}
