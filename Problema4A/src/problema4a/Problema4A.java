/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4a;

/**
 *
 * @author carlos
 */
public class Problema4A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Profesor p = new Profesor();
        p.profesion = "Ingeniero";
        p.nombre = "X";
        p.saludar();
        
        Alumno a = new Alumno();
        a.carnet = "124123412";
        a.nombre = "Y";
        a.saludar();
    }
    
}
