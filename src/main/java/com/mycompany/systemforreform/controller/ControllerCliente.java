/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.controller;

import com.mongodb.client.MongoCollection;
import com.mycompany.systemforreform.models.ClienteModel;
import com.mycompany.systemforreform.repository.RepositoryCliente;
import com.mycompany.systemforreform.services.ServicesCliente;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public class ControllerCliente implements RepositoryCliente<ClienteModel>{
    
    private ServicesCliente cliente = new ServicesCliente();

    @Override
    public void createCliente(ClienteModel t) {
        cliente.createCliente(t);
    }

    @Override
    public MongoCollection<Document> findAll() {
        return cliente.findAll();
    }

    @Override
    public void updateByName(String name, ClienteModel t) {
        cliente.updateByName(name, t);
    }

    @Override
    public void deleteByName(String name) {
        cliente.deleteByName(name);
    }

    @Override
    public Document findByName(String name) {
        return cliente.findByName(name);
    }
    
}
