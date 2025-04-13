/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema4a;

/**
 *
 * @author carlos
 */
public class Profesor extends Persona{
    
    public String profesion;
    
    @Override
    public void saludar(){
        super.saludar();
        System.out.println("Soy: "+profesion);
    }
    
}
