package com.ouasti2.eventCode.model;

import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class EvenementDAO {

    public static List<Evenement> findEvenement(Connection connection) throws SQLException {
        EvenementHandler evenementHandler = new EvenementHandler(connection);
        QueryRunner runner = new QueryRunner();
        String query = "WITH \n" +
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
                "                              (SELECT e.nom AS nom_evenement, e.date_evenement AS date_evenement, e.id AS IDE\n" +
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
                "          LEFT JOIN totale_billet ON totale_billet.IDT= nbr_billet_panier.IDP";
        List<Evenement> evenements= runner.query(connection, query, evenementHandler);
        return evenements;
    }


}
