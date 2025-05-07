/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.models;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import org.bson.Document;



public class UserModels {
    
    private String user;
    private String name;
    private Date dateOfBirth;
    private String location;
    private String phone;
    private String inCharge;
    private String password;

    public UserModels(String user, String name, Date dateOfBirth, String location, String phone, String inCharge, String password) {
        this.user = user;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.location = location;
        this.phone = phone;
        this.inCharge = inCharge;
        this.password = password;
    }
    
    public Document toDocumentUserMOdels(){
        return new Document("User",user)
                .append("Name", name)
                .append("Date Of Birth", dateOfBirth)
                .append("Location", location)
                .append("Phone", phone)
                .append("In Charge", inCharge)
                .append("Password", password);
    }
    
    
}
