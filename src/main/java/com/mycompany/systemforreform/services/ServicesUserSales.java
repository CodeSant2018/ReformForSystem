/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.services;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mycompany.systemforreform.entity.DataGestion;
import com.mycompany.systemforreform.models.UserSalesModel;
import com.mycompany.systemforreform.repository.DateAndNameRepository;
import java.util.Date;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public class ServicesUserSales implements DateAndNameRepository<UserSalesModel> {

    private DataGestion userSales = new DataGestion("User Sales");

    @Override
    public void create(UserSalesModel t) {
        userSales.getCollectionData().insertOne(t.toDocumentUserSales());
    }

    @Override
    public MongoCollection<Document> findAll() {
        return userSales.getCollectionData();
    }


    @Override
    public Document findByDate(Date date) {
        return userSales.getCollectionData().find(Filters.eq("Date", date)).first();
    }

    @Override
    public Document findByName(String name) {
        return userSales.getCollectionData().find(Filters.eq("User.User", name)).first();
    }

}
