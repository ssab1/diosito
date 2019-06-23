
package Codigo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
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
    //--------------------------------------------------------------------------------------------------------------------------//
    public void IDUSUARIO(String nombre,String apellido,String rut,String sexo,String nm_usuario,String contrasena,int id_tip){
       
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "INSERT INTO USUARIO("+
                    "NOMBRE, APELLIDO,RUT,SEXO,NOMBRE_USUARIO,CONTRASENA,ID_TIPO)"
                    + " VALUES('"+nombre+"','"+apellido+"','"+rut+"','"+sexo+"','"+nm_usuario+"','"+contrasena+"','"+id_tip+"')";
            
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            ImageIcon ingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/ingresados.png"));
            JOptionPane.showMessageDialog(null,"Datos ingresados!!","Mensaje",JOptionPane.DEFAULT_OPTION,ingresados);
            
        }catch(ClassNotFoundException | SQLException e){
            ImageIcon noingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/noingresados.png"));
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE,noingresados);
        }
        
        
    }// 
    //-----------------------------------------------------------------------------------------------------------------//  
        
    public void mostrarUsuarios(JTable tblUsuario){
         
         try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            sentencia = conexion.createStatement();
            String sql = "SELECT * FROM USUARIO";
            resultados = sentencia.executeQuery(sql);
            int fila = 0;
            while(resultados.next()){
                
                tblUsuario.setValueAt(resultados.getInt("ID"), fila, 0);
                tblUsuario.setValueAt(resultados.getString("NOMBRE"), fila, 1);
                tblUsuario.setValueAt(resultados.getString("APELLIDO"), fila, 2);
                tblUsuario.setValueAt(resultados.getString("RUT"), fila, 3);
                tblUsuario.setValueAt(resultados.getString("SEXO"), fila, 4);
                tblUsuario.setValueAt(resultados.getString("NOMBRE_USUARIO"), fila, 5);
                tblUsuario.setValueAt(resultados.getString("CONTRASENA"), fila, 6);
                tblUsuario.setValueAt(resultados.getString("ID_TIPO"), fila, 7);
                fila++;
            }
            
            resultados.close();
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE);
        }
      //----------------------------------------------------------------------------------------------------------------//  
       
      //----------------------------------------------------------------------------------------------------------------//
      
      //----------------------------------------------------------------------------------------------------------------//
      
      //----------------------------------------------------------------------------------------------------------------//
//        public static void main(String[] args) {
//        Creacion_bbdd cb= new Creacion_bbdd();
////      cb.CrearBD();
////      cb.TablaTipoUsuario();
////      cb.TablaUsuario();
////      cb.IDTIPOUSUARIO();
////        cb.IDUSUARIO();
//    }
    }
}
