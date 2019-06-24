
package Codigo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Creacion_bbdd {
    
    Connection conexion = null;
    Statement sentencia = null;
    ResultSet resultados = null;
    String DRIVER = "org.sqlite.JDBC";
    String NOMBREBD = "Bodega.sqlite";
    String URL = "jdbc:sqlite:"+NOMBREBD;
    
    //--------------------------------------------------------------------------------------------------------------------//
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
    
    
    
    
    
    //-------------------------------------------------------------------------------------------------------------------//
    
    
    
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
    public void IDUSUARIO(String nombre,String apellido,String rut,String m,String nm_usuario,String contrasena){
       
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "INSERT INTO USUARIO("+
                    "NOMBRE, APELLIDO,RUT,SEXO,NOMBRE_USUARIO,CONTRASENA,ID_TIPO)"
                    + " VALUES('"+nombre+"','"+apellido+"','"+rut+"','"+m+"','"+nm_usuario+"','"+contrasena+"','2')";
            
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
    public void DELUSUARIO(String rutsu){
       
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "DELETE FROM USUARIO WHERE RUT='"+rutsu+"' ";
            
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            ImageIcon ingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/ingresados.png"));
            JOptionPane.showMessageDialog(null,"Usuario eliminado!!","Mensaje",JOptionPane.DEFAULT_OPTION,ingresados);
            
        }catch(ClassNotFoundException | SQLException e){
            ImageIcon noingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/noingresados.png"));
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE,noingresados);
        }
        
        
    }// 
    
    //-----------------------------------------------------------------------------------------------------------------//
    
    //----------------------------------------------------------------------------------------------------------------//
    
    
    
    
    
    //aqui voy
        public void MDUSUARIO(String md,JTextField md_nombre){
       
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "SELECT NOMBRE, APELLIDO,RUT,SEXO,NOMBRE_USUARIO,CONTRASENA FROM USUARIO WHERE ID='"+md+"' ";
            md_nombre.setText("NOMBRE");
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            ImageIcon ingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/ingresados.png"));
            JOptionPane.showMessageDialog(null,"Usuario eliminado!!","Mensaje",JOptionPane.DEFAULT_OPTION,ingresados);
            
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
            String sql = "SELECT NOMBRE,APELLIDO,RUT,SEXO,NOMBRE_USUARIO,TIPO_USER FROM USUARIO JOIN TIPO_USUARIO ON TIPO_USUARIO.ID=USUARIO.ID_TIPO ";
            resultados = sentencia.executeQuery(sql);
            int fila = 0;
            while(resultados.next()){
                
                tblUsuario.setValueAt(resultados.getString("NOMBRE"), fila, 0);
                tblUsuario.setValueAt(resultados.getString("APELLIDO"), fila, 1);
                tblUsuario.setValueAt(resultados.getString("RUT"), fila, 2);
                tblUsuario.setValueAt(resultados.getString("SEXO"), fila, 3);
                tblUsuario.setValueAt(resultados.getString("NOMBRE_USUARIO"), fila, 4);
                tblUsuario.setValueAt(resultados.getString("TIPO_USER"), fila, 5);
                fila++;
            }
            
            resultados.close();
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public void MODUSERR(int id ,JTable tbl_moduser,JTextField campo_nmusuario,JTextField campo_nombre,JTextField campo_apellido,
            JTextField campo_contrasena,JTextField campo_rut){
         
         try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            sentencia = conexion.createStatement();
            String sql = "SELECT NOMBRE,APELLIDO,RUT,SEXO,NOMBRE_USUARIO,CONTRASENA FROM USUARIO WHERE ID='"+id+"'";
            
            
            String sq = "SELECT NOMBRE,APELLIDO,RUT,CONTRASENA,NOMBRE_USUARIO FROM USUARIO WHERE ID='"+id+"'";
            resultados = sentencia.executeQuery(sq);
            campo_nombre.setText(resultados.getString("NOMBRE"));
            campo_apellido.setText(resultados.getString("APELLIDO"));
            campo_rut.setText(resultados.getString("RUT"));
            campo_contrasena.setText(resultados.getString("CONTRASENA"));
            campo_nmusuario.setText(resultados.getString("NOMBRE_USUARIO"));
            
            resultados = sentencia.executeQuery(sql);
            int fila = 0;
            while(resultados.next()){
                
                tbl_moduser.setValueAt(resultados.getString("NOMBRE"), fila, 0);
                tbl_moduser.setValueAt(resultados.getString("APELLIDO"), fila, 1);
                tbl_moduser.setValueAt(resultados.getString("RUT"), fila, 2);
                tbl_moduser.setValueAt(resultados.getString("SEXO"), fila, 3);
                tbl_moduser.setValueAt(resultados.getString("NOMBRE_USUARIO"), fila, 4);
                tbl_moduser.setValueAt(resultados.getString("CONTRASENA"), fila, 5);
                fila++;
            }

            
            resultados.close();
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void MODIFICARUSUARIO(int id,String nombre,String apellido,String rut,String sexo,String nom_user,
            String contra){
         
         try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            sentencia = conexion.createStatement();
            String sql = "UPDATE USUARIO SET NOMBRE='"+nombre+"',APELLIDO='"+apellido+"',RUT='"+rut+"',"
                    + "SEXO='"+sexo+"',NOMBRE_USUARIO='"+nom_user+"',CONTRASENA='"+contra+"' WHERE ID='"+id+"'";
            resultados = sentencia.executeQuery(sql);
            int fila = 0;
            while(resultados.next()){
                
//                tbl_moduser.setValueAt(resultados.getString("NOMBRE"), fila, 0);
//                tbl_moduser.setValueAt(resultados.getString("APELLIDO"), fila, 1);
//                tbl_moduser.setValueAt(resultados.getString("RUT"), fila, 2);
//                tbl_moduser.setValueAt(resultados.getString("SEXO"), fila, 3);
//                tbl_moduser.setValueAt(resultados.getString("NOMBRE_USUARIO"), fila, 4);
//                tbl_moduser.setValueAt(resultados.getString("CONTRASENA"), fila, 5);
                fila++;
            }
            
            resultados.close();
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //------------------------creacion productos-----------------------------------------//
    
    
     public void TablaCategoria(){
       
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "CREATE TABLE CATEGORIA(" +
                    "ID         INTEGER     PRIMARY KEY AUTOINCREMENT, " +
                    "CATEGORIA_NOMBRE     TEXT    NOT NULL)";
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println("tabla creada!!"); 
        
    }//  
    public void IDCategoria(String cat){
       
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "INSERT INTO CATEGORIA("+
                    "CATEGORIA_NOMBRE) VALUES ( '"+cat+"')";
            
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println("datos ingresados!!"); 
        
    }//
    //--------------------------------------------------------------------------------------------------------//
    
     public void TablaSeccion(){
       
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "CREATE TABLE SECCION(" +
                    "ID         INTEGER  PRIMARY KEY AUTOINCREMENT, " +
                    "PASILLO    TEXT     NOT NULL,"
                  + "RACK       TEXT     NOT NULL)";
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println("tabla creada!!"); 
        
    }//  
    public void IDSeccion(String pas,String rack){
       
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "INSERT INTO SECCION("+
                    "PASILLO,RACK) VALUES ( '"+pas+"','"+rack+"')";
            
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println("datos ingresados!!"); 
        
    }//

    //-----------------------------------------------------------------------------------------------------//
     public void TablaProducto(){
       
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "CREATE TABLE PRODUCTO(" +
                    "ID              INTEGER     PRIMARY KEY AUTOINCREMENT, " 
                  + "CODIGO          TEXT    NOT NULL,"
                  + "NOMBRE          TEXT    NOT NULL,"
                  + "CANTIDAD        TEXT    NOT NULL,"
                  + "ID_CAT          INTEGER     NOT NULL,"
                  + "ID_SEC          INTEGER     NOT NULL,"
                  + "FOREIGN KEY (ID_CAT) REFERENCES SECCION(ID),"
                  + "FOREIGN KEY (ID_SEC) REFERENCES CATEGORIA(ID))";
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println("tabla creada!!"); 
        
    }//  
    
    public void IDProducto(String codigo,String nombre,int cantidad,int a,int c){
       
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "INSERT INTO USUARIO("+
                    "CODIGO,NOMBRE,CANTIDAD,ID_CAT,ID_SEC)"
                    + " VALUES('"+codigo+"','"+nombre+"','"+cantidad+"','"+a+"','"+c+"')";
            
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
    
     //---------------------------------------------------------------------------------------------------------------------//
        public static void main(String[] args) {
        Creacion_bbdd cb= new Creacion_bbdd();
//        cb.IDSeccionn();
//        cb.IDCategoriaa();
//        cb.TablaCategoria();
//        cb.TablaSeccion();
//        cb.TablaProducto();
//        cb.verUSUARIO();
////      cb.CrearBD();
////      cb.TablaTipoUsuario();
////      cb.TablaUsuario();
////      cb.IDTIPOUSUARIO();
////        cb.IDUSUARIO();
    }
}
