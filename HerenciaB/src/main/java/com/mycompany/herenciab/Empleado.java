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
public class Empleado extends Persona{
    
    public String puesto;
    public String area;
    public double salario;
    
    public void registrarEmpleado(String nombre, int edad, Date fechaNacimiento, 
            char genero, String dpi, String puesto, String area, double salario){
        
        super.registrar(nombre, edad, fechaNacimiento, genero, dpi);
        this.puesto = puesto;
        this.area = area;
        this.salario = salario;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Puesto:"+puesto);
        System.out.println("Area:"+area);
        System.out.println("Salario:"+salario);
    }
    
}
