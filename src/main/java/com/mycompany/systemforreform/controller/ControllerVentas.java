/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.controller;

import com.mongodb.client.MongoCollection;
import com.mycompany.systemforreform.models.VentasModels;
import com.mycompany.systemforreform.repository.RepositoryVentas;
import com.mycompany.systemforreform.services.ServicesVentas;
import java.util.Date;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public class ControllerVentas implements RepositoryVentas<VentasModels>{
    
    private ServicesVentas ventas = new ServicesVentas();

    @Override
    public void createSales(VentasModels t) {
        ventas.createSales(t);
    }

    @Override
    public MongoCollection<Document> findAll() {
        return ventas.findAll();
    }

    @Override
    public Document findByID(int id) {
        return ventas.findByID(id);
    }

    @Override
    public Document findByDate(Date date) {
        return ventas.findByDate(date);
    }

    @Override
    public Document findByClient(String client) {
        return ventas.findByClient(client);
      }
    
    
}
