/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adsi.app.rest;

import com.adsi.app.controlador.Controlador;
import com.adsi.app.modelo.Producto;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Yisus
 */
@Path("/rest")
public class ProductosRest {
    
    
    private final Controlador repo = new Controlador();
    
    public ProductosRest() throws SQLException, IOException {
        repo.conectar();
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/get")
    public String get() {
        //TODO return proper representation object
        return "Hola Rest GET";
    } 
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/Productos")
    public List<Producto> productList() throws SQLException { 
        //TODO return proper representation object
        return repo.findAllProductos();
    }
    
    
    
    
    
    
    
    
    
    
    
}
