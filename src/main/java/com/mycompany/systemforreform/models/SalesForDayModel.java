/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.models;

import java.util.Date;
import java.util.List;
import org.bson.Document;


public class SalesForDayModel {
 
    private Date date;
    private List<Document>salesForProduct;
    private double salesTotal;
    private double benefit;

    public SalesForDayModel(Date date, List<Document> salesForProduct, double salesTotal, double benefit) {
        this.date = date;
        this.salesForProduct = salesForProduct;
        this.salesTotal = salesTotal;
        this.benefit = benefit;
    }
    
    public Document toDocumentSalesForDay(){
        return new Document("Date",date)
                .append("Sales For Product", salesForProduct)
                .append("Sales Total", salesTotal)
                .append("Benefit",benefit);
    }
          
    
}
