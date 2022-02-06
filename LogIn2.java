package logIn;

import javax.swing.*;
import java.awt.*;

public class LogIn2 extends JFrame {

    LogIn2(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(800,800);

        Container c =  getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);

        JLabel l1 = new JLabel("You entered in a new frame");
        l1.setBounds(20,30,300,100);

        c.add(l1);

    }

    public static void main(String[] args) {
        LogIn2 in = new LogIn2();
        in.setVisible(true);



    }
}
