/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.entity;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author thevoid
 */
public class DataReform {
    
    private static DataReform instance;
    private MongoClient cliente;
    private MongoDatabase data;
    
    private DataReform(){
        cliente = MongoClients.create("mongodb+srv://tiendalareforma2025:je4VkAeKpECyPqx6@tiendareforma.b8vf1i5.mongodb.net/?retryWrites=true&w=majority&appName=TiendaReforma");
        data = cliente.getDatabase("Store_Reform_Data");
    }
    
    
    public static synchronized DataReform getInstance(){
        if (instance==null){
            instance = new DataReform();
        }
        return instance;
    }
    
    public MongoDatabase getData(){
        return data;
    }
    
    public void close(){
        cliente.close();
    }
}
