/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solid.ocp.ejercicio2;

// Abierto para extensión
public abstract class Documento {
    protected String contenido;

    public Documento(String contenido) {
        this.contenido = contenido;
    }

    public abstract void exportar();
}