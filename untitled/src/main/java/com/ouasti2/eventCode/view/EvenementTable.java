package com.ouasti2.eventCode.view;

import com.ouasti2.eventCode.model.Evenement;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class EvenementTable extends AbstractTableModel {

    String[] columnNames = {
            "Nom de l'evenement",
            "Date et heure ",
            "Nombre de billet max",
            "Nombre billet vendu",
            "Nombre billets en panier"
    };

    Object[][] data;

    public EvenementTable(List<Evenement> evenements) {
        //TODO: mettre dans data la liste d'evenements
    }

    @Override
    public int getRowCount() {

    }

    @Override
    public int getColumnCount() {

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

    }

    @Override
    public String getColumnName(int column) {

    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {

    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {

    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        //TODO: modifier dans data ET dans dans sql
    }
}
