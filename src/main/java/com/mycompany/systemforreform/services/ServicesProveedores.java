/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.services;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mycompany.systemforreform.entity.DataGestion;
import com.mycompany.systemforreform.models.ProveedorModel;
import com.mycompany.systemforreform.repository.RepositoryProveedor;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public class ServicesProveedores implements RepositoryProveedor<ProveedorModel> {

    private DataGestion proveedor = new DataGestion("Proveedores");

    @Override
    public void crearProveedor(ProveedorModel t) {
        try {
            proveedor.getCollectionData().insertOne(t.toDocumentProveedor());
            JOptionPane.showMessageDialog(null, "Proveedor Ingresado de Manera Correcta", "Correcto", JOptionPane.INFORMATION_MESSAGE);
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    @Override
    public MongoCollection<Document> findAll() {
        try {
            return proveedor.getCollectionData();
        } catch (MongoException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void updateByName(String name, ProveedorModel t) {
        try {
            proveedor.getCollectionData().updateOne(Filters.eq("Nombre", name), new Document("$set", t.toDocumentProveedor()));
            JOptionPane.showMessageDialog(null, "Proveedor Actualizado de Manera Correcta", "Correcto", JOptionPane.INFORMATION_MESSAGE);

        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteByName(String name) {
        try {
            proveedor.getCollectionData().deleteOne(Filters.eq("Nombre", name));
            JOptionPane.showMessageDialog(null, "Proveedor Eliminado de Manera Correcta", "Correcto", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Document findByName(String name) {
        try {
            return proveedor.getCollectionData().find(Filters.eq("Nombre",name)).first();
        } catch (MongoException e) {
        }
        return null;
    }

}
