package rmi;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        JLabel label = new JLabel("Nathaniel");
        // Assume you accessed 20 of the label's methods.
        JTextField textField = new JTextField();
        // Assume you accessed 20 of the text field's methods.

        this.setTitle("Bela Jash");
        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
    }
}
