/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.services;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mycompany.systemforreform.entity.DataGestion;
import com.mycompany.systemforreform.models.SupplierModel;
import com.mycompany.systemforreform.repository.NameRepository;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public class SeriveSupplier implements NameRepository<SupplierModel>{
    
    private DataGestion supplier = new DataGestion("Supplier");

    @Override
    public void create(SupplierModel t) {
        try {
            supplier.getCollectionData().insertOne(t.toDocumentSupplier());
            JOptionPane.showMessageDialog(null, "Proveedor Ingresado de Manera Correcta","¡Correcto!",JOptionPane.INFORMATION_MESSAGE);
        } catch (MongoException e) {
        }
    }

    @Override
    public MongoCollection<Document> findAll() {
        return supplier.getCollectionData();
    }

    @Override
    public void updateByName(String name, SupplierModel t) {
        try {
            supplier.getCollectionData().updateOne(Filters.eq("Supplier",name),t.toDocumentSupplier());
                    JOptionPane.showMessageDialog(null, "Proveedor Actualizado de Manera Correcta","¡Correcto!",JOptionPane.INFORMATION_MESSAGE);

        } catch (MongoException e) {
        }
    }

    @Override
    public void deleteByName(String name) {
        try {
            supplier.getCollectionData().deleteOne(Filters.eq("Supplier",name));
                    JOptionPane.showMessageDialog(null, "Proveedor Eliminado de Manera Correcta","¡Correcto!",JOptionPane.INFORMATION_MESSAGE);

        } catch (MongoException e) {
        }
    }

    @Override
    public Document findByName(String name) {
        return supplier.getCollectionData().find(Filters.eq("Supplier",name)).first();
    }
    
}
