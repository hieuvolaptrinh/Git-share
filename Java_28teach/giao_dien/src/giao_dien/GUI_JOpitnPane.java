package giao_dien.src.giao_dien;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_JOpitnPane { // để hiển thị lên thông báo
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPasswordField Example");
        JLabel lbl1 = new JLabel("Username : ");
        JLabel lbl2 = new JLabel("Password : ");
        lbl1.setBounds(50, 50, 100, 30);
        lbl2.setBounds(50, 100, 100, 30);

        JTextField username = new JTextField( );
        JPasswordField password = new JPasswordField( );

        username.setBounds(150, 50, 150, 30);
        password.setBounds(150, 100, 150, 30);

        JButton login = new JButton("Login");
        login.setBounds(100, 150, 80, 30);

        frame.add(lbl1);
        frame.add(lbl2);
        frame.add(username);
        frame.add(password);
        frame.add(login);

        login.addActionListener(new ActionListener( ) {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( username.getText( ).equals("28tech") &&
                        String.valueOf(password.getPassword( )).equals("28tech") ) {
                    JOptionPane.showMessageDialog(frame, "Successful !");
                } else {
                    JOptionPane.showMessageDialog(frame, "Failed !");
                }
            }
        });
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}