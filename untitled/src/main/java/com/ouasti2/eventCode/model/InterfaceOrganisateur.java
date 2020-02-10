package com.ouasti2.eventCode.model;

import java.sql.Timestamp;

public interface InterfaceOrganisateur{
    public int getTypeCompteId();
    public int getParrainId();
    public String getMail();
    public String getPassword();
    public Timestamp getDateDerniereConnexion();

}
