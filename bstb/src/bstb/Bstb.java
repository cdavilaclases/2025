/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bstb;

/**
 *
 * @author carlos
 */
public class Bstb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arbol bst = new Arbol();
        bst.insertar(12);
        bst.insertar(5);
        bst.insertar(8);
        bst.insertar(27);
        bst.insertar(3);
        bst.insertar(10);
        
        bst.inorden();
        bst.postorden();
        bst.preorden();
        
    }
    
}
