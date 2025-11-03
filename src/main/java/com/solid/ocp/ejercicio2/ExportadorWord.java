/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solid.ocp.ejercicio2;

// Nueva extensión para Word
public class ExportadorWord extends Documento {

    public ExportadorWord(String contenido) {
        super(contenido);
    }

    @Override
    public void exportar() {
        System.out.println("Exportando a Word...");
    }
}