/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binario;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class Binario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leeConsola = new Scanner(System.in);
        System.out.println("Ingrese un numero binario: ");
        String entrada = leeConsola.next();
        
        AnalisisLexico lexico = new AnalisisLexico(new BufferedReader(new StringReader(entrada)));
        AnalisisSintactico sintactico = new AnalisisSintactico(lexico);
        
        try{
            sintactico.parse();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
