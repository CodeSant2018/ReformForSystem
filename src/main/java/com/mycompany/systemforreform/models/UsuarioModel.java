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
public class UsuarioModel {
    private String nombre;
    private String usurio;
    private String correo;
    private String rol;
    private String contraseña;
    private String contraseñaConf;
    private String nota;
    private boolean activo;
    
    public Document toDocumentUsuarios(){
        return new Document("Nombre",nombre)
                .append("Usuario", usurio)
                .append("Correo", correo)
                .append("Rol", rol)
                .append("Contraseña", contraseña)
                .append("Confirmar Contraseña", contraseñaConf)
                .append("Nota", nota)
                .append("Activo", activo);
    }
}
