package clicker.ui;

import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Paulius on 2017.10.20.
 */
public class ClickListener implements ActionListener {

    private Calculator cal;
    private JLabel lable;

    public ClickListener(Calculator cal, JLabel label){
        this.cal = cal;
        this.lable = label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.cal.increase();
        this.lable.setText(Integer.toString(cal.giveValue()));

    }
}
