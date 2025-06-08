/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bson.Document;

@Getter
@Setter
@AllArgsConstructor

public class ProductosModel {
    private String nombre;
    private String idProductos;
    private String descripcion;
    private String categoria;
    private String proveedor;
    private double precioCompra;
    private double precioVenta;
    private double ganancias;
    private double margenBruto;
    private int stockIncial;
    private int stockMinimo;
    private String unidad;
    
    public Document toDocumentProductos(){
            return new Document()
            .append("nombre", nombre)
            .append("idProductos", idProductos)
            .append("descripcion", descripcion)
            .append("categoria", categoria)
            .append("proveedor", proveedor)
            .append("precioCompra", precioCompra)
            .append("precioVenta", precioVenta)
            .append("ganancias", ganancias)
            .append("margenBruto", margenBruto)
            .append("stockInicial", stockIncial)
            .append("stockMinimo", stockMinimo)
            .append("unidad", unidad);
    }
    
}
