
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
    private String location;


    public ClientModels(String name, String phone, String location) {
        this.idClient = idGenerate();
        this.name = name;
        this.phone = phone;
        this.location = location;
       
    }
    
    private int idGenerate(){
        Random rd = new Random();
        return rd.nextInt(999999999);
    }
    
    public Document toDocumentClient(){
        return new Document("Id Client",idClient)
                .append("Name", name)
                .append("Phone", phone)
                .append("location", location);
    }
    
}
