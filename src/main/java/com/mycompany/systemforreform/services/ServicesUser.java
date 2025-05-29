/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.services;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mycompany.systemforreform.entity.DataGestion;
import com.mycompany.systemforreform.models.UsuarioModel;
import com.mycompany.systemforreform.repository.RepositoryUsuarios;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public class ServicesUser implements RepositoryUsuarios<UsuarioModel> {

    private DataGestion usuarios = new DataGestion("Usuarios");

    @Override
    public void createProducto(UsuarioModel t) {
        try {
            usuarios.getCollectionData().insertOne(t.toDocumentUsuarios());
            JOptionPane.showMessageDialog(null, "Usuario Ingresado de Manera Correcta", "¡Correcto!", JOptionPane.INFORMATION_MESSAGE);
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    @Override
    public MongoCollection<Document> findAll() {
        try {
            return usuarios.getCollectionData();
        } catch (MongoException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void updateByName(String name, UsuarioModel t) {
        try {
            usuarios.getCollectionData().updateOne(Filters.eq("Nombre", name), new Document("$set", t.toDocumentUsuarios()));
            JOptionPane.showMessageDialog(null, "Usuario Actualizado de Manera Correcta", "¡Correcto!", JOptionPane.INFORMATION_MESSAGE);

        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateByUser(String name, UsuarioModel t) {
        try {
            usuarios.getCollectionData().updateOne(Filters.eq("Usuario", name), new Document("$set", t.toDocumentUsuarios()));

            JOptionPane.showMessageDialog(null, "Usuario Actualizado de Manera Correcta", "¡Correcto!", JOptionPane.INFORMATION_MESSAGE);

        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteByName(String name) {
        try {
            usuarios.getCollectionData().deleteOne(Filters.eq("Nombre", name));
            JOptionPane.showMessageDialog(null, "Usuario Eliminado de Manera Correcta", "¡Correcto!", JOptionPane.INFORMATION_MESSAGE);

        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteByUser(String user) {
        try {
            usuarios.getCollectionData().deleteOne(Filters.eq("Usuario", user));

            JOptionPane.showMessageDialog(null, "Usuario Eliminado de Manera Correcta", "¡Correcto!", JOptionPane.INFORMATION_MESSAGE);

        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Document findByName(String name) {
        try {
          return  usuarios.getCollectionData().find(Filters.eq("Nombre",name)).first();
        } catch (MongoException e) {
            e.printStackTrace();
        }
        
        return null;
    }

    @Override
    public Document findByUser(String user) {
        try {
          return  usuarios.getCollectionData().find(Filters.eq("Usuario",user)).first();

        } catch (MongoException e) {
            e.printStackTrace();
        }
        return null;
    }

}
