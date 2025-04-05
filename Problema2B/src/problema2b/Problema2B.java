/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2b;

/**
 *
 * @author carlos
 */
public class Problema2B {

    
    private static String numbersToLetters(String s) {
        String words[] = s.split("\\+");
        String exit = "";
        for(String word : words){
            String letters[]  = word.split("\\s");
            for(String letter: letters){
                int l = Integer.parseInt(letter);
                l+=64;
                char l2 = (char)l;
                exit+=l2;
            }
            exit+=" ";
        }
        return exit;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(numbersToLetters("21 14 9 20+20 5 19 20"));
    }
    
}
