/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adsi.app.controlador;

import com.adsi.app.modelo.Conexion;
import com.adsi.app.modelo.Producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Yisus
 */
public class Controlador extends Conexion{
   
    public  List<Producto>  findAllProductos() throws SQLException {
        //SELECT * FROM productos 
         if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }
         
         LinkedList lista = new LinkedList();
         PreparedStatement pst = null;
         ResultSet rst = null;
      try {    
            String query;
            query = "SELECT * FROM productos  ";                    //Definir la consulta
            pst = con.prepareStatement(query);                      //Prepararla
                  
            rst = pst.executeQuery();                               //Ejecutarla 
            
            while(rst.next()){
                lista.add(Producto.load(rst));          //Recorrer el rst y llena la lista
            }
            
      } finally {
            if (pst != null) {
                pst.close();
                pst = null;
            }
            if (rst != null) {
                rst.close();
                rst = null;
            }
        }
        return lista;                            //Retorna la lista llena
      
           
    }  
    
   
    public  Long  totalProductos() throws SQLException{
        //SELECT * FROM productos 
         if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }
         
         LinkedList lista = new LinkedList();
         PreparedStatement pst = null;
         ResultSet rst = null;
         Long total = null ;
      try {    
            String query;
            query = "SELECT count(*) FROM productos";             //Definir la consulta
            pst = con.prepareStatement(query);                      //Prepararla
                  
            rst = pst.executeQuery();                               //Ejecutarla 
            
            
            while(rst.next()){
                total = rst.getLong(1) ;                      //Recorrer el rst y llena la lista
            }
            
      } finally {
            if (pst != null) {
                pst.close();
                pst = null;
            }
            if (rst != null) {
                rst.close();
                rst = null;
            }
        }
        return total ;                            //Retorna la lista llena
      
           
    }  
    
    
    public  List<Producto>  listarProductosEscasos(Integer valor ) throws SQLException{
        //SELECT * FROM productos 
         if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }
         
         LinkedList lista = new LinkedList();
         PreparedStatement pst = null;
         ResultSet rst = null;
      try {    
            String query;
            query = "SELECT * FROM productos where cantidad <= ? ";                    //Definir la consulta
            pst = con.prepareStatement(query);                      //Prepararla
            pst.setInt(1, valor);
            
                  
            rst = pst.executeQuery();                               //Ejecutarla 
            
            while(rst.next()){
                lista.add(Producto.load(rst));          //Recorrer el rst y llena la lista
            }
            
      } finally {
            if (pst != null) {
                pst.close();
                pst = null;
            }
            if (rst != null) {
                rst.close();
                rst = null;
            }
        }
        return lista;                            //Retorna la lista llena
      
           
    } 
    
;
    
    
     public  void  addProductos( Producto producto) throws SQLException{
        //SELECT * FROM productos 
         if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }
         
         LinkedList lista = new LinkedList();
         PreparedStatement pst = null;
         ResultSet rst = null;
      try {    
            String query;
            query = " INSERT INTO `productos`\n" +
                    " ( `nombre_completo`, `cantidad`, `valor`, `fecha_ing`,  `descripcion`, `fk_proveedor` )\n" +
                    " VALUES\n" +
                    " (?, ?, ?, ?, ?, ?) ";                    //Definir la consulta
            pst = con.prepareStatement(query);                      //Prepararla
            
            pst.setString(1,producto.getNombre() );
            pst.setString(2,producto.getCantidad() );
            pst.setString(3,producto.getValor() );
            pst.setDate(4, producto.getFechaIngreso());
            pst.setString(5, producto.getDescripcion());
            pst.setString(6, producto.getFk_proveedor());
            
                             
            pst.execute();                               //Ejecutarla 
            
           
            
      } finally {
            if (pst != null) {
                pst.close();
                pst = null;
            }
            if (rst != null) {
                rst.close();
                rst = null;
            }
        }
        
      
           
    }   
    
    
     
    
}
