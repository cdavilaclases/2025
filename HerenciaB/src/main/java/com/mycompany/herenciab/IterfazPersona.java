/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.herenciab;

import java.util.Date;

/**
 *
 * @author carlos
 */
public interface IterfazPersona {
    
    public void registrar(String nombre, int edad, Date fechaNacimiento, 
            char genero, String dpi);
    public void imprimir();
    
}
