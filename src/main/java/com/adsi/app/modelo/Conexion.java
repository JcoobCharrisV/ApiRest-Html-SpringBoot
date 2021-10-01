/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adsi.app.modelo;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Yisus
 */
public class Conexion {

    
    public transient Connection con;

    public boolean hayConexion() {
        return this.con != null;
    }
    private String driver;
    private String url;
    private String user = "";
    private String password = "";

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void conectar() throws SQLException, IOException {
        
        setDriver("com.mysql.jdbc.Driver");
        setUrl("jdbc:mysql://yisus-mysql.mysql.database.azure.com:3306/registro?serverTimezone=UTC&useUnicode=true&characterEncoding=utf8&useSSL=false");
        setUser("AdminJesus@yisus-mysql");
        setPassword("jeguezu0411Z");
          
        if (!hayConexion()) {
            if (driver == null) {
                throw new SQLException("No se ha definido el driver de conexion");
            }
            if (url == null) {
                throw new SQLException("No se ha especificado la url para la conexion");
            }
            try {
                Class.forName(driver).newInstance();
            } catch (Exception e) {
                throw new IOException("Error! No se ha logrado cargar el driver especificado");
            }
            con = DriverManager.getConnection(url, user, password);
        }
        
        con = DriverManager.getConnection(url, user, password);
    }
    
}

