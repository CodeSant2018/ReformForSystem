/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.services;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mycompany.systemforreform.entity.DataGestion;
import com.mycompany.systemforreform.models.ClientModels;
import com.mycompany.systemforreform.repository.NameIdRepository;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public class ServiceClient implements NameIdRepository<ClientModels> {

    private DataGestion clients = new DataGestion("Clients");

    @Override
    public void create(ClientModels t) {
        try {
            clients.getCollectionData().insertOne(t.toDocumentClient());
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateById(int id, ClientModels t) {
        try {
            clients.getCollectionData().updateOne(Filters.eq("Id Client", id), t.toDocumentClient());
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateByName(String name, ClientModels t) {
        try {
            clients.getCollectionData().updateOne(Filters.eq("Name", name), t.toDocumentClient());
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteById(int id) {
        try {
            clients.getCollectionData().deleteOne(Filters.eq("Id Client", id));
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteByName(String name) {
        try {
            clients.getCollectionData().deleteOne(Filters.eq("Name", name));
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    @Override
    public MongoCollection<Document> all() {
        try {
            return clients.getCollectionData();
        } catch (MongoException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Document getAllById(int id) {
        try {
            return clients.getCollectionData().find(Filters.eq("Id Client", id)).first();
        } catch (MongoException e) {
        }
        return null;
    }

    @Override
    public Document getAllByName(String name) {
        try {
            return clients.getCollectionData().find(Filters.eq("Name", name)).first();
        } catch (MongoException e) {
        }
        return null;
    }

}
