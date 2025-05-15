
package com.mycompany.systemforreform.models;

import java.util.Random;
import lombok.Getter;
import lombok.Setter;
import org.bson.Document;

@Getter
@Setter

public class ClientModels {
    
    private int idClient;
    private String name;
     private String phone;
     private String email; 
    private String typeClint;
    private String location;
    private String note;

    public ClientModels(int idClient, String name, String phone, String email, String typeClint, String location, String note) {
        this.idClient = idClient;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.typeClint = typeClint;
        this.location = location;
        this.note = note;
    }


   

    
    private int idGenerate(){
        Random rd = new Random();
        return rd.nextInt(999999999);
    }
    
    public Document toDocumentClient(){
        return new Document("Id Client",idClient)
                .append("Name", name)
                .append("Phone", phone)
                .append("Email", email)
                .append( "Type Client", typeClint)
                .append("location", location)
                .append("Note", note);
    }
    
}
