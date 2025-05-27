/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.controller;

import com.mongodb.client.MongoCollection;
import com.mycompany.systemforreform.models.CompraClienteModel;
import com.mycompany.systemforreform.repository.RepositoryComprasCliente;
import com.mycompany.systemforreform.services.ServicesCompraCliente;
import java.util.Date;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public class ControllerCompraCliente implements RepositoryComprasCliente<CompraClienteModel>{
    
    private ServicesCompraCliente compra = new ServicesCompraCliente();

    @Override
    public void createCompras(CompraClienteModel t) {
        compra.createCompras(t);
    }

    @Override
    public MongoCollection<Document> findAll() {
        return compra.findAll();
    }

    @Override
    public Document findByDate(Date date) {
        return compra.findByDate(date);
    }

    @Override
    public Document findByID(int id) {
        return compra.findByID(id);
    }
    
}
