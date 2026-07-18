/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bstb2026;

/**
 *
 * @author carlos
 */
public class Bstb2026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Arbol arbol = new Arbol();
        arbol.insertar(15);
        arbol.insertar(9);
        arbol.insertar(6);
        arbol.insertar(20);
        arbol.insertar(17);
        arbol.insertar(14);
        arbol.insertar(64);
        arbol.insertar(72);
        arbol.insertar(26);
        arbol.insertar(13);
        
        arbol.inorden();
        arbol.postorden();
        arbol.preorden();
        
        arbol.dibujarGraphviz();
        
    }
    
}
