package logIn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn extends JFrame {
    Container container;
    JLabel userLabel, passLabel;
    JTextField t1;
    JPasswordField p1;
    JButton b1, b2;
    Font f = new Font("Arial", Font.BOLD, 16);
    Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

    LogIn() {
        setTitle("LOG IN Frame");
        setDefaultCloseOperation(3);
        setVisible(true);
        setBounds(20, 20, 1200, 1080);


        contentPane();
        designPannel();
        addContainer();
    }

    public void contentPane() {
        container = getContentPane();
        container.setLayout(null);
        container.setBackground(Color.DARK_GRAY);
    }

    public void designPannel() {
        userLabel = new JLabel("Enter User Name : ");
        userLabel.setBounds(30, 50, 115, 40);
        userLabel.setBackground(Color.GREEN);
        userLabel.setOpaque(true);
        userLabel.setForeground(Color.red);

        passLabel = new JLabel("Enter Password : ");
        passLabel.setBounds(30, 100, 110, 40);
        passLabel.setBackground(Color.GREEN);
        passLabel.setOpaque(true);
        passLabel.setForeground(Color.red);

        t1 = new JTextField();
        t1.setBounds(150, 50, 200, 40);
        t1.setFont(f);
        t1.setBackground(Color.DARK_GRAY);
        t1.setForeground(Color.WHITE);
        t1.setToolTipText("Enter your valid name");

        p1 = new JPasswordField();
        p1.setBounds(150, 100, 200, 40);
        p1.setFont(f);
        p1.setBackground(Color.DARK_GRAY);
        p1.setForeground(Color.WHITE);
        p1.setEchoChar('f');
        p1.setToolTipText("Enter a valid password");


        b1 = new JButton("Log In");
        b1.setBounds(200, 180, 100, 50);
        b1.setBackground(Color.RED);
        b1.setForeground(Color.GREEN);
        b1.setCursor(cursor);
        b1.setFont(f);

        b2 = new JButton("Clear");
        b2.setBounds(320, 180, 100, 50);
        b2.setBackground(Color.RED);
        b2.setForeground(Color.GREEN);
        b2.setCursor(cursor);
        b2.setFont(f);


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (t1.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter Information");
                } else {
                    if (p1.getPassword().length < 8) {
                        JOptionPane.showMessageDialog(null, "your password is less then 8 character");
                    } else
                        JOptionPane.showMessageDialog(null, "Congratulations ! Your Information is saved");
                }


            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                p1.setText("");
            }
        });


    }

    public void addContainer() {
        container.add(userLabel);
        container.add(passLabel);
        container.add(t1);
        container.add(p1);
        container.add(b1);
        container.add(b2);
    }
}
