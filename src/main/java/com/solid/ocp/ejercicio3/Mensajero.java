/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solid.ocp.ejercicio3;

// Abstracción de canal (Abierto para extensión)
public abstract class Mensajero {
    public abstract void enviar(String mensaje);
}