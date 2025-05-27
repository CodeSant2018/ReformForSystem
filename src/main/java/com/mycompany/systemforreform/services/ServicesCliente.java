/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.services;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mycompany.systemforreform.entity.DataGestion;
import com.mycompany.systemforreform.models.ClienteModel;
import com.mycompany.systemforreform.repository.RepositoryCliente;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public class ServicesCliente implements RepositoryCliente<ClienteModel> {

    private DataGestion cliente = new DataGestion("Clientes");

    @Override
    public void createCliente(ClienteModel t) {
        try {
            cliente.getCollectionData().insertOne(t.toDocumentCliente());
            JOptionPane.showMessageDialog(null, "Cliente Ingresado de Manera Correcta", "¡Correcto!", JOptionPane.INFORMATION_MESSAGE);
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    @Override
    public MongoCollection<Document> findAll() {
        try {
            return cliente.getCollectionData();
        } catch (MongoException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void updateByName(String name, ClienteModel t) {
        try {
            cliente.getCollectionData().updateOne(Filters.eq("Nombre", name), new Document("$set", t.toDocumentCliente()));
            JOptionPane.showMessageDialog(null, "Cliente Actualizado de Manera Correcta", "¡Correcto!", JOptionPane.INFORMATION_MESSAGE);

        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteByName(String name) {
        try {
            cliente.getCollectionData().deleteOne(Filters.eq("Nombre", name));
            JOptionPane.showMessageDialog(null, "Cliente Eliminado de Manera Correcta", "¡Correcto!", JOptionPane.INFORMATION_MESSAGE);

        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Document findByName(String name) {
        try {
            return cliente.getCollectionData().find(Filters.eq("Nombre", name)).first();
        } catch (MongoException e) {
            e.printStackTrace();
        }
        return null;
    }
}
