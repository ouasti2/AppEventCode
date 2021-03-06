package com.ouasti2.eventCode.controller;


import com.ouasti2.eventCode.model.Evenement;
import com.ouasti2.eventCode.model.Organisateur;
import com.ouasti2.eventCode.model.OrganisateurDAO;
import com.ouasti2.eventCode.view.EvenementTable;
import com.ouasti2.eventCode.view.OrganisateurView;
import com.ouasti2.eventCode.view.ReponseView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

public class ControllerConnexion {

    public static void verificationConnexion() {


        OrganisateurView frame = new OrganisateurView();

        frame.getButton().addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {

                char[] passwordEntree;
                String mailEntree;

                JTable evenementTable = new JTable(new EvenementTable(organisateur.getEvenements()));

                fn.getScroll().getViewport().add(evenementTable);
                Evenement[] evenements;

                StringBuilder passwordEntree1 = new StringBuilder();
                passwordEntree = frame.getPassword1();
                mailEntree = frame.getText1();
                for (int i = 0; i < passwordEntree.length; i++) {
                    passwordEntree1.append(passwordEntree[i]);

                }

                try {
                    Organisateur organisateur = OrganisateurDAO.findOne(mailEntree, passwordEntree1.toString());

                    if (organisateur != null) {
                        frame.dispose();
                        ReponseView fen = new ReponseView();
                        fen.setVisible(true);
                        fen.getLabel1().setText("Les informations de l'organisateur  ");
                        fen.getLabel2().setText("L'identifiant est :  " + organisateur.getId());
                        fen.getLabel3().setText("Le mail de l'organisateur :  " + organisateur.getMail());
                        fen.getLabel4().setText("Le type de compte  :  " + organisateur.getTypeCompte());
                        fen.getLabel5().setText(" Le mail du parrain est : " + organisateur.getMailParrain());


                    } else {
                        frame.getLabel3().setText("login ou mot de passe incorrect");
                        frame.resetPassword();
                        frame.resetTest1();


                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

            }
        });


        frame.setVisible(true);

    }

}

