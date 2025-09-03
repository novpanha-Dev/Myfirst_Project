package gui1;

import javax.swing.*;
import java.awt.*;

public class GridLayoutUI extends JFrame {

    JLabel name = new JLabel("Name", JLabel.RIGHT);
    JTextField tfName = new JTextField(10);
    JLabel pw = new JLabel("Password", JLabel.RIGHT);
    JTextField tfpw = new JPasswordField(10);
    JButton login = new JButton("Login");
    JLabel nul = new JLabel("",JLabel.RIGHT);

    public GridLayoutUI(){

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2,5,5));
        panel.add(name);panel.add(tfName);
        panel.add(pw); panel.add((tfpw));
        panel.add(nul);panel.add(login);
        add(panel);

        // Design

//        login.setBackground(Color.PINK);



        setSize(300,175);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new GridLayoutUI();
    }
}
