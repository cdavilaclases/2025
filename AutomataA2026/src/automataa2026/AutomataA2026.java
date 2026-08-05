/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automataa2026;

/**
 *
 * @author carlos
 */
public class AutomataA2026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Automata1 a = new Automata1();
        
        System.out.println(a.validar(""));
        System.out.println(a.validar("aaaaaa"));
        System.out.println(a.validar("bbbbbb"));
        System.out.println(a.validar("ccccc"));
        System.out.println(a.validar("abbba"));
        System.out.println(a.validar("abc"));
        System.out.println(a.validar("hola"));
        
    }
    
}
