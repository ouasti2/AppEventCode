package com.ouasti2.eventCode.model;

import java.sql.Timestamp;

public class Evenement {
  private int id;
  private int organisateurId;
  private String nom;
  private Timestamp dateEvenement;


    public Evenement() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Timestamp getDateEvenement() {
        return dateEvenement;
    }

    public void setDateEvenement(Timestamp dateEvenement) {
        this.dateEvenement = dateEvenement;
    }



    @Override
    public String toString() {
        return "Evenement{" +
                "id=" + id +
                ", organisateurId=" + organisateurId +
                ", nom='" + nom + '\'' +
                ", dateEvenement=" + dateEvenement +
                '}';
    }
}


