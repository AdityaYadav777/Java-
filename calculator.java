import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;



public class calculator extends WindowAdapter implements ActionListener {
    int n,c;
    Frame frame;
    TextField tf;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnAdd, btnSub, btnDiv, btnMul, btnEqual;

    calculator() {

        frame = new Frame();
        tf = new TextField();
        tf.setBounds(200, 50, 205, 50);

        frame.add(tf);

        btn1 = new Button("1");
        btn2 = new Button("2");
        btn3 = new Button("3");
        btn4 = new Button("4");
        btn5 = new Button("5");
        btn6 = new Button("6");
        btn7 = new Button("7");
        btn8 = new Button("8");
        btn9 = new Button("9");
        btn0 = new Button("0");
        btnAdd = new Button("+");
        btnSub = new Button("-");
        btnMul = new Button("*");
        btnDiv = new Button("/");
        btnEqual = new Button("=");

        btn1.setBounds(200, 120, 40, 40);
        btn1.addActionListener(this);

        btn2.setBounds(250, 120, 40, 40);
        btn2.addActionListener(this);

        btn3.setBounds(300, 120, 40, 40);
        btn3.addActionListener(this);

        btnAdd.setBounds(350, 120, 55, 40);
        btnAdd.addActionListener(this);

        btn4.setBounds(200, 165, 40, 40);
        btn4.addActionListener(this);

        btn5.setBounds(250, 165, 40, 40);
        btn5.addActionListener(this);

        btn6.setBounds(300, 165, 40, 40);
        btn6.addActionListener(this);

        btnSub.setBounds(350, 165, 55, 40);
        btnSub.addActionListener(this);

        btn7.setBounds(200, 210, 40, 40);
        btn7.addActionListener(this);

        btn8.setBounds(250, 210, 40, 40);
        btn8.addActionListener(this);

        btn9.setBounds(300, 210, 40, 40);
        btn9.addActionListener(this);

        btnDiv.setBounds(350, 210, 55, 40);
        btnDiv.addActionListener(this);

        btn0.setBounds(200, 255, 40, 40);
        btn0.addActionListener(this);

        btnMul.setBounds(250, 255, 40, 40);
        btnMul.addActionListener(this);

        btnEqual.setBounds(300, 255, 105, 40);
        btnEqual.addActionListener(this);

        frame.setTitle("Title X");
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

    }

    public void init() {
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);
        frame.add(btn0);
        frame.add(btnAdd);
        frame.add(btnSub);
        frame.add(btnDiv);
        frame.add(btnMul);
        frame.add(btnEqual);

    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        String str1, str2;
        if (e.getSource() == btn1) {
            str2 = tf.getText();
            str1 = str2 + "1";
            tf.setText(str1);
        }

        if (e.getSource() == btn2) {
            str2 = tf.getText();
            str1 = str2 + "2";
            tf.setText(str1);
        }

        if (e.getSource() == btn3) {
            str2 = tf.getText();
            str1 = str2 + "3";
            tf.setText(str1);
        }

        if (e.getSource() == btn4) {
            str2 = tf.getText();
            str1 = str2 + "4";
            tf.setText(str1);
        }

        if (e.getSource() == btn5) {
            str2 = tf.getText();
            str1 = str2 + "5";
            tf.setText(str1);
        }

        if (e.getSource() == btn6) {
            str2 = tf.getText();
            str1 = str2 + "6";
            tf.setText(str1);
        }

        if (e.getSource() == btn7) {
            str2 = tf.getText();
            str1 = str2 + "7";
            tf.setText(str1);
        }

        if (e.getSource() == btn8) {
            str2 = tf.getText();
            str1 = str2 + "8";
            tf.setText(str1);
        }

        if (e.getSource() == btn9) {
            str2 = tf.getText();
            str1 = str2 + "9";
            tf.setText(str1);
        }

        if (e.getSource() == btn0) {
            str2 = tf.getText();
            str1 = str2 + "0";
            tf.setText(str1);
        }

        if (e.getSource() == btnAdd) {
            str2 = tf.getText();
            str1 = str2 + "+";
            tf.setText(str1);
        }

        if (e.getSource() == btnMul) {
            str2 = tf.getText();
            str1 = str2 + "*";
            tf.setText(str1);
        }

        if (e.getSource() == btnDiv) {
            str2 = tf.getText();
            str1 = str2 + "/";
            tf.setText(str1);
            c++;
        }

        if (e.getSource() == btnSub) {
            str2 = tf.getText();
            str1 = str2 + "-";
            tf.setText(str1);

        }
        if (e.getSource() == btnEqual) {
            str2 = tf.getText();
            str1 = str2 + "=";
            tf.setText(str1);
        }

        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    public static void main(String[] args) {
        calculator c = new calculator();
        c.init();

    }

}
