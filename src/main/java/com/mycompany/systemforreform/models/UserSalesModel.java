/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.models;

import java.util.Date;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public class UserSalesModel {
    
    private Date date;
    private UserModels user;
    private List<Document> salesForProduct;
    private double salesTotal;
    private double benefit;

    public UserSalesModel(Date date, UserModels user, List<Document> salesForProduct, double salesTotal, double benefit) {
        this.date = date;
        this.user = user;
        this.salesForProduct = salesForProduct;
        this.salesTotal = salesTotal;
        this.benefit = benefit;
    }
    
    public Document toDocumentUserSales(){
        return new Document("Date",date)
                .append("User", user.toDocumentUserMOdels())
                .append("Sales Total", salesTotal)
                .append("Benefit", benefit);
    }
}
