/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.models;

import java.util.Date;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public class SupplierModel {

    private String supplier;
    private String phone;
    private String productsSupplied;
    private Date visitDate;

    public SupplierModel(String supplier, String phone, String productsSupplied, Date visitDate) {
        this.supplier = supplier;
        this.phone = phone;
        this.productsSupplied = productsSupplied;
        this.visitDate = visitDate;
    }

    
    public Document toDocumentSupplier(){
        return new Document("Supplier",supplier)
                .append("Phone", phone)
                .append("Products Supplied", productsSupplied)
                .append("Visit Day", visitDate);
    }
}
