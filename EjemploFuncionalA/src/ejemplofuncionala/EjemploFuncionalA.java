/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplofuncionala;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 *
 * @author carlos
 */
public class EjemploFuncionalA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Comparator<Integer> funcion = (x,z)-> 3*x + z;
        
        System.out.println(funcion.compare(1,2));
        System.out.println(funcion.compare(3,4));
        
        
        Consumer<Venta> precioSinIva = (v)-> { 
            v.totalSinIva = v.total/1.12;
        };
        
        Venta v = new Venta();
        v.total = 100.0;
        
        Venta v2 = new Venta();
        v2.total = 150.0;
        
        Venta v3 = new Venta();
        v3.total = 45.99;
        
        ArrayList<Venta> ventas = new ArrayList<>();
        ventas.add(v);
        ventas.add(v2);
        ventas.add(v3);
        
        ventas.forEach(precioSinIva);
        
        ventas.forEach((x)->{
            System.out.println(x.total);
            System.out.println(x.totalSinIva);
        });
        
        Calendar fechaYHoraActual = Calendar.getInstance();
        System.out.println(fechaYHoraActual.getTime().toString());
        
        
    }
    
}
