/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectob;

import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class Proyectob {
    
    public static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static void main(String[] args) {
        
        Usuario u = new Usuario();
        u.setNombre("admin");
        u.setPassword("admin");
        u.setUsuario("admin");
        u.setRol(1);
        
        usuarios.add(u);
        
        Login v = new Login();
        v.setVisible(true);
        
    }
}
