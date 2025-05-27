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

public class ProveedorModel {

    private String nombre;
    private String rfc;
    private String telefono;
    private String correo;
    private String personaContacto;
    private String dirrecion;
    private String terminosPago;
    private String nota;
    
    public Document toDocumentProveedor(){
        return new Document("Nombre",nombre)
                .append("RFC", rfc)
                .append("Telefono", telefono)
                .append("Correo", correo)
                .append("Persona Contacto", personaContacto)
                .append("Dirección ", dirrecion)
                .append("Terminos Pago", terminosPago)
                .append("Nota", nota);
    }
}
