/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.systemforreform.repository;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public interface RepositoryPedido<T> {

    void crearPedido(T t);

    MongoCollection<Document> findAll();

    void updateByName(String name, T t);

    void updateByID(int id, T t);

    Document findByName(String name);

    Document findByID(int id);

}
