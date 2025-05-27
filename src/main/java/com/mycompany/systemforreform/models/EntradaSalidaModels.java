/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.models;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bson.Document;

@Getter
@Setter
@AllArgsConstructor

public class EntradaSalidaModels {

    private Date fecha;
    private String tipoOperacion;
    private String descripcion;
    private double total;
    
    
    public Document toDocumentEntradaSalida(){
        return new Document("Fecha",fecha)
                .append("Tipo Operación", tipoOperacion)
                .append("Descripción", descripcion)
                .append("Total", total);
    }
    
}
