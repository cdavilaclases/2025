/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoa2026;

import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class Consultorio {
    
    public String nombre;
    public int id;
    
    private static int contador = 0;
    
    public ArrayList<Usuario> usuarios = new ArrayList<>();

    public Consultorio(String nombre) {
        this.nombre = nombre;
        id = contador;
        contador ++;
    }
    
    
    
}
