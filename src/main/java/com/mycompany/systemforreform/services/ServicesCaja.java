/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.services;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mycompany.systemforreform.entity.DataGestion;
import com.mycompany.systemforreform.models.CorteCajaModel;
import com.mycompany.systemforreform.repository.RepositoryCaja;
import java.util.Date;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public class ServicesCaja implements RepositoryCaja<CorteCajaModel> {

    private DataGestion caja = new DataGestion("Corte Caja");

    @Override
    public void createCaja(CorteCajaModel t) {
        try {
            caja.getCollectionData().insertOne(t.toDocumentCorteCaja());
            JOptionPane.showMessageDialog(null, "Corte Generado de Manera Correcta", "¡Correcto!", JOptionPane.INFORMATION_MESSAGE);
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    @Override
    public MongoCollection<Document> findAll() {
        try {
            return caja.getCollectionData();
        } catch (MongoException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Document findByID(int id) {
        try {
            return caja.getCollectionData().find(Filters.eq("Id_Corte", id)).first();
        } catch (MongoException e) {
        }
        return null;
    }

    @Override
    public Document findByDate(Date date) {
        try {
            return caja.getCollectionData().find(Filters.eq("Fecha", date)).first();
        } catch (MongoException e) {
        }
        return null;
    }

    @Override
    public Document findByShiftManager(String name) {
        try {
            return caja.getCollectionData().find(Filters.eq("Encargado", name)).first();
        } catch (MongoException e) {
        }
        return null;
    }

}
