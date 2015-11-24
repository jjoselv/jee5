/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.primera.servicios;

import com.curso.primera.modelo.Usuario;

/**
 *
 * @author formacion
 */
public class ServicioAutenticacion1 {
    
    private static final ServicioAutenticacion1 INSTANCIA = new ServicioAutenticacion1();
    
    private ServicioAutenticacion1() {
    }

    public static ServicioAutenticacion1 getInstancia() {
        return INSTANCIA;
    }

    public Boolean autenticar(Usuario usuario) {
        return usuario.getNombre().equals("a") && usuario.getClave().equals("a");
    }
}
