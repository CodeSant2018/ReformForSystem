/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.controller;

import com.mongodb.client.MongoCollection;
import com.mycompany.systemforreform.models.PedidoModels;
import com.mycompany.systemforreform.repository.RepositoryPedido;
import com.mycompany.systemforreform.services.ServicesPedido;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public class ControllerPedido implements RepositoryPedido<PedidoModels>{
    
    private ServicesPedido pedido = new ServicesPedido();

    @Override
    public void crearPedido(PedidoModels t) {
        pedido.crearPedido(t);
    }

    @Override
    public MongoCollection<Document> findAll() {
        return pedido.findAll();
    }

    @Override
    public void updateByID(int id, PedidoModels t) {
        pedido.updateByID(id, t);
    }

    @Override
    public Document findByID(int id) {
        return pedido.findByID(id);
  }
    
}
