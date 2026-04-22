/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaa;

import java.util.Date;

/**
 *
 * @author carlos
 */
public class Empleado extends Persona{
    
    public String puesto;
    public double salario;
    public String area;
    
    public Empleado(String nombre, int edad, char genero,
    Date fechaNacimiento, String dpi,String puesto, double salario,
    String area){
        super(nombre, edad, genero, fechaNacimiento, dpi);
        this.puesto = puesto;
        this.salario = salario;
        this.area = area;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Puesto: "+ puesto);
        System.out.println("Salario: "+ salario);
        System.out.println("Area: "+ area);
    }
    
}
