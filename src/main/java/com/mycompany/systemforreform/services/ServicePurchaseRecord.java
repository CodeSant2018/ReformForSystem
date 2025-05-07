/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.services;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mycompany.systemforreform.entity.DataGestion;
import com.mycompany.systemforreform.models.PurchaseRecordModel;
import com.mycompany.systemforreform.repository.DateRepository;
import java.util.Date;
import javax.swing.JOptionPane;
import org.bson.Document;

public class ServicePurchaseRecord implements DateRepository<PurchaseRecordModel> {

    private DataGestion purchase = new DataGestion("Purchase Record");

    @Override
    public void create(PurchaseRecordModel t) {
        try {
            purchase.getCollectionData().insertOne(t.toDocumentPurchase());
            JOptionPane.showMessageDialog(null, "Pedido Ingresado de Manera Correcta", "¡Correcto!", JOptionPane.INFORMATION_MESSAGE);
        } catch (MongoException e) {
        }
    }

    @Override
    public MongoCollection<Document> findall() {
        try {
            return purchase.getCollectionData();
        } catch (MongoException e) {

        }
        return null;
    }

    @Override
    public void updateByDate(Date data, PurchaseRecordModel t) {
        try {
            purchase.getCollectionData().updateOne(Filters.eq("Date", data), t.toDocumentPurchase());
        } catch (MongoException e) {
            JOptionPane.showMessageDialog(null, "Pedido Actualizado de manera correcta", "¡Correcto!", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    @Override
    public void deleteByDate(Date data) {
        try {
            purchase.getCollectionData().deleteOne(Filters.eq("Date", data));
            JOptionPane.showMessageDialog(null, "Pedido Eliminado de manera correcta", "¡Correcto!", JOptionPane.INFORMATION_MESSAGE);

        } catch (MongoException e) {

        }
    }

    @Override
    public Document findByDate(Date data) {
        try {
            return purchase.getCollectionData().find(Filters.eq("Date", data)).first();
        } catch (MongoException e) {
        }
        return null;
    }

}
