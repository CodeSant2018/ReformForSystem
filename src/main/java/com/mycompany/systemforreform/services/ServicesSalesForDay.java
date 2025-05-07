/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.services;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mycompany.systemforreform.entity.DataGestion;
import com.mycompany.systemforreform.models.SalesForDayModel;
import com.mycompany.systemforreform.repository.DateRepository;
import java.util.Date;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public class ServicesSalesForDay  implements DateRepository<SalesForDayModel> {

    private DataGestion sales = new DataGestion("Sales For Products");
    
    @Override
    public void create(SalesForDayModel t) {
         try {
            sales.getCollectionData().insertOne(t.toDocumentSalesForDay());
             JOptionPane.showMessageDialog(null, "Venta del Día Generada de Manera Correcta","¡Correcto!",JOptionPane.INFORMATION_MESSAGE);
        } catch (MongoException e) {
        }
    }

    @Override
    public MongoCollection<Document> findall() {
        try {
            return sales.getCollectionData();
        } catch (MongoException e) {
        }
        return null;
    }

    @Override
    public void updateByDate(Date data, SalesForDayModel t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteByDate(Date data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Document findByDate(Date data) {
        try {
            return sales.getCollectionData().find(Filters.eq("Date",data)).first();
        } catch (MongoException e) {
        }
        return null;
    }
    
}
