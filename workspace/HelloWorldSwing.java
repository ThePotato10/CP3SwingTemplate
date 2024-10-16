import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloWorldSwing {
    private static JLabel label = new JLabel("Hello World");
    private static JFrame frame = new JFrame("HelloWorldSwing");

    private static JPanel createButtonPanel() {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1));

        JButton button1 = new JButton("Press me");
        JButton button2 = new JButton("Octopus");
        JButton button3 = new JButton("Hola");

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("You did it!");
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Octopus");
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hola");
            }
        });

        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);

        return buttonPanel;
    }

    private static JMenuBar createMenuBar() {
        JMenuBar menubar = new JMenuBar();

        JMenu menu = new JMenu("Menu");

        JMenuItem m1 = new JMenuItem("Button Screen");

        m1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showDefaultScreen();
            }
        });

        JMenuItem m2 = new JMenuItem("Coder Screen");

        m2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showCoderScreen();
            }
        });

        menu.add(m1);
        menu.add(m2);

        menubar.add(menu);

        return menubar;
    }

    private static void showCoderScreen() {
        System.out.println("Hello");

        JPanel coderPanel = new JPanel();

        coderPanel.add(new JLabel("JD is the best Java Coder ever"));

        frame.remove(0);

        frame.add(coderPanel);
    }

    private static void showDefaultScreen() {
        frame.remove(0);
        frame.add(label);
        frame.add(createButtonPanel());
    }

    /**
     * Create the GUI and show it. For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        // Create and set up the window.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display the window.
        frame.setLayout(new GridLayout(1, 2));

        frame.setJMenuBar(createMenuBar());
        frame.add(label);
        frame.add(createButtonPanel());

        frame.setSize(400, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Schedule a job for the event-dispatching thread:
        // creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
