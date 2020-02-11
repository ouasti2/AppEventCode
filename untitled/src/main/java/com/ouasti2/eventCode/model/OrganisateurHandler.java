package com.ouasti2.eventCode.model;

import org.apache.commons.dbutils.BasicRowProcessor;
import org.apache.commons.dbutils.BeanProcessor;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 public class OrganisateurHandler extends BeanHandler<Organisateur> {

     private static final String  QUERY ="WITH \n" +
             "          nbr_billet_vendu  AS\n" +
             "\t\t\t\t(SELECT bl.evenement_id AS IDV,COUNT(*) AS nombre_billets_vendu \n" +
             "\t\t\t\tFROM billet AS bl \n" +
             "\t\t\t\tWHERE bl.achat_client_id is not null\n" +
             "\t\t\t\tgroup by bl.evenement_id),\n" +
             "\n" +
             "           totale_billet    AS  (select evenement_id IDT ,Sum(nombre_places) AS totale FROM `categorie_billet` GROUP BY evenement_id),\n" +
             "\n" +
             "\n" +
             "          info_evenement AS \n" +
             "                              (SELECT e.nom AS nom_evenement, e.date_evenement AS date_evenement, e.organisateur_id AS organisateurId , e.id AS IDE\n" +
             "                               FROM `evenement` e \n" +
             "                               LEFT JOIN categorie_billet ca ON e.id= ca.evenement_id\n" +
             "                               ),\n" +
             "     \n" +
             "\n" +
             "          nbr_billet_panier  AS  (SELECT bl.evenement_id AS IDP, COUNT(*) AS nombre_billets_panier\n" +
             "                                  FROM billet AS bl \n" +
             "                                  WHERE bl.panier_client_id is not null \n" +
             "                                  group by bl.evenement_id)\n" +
             "       SELECT DISTINCT  \n" +
             "       info_evenement.nom_evenement, info_evenement.date_evenement , totale_billet.totale,  \n" +
             "       nbr_billet_vendu.nombre_billets_vendu, \n" +
             "       nbr_billet_panier.nombre_billets_panier\n" +
             "       \n" +
             "\n" +
             "\n" +
             "          FROM nbr_billet_vendu\n" +
             "          \n" +
             "          LEFT JOIN info_evenement ON nbr_billet_vendu.IDV= info_evenement.IDE\n" +
             "          LEFT JOIN nbr_billet_panier ON nbr_billet_vendu.IDV= nbr_billet_panier.IDP\n" +
             "          LEFT JOIN totale_billet ON totale_billet.IDT= nbr_billet_panier.IDP\n" +
             "\n" +
             "where info_evenement.organisateurId = ?";
    private Connection connection;
    public OrganisateurHandler(Connection connection) {
        super(Organisateur.class, new BasicRowProcessor(new BeanProcessor(mapColumnsToFields())));
        this.connection = connection;

    }

     @Override
     public Organisateur handle(ResultSet rs) throws SQLException {
         Organisateur organisateur = super.handle(rs);
         QueryRunner runner = new QueryRunner();
         EvenementHandler handler = new EvenementHandler(SqlService.getConnection());
         String query =QUERY;
             List<Evenement> evenementsOganisateur = runner.query(SqlService.getConnection(), query, handler, organisateur.getId());
             organisateur.setOrganisateursEvent(evenementsOganisateur);
         return organisateur;
     }



     public static Map<String, String> mapColumnsToFields() {
         Map<String, String> columnsToFieldsMap = new HashMap<>();
         columnsToFieldsMap.put("type_compte_id", "typeCompteId");
         columnsToFieldsMap.put("parrain_id", "parrainId");
         columnsToFieldsMap.put("date_derniere_connexion", "dateDerniereConnexion");
         columnsToFieldsMap.put("nom", "typeCompte");
         return columnsToFieldsMap;
     }
}