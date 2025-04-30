/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplofuncionalb;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 *
 * @author carlos
 */
public class EjemploFuncionalB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Consumer<Double> decirPrecioSinIva = (precio) -> {
            System.out.println(precio/1.12);
        };
        
        decirPrecioSinIva.accept(100.0);
        decirPrecioSinIva.accept(25.5);
        decirPrecioSinIva.accept(275.99);
        
        Comparator<Integer> sumar = (a,b) -> a + b;
        
        System.out.println(sumar.compare(3,5));
        
        ArrayList<Double> precios = new ArrayList<>();
        precios.add(20.45);
        precios.add(48.75);
        precios.add(120.50);
        
        
        precios.forEach(decirPrecioSinIva);
        
        Calendar fechaYHoraActual = Calendar.getInstance();
       
        System.out.println(fechaYHoraActual.getTime());
        
       
    }
  
    
}
