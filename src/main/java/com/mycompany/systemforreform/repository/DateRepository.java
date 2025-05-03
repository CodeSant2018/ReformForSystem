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
public interface DateRepository <T>{
    
    void create(T t);
    MongoCollection<Document>findall();
    void updateByDate(Date data,T t);
    void deleteByDate(Date data);
    Document findByDate(Date data);
}
