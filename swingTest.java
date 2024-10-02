import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class swingTest {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        MenuBar menuBar = new MenuBar();
        Menu file = new Menu("file");
        Menu edit = new Menu("edit");
        Menu setting = new Menu("setting");

        MenuItem item1 = new MenuItem("New");   
        MenuItem itemSave=new MenuItem("save");
        MenuItem item2 = new MenuItem("Delete");
        MenuItem item3 = new MenuItem("Profile");

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(setting);

        file.add(item1);
        file.add(itemSave);
        edit.add(item2);
        setting.add(item3);
        frame.setMenuBar(menuBar);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(300, 300);

        item1.addActionListener(e ->{
            JFileChooser chooser=new JFileChooser();
            chooser.showOpenDialog(null);
        });

    }

}
