package com.mycompany.systemforreform.models;

import lombok.Getter;
import lombok.Setter;
import org.bson.Document;


@Setter
@Getter

public class ProductsModels {

    private String idProduct;
    private String name;
    private String description;
    private double price;
    private double priceBuy;
    private double revenueProduct;
    private double grossMargin;
    private double revenue;
    private int initialStocks;
    private String units;
    private int minimumStock;

    public ProductsModels() {
    }

    public ProductsModels(String idProduct, String name, String description, double price, double priceBuy, double revenueProduct, double grossMargin, double revenue, int initialStocks, String units, int minimumStock) {
        this.idProduct = idProduct;
        this.name = name;
        this.description = description;
        this.price = price;
        this.priceBuy = priceBuy;
        this.revenueProduct = revenueProduct;
        this.grossMargin = grossMargin;
        this.revenue = revenue;
        this.initialStocks = initialStocks;
        this.units = units;
        this.minimumStock = minimumStock;
    }
    
    public Document toDocumentsProducts(){
        return new Document("Id_Product",this.idProduct)
                .append("Product",this.name)
                .append("Description", description)
                .append("Price", price)
                .append("PriceV", priceBuy)
                .append("Revenue", revenueProduct)
                .append("Gross margin", grossMargin)
                .append("Revenue", revenue)
                .append("Stock", initialStocks)
                .append("Units", units)
                .append("Minimum stock", name);
    }
}
