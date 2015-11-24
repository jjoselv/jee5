/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.primera;

import com.curso.primera.modelo.Usuario;
import com.curso.primera.servicios.ServicioAutenticacion1;

/**
 *
 * @author formacion
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioAutenticacion1 s1 = ServicioAutenticacion1.getInstancia();
        Usuario u = new Usuario("a", "b");
        System.out.println(s1.autenticar(u));
    }
    
}
