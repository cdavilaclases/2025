/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema4a;

/**
 *
 * @author carlos
 */
public class Alumno extends Persona{
    
    public String carnet;
    
    public void saludar(){
        super.saludar();
        System.out.println("Mi carnet es: "+carnet);
    }
    
}
