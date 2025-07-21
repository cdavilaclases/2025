/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bsta;

/**
 *
 * @author carlos
 */
public class Arbol {
    private Nodo raiz;
    
    public void insertar(int valor){
        Nodo nuevo = new Nodo();
        nuevo.valor = valor;
        
        if(raiz==null){
            raiz = nuevo;
        }
        else{
            raiz.insertar(nuevo);
        }
    }
    
    public void inorden(){
        System.out.println("INORDEN:");
        raiz.inorden();
        System.out.println("-----------");
    }
    
    public void postorden(){
        System.out.println("POSTORDEN:");
        raiz.postorden();
        System.out.println("-----------");
    }
    
    public void preorden(){
        System.out.println("PREORDEN:");
        raiz.preorden();
        System.out.println("-----------");
    }
    
    
    
}
