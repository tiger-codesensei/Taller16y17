/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solid.ocp.ejercicio2;

// Implementación PDF
public class ExportadorPDF extends Documento {

    public ExportadorPDF(String contenido) {
        super(contenido);
    }

    @Override
    public void exportar() {
        System.out.println("Exportando a PDF...");
    }
}