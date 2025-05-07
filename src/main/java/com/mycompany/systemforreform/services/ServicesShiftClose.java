/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemforreform.services;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mycompany.systemforreform.entity.DataGestion;
import com.mycompany.systemforreform.models.ShiftClosureModels;
import com.mycompany.systemforreform.repository.DateIdSearchableRepository;
import java.util.Date;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author thevoid
 */
public class ServicesShiftClose implements DateIdSearchableRepository<ShiftClosureModels>{

    private DataGestion shift = new DataGestion("Shift Closure");
    
    @Override
    public void create(ShiftClosureModels t) {
        try {
            shift.getCollectionData().insertOne(t.toDocumentShiftClosure());
            JOptionPane.showMessageDialog(null, "Cierre de Truno Generado de Manera Correcta","¡Correcto!",JOptionPane.INFORMATION_MESSAGE);
        } catch (MongoException e) {
        }
    }

    @Override
    public MongoCollection<Document> findAll() {
        return shift.getCollectionData();
    }

   
    @Override
    public Document findByDate(Date date) {
        return shift.getCollectionData().find(Filters.eq("date",date)).first();
    }

    @Override
    public Document findById(int id) {
        return shift.getCollectionData().find(Filters.eq("idShiftClosur",id)).first();
    }
    
}
