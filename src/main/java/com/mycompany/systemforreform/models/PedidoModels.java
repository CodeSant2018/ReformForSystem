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

public class PedidoModels {

    private int idPedido;
    private String proveedor;
    private List<Document> productos;
    private double subtotal;
    private double total;
    private Date fechaEntrega;
    private String estatus;
    private String nota;

    public PedidoModels(String proveedor, List<Document> productos, double subtotal, double total, Date fechaEntrega, String estatus, String nota) {
        this.idPedido = getIdPedido();
        this.proveedor = proveedor;
        this.productos = productos;
        this.subtotal = subtotal;
        this.total = total;
        this.fechaEntrega = fechaEntrega;
        this.estatus = estatus;
        this.nota = nota;
    }
    
    private int getIdPedido(){
        Random rd = new Random();
        return rd.nextInt(999999999);
    }
    
    public Document toDocumentPedido(){
        return new Document("ID_Pedido",idPedido)
                .append("Proveedor", proveedor)
                .append("Productos", productos)
                .append("SubTotal", subtotal)
                .append("Total", total)
                .append("Fecha Entrega", fechaEntrega)
                .append("Estatus", estatus)
                .append("Nota", nota);
    }
}
