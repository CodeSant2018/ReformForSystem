/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.models;

import java.util.Date;
import java.util.Random;
import lombok.Getter;
import lombok.Setter;
import org.bson.Document;

@Getter
@Setter

public class CorteCajaModel {

    private int id;
    private Date fecha;
    private String encargado;
    private double montoIncial;
    private double totalEfectivo;
    private double totalTransferencia;
    private double totalTarjeta;
    private double totalSalidas;
    private double totalEntradas;
    private double dineroCaja;
    private double totalVentasDia;
    private double efectivoEsperado;
    private double diferencia;
    private double gananciasTotales;

    public CorteCajaModel(Date fecha, String encargado, double montoIncial, double totalEfectivo, double totalTransferencia, double totalTarjeta, double totalSalidas, double totalEntradas, double dineroCaja, double totalVentasDia, double efectivoEsperado, double diferencia, double gananciasTotales) {
        this.id = getIdCorte();
        this.fecha = fecha;
        this.encargado = encargado;
        this.montoIncial = montoIncial;
        this.totalEfectivo = totalEfectivo;
        this.totalTransferencia = totalTransferencia;
        this.totalTarjeta = totalTarjeta;
        this.totalSalidas = totalSalidas;
        this.totalEntradas = totalEntradas;
        this.dineroCaja = dineroCaja;
        this.totalVentasDia = totalVentasDia;
        this.efectivoEsperado = efectivoEsperado;
        this.diferencia = diferencia;
        this.gananciasTotales = gananciasTotales;
    }

    private int getIdCorte() {
        Random rd = new Random();
        return rd.nextInt(999999999);
    }
    
    
    public Document toDocumentCorteCaja(){
        return new Document("Id_Corte",id)
                .append("Fecha", fecha)
                .append("Encargado", encargado)
                .append("Monto Inicial", montoIncial)
                .append("Total Efectivo", totalEfectivo)
                .append("Total Transferencias",totalTransferencia)
                .append("Total Tarjeta", totalTarjeta)
                .append("Total Salida Efectivo", totalSalidas)
                .append("Total Entradas Efectivo", totalEntradas)
                .append("Dinero Caja", dineroCaja)
                .append("Total Venta Día", totalVentasDia)
                .append("Efectivo Esperado", efectivoEsperado)
                .append("Diferencia", diferencia)
                .append("Ganancias Totales", gananciasTotales);
    }
}
