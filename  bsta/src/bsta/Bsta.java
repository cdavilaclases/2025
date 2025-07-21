/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bsta;

/**
 *
 * @author carlos
 */
public class Bsta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbol bst = new Arbol();
        bst.insertar(50);
        bst.insertar(20);
        bst.insertar(8);
        bst.insertar(3);
        bst.insertar(100);
        bst.insertar(205);
        bst.insertar(17);
        bst.insertar(69);
        bst.insertar(20);
        
        bst.inorden();
        bst.postorden();
        bst.preorden();
        
        
    }
    
}
