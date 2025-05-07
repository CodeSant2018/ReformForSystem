/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.entity;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public class DataGestion {
     private String collecion;
    private DataReform reformaData;
    private MongoDatabase data;
    private MongoCollection<Document> collection;

    public DataGestion(String collecion) {
        this.collecion = collecion;
    }

    public MongoCollection<Document> getCollectionData() {

        reformaData = DataReform.getInstance();
        data = reformaData.getData();
        collection = data.getCollection(this.collecion);
        
        return collection;
    }
}
