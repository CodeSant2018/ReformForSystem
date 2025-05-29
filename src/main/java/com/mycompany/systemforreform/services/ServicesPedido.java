/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.services;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mycompany.systemforreform.entity.DataGestion;
import com.mycompany.systemforreform.models.PedidoModels;
import com.mycompany.systemforreform.repository.RepositoryPedido;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public class ServicesPedido implements RepositoryPedido<PedidoModels> {

    private DataGestion pedido = new DataGestion("Pedidios");

    @Override
    public void crearPedido(PedidoModels t) {
        try {
            pedido.getCollectionData().insertOne(t.toDocumentPedido());
            JOptionPane.showMessageDialog(null, "Pedido Registrado", "Correcto", JOptionPane.INFORMATION_MESSAGE);
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    @Override
    public MongoCollection<Document> findAll() {
        try {
            return pedido.getCollectionData();
        } catch (MongoException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void updateByID(int id, PedidoModels t) {
        try {
            pedido.getCollectionData().updateOne(Filters.eq("ID_Pedido", id), new Document("$set", t.toDocumentPedido()));
            JOptionPane.showMessageDialog(null, "Pedido Actualizado", "Correcto", JOptionPane.INFORMATION_MESSAGE);

        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Document findByID(int id) {
        try {
            return pedido.getCollectionData().find(Filters.eq("ID_Pedido", id)).first();
        } catch (MongoException e) {
            e.printStackTrace();
        }
        return null;
    }

}
