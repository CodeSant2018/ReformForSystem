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
public interface RepositoryProductos <T>{
    
    void createProducto(T t);
    MongoCollection<Document> findAll();
    void updateByName(String name,T t);
    void updateById(String id,T t);
    void deleteByName(String name);
    void deleteByID(String id);
    Document findByName(String name);
    Document findById(String id);
}
