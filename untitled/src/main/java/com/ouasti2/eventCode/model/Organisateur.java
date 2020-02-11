package com.ouasti2.eventCode.model;


import java.sql.Timestamp;
import java.util.List;

public class Organisateur implements InterfaceOrganisateur {
    private int id;
    private int typeCompteId;
    private int parrainId;
    private String mail;
    private String password;
    private Timestamp dateDerniereConnexion;
    private String typeCompte;
    private String mailParrain;
    private List<Evenement> organisateursEvent;


    public Organisateur() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTypeCompteId() {
        return typeCompteId;
    }

    public void setTypeCompteId(int typeCompteId) {
        this.typeCompteId = typeCompteId;
    }

    public int getParrainId() {
        return parrainId;
    }

    public void setParrainId(int parrain_id) {
        this.parrainId = parrain_id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getDateDerniereConnexion() {
        return dateDerniereConnexion;
    }

    public void setDateDerniereConnexion(Timestamp date_derniere_connexion) {
        this.dateDerniereConnexion = date_derniere_connexion;
    }

    public String getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(String typeCompte) {
        this.typeCompte = typeCompte;
    }

    public String getMailParrain() {
        return mailParrain;
    }

    public void setMailParrain(String mailParrain) {
        this.mailParrain = mailParrain;
    }

    public List<Evenement> getOrganisateursEvent() {
        return organisateursEvent;
    }

    public void setOrganisateursEvent(List<Evenement> organisateursEvent) {
        this.organisateursEvent = organisateursEvent;
    }


    @Override
    public String toString() {
        return "Organisateur{" +
                "id=" + id +
                ", typeCompteId=" + typeCompteId +
                ", parrainId=" + parrainId +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                ", dateDerniereConnexion=" + dateDerniereConnexion +
                ", typeCompte='" + typeCompte + '\'' +
                ", mailParrain='" + mailParrain + '\'' +
                ", organisateursEvent=" + organisateursEvent +
                '}';
    }
}
