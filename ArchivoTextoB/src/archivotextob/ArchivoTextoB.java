/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivotextob;
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
public class ArchivoTextoB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        escribir("rutaRelativa.csv","""
                                    Jhon Smith, 123, ciudad, 80991-9
                                    Mary Smith, 2432, San Jose, 151324123-k
                                    """);
        //escribir("/home/carlos/Desktop/rutaAbsoluta.csv","hola mundo");
        
        ArrayList<Cliente> clientes = leer("rutaRelativa.csv");
        
        clientes.forEach((c)->{
            System.out.print(c.getNombre());
            System.out.print(",");
            System.out.print(c.getTelefono());
            System.out.print(",");
            System.out.print(c.getDireccion());
            System.out.print(",");
            System.out.print(c.getNit());
            System.out.println("");
        });
        
    }
    
    public static void escribir(String ruta
            , String contenido){
        
        try {
            FileWriter archivo = new FileWriter(ruta);
            PrintWriter escribir = new PrintWriter(archivo);
            escribir.write(contenido);
            escribir.close();
            archivo.close();
        } catch (IOException ex) {
            Logger.getLogger(ArchivoTextoB.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }
    
    public static ArrayList<Cliente> leer(String ruta){
    
        ArrayList<Cliente> contenido = new ArrayList<>();
        
        
        try {
            File archivo = new File(ruta);
            FileReader leer = new FileReader(archivo);
            BufferedReader bloque = new BufferedReader(leer);
            String linea = bloque.readLine();
            while(linea !=null){
                String[] cliente = linea.split(",");
                Cliente c = new Cliente();
                c.setNombre(cliente[0].trim());
                c.setTelefono(Integer.parseInt(cliente[1].trim()));
                c.setDireccion(cliente[2].trim());
                c.setNit(cliente[3].trim());
                contenido.add(c);
                linea = bloque.readLine();
            }
            leer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoTextoB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArchivoTextoB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return contenido;
        
    }
    
}
