
package com.mycompany.systemforreform.models;

import java.util.Date;
import java.util.List;
import java.util.Random;
import lombok.Getter;
import lombok.Setter;
import org.bson.Document;

@Getter
@Setter

public class SalesModels {
    private int idSales;
    private Date date;
    private String client;
    private List<Document> products;
    private double totalAmount;
    private String paymentMethod;
    private double totalCollected;
    private double turned;
    private double totalProfit;

    public SalesModels(int idSales, Date date, String client, List<Document> products, double totalAmount, String paymentMethod, double totalCollected, double turned, double totalProfit) {
        this.idSales = idSales;
        this.date = date;
        this.client = client;
        this.products = products;
        this.totalAmount = totalAmount;
        this.paymentMethod = paymentMethod;
        this.totalCollected = totalCollected;
        this.turned = turned;
        this.totalProfit = totalProfit;
    }
    
    private int idGenerate(){
        Random rd = new Random();
        return rd.nextInt(999999999);
    }
    
    
    public Document toDocumentSales(){
        return new Document("Date",date)
                .append("Client", client)
                .append("Products", products)
                .append("Total Amount", totalAmount)
                .append("Payment Method", paymentMethod)
                .append("Total Collected", totalCollected)
                .append("Turned", turned)
                .append("Total Profit", totalProfit);
    }
}
