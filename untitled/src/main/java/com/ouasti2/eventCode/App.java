package com.ouasti2.eventCode;

import com.ouasti2.eventCode.controller.ControllerConnexion;
import com.ouasti2.eventCode.model.OrganisateurDAO;

import java.sql.SQLException;

public class App {
    //    susan97@jean.com
    //    JT.>0XS~vj/VN4Ir'&xk
    public static void main(String[] args) throws SQLException {
        ControllerConnexion.verificationConnexion();
        //System.out.println(OrganisateurDAO.findOne("susan97@jean.com", "JT.>0XS~vj/VN4Ir'&xk"));
    }
}
