package com.ouasti2.eventCode.model;

import java.sql.Connection;
import java.sql.SQLException;

public interface IntrefaceOrganisateurDAO {

    static Organisateur findOne(String mailEntree, String passwordEntree, Connection connection) throws SQLException {
        return null;
    }

     static String findOneEmailById(int paramId, Connection connection) throws SQLException {
        return null;
    }

}
