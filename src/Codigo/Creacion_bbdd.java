
package Codigo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Creacion_bbdd {
    
    Connection conexion = null;
    Statement sentencia = null;
    ResultSet resultados = null;
    String DRIVER = "org.sqlite.JDBC";
    String NOMBREBD = "Bodega.sqlite";
    String URL = "jdbc:sqlite:"+NOMBREBD;
    
    
    public void crearBD(){
        
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println("DB creada!!");
        
    }//.
    
        public void TablaTipoUsuario(){
       
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "CREATE TABLE TIPO_USUARIO(" +
                    "ID         INT     PRIMARY KEY AUTOINCREMENT, " +
                    "TIPO_USER     TEXT    NOT NULL)";
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println("tabla creada!!"); 
        
    }//
        
        
        
        
      
    public void TablaUsuario(){
       
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "CREATE TABLE TIPO_USUARIO(" +
                    "ID         INT     PRIMARY KEY AUTOINCREMENT, " +
                    "NOMBRE     TEXT    NOT NULL,"
                  + "APELLIDO   TEXT    NOT NULL,"
                  + "RUT        TEXT    NOT NULL,"
                  + "SEXO       TEXT    NOT NULL,"
             + "NOMBRE_USUARIO  TEXT    NOT NULL,"
                  + "CONTRASENA TEXT    NOT NULL,"
                  + "ID_TIPO    TEXT    NOT NULL,"
                  + "FOREIGN KEY (ID_TIPO) REFERENCES TIPO_USUARIO(ID))";
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println("tabla creada!!"); 
        
    }//  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        public static void main(String[] args) {
        
    }
}
