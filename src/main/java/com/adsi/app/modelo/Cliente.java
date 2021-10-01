/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adsi.app.modelo;

/**
 *
 * @author RICARDO
 */
public class Cliente {
    
    private String nombreCliente;
    private String identificacionCliente;

    public Cliente() {
    }

    public Cliente(String nombreCliente, String identificacionCliente) {
        this.nombreCliente = nombreCliente;
        this.identificacionCliente = identificacionCliente;
    }

    public String getIdentificacionCliente() {
        return identificacionCliente;
    }

    public void setIdentificacionCliente(String identificacionCliente) {
        this.identificacionCliente = identificacionCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombreCliente=" + nombreCliente + ", identificacionCliente=" + identificacionCliente + '}';
    }
    
    
    
    
}
