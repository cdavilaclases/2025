/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema4;

/**
 *
 * @author carlos
 */
public class Maestro extends Persona{
    
    public int codigo;
    
    public void saludar(){
        super.saludar();
        System.out.println("Codigo: "+codigo);
    }
    
}
