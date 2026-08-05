/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automatab2026;

/**
 *
 * @author carlos
 */
public class AutomataB2026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Automata1 a = new Automata1();
        System.out.println(a.validar(""));
        System.out.println(a.validar("aaaaaaa"));
        System.out.println(a.validar("bbbbb"));
        System.out.println(a.validar("cccccc"));
        System.out.println(a.validar("hola"));
        System.out.println(a.validar("aacccac"));
        
        
        
    }
    
}
