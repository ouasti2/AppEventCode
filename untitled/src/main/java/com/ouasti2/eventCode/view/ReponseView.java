package com.ouasti2.eventCode.view;

import javax.swing.*;

public class ReponseView extends JFrame {
    private JPanel PanelReponse;
    private JLabel label1;
    private JLabel label4;
    private JLabel label3;
    private JLabel label2;
    private JLabel label5;
    private JScrollPane scroll;


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

    public void setPanelReponse(JPanel panelReponse) {
        PanelReponse = panelReponse;
    }

    public void setLabel1(JLabel label1) {
        this.label1 = label1;
    }

    public void setLabel4(JLabel label4) {
        this.label4 = label4;
    }

    public void setLabel3(JLabel label3) {
        this.label3 = label3;
    }

    public void setLabel2(JLabel label2) {
        this.label2 = label2;
    }

    public void setLabel5(JLabel label5) {
        this.label5 = label5;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }
}
