package com.ouasti2.eventCode.view;

import javax.swing.*;

public class ReponseView extends JFrame {
    private JPanel PanelReponse;
    private JLabel label1;
    private JLabel label4;
    private JLabel label3;
    private JLabel label2;
    private JLabel label5;


    public ReponseView() {
        setContentPane(PanelReponse);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
    }

    public JPanel getPanelReponse() {
        return PanelReponse;
    }

    public JLabel getLabel1() {
        return label1;
    }

    public JLabel getLabel4() {
        return label4;
    }

    public JLabel getLabel3() {
        return label3;
    }

    public JLabel getLabel2() {
        return label2;
    }

    public JLabel getLabel5() {
        return label5;
    }
}
