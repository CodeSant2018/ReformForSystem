/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.services;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mycompany.systemforreform.entity.DataGestion;
import com.mycompany.systemforreform.models.SalesForProductModel;
import com.mycompany.systemforreform.repository.DateAndNameRepository;
import java.util.Date;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public class ServiceSalesForDay implements DateAndNameRepository<SalesForProductModel> {

    private DataGestion salesProduct = new DataGestion("Sales for Products");

    @Override
    public void create(SalesForProductModel t) {
        try {
            salesProduct.getCollectionData().insertOne(t.toDocumentSalesForProduct());
        } catch (MongoException e) {
        }
    }

    @Override
    public MongoCollection<Document> findAll() {
        return salesProduct.getCollectionData();
    }


    @Override
    public Document findByDate(Date date) {
        try {
            return salesProduct.getCollectionData().find(Filters.eq("Date", date)).first();
        } catch (MongoException e) {
        }
        return null;
    }

    @Override
    public Document findByName(String name) {
        try {
            return salesProduct.getCollectionData().find(Filters.eq("Product", name)).first();
        } catch (MongoException e) {
        }
        return null;
    }

}
