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
public class PurchaseRecordModel {
    private Date date;
    private SupplierModel pupplier;
    private List<Document> products;
    private Date  deliveryDate;
    private double totalPurchase;
    private String termsOfPayment;
    private String note;

    public PurchaseRecordModel(Date date, SupplierModel pupplier, List<Document> products, Date deliveryDate, double totalPurchase, String termsOfPayment, String note) {
        this.date = date;
        this.pupplier = pupplier;
        this.products = products;
        this.deliveryDate = deliveryDate;
        this.totalPurchase = totalPurchase;
        this.termsOfPayment = termsOfPayment;
        this.note = note;
    }
    
    public Document toDocumentPurchase(){
        return new Document("Date",date)
                .append("Pupplier", pupplier.toDocumentSupplier())
                .append("Products", products)
                .append("Delevery Date", deliveryDate)
                .append("Total Purchase", totalPurchase)
                .append("Terms Of Payment", termsOfPayment)
                .append("Note", note);
    }

}
