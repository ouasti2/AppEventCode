package com.ouasti2.eventCode.model;

import java.sql.Timestamp;

public class Evenement {
    private int id;
    private int organisateurId;
    private String nom;
    private Timestamp dateEvenement;
    private long totale;
    private long nombreBilletsPanier;
    private long nombreBilletsVendu;

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
    public long getTotale() {
        return totale;
    }

    public void setTotale(long totale) {
        this.totale = totale;
    }

    public long getNombreBilletsPanier() {
        return nombreBilletsPanier;
    }

    public void setNombreBilletsPanier(long nombreBilletsPanier) {
        this.nombreBilletsPanier = nombreBilletsPanier;
    }

    public int getOrganisateurId() {
        return organisateurId;
    }

    public void setOrganisateurId(int organisateurId) {
        this.organisateurId = organisateurId;
    }

    public long getNombreBilletsVendu() {
        return nombreBilletsVendu;
    }

    public void setNombreBilletsVendu(long nombreBilletsVendu) {
        this.nombreBilletsVendu = nombreBilletsVendu;
    }

    @Override
    public String toString() {
        return "Evenement{" +
                "id=" + id +
                ", organisateurId=" + organisateurId +
                ", nom='" + nom + '\'' +
                ", dateEvenement=" + dateEvenement +
                ", totale=" + totale +
                ", nombreBilletsPanier=" + nombreBilletsPanier +
                ", nombreBilletsVendu=" + nombreBilletsVendu +
                '}';
    }
}


