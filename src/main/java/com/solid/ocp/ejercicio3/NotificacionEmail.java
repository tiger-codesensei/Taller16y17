/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solid.ocp.ejercicio3;

public class NotificacionEmail extends Mensajero {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando EMAIL: " + mensaje);
    }
}