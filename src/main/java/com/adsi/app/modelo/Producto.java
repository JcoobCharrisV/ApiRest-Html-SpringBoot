/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adsi.app.modelo;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;



/**
 *
 * @author RICARDO
 */
public class Producto {
    
private  int id ;
private   String nombre;
private   String cantidad ;
private   String valor ;
private   Date fechaIngreso ;
private   String descripcion;
private   String fk_proveedor;
        

    public Producto() {
    }

    public Producto(int id, String nombre, String cantidad, String valor, Date fechaIngreso, String descripcion, String fk_proveedor) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.valor = valor;
        this.fechaIngreso = fechaIngreso;
        this.descripcion = descripcion;
        this.fk_proveedor = fk_proveedor;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIng) {
        this.fechaIngreso = fechaIng;
    }

    public String getFk_proveedor() {
        return fk_proveedor;
    }

    public void setFk_proveedor(String fk_proveedor) {
        this.fk_proveedor = fk_proveedor;
    }

    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
  
  
    
    public static Producto load(ResultSet rs)throws SQLException{
        Producto producto= new Producto();
        
        producto.setId(rs.getInt(1));
        producto.setNombre(rs.getString(2));
        producto.setCantidad(rs.getString(3));
        producto.setValor(rs.getString(4));
        producto.setFechaIngreso(rs.getDate(5));
        producto.setDescripcion(rs.getString(6));
        producto.setFk_proveedor(rs.getString(7));
                       
        return producto;
    }
    
    
  
  
    
}
