/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema4;

/**
 *
 * @author carlos
 */
public class Persona implements InterfazPersona{
    
    public String nombre;
    public String apellido;
    public int edad;
    
    public void saludar(){
        System.out.println("Hola soy: "+nombre);
    }
    
}
