/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solid.ocp.ejercicio1;

// Nueva extensión sin modificar la base
public class DescuentoFijo extends Descuento {
    private final double montoFijo;

    public DescuentoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    @Override
    public double aplicarDescuento(double precio) {
        double precioFinal = precio - montoFijo;
        return Math.max(0, precioFinal);
    }
}