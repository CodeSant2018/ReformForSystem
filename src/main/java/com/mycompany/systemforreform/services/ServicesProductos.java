/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.services;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mycompany.systemforreform.entity.DataGestion;
import com.mycompany.systemforreform.models.ProductosModel;
import com.mycompany.systemforreform.repository.RepositoryProductos;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public class ServicesProductos implements RepositoryProductos<ProductosModel> {

    private DataGestion productos = new DataGestion("Productos");

    @Override
    public void createProducto(ProductosModel t) {
        try {
            productos.getCollectionData().insertOne(t.toDocumentProductos());
            JOptionPane.showMessageDialog(null, "Producto Ingresado de Manera Correcta", "!Correcto¡", JOptionPane.INFORMATION_MESSAGE);
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    @Override
    public MongoCollection<Document> findAll() {
        try {
            return productos.getCollectionData();
        } catch (MongoException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void updateByName(String name, ProductosModel t) {
        try {
            productos.getCollectionData().updateOne(Filters.eq("nombre", name), new Document("$set", t.toDocumentProductos()));
            JOptionPane.showMessageDialog(null, "Producto Actualizado de Manera Correcta", "¡Correcto!", JOptionPane.INFORMATION_MESSAGE);
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateById(String id, ProductosModel t) {
        try {
            productos.getCollectionData().updateOne(Filters.eq("idProductos", id), new Document("$set", t.toDocumentProductos()));
            JOptionPane.showMessageDialog(null, "Producto Actualizado de Manera Correcta", "¡Correcto!", JOptionPane.INFORMATION_MESSAGE);
        } catch (MongoException e) {
        }
    }

    @Override
    public void deleteByName(String name) {
        try {
            productos.getCollectionData().deleteOne(Filters.eq("nombre", name));
            JOptionPane.showMessageDialog(null, "Producto Eliminado de Manera Correcta", "¡Correcto!", JOptionPane.INFORMATION_MESSAGE);

        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteByID(String id) {
        try {
            productos.getCollectionData().deleteOne(Filters.eq("idProductos", id));
            JOptionPane.showMessageDialog(null, "Producto Eliminado de Manera Correcta", "¡Correcto!", JOptionPane.INFORMATION_MESSAGE);

        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Document findByName(String name) {
        try {
            return productos.getCollectionData().find(Filters.eq("nombre",name)).first();
        } catch (MongoException e) {
        }
        return null;
    }

    @Override
    public Document findById(String id) {
         try {
            return productos.getCollectionData().find(Filters.eq("idProductos",id)).first();
        } catch (MongoException e) {
        }
        return null;
    }

}
