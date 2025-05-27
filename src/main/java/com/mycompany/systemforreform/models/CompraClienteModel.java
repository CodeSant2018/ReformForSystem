/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.models;

import java.util.Date;
import java.util.List;
import java.util.Random;
import lombok.Getter;
import lombok.Setter;
import org.bson.Document;

@Getter
@Setter

public class CompraClienteModel {

    private int idVentas;
    private Date fecha;
    private List<Document> productos;
    private String tipoPago;
    private double totalVenta;
    private String nota;

    public CompraClienteModel(Date fecha, List<Document> productos, String tipoPago, double totalVenta, String nota) {
        this.idVentas = getIdVenta();
        this.fecha = fecha;
        this.productos = productos;
        this.tipoPago = tipoPago;
        this.totalVenta = totalVenta;
        this.nota = nota;
    }

    private int getIdVenta() {
        Random rd = new Random();

        return rd.nextInt(999999999);

    }

    public Document toDocumentCliente() {
        return new Document("Id Venta", idVentas)
                .append("Fecha", fecha)
                .append("Productos", productos)
                .append("Tipo Pago", tipoPago)
                .append("Total Venta", totalVenta)
                .append("Nota", nota);
    }
}
