/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author calvo
 */
public class ConectarBD {
    public Connection conexion;
    public PreparedStatement sentencia;
    
    public ConectarBD() {
        String ruta = "jdbc:postgresql://localhost:5432/postgres";
        try{
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(ruta,"postgres","admin");
        }catch(ClassNotFoundException e){
            System.out.println("Error:"+e);
        }catch(SQLException e){
            System.out.println("Error en la conexion"+ e);
        }
    }
    public Connection getConexion(){
        return conexion;
    }
    public void setConexion(Connection conexion){
        this.conexion = conexion;
    }
}