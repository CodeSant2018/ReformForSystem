/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.systemforreform;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTMonokaiProIJTheme;
import com.mycompany.systemforreform.vista.MainPanel;
import com.mycompany.systemforreform.vista.loging.Loging;
import javax.swing.UIManager;

/**
 *
 * @author thevoid
 */
public class SystemForReform {

    public static void main(String[] args) {
        FlatMTMonokaiProIJTheme.setup();
        UIManager.put("Button.arc", 15);
        UIManager.put("TextComponent.arc", 15);
        MainPanel mp = new MainPanel();
        mp.setVisible(true);
        mp.setLocationRelativeTo(null);
     
        
       

    }
}
