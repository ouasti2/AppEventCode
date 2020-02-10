package com.ouasti2.eventCode.model;

import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

public class OrganisateurDAO  implements IntrefaceOrganisateurDAO {

    public static Organisateur findOne(String mailEntree, String  passwordEntree ) throws SQLException {
        OrganisateurHandler organisateurHandler = new OrganisateurHandler(SqlService.getConnection());
        QueryRunner runner = new QueryRunner();
        String query = "SELECT o.*, tc.nom, og.mail as mailParrain  FROM organisateur o INNER JOIN organisateur og ON og.id=o.parrain_id INNER JOIN type_compte tc ON tc.id = o.type_compte_id where o.mail = ? and o.password = ?";

        Organisateur organisateur = runner.query(SqlService.getConnection(), query, organisateurHandler, mailEntree, passwordEntree);
        return organisateur;
    }






}

