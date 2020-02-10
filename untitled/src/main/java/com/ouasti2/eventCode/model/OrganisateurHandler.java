package com.ouasti2.eventCode.model;


import org.apache.commons.dbutils.BasicRowProcessor;
import org.apache.commons.dbutils.BeanProcessor;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;


public class OrganisateurHandler extends BeanHandler<Organisateur> {

    private Connection connection;

    public OrganisateurHandler(Connection connection) {
        super(Organisateur.class, new BasicRowProcessor(new BeanProcessor(mapColumnsToFields())));
        this.connection = connection;

    }

//    @Override
//    public Organisateur handle(ResultSet rs) throws SQLException {
//        BeanHandler<Organisateur> beanHandler = new BeanHandler<>(Organisateur.class);
//        QueryRunner runner = new QueryRunner();
//        String query = "SELECT * FROM organisateur";
//        Organisateur organisateur = runner.query(connection, query, beanHandler);
//        return organisateur;
//    }

    public static Map<String, String> mapColumnsToFields() {
        Map<String, String> columnsToFieldsMap = new HashMap<>();
        columnsToFieldsMap.put("type_compte_id", "typeCompteId");
        columnsToFieldsMap.put("parrain_id", "parrainId");
        columnsToFieldsMap.put("date_derniere_connexion", "dateDerniereConnexion");
        columnsToFieldsMap.put("nom", "typeCompte");
        return columnsToFieldsMap;
    }


}
