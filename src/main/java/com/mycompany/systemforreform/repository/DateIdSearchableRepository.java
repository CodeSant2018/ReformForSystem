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
public interface DateIdSearchableRepository <T> {
    
    void create(T t);
    
    MongoCollection<Document> findAll();
    
    void updateByDate(Date date,T t);
    
    void updateById(int id,T t);
    
    void deleteByDate(Date date);
    
    void deleteById(int id);
    
    Document findByDate(Date date);
    
    Document findById(int id);
    
}
