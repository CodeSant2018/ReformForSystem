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
public interface NameIdRepository<T> {

    void create(T t);

    MongoCollection<Document> all();

    void updateById(int id, T t);

    void updateByName(String name, T t);

    void deleteById(int id);

    void deleteByName(String name);

    Document getAllById(int id);

    Document getAllByName(String name);

}
