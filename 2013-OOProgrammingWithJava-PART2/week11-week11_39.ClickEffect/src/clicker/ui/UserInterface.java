package clicker.ui;

import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;

import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    private Calculator cal;

    public UserInterface(Calculator cal){
        this.cal = cal;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(1000, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(2,1);
        container.setLayout(layout);

        JLabel text = new JLabel(Integer.toString(cal.giveValue()));

        JButton button = new JButton("Mik!");
        ClickListener click = new ClickListener(this.cal, text);

        button.addActionListener(click);





        container.add(text);

        container.add(button);






    }

    public JFrame getFrame() {
        return frame;
    }
}
