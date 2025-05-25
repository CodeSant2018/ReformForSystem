/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.table;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thevoid
 */
public class TableDesing {
    
    private DefaultTableModel model;
    private JTable table;
    private String[] culum;
    private Class[] tipes;
    private boolean [] culumEtidables;

    public TableDesing(DefaultTableModel model, JTable table, String[] culum, Class[] tipes, boolean[] culumEtidables) {
        this.model = model;
        this.table = table;
        this.culum = culum;
        this.tipes = tipes;
        this.culumEtidables = culumEtidables;
    }
    
    public  void creationTable(){
        try {
            model = (new DefaultTableModel(null,culum){
                 @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return tipes[columnIndex];

                }

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return culumEtidables[columnIndex];
                }

            });
            table.setModel(model);
            
        } catch (Exception e) {
        }
    }
    
}
