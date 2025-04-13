/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

/**
 *
 * @author carlos
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Maestro m = new Maestro();
        m.codigo =1;
        m.apellido = "s";
        m.nombre = "Maestro";
        m.saludar();
        
        Alumno a = new Alumno();
        a.carnet = "3190-24-2332524";
        a.edad = 10;
        a.nombre = "Alumno";
        a.saludar();
        
    }
    
}
