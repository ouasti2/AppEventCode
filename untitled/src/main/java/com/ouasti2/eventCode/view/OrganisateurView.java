package com.ouasti2.eventCode.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrganisateurView extends JFrame {

    private JPanel panel;
    private JTextField text1;
    private JPasswordField password1;
    private JButton button;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;


    public OrganisateurView() {
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
    }


    public JPanel getPanel() {
        return panel;
    }

    public String getText1() {
        return text1.getText();
    }

    public char[] getPassword1() {
        return password1.getPassword();
    }

    public JButton getButton() {
        return button;
    }

    public void setText1(JTextField text1) {
        this.text1 = text1;
    }

    public void setPassword1(JPasswordField password1) {
        this.password1 = password1;
    }

    public void resetPassword() {
        password1.setText("");
    }


    public void resetTest1() {
        text1.setText("");
    }
    public JLabel getLabel1() {
        return label1;
    }

    public JLabel getLabel2() {
        return label2;
    }

    public JLabel getLabel3() {
        return label3;
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
