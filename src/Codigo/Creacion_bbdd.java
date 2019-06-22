
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
    
    
    public void CrearBD(){
        
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println("DB creada!!");
        
    }//.
    
    //-----------------------------------------------------------------------------------------------------------------------//
    
        public void TablaTipoUsuario(){
       
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "CREATE TABLE TIPO_USUARIO(" +
                    "ID         INTEGER     PRIMARY KEY AUTOINCREMENT, " +
                    "TIPO_USER  TEXT    NOT NULL)";
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println("tabla creada!!"); 
        
    }//
    public void IDTIPOUSUARIO(){
       
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "INSERT INTO TIPO_USUARIO("+
                    "TIPO_USER) VALUES ( 'ADMINISTRADOR')";
            
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println("datos ingresados!!"); 
        
    }//
        
    //--------------------------------------------------------------------------------------------------------------------// 
    
    public void TablaUsuario(){
       
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "CREATE TABLE USUARIO(" +
                    "ID         INTEGER     PRIMARY KEY AUTOINCREMENT, " +
                    "NOMBRE     TEXT    NOT NULL,"
                  + "APELLIDO   TEXT    NOT NULL,"
                  + "RUT        TEXT    NOT NULL,"
                  + "SEXO       TEXT    NOT NULL,"
             + "NOMBRE_USUARIO  TEXT    NOT NULL,"
                  + "CONTRASENA TEXT    NOT NULL,"
                  + "ID_TIPO    INT    NOT NULL,"
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
    public void IDUSUARIO(){
       
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "INSERT INTO USUARIO("+
                    "NOMBRE, APELLIDO,RUT,SEXO,NOMBRE_USUARIO,CONTRASENA,ID_TIPO)"
                    + " VALUES('BASTIAN','SANTIBANEZ','20.401.787-5','MASCULINO','SSAB','1234','1')";
            
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println("datos ingresados!!"); 
        
    }// 
        
    //-----------------------------------------------------------------------------------------------------------------//  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      //----------------------------------------------------------------------------------------------------------------//  
        public static void main(String[] args) {
        Creacion_bbdd cb= new Creacion_bbdd();
//      cb.CrearBD();
//      cb.TablaTipoUsuario();
//      cb.TablaUsuario();
//      cb.IDTIPOUSUARIO();
        cb.IDUSUARIO();
    }
}
