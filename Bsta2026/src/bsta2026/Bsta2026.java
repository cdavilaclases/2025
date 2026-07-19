/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bsta2026;

/**
 *
 * @author carlos
 */
public class Bsta2026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Arbol arbol = new Arbol();
        arbol.insertar(46);
        arbol.insertar(35);
        arbol.insertar(74);
        arbol.insertar(39);
        arbol.insertar(42);
        arbol.insertar(49);
        arbol.insertar(23);
        arbol.insertar(73);
        arbol.insertar(80);
        arbol.insertar(96);
        
        arbol.inorden();
        arbol.postorden();
        arbol.preorden();
        
        arbol.dibujarGraphviz();
    }
    
}
