/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaa;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author carlos
 */
public class Persona implements InterfazPersona{
    
    public String nombre;
    public int edad;
    public char genero;
    public Date fechaNacimiento;
    public String dpi;
    public int id;
    
    
    private static int contador = 0;
    
    public  Persona(String nombre, int edad, char genero,
    Date fechaNacimiento, String dpi){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.dpi = dpi;
        id = contador;
        contador ++;
    }
    
    @Override
    public void imprimir(){
        System.out.println("------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Genero: "+genero);
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Fecha nacimiento: "+formatoFecha.format(fechaNacimiento));
        System.out.println("DPI: "+dpi);
        System.out.println("ID: "+id);
        
    }
    
}
