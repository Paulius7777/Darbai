package greeter.ui;

import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    public UserInterface(){

    }

    @Override
    public void run() {
        frame = new JFrame("Title");
        frame.setPreferredSize(new Dimension(400, 200));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        container.add(new JLabel("Choose meat or fish!"));
        JRadioButton meat = new JRadioButton("Meat");
        JRadioButton fish = new JRadioButton("fish");

//        ButtonGroup buttonGroup = new ButtonGroup();
//        buttonGroup.add(meat);
//        buttonGroup.add(fish);

        container.add(meat);
        container.add(fish);


    }

    public JFrame getFrame() {
        return frame;
    }
}
