/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.systemforreform;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.mycompany.systemforreform.vista.Products;
import javax.swing.UIManager;

/**
 *
 * @author thevoid
 */
public class SystemForReform {

    public static void main(String[] args) {
        FlatMacDarkLaf.setup();
        UIManager.put( "TextComponent.arc", 30 );
        Products p = new Products();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
        
    }
}
