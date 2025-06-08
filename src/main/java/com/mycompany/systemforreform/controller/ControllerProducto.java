/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.controller;

import com.mongodb.client.MongoCollection;
import com.mycompany.systemforreform.models.ProductosModel;
import com.mycompany.systemforreform.repository.RepositoryProductos;
import com.mycompany.systemforreform.services.ServicesProductos;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public class ControllerProducto implements RepositoryProductos<ProductosModel>{
    
    private ServicesProductos productos = new ServicesProductos();

    @Override
    public void createProducto(ProductosModel t) {
        productos.createProducto(t);
    }

    @Override
    public MongoCollection<Document> findAll() {
        return productos.findAll();
    }

    @Override
    public void updateByName(String name, ProductosModel t) {
        productos.updateByName(name, t);
    }

    @Override
    public void updateById(String id, ProductosModel t) {
        productos.updateById(id, t);
    }

    @Override
    public void deleteByName(String name) {
        productos.deleteByName(name);
    }

    @Override
    public void deleteByID(String id) {
        productos.deleteByID(id);
    }

    @Override
    public Document findByName(String name) {
        return productos.findByName(name);
    }

    @Override
    public Document findById(String id) {
        return productos.findById(id);
    }
    
}
