/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivobinariob;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlos
 */
public class ArchivoBinarioB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Persona p = new Persona();
        p.setNombre("Test");
        p.setApellido("Apellido");
        p.setEdad((short) 30);
        p.setEstatura(1.75f);

        Persona p2 = new Persona();
        p2.setNombre("Test2");
        p2.setApellido("Apellido2");
        p2.setEdad((short) 32);
        p2.setEstatura(1.72f);

        LinkedList<Persona> personas = new LinkedList<>();
        personas.add(p);
        personas.add(p2);

        Listas lista = new Listas();
        lista.setPersonas(personas);

        guardarObjeto(lista, "miObjeto.progra");

        Listas l = (Listas) leerObjeto("miObjeto.progra");

        LinkedList<Persona> per = l.getPersonas();

        for (Persona t : per) {
            System.out.println(t.getNombre());
        }

    }

    public static void guardarObjeto(Object o, String ruta) {

        try {
            FileOutputStream archivo = new FileOutputStream(ruta);
            ObjectOutputStream escribe = new ObjectOutputStream(archivo);
            escribe.writeObject(o);
        } catch (IOException e) {
            Logger.getLogger(ArchivoBinarioB.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public static Object leerObjeto(String ruta) {
        try {
            FileInputStream archivo = new FileInputStream(ruta);
            ObjectInputStream leer = new ObjectInputStream(archivo);
            return leer.readObject();
        } catch (IOException | ClassNotFoundException e) {
            Logger.getLogger(ArchivoBinarioB.class.getName()).log(Level.SEVERE, null, e);
        }

        return null;
    }

}
