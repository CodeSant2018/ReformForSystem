/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.controller;

import com.mongodb.client.MongoCollection;
import com.mycompany.systemforreform.models.EntradaSalidaModels;
import com.mycompany.systemforreform.repository.RepositoryESEfectivo;
import com.mycompany.systemforreform.services.ServicesES;
import java.util.Date;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public class ControllerES implements RepositoryESEfectivo<EntradaSalidaModels>{
    
    private ServicesES efectivo = new ServicesES();

    @Override
    public void createES(EntradaSalidaModels t) {
        efectivo.createES(t);
    }

    @Override
    public MongoCollection<Document> findAll() {
        return efectivo.findAll();
    }

    @Override
    public void updateByDate(Date date, EntradaSalidaModels t) {
        efectivo.updateByDate(date, t);
    }

    @Override
    public Document findByDate(Date date) {
        return efectivo.findByDate(date);
    }

}
