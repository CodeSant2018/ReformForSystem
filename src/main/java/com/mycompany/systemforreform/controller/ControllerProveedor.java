/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.controller;

import com.mongodb.client.MongoCollection;
import com.mycompany.systemforreform.models.ProveedorModel;
import com.mycompany.systemforreform.repository.RepositoryProveedor;
import com.mycompany.systemforreform.services.ServicesProveedores;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public class ControllerProveedor implements RepositoryProveedor<ProveedorModel>{
    
    private ServicesProveedores proveedores = new ServicesProveedores();

    @Override
    public void crearProveedor(ProveedorModel t) {
        proveedores.crearProveedor(t);
    }

    @Override
    public MongoCollection<Document> findAll() {
       return proveedores.findAll();
    }

    @Override
    public void updateByName(String name, ProveedorModel t) {
        proveedores.updateByName(name, t);
    }

    @Override
    public void deleteByName(String name) {
        proveedores.deleteByName(name);
    }

    @Override
    public Document findByName(String name) {
        return proveedores.findByName(name);
    }
    
}
