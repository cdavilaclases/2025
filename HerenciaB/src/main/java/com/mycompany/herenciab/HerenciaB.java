/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herenciab;

import java.util.Date;

/**
 *
 * @author carlos
 */
public class HerenciaB {

    public static void main(String[] args) {
        
        
        Empleado e = new Empleado();
        e.registrarEmpleado("Test", 20, new Date(), 'M', "1234560101", "Ing", "IT", 3000);
        
        e.imprimir();
        
        Empleado e2 = new Empleado();
        e2.registrarEmpleado("Test2", 60, new Date(), 'F', "1234560102", "Ing2", "IT2", 5000);
        e2.imprimir();
        
        
        
        Cliente c = new Cliente();
        
        c.registrarCliente("Cliente", 35, new Date(), 'F', "2141232130101", "242131-7");
        c.imprimir();
        
        
        
    }
}
