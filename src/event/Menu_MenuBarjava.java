package event;

import javax.swing.*;

public class Menu_MenuBarjava extends JFrame {
    // Create items
    JMenuItem save = new JMenuItem("Save");
    JMenuItem exit = new JMenuItem("Exit");
    JMenuItem showToolBar = new JMenuItem("Show toolBar");

    // Create toolbar in edit


    public Menu_MenuBarjava(){
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");

        edit.add(showToolBar);
        file.add(save); file.add(exit);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(file); menuBar.add(edit);
        setJMenuBar(menuBar);

        setSize(350, 200);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Menu_MenuBarjava();
    }
}
