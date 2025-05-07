/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.services;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mycompany.systemforreform.entity.DataGestion;
import com.mycompany.systemforreform.models.UserModels;
import com.mycompany.systemforreform.repository.UserAndNameRepository;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public class ServiceUser implements UserAndNameRepository<UserModels> {

    private DataGestion user = new DataGestion("User");

    @Override
    public void create(UserModels t) {
        try {
            user.getCollectionData().insertOne(t.toDocumentUserMOdels());
            JOptionPane.showMessageDialog(null, "Usuario Ingresado de Manera Correcta", "¡Correcto!", JOptionPane.INFORMATION_MESSAGE);

        } catch (MongoException e) {
        }
    }

    @Override
    public MongoCollection<Document> findAll() {
        return user.getCollectionData();
    }

    @Override
    public void updateByUser(String user, UserModels t) {
        try {
            this.user.getCollectionData().updateOne(Filters.eq("User", user), t.toDocumentUserMOdels());
            JOptionPane.showMessageDialog(null, "Usuario Actualizado de Manera Correcta", "¡Correcto!", JOptionPane.INFORMATION_MESSAGE);
        } catch (MongoException e) {
        }
    }

    @Override
    public void updateByName(String name, UserModels t) {
        try {
            user.getCollectionData().updateOne(Filters.eq("Name", name), t.toDocumentUserMOdels());
            JOptionPane.showMessageDialog(null, "Usuario Actualizado de Manera Correcta", "¡Correcto!", JOptionPane.INFORMATION_MESSAGE);

        } catch (MongoException e) {
        }
    }

    @Override
    public void deleteByUser(String user) {
        try {
            this.user.getCollectionData().deleteOne(Filters.eq("User", user));
            JOptionPane.showMessageDialog(null, "Usuario Eliminado de Manera Correcta", "¡Correcto!", JOptionPane.INFORMATION_MESSAGE);

        } catch (MongoException e) {
        }
    }

    @Override
    public void deleteByName(String name) {
        try {
            this.user.getCollectionData().deleteOne(Filters.eq("Name", name));
            JOptionPane.showMessageDialog(null, "Usuario Eliminado de Manera Correcta", "¡Correcto!", JOptionPane.INFORMATION_MESSAGE);

        } catch (MongoException e) {
        }
    }

    @Override
    public Document findByUser(String user) {
        return this.user.getCollectionData().find(Filters.eq("User",user)).first();
    }

    @Override
    public Document findByName(String name) {
        return this.user.getCollectionData().find(Filters.eq("Name",name)).first();
    }

}
