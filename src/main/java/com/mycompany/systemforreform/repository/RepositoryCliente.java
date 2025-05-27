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
public interface RepositoryCliente <T> {
    void createCliente(T t);
    MongoCollection<Document> findAll();
    void updateByName(String name,T t);
    void deleteByName(String name);
    Document findByName(String name);
    
}
