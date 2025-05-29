/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.controller;

import com.mongodb.client.MongoCollection;
import com.mycompany.systemforreform.models.UsuarioModel;
import com.mycompany.systemforreform.repository.RepositoryUsuarios;
import com.mycompany.systemforreform.services.ServicesUser;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public class ControllerUsuario implements RepositoryUsuarios<UsuarioModel>{
    
    private ServicesUser usuario = new ServicesUser();

    @Override
    public void createProducto(UsuarioModel t) {
        usuario.createProducto(t);
    }

    @Override
    public MongoCollection<Document> findAll() {
        return usuario.findAll();
    }

    @Override
    public void updateByName(String name, UsuarioModel t) {
        usuario.updateByName(name, t);
    }

    @Override
    public void updateByUser(String name, UsuarioModel t) {
        usuario.findByUser(name);
    }

    @Override
    public void deleteByName(String name) {
        usuario.deleteByName(name);
    }

    @Override
    public void deleteByUser(String user) {
        usuario.deleteByUser(user);
    }

    @Override
    public Document findByName(String name) {
        return usuario.findByName(name);
    }

    @Override
    public Document findByUser(String user) {
        return usuario.findByUser(user);
    }
    
}
