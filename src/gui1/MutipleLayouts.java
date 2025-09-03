package gui1;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MutipleLayouts extends JFrame {

    JLabel lbname = new JLabel("Name", JLabel.CENTER);
    JTextField tfName = new JTextField(10);
    JLabel lbpw = new JLabel("Password", JLabel.CENTER);
    JTextField tfpw = new JPasswordField(10);
    JButton tbnlogin = new JButton("Login");
    JLabel nul = new JLabel("",JLabel.RIGHT);

    public MutipleLayouts(){
        JPanel gridPanel = new JPanel(new GridLayout(2,2,5,5));  // hgap = row , vgap = column

        gridPanel.add(lbname); gridPanel.add(tfName);
        gridPanel.add(lbpw);gridPanel.add(tfpw);

        JPanel flowPanel = new JPanel(new FlowLayout());
        flowPanel.add(tbnlogin);

        // border layout

        JPanel allPanel = new JPanel(new BorderLayout());

        allPanel.add(gridPanel,BorderLayout.CENTER);
        allPanel.add(flowPanel, BorderLayout.SOUTH);

        Border border = BorderFactory.createEmptyBorder(10,0,10,10); // this code for create padding.
        allPanel.setBorder(border);
        add(allPanel);

        setSize(300,175);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new MutipleLayouts();
    }
}