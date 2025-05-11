/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivotextoa;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlos
 */
public class ArchivoTextoA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        escribir("rutaRelativa.csv","""
                                    214213-2,Jhon Smit, Ciudad, 45
                                    25323-K, Mary Smith, San Jose, 34
                                    """);
        //escribir("/home/carlos/Desktop/rutaAbsoluta.txt","Hola\nmundo");
        
        ArrayList<Cliente> clientes = leer("rutaRelativa.csv");
        clientes.forEach((c)->{
            System.out.print(c.nombre);
            System.out.print(",");
            System.out.print(c.direccion);
            System.out.print(",");
            System.out.print(c.edad);
            System.out.print(",");
            System.out.print(c.nit);
            System.out.println("");
        });
        
        
    }
    
    public static void escribir(String ruta, String contenido){
        try {
            FileWriter archivo = new FileWriter(ruta);
            PrintWriter escribir = new PrintWriter(archivo);
            escribir.write(contenido);
            escribir.close();
            archivo.close();
        } catch (IOException ex) {
            Logger.getLogger(ArchivoTextoA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ArrayList<Cliente> leer(String ruta){
        ArrayList<Cliente> contenido = new ArrayList<>();
        
        try {
            File archivo = new File(ruta);
            FileReader leer = new FileReader(archivo);
            BufferedReader bloque = new BufferedReader(leer);
            String linea = bloque.readLine();
            while(linea!=null){
                String[] cliente = linea.split(",");
                Cliente c = new Cliente();
                c.nit = cliente[0].trim();
                c.nombre = cliente[1].trim();
                c.direccion = cliente[2].trim();
                c.edad = Integer.parseInt(cliente[3].trim());
                contenido.add(c);
                linea = bloque.readLine();
            }
            leer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoTextoA.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) { 
            Logger.getLogger(ArchivoTextoA.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return contenido;
    }
    
}
