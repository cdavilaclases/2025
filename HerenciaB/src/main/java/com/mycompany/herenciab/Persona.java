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

public class Persona implements IterfazPersona{
    
    private String nombre;
    private int edad;
    private Date fechaNacimiento;
    private char genero;
    private String dpi;
    private int id;
    private static int contador = 1;
    
    @Override
    public void registrar(String nombre, int edad, Date fechaNacimiento, 
            char genero, String dpi){
        setId(contador);
        contador ++;
        
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setFechaNacimiento(fechaNacimiento);
        this.setGenero(genero);
        this.setDpi(dpi);
        
    }
    
    public void imprimir(){
        System.out.println("---------------");
        System.out.println("Nombre: " +getNombre());
        System.out.println("Edad: " +getEdad());
        System.out.println("Fecha nac: " +getFechaNacimiento());
        System.out.println("DPI: " +getDpi());
        System.out.println("Genero: " +getGenero());
        System.out.println("ID: " +getId());
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the genero
     */
    public char getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * @return the dpi
     */
    public String getDpi() {
        return dpi;
    }

    /**
     * @param dpi the dpi to set
     */
    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    
    
    
}
