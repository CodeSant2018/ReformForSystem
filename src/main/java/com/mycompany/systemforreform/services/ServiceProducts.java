/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.services;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mycompany.systemforreform.entity.DataGestion;
import com.mycompany.systemforreform.models.ProductsModels;
import com.mycompany.systemforreform.repository.NameIdRepository;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public class ServiceProducts implements NameIdRepository<ProductsModels> {

    private DataGestion products = new DataGestion("Products");

    @Override
    public void create(ProductsModels t) {
        try {
            products.getCollectionData().insertOne(t.toDocumentsProducts());
            JOptionPane.showMessageDialog(null, "Producto:" + t.getName() + "\nIngresado de Manera Correcta", "¡Correcto!", JOptionPane.INFORMATION_MESSAGE);
        } catch (MongoException e) {
        }
    }

    @Override
    public void updateById(int id, ProductsModels t) {
        try {
            products.getCollectionData().updateOne(Filters.eq("Id_Product", id), t.toDocumentsProducts());
            JOptionPane.showMessageDialog(null, "Producto:" + t.getName() + "\nActualizado de Manera Correcta", "¡Correcto!", JOptionPane.INFORMATION_MESSAGE);
        } catch (MongoException e) {
        }
    }

    @Override
    public void updateByName(String name, ProductsModels t) {
        try {
            products.getCollectionData().updateOne(Filters.eq("Product", name), t.toDocumentsProducts());
            JOptionPane.showMessageDialog(null, "Producto:" + t.getName() + "\nActualizado de Manera Correcta", "¡Correcto!", JOptionPane.INFORMATION_MESSAGE);
        } catch (MongoException e) {
        }
    }

    @Override
    public void deleteById(int id) {
        try {
            products.getCollectionData().deleteOne(Filters.eq("Id_Product", id));
            JOptionPane.showMessageDialog(null, "Prodducto Eliminado", "¡Correcto!", JOptionPane.INFORMATION_MESSAGE);
        } catch (MongoException e) {
        }
    }

    @Override
    public void deleteByName(String name) {
        try {
            products.getCollectionData().deleteOne(Filters.eq("Product", name));
            JOptionPane.showMessageDialog(null, "Prodducto Eliminado", "¡Correcto!", JOptionPane.INFORMATION_MESSAGE);
        } catch (MongoException e) {
        }
    }

    @Override
    public MongoCollection<Document> all() {
        try {
            return products.getCollectionData();
        } catch (MongoException e) {
        }
        return null;
    }

    @Override
    public Document getAllById(int id) {
        try {
            products.getCollectionData().find(Filters.eq("Id_Product", id)).first();
        } catch (MongoException e) {
        }
        return null;
    }

    @Override
    public Document getAllByName(String name) {
        try {
            products.getCollectionData().find(Filters.eq("Product", name)).first();
        } catch (MongoException e) {
        }
        return null;
    }

}
