/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solid.lsp.ejercicio1;

public class Circulo extends Figura {
    private final double radio;

    public Circulo(double radio) {
        this.radio = Math.max(0, radio);
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
}