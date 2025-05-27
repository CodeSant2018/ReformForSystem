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

public class ClienteModel {
    private String nombre;
    private String telefono;
    private String correo;
    private String tipoCliente;
    private String direccion;
    private String nota;
    
    public Document toDocumentCliente(){
        return new Document("Nombre",nombre)
                .append("Telefono", telefono)
                .append("Correo", correo)
                .append("Tipo Cliente", tipoCliente)
                .append("Dirección", direccion)
                .append("Nota", nota);
    }
}
