/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.controller;

import com.mongodb.client.MongoCollection;
import com.mycompany.systemforreform.models.CorteCajaModel;
import com.mycompany.systemforreform.repository.RepositoryCaja;
import com.mycompany.systemforreform.services.ServicesCaja;
import java.util.Date;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public class ControllerCaja implements RepositoryCaja<CorteCajaModel>{
    
    private ServicesCaja caja = new ServicesCaja();

    @Override
    public void createCaja(CorteCajaModel t) {
        caja.createCaja(t);
    }

    @Override
    public MongoCollection<Document> findAll() {
        return caja.findAll();
    }

    @Override
    public Document findByID(int id) {
        return caja.findByID(id);
    }

    @Override
    public Document findByDate(Date date) {
        return caja.findByDate(date);
    }

    @Override
    public Document findByShiftManager(String name) {
        return caja.findByShiftManager(name);
    }
    
}
