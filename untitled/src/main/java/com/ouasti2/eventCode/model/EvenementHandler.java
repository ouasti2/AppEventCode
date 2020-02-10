package com.ouasti2.eventCode.model;

import org.apache.commons.dbutils.BasicRowProcessor;
import org.apache.commons.dbutils.BeanProcessor;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvenementHandler extends BeanListHandler<Evenement> {

    private Connection connection;

    public EvenementHandler(Connection connection) {
        super(Evenement.class, new BasicRowProcessor(new BeanProcessor(mapColumnsToFields())));
        this.connection = connection;
    }


    public static Map<String, String> mapColumnsToFields() {
        Map<String, String> columnsToFieldsMap = new HashMap<>();
        columnsToFieldsMap.put("organisateur_id", "organisateurId");
        columnsToFieldsMap.put("date_evenement", "dateEvenement");
        return columnsToFieldsMap;
    }


}




