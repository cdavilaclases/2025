/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivobinarioa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class ArchivoBinarioA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona p = new Persona();
        p.setNombre("Test");
        p.setApellido("Apellido");
        p.setEdad((short)30);
        p.setEstatura(1.71f);
        
        Persona p2 = new Persona();
        p2.setNombre("Test2");
        p2.setApellido("Apellido2");
        p2.setEdad((short)32);
        p2.setEstatura(1.72f);
        
        
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(p);
        personas.add(p2);
        
        Programa prog = new Programa();
        prog.setPersonas(personas);
        
        escribirArchivoBinario(prog, "objeto.progra");
        
        Programa leeido = (Programa)leerArchivoBinario("objeto.progra");
        
        for(Persona l : leeido.getPersonas()){
            System.out.println(l.getNombre());
            System.out.println(l.getApellido());
            System.out.println(l.getEdad());
            System.out.println(l.getEstatura());
            System.out.println("-------------------");
        }
    }
    
    public static void escribirArchivoBinario(Object o, String ruta){
        try{
            FileOutputStream archivo = new FileOutputStream(ruta);
            ObjectOutputStream escribe = new ObjectOutputStream(archivo);
            escribe.writeObject(o);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static Object leerArchivoBinario(String ruta){
        try{
            FileInputStream archivo = new FileInputStream(ruta);
            ObjectInputStream lee = new ObjectInputStream(archivo);
            return lee.readObject();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
}
