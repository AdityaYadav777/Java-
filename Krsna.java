import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;



public class Krsna  {

    Krsna() {

        JFrame jf = new JFrame();
        jf.setTitle("Form");
        JLabel setName = new JLabel("First Name: ");
        JTextField txtName = new JTextField();
        JLabel SecondName = new JLabel("Second Name:");
        JTextField txtSecondName = new JTextField();
        JLabel Password = new JLabel("Password:");
        JPasswordField txtPassword = new JPasswordField();
        JLabel confirmPass = new JLabel("Confirm:");
        JPasswordField conPass = new JPasswordField();
        JLabel getGender=new JLabel("Gender:");
        JRadioButton male=new JRadioButton("Male");
        JRadioButton female=new JRadioButton("Female");
        JButton btnSigup=new JButton("SignUp");



        setName.setBounds(30, 10, 100, 50);
        SecondName.setBounds(10, 40, 100, 50);
        Password.setBounds(30, 70, 100, 50);
        confirmPass.setBounds(30, 65, 100, 130);
        getGender.setBounds(30,140,70,50);



        txtSecondName.setBounds(120, 55, 100, 25);
        txtPassword.setBounds(120, 85, 100, 25);
        conPass.setBounds(120, 120, 100, 25);
        txtName.setBounds(120, 25, 100, 25);
        male.setBounds(110,150,70,30);
        female.setBounds(180,155,70,20);
        btnSigup.setBounds(80,200,100,30);
       
       

        jf.setLayout(null);
        jf.add(conPass);
        jf.add(btnSigup);
        jf.add(female);
        jf.add(male);
        jf.add(getGender);
        jf.add(confirmPass);
        jf.add(txtPassword);
        jf.add(Password);
        jf.add(SecondName);
        jf.add(setName);
        jf.add(txtName);
        jf.add(txtSecondName);
        jf.setSize(300, 300);
        jf.setVisible(true);
    
    }

    public static void main(String[] args) {
        new Krsna();
    }

 
}
