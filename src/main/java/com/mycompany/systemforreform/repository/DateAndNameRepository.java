/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.systemforreform.repository;

import com.mongodb.client.MongoCollection;
import java.util.Date;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public interface DateAndNameRepository<T> {

    void create(T t);

    MongoCollection<Document> findAll();

 

    Document findByDate(Date date);

    Document findByName(String name);
}
