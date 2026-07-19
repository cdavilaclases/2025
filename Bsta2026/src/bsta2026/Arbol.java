/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bsta2026;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author carlos
 */
public class Arbol {
    
    private Nodo raiz;
    
    public void insertar(int valor){
        Nodo nuevo = new Nodo();
        nuevo.valor = valor;
        if(raiz == null){
            raiz = nuevo;
        }
        else{
            raiz.insertarHijo(nuevo);
        }
    }
    
    public void inorden(){
        System.out.println("Recorrido inorden: ");
        raiz.inorden();
        System.out.println("");
    }
    public void postorden(){
        System.out.println("Recorrido postorden: ");
        raiz.postorden();
        System.out.println("");
    }
    public void preorden(){
        System.out.println("Recorrido preorden: ");
        raiz.preorden();
        System.out.println("");
    }
    private String obtenerCodidigoGraphviz() {
        String texto = "digraph G\n"
                + "{\n"
                + "    node [shape = circle]\n"
                + "    node [style = filled]\n"
                + "    node [fillcolor = \"#EEEEE\"]\n"
                + "    node [color = \"#EEEEE\"]\n"
                + "    edge [color = \"#31CEF0\"]\n";
        if(raiz!=null){
            texto+=raiz.textoGraphviz();
        }
        texto += "\n}";
        return texto;

    }
    
    private void escribirArchivo(String ruta, String contenido){
        FileWriter fichero = null;
        PrintWriter pw = null;
        
        try{
            fichero = new FileWriter(ruta);
            pw = new PrintWriter(fichero);
            pw.write(contenido);
            pw.close();
            fichero.close();
        
        }catch(Exception e){
            System.out.println(e.getMessage());
        
        } finally{
            if(pw!=null){
                pw.close();
            }
        }
     
    }
    
     public void dibujarGraphviz(){
        try{
            escribirArchivo("archivo.dot",obtenerCodidigoGraphviz());
            ProcessBuilder proceso;
            proceso = new ProcessBuilder("dot","-Tpng","-o","arbol.png","archivo.dot");
            proceso.redirectErrorStream(true);
            proceso.start();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    
    
    
}
