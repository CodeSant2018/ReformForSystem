/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.services;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mycompany.systemforreform.entity.DataGestion;
import com.mycompany.systemforreform.models.VentasModels;
import com.mycompany.systemforreform.repository.RepositoryVentas;
import java.util.Date;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public class ServicesVentas implements RepositoryVentas<VentasModels> {

    private DataGestion ventas = new DataGestion("Ventas");

    @Override
    public void createSales(VentasModels t) {
        try {
            ventas.getCollectionData().insertOne(t.toDocumentVentas());
            JOptionPane.showMessageDialog(null, "Venta Completada", "¡Correcot!", JOptionPane.INFORMATION_MESSAGE);
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    @Override
    public MongoCollection<Document> findAll() {
        try {
            return ventas.getCollectionData();
        } catch (MongoException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Document findByID(int id) {
        try {
            return ventas.getCollectionData().find(Filters.eq("ID_Venta", id)).first();
        } catch (MongoException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Document findByDate(Date date) {
        try {
            return ventas.getCollectionData().find(Filters.eq("Fecha", date)).first();
        } catch (MongoException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Document findByClient(String client) {
        try {
            return ventas.getCollectionData().find(Filters.eq("Cliente", client)).first();
        } catch (MongoException e) {
            e.printStackTrace();
        }

        return null;
    }

}
