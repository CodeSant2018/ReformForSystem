/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.services;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mycompany.systemforreform.entity.DataGestion;
import com.mycompany.systemforreform.models.CompraClienteModel;
import com.mycompany.systemforreform.repository.RepositoryComprasCliente;
import java.util.Date;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public class ServicesCompraCliente implements RepositoryComprasCliente<CompraClienteModel>{
    
    private DataGestion compras = new DataGestion("Compras Cliente");

    @Override
    public void createCompras(CompraClienteModel t) {
        try {
            compras.getCollectionData().insertOne(t.toDocumentCliente());
        } catch (MongoException e) {
        }
    }

    @Override
    public MongoCollection<Document> findAll() {
        try {
            return compras.getCollectionData();
        } catch (MongoException e) {
        }
        return null;
    }

    @Override
    public Document findByDate(Date date) {
        try {
           return compras.getCollectionData().find(Filters.eq("Fecha",date)).first();
        } catch (MongoException e) {
        }
        return null;
    }

    @Override
    public Document findByID(int id) {
        try {
            return compras.getCollectionData().find(Filters.eq("Id Venta",id)).first();
        } catch (MongoException e) {
        }
        return null;
    }
    
}
