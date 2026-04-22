/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herenciaa;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author carlos
 */
public class HerenciaA {

    public static void main(String[] args) {
        
        Persona p = new Persona("Test", 20, 'F', new Date(), "14242320101");
        p.imprimir();
        
        Persona p1 = new Persona("Test2", 25, 'M', new Date(), "3423230101");
        p1.imprimir();
        
        Calendar fecha = Calendar.getInstance();
        fecha.set(2001, 8, 16,0, 0, 0);
        
        
        Empleado e = new Empleado("Test3", 45, 'F', fecha.getTime(), "2343242340101", "Progra", 5000, "IT");
        e.imprimir();
    }
}
