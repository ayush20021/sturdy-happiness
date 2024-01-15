package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingExample extends JFrame {

    private JLabel label;
    private JButton button;

    public SwingExample() {
        // Set the title of the JFrame
        super("Swing Example");

        // Create a JLabel
        label = new JLabel("Hello, Swing!", SwingConstants.CENTER);

        // Create a JButton
        button = new JButton("Click me!");

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                label.setText("Button clicked!");
            }
        });


        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));


        add(label);
        add(button);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null); // Center the JFrame on the screen
    }

    public static void main(String[] args) {
        // Create an instance of SwingExample
        SwingExample swingExample = new SwingExample();

        // Set the visibility of the JFrame
        swingExample.setVisible(true);
    }
}

