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
public interface UserAndNameRepository<T> {

    void create(T t);

    MongoCollection<Document> findAll();

    void updateByUser(String user, T t);

    void updateByName(String name, T t);

    void deleteByUser(String user);

    void deleteByName(String name);

    Document findByUser(String user);

    Document findByName(String name);
}
