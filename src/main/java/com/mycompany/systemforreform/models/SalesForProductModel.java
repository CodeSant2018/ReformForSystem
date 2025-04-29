
package com.mycompany.systemforreform.models;

import java.util.Date;
import java.util.List;
import java.util.Random;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.bson.Document;

@Getter
@Setter

public class SalesForProductModel {
   
    private Data data;
    private String client;
    private String product;
    private int cant;
    private double price;
    private double total;
    private double benefit;
    private String methodPayment;
    private UserModels user;

    public SalesForProductModel(Data data, String client, String product, int cant, double price, double total, double benefit, String methodPayment, UserModels user) {
        this.data = data;
        this.client = client;
        this.product = product;
        this.cant = cant;
        this.price = price;
        this.total = total;
        this.benefit = benefit;
        this.methodPayment = methodPayment;
        this.user = user;
    }

    public Document toDocumentSalesForProduct(){
        return new Document("Date",data)
                .append("Client", client)
                .append("Product", product)
                .append("Quantity", cant)
                .append("Price", price)
                .append("Total", total)
                .append("Benefit", benefit)
                .append("Payment Method", methodPayment)
                .append("User", user.toDocumentUserMOdels());
    }
    
    
}
