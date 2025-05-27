/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.services;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mycompany.systemforreform.entity.DataGestion;
import com.mycompany.systemforreform.models.EntradaSalidaModels;
import com.mycompany.systemforreform.repository.RepositoryESEfectivo;
import java.util.Date;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public class ServicesES implements RepositoryESEfectivo<EntradaSalidaModels>{
    
    private DataGestion EntradaSal = new DataGestion("Entrada Salida Efectivo");

    @Override
    public void createES(EntradaSalidaModels t) {
        try {
            EntradaSal.getCollectionData().insertOne(t.toDocumentEntradaSalida());
            JOptionPane.showMessageDialog(null, "Cantidad Ingresa Correctamente","¡Correcto!",JOptionPane.INFORMATION_MESSAGE);
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    @Override
    public MongoCollection<Document> findAll() {
        try {
            return EntradaSal.getCollectionData();
        } catch (MongoException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void updateByDate(Date date,EntradaSalidaModels t) {
        try {
            EntradaSal.getCollectionData().updateOne(Filters.eq("Fecha",date),t.toDocumentEntradaSalida());
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Document findByDate(Date date) {
        try {
            return EntradaSal.getCollectionData().find(Filters.eq("Fecha",date)).first();
        } catch (MongoException e) {
            e.printStackTrace();
        }
        return null;
    }
}
