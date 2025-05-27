/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.models;

import java.util.Date;
import java.util.List;
import java.util.Random;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bson.Document;

@Getter
@Setter

public class VentasModels {
    
    private int idVenta;
    private Date fecha;
    private String cliente;
    private List<Document> products;
    private int cantProductos;
    private String tipoPago;
    private double ganancias;
    private double total;

    public VentasModels(Date fecha, String cliente, List<Document> products, int cantProductos, String tipoPago, double ganancias, double total) {
        this.idVenta = getIdVenta();
        this.fecha = fecha;
        this.cliente = cliente;
        this.products = products;
        this.cantProductos = cantProductos;
        this.tipoPago = tipoPago;
        this.ganancias = ganancias;
        this.total = total;
    }
    
    private int getIdVenta(){
        Random rd = new Random();
        return rd.nextInt(999999999);
    }
    
    public Document toDocumentVentas(){
        return new Document("ID_Venta",idVenta)
                .append("Fecha",fecha)
                .append("Cliente", cliente)
                .append("Productos", products)
                .append("Cantidad_Productos", cantProductos)
                .append("Tipo_Pago", tipoPago)
                .append("Ganancias", ganancias)
                .append("Total", total);
    }
}

