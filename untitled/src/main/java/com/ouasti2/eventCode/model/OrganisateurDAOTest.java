package com.ouasti2.eventCode.model;

import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

public class OrganisateurDAOTest implements IntrefaceOrganisateurDAO {

    public static Organisateur findOne(String mailEntree, String  passwordEntree, Connection connection) throws SQLException {
        OrganisateurHandler organisateurHandler = new OrganisateurHandler(connection);
        QueryRunner runner = new QueryRunner();
        String query = "SELECT * FROM organisateur WHERE mail = ? AND password= ? LIMIT 1";

        Organisateur organisateur = runner.query(connection, query, organisateurHandler, mailEntree, passwordEntree);
        return organisateur;
    }


    public static String findOneEmailById(int paramId, Connection connection)  throws SQLException{
        OrganisateurHandler organisateurHandler = new OrganisateurHandler(connection);
        QueryRunner runner = new QueryRunner();
        String query = "SELECT  mail  FROM organisateur  WHERE id = ?";
        Organisateur organisateur = runner.query(connection, query, organisateurHandler, paramId);

        String mail = organisateur.getMail();
        return mail;
    }



}
