/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciab;

import java.util.Date;

/**
 *
 * @author carlos
 */
public class Cliente extends Persona{
    
    private String nit;
    
    public void registrarCliente(String nombre, int edad, Date fechaNacimiento, 
            char genero, String dpi,String nit){
        super.registrar(nombre, edad, fechaNacimiento, genero, dpi);
        this.setNit(nit);
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("NIT: "+getNit());
    }

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
    }
    
}
