
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
            
            //crear y nombrar campos de la tabla a crear
            sentencia = conexion.createStatement();
            String sql = "CREATE TABLE TIPO_USUARIO(" +
                    "ID         INTEGER     PRIMARY KEY AUTOINCREMENT, " +
                    "TIPO_USER  TEXT    NOT NULL)";
            //guardar consulta
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println("tabla creada!!"); 
        
    }//
        
    
    //--------------------------------------------------------------------------------------------------------------------// 
    
    
    
    
    
    //-------------------------------------------------------------------------------------------------------------------//
    
    
    
    public void TablaUsuario(){
       
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            //crear y nombrar campos de la tabla a crear
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
            //guardar consulta 
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

    //-----------------------------------------------------------------------------------------------------------------//  
        
    public void mostrarUsuarios(JTable tblUsuario){
         
         try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            sentencia = conexion.createStatement();
            String sql = "SELECT USUARIO.ID,NOMBRE,APELLIDO,RUT,SEXO,NOMBRE_USUARIO,TIPO_USER FROM USUARIO JOIN TIPO_USUARIO ON TIPO_USUARIO.ID=USUARIO.ID_TIPO ";
            resultados = sentencia.executeQuery(sql);
            int fila = 0;
            while(resultados.next()){
                tblUsuario.setValueAt(resultados.getString("ID"), fila, 0);
                tblUsuario.setValueAt(resultados.getString("NOMBRE"), fila, 1);
                tblUsuario.setValueAt(resultados.getString("APELLIDO"), fila, 2);
                tblUsuario.setValueAt(resultados.getString("RUT"), fila, 3);
                tblUsuario.setValueAt(resultados.getString("SEXO"), fila, 4);
                tblUsuario.setValueAt(resultados.getString("NOMBRE_USUARIO"), fila, 5);
                tblUsuario.setValueAt(resultados.getString("TIPO_USER"), fila, 6);
                fila++;
            }
            
            resultados.close();
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            ImageIcon noingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/noingresados.png"));
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE,noingresados);
        }
    }
    
        public void mostrarrut(JTable tblrut,String rut){
         
         try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            sentencia = conexion.createStatement();
            String sql = "SELECT NOMBRE,APELLIDO,RUT FROM USUARIO WHERE RUT='"+rut+"' ";
            resultados = sentencia.executeQuery(sql);
            int fila = 0;
            while(resultados.next()){
                
                tblrut.setValueAt(resultados.getString("NOMBRE"), fila, 0);
                tblrut.setValueAt(resultados.getString("APELLIDO"), fila, 1);
                tblrut.setValueAt(resultados.getString("RUT"), fila, 2);
                fila++;
            }
            
            resultados.close();
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            ImageIcon noingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/noingresados.png"));
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE,noingresados);
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
            ImageIcon noingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/noingresados.png"));
            JOptionPane.showMessageDialog(null, "Id invalida", 
                    "Error!!", JOptionPane.ERROR_MESSAGE,noingresados);
        }
    }
    public void IDMODIFICAR(int id,String nombre,String apellido,String rut,String m,String nm_usuario,String contrasena){
       
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "UPDATE USUARIO SET "+
                    "NOMBRE='"+nombre+"', APELLIDO='"+apellido+"',RUT='"+rut+"',SEXO='"+m+"',NOMBRE_USUARIO='"+nm_usuario+"'"
                    + ",CONTRASENA='"+contrasena+"' WHERE ID='"+id+"'";
            
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            ImageIcon ingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/ingresados.png"));
            JOptionPane.showMessageDialog(null, "Datos modificados!!",  "MENSAJE", JOptionPane.ERROR_MESSAGE,ingresados);
            
        }catch(ClassNotFoundException | SQLException e){
            ImageIcon noingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/noingresados.png"));
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE,noingresados);
        }
        
        
    }// 
    

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
            ImageIcon ingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/ingresados.png"));
            JOptionPane.showMessageDialog(null, "Datos ingresados!!", 
                    "MENSAJE", JOptionPane.ERROR_MESSAGE,ingresados);
        }catch(ClassNotFoundException | SQLException e){
            ImageIcon noingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/noingresados.png"));
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE,noingresados);
        }
         
        
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
           ImageIcon ingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/ingresados.png"));
           JOptionPane.showMessageDialog(null, "Datos ingresados!!",  "MENSAJE", JOptionPane.ERROR_MESSAGE,ingresados);
        }catch(ClassNotFoundException | SQLException e){
            ImageIcon noingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/noingresados.png"));
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE,noingresados);
        }
        
    }//

    //-----------------------------------------------------------------------------------------------------//
     public void TablaProducto(){
       
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "CREATE TABLE PRODUCTO(" +
                    "ID              INTEGER     PRIMARY KEY AUTOINCREMENT, " 
                  + "CODIGO          INTEGER    NOT NULL,"
                  + "NOMBRE          TEXT    NOT NULL,"
                  + "CANTIDAD        INTEGER    NOT NULL,"
                  + "ID_CAT         INTEGER    NOT NULL,"
                  + "ID_SEC         INTEGER    NOT NULL,"
                  + "FOREIGN KEY (ID_CAT) REFERENCES CATEGORIA(ID),"
                  + "FOREIGN KEY (ID_SEC) REFERENCES SECCION(ID))";

            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println("tabla creada!!"); 
        
    }//  
    
    public void IDProducto(int codigo,String nombre,int cantidad,int a,int c){
       
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "INSERT INTO PRODUCTO("+
                    "CODIGO,NOMBRE,CANTIDAD,ID_CAT,ID_SEC)"
                    + " VALUES('"+codigo+"','"+nombre+"','"+cantidad+"','"+a+"','"+c+"')";
            
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            ImageIcon ingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/ingresados.png"));
            JOptionPane.showMessageDialog(null, "Datos ingresados!!",  "MENSAJE", JOptionPane.ERROR_MESSAGE,ingresados);
            
        }catch(ClassNotFoundException | SQLException e){
            ImageIcon noingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/noingresados.png"));
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE,noingresados);
        }
        
        
    }// 
    
    //---------------------------------------------------------------------------------------------------------------------//

    public void verporcod(JTable tblrevisar,int cod){
         
         try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            sentencia = conexion.createStatement();
            String sql = "SELECT CODIGO,NOMBRE,CANTIDAD FROM PRODUCTO WHERE CODIGO='"+cod+"'";
            resultados = sentencia.executeQuery(sql);
            int fila = 0;
            while(resultados.next()){
                
                tblrevisar.setValueAt(resultados.getString("CODIGO"), fila, 0);
                tblrevisar.setValueAt(resultados.getString("NOMBRE"), fila, 1);
                tblrevisar.setValueAt(resultados.getString("CANTIDAD"), fila, 2);
                fila++;
            }
            
            resultados.close();
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            ImageIcon noingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/noingresados.png"));
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE,noingresados);
        }
    }
    //--------------------------------------------------------------------------------------------------------------------------//
        public void versec(JTable tblseccion){
         
         try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            sentencia = conexion.createStatement();
            String sql = "SELECT * FROM SECCION";
            resultados = sentencia.executeQuery(sql);
            int fila = 0;
            while(resultados.next()){
                
                tblseccion.setValueAt(resultados.getString("ID"), fila, 0);
                tblseccion.setValueAt(resultados.getString("PASILLO"), fila, 1);
                tblseccion.setValueAt(resultados.getString("RACK"), fila, 2);
                fila++;
            }
            
            resultados.close();
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            ImageIcon noingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/noingresados.png"));
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE,noingresados);
        }
    }
    public void versec2(JTable tblseccion2){
         
         try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            sentencia = conexion.createStatement();
            String sql = "SELECT * FROM SECCION";
            resultados = sentencia.executeQuery(sql);
            int fila = 0;
            while(resultados.next()){
                
                tblseccion2.setValueAt(resultados.getString("ID"), fila, 0);
                tblseccion2.setValueAt(resultados.getString("PASILLO"), fila, 1);
                tblseccion2.setValueAt(resultados.getString("RACK"), fila, 2);
                fila++;
            }
            
            resultados.close();
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            ImageIcon noingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/noingresados.png"));
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE,noingresados);
        }
    }
            //--------------------------------------------------------------------------------------------------------------------------//
        public void vercat(JTable tblcategoria){
         
         try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            sentencia = conexion.createStatement();
            String sql = "SELECT * FROM CATEGORIA";
            resultados = sentencia.executeQuery(sql);
            int fila = 0;
            while(resultados.next()){
                
                tblcategoria.setValueAt(resultados.getString("ID"), fila, 0);
                tblcategoria.setValueAt(resultados.getString("CATEGORIA_NOMBRE"), fila, 1);
                fila++;
            }
            
            resultados.close();
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            ImageIcon noingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/noingresados.png"));
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE,noingresados);
        }
    }
   public void vercat2(JTable tblcategoria2){
         
         try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            sentencia = conexion.createStatement();
            String sql = "SELECT * FROM CATEGORIA";
            resultados = sentencia.executeQuery(sql);
            int fila = 0;
            while(resultados.next()){
                
                tblcategoria2.setValueAt(resultados.getString("ID"), fila, 0);
                tblcategoria2.setValueAt(resultados.getString("CATEGORIA_NOMBRE"), fila, 1);
                fila++;
            }
            
            resultados.close();
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            ImageIcon noingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/noingresados.png"));
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE,noingresados);
        }
    }
    //--------------------------------------------------------------------------------------------------------------------------//
     public void verporcodtodos(JTable tblrevisar){
         
         try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            sentencia = conexion.createStatement();
            String sql = "SELECT CODIGO,NOMBRE,CANTIDAD FROM PRODUCTO";
            resultados = sentencia.executeQuery(sql);
            int fila = 0;
            while(resultados.next()){
                
                tblrevisar.setValueAt(resultados.getString("CODIGO"), fila, 0);
                tblrevisar.setValueAt(resultados.getString("NOMBRE"), fila, 1);
                tblrevisar.setValueAt(resultados.getString("CANTIDAD"), fila, 2);
                fila++;
            }
            
            resultados.close();
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            ImageIcon noingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/noingresados.png"));
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE,noingresados);
        }
    }
    //---------------------------------------------------------------------------------------------------------------------//
     public void VERPRODUC(int codigo ,JTable tbl_moduser,JTextField txt_nombre,JTextField txt_cantidad,JTextField txt_idcat,
            JTextField txt_idsec,JTextField txt_cod){
         
         try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            sentencia = conexion.createStatement();
            String sql = "SELECT NOMBRE,CANTIDAD,CODIGO,ID_CAT,ID_SEC FROM PRODUCTO WHERE ID='"+codigo+"'";
            resultados = sentencia.executeQuery(sql);
            txt_nombre.setText(resultados.getString("NOMBRE"));
            txt_cantidad.setText(resultados.getString("CANTIDAD"));
            txt_cod.setText(resultados.getString("CODIGO"));
            txt_idcat.setText(resultados.getString("ID_CAT"));
            txt_idsec.setText(resultados.getString("ID_SEC"));
            resultados.close();
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            ImageIcon noingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/noingresados.png"));
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE,noingresados);
        }
    }
     //---------------------------------------------------------------------------------------------------------------------//
         public void IDMODIFICARPRODUCTO(int id,String nombre,int codigo,int cantidad,int id_cat,int id_sec){
       
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "UPDATE PRODUCTO SET "+
                    "CODIGO='"+codigo+"', NOMBRE='"+nombre+"',CANTIDAD='"+cantidad+"',ID_CAT='"+id_cat+"',ID_SEC='"+id_sec+"'"
                    + " WHERE ID='"+id+"'";
            
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            ImageIcon ingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/ingresados.png"));
            JOptionPane.showMessageDialog(null,"Datos modificados!!","Mensaje",JOptionPane.DEFAULT_OPTION,ingresados);
            
        }catch(ClassNotFoundException | SQLException e){
            ImageIcon noingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/noingresados.png"));
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE,noingresados);
        }
        
        
    }// 
         //-----------------------------------------------------------------------------------------------------------------//
        public void mostrarproductos(JTable tblproductos){
         
         try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            sentencia = conexion.createStatement();
            String sql = "SELECT PRODUCTO.ID,CODIGO,NOMBRE,CANTIDAD,PASILLO,CATEGORIA_NOMBRE "
                    + "FROM PRODUCTO JOIN CATEGORIA ON PRODUCTO.ID_CAT=CATEGORIA.ID"
                    + " INNER JOIN SECCION ON PRODUCTO.ID_SEC=SECCION.ID ";
            resultados = sentencia.executeQuery(sql);
            int fila = 0;
            while(resultados.next()){
                tblproductos.setValueAt(resultados.getString("ID"), fila, 0);
                tblproductos.setValueAt(resultados.getString("CODIGO"), fila, 1);
                tblproductos.setValueAt(resultados.getString("NOMBRE"), fila, 2);
                tblproductos.setValueAt(resultados.getString("CANTIDAD"), fila, 3);
                tblproductos.setValueAt(resultados.getString("PASILLO"), fila, 4);
                tblproductos.setValueAt(resultados.getString("CATEGORIA_NOMBRE"), fila, 5);
                fila++;
            }
            
            resultados.close();
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            ImageIcon noingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/noingresados.png"));
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE,noingresados);
        }
    }
        
    public void SALIDAPRODUCTO(int codigo, int cantidad){
       
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "UPDATE PRODUCTO SET "+
                    "CANTIDAD=CANTIDAD-'"+cantidad+"' WHERE CODIGO='"+codigo+"'";
            
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            ImageIcon ingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/ingresados.png"));
            JOptionPane.showMessageDialog(null,"Datos modificados!!","Mensaje",JOptionPane.DEFAULT_OPTION,ingresados);
            
        }catch(ClassNotFoundException | SQLException e){
            ImageIcon noingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/noingresados.png"));
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE,noingresados);
        }
        
        
    }// 
    
        public void ENTRADAPRODUCTO(int codigo, int cantidad){
       
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "UPDATE PRODUCTO SET "+
                    "CANTIDAD=CANTIDAD+'"+cantidad+"' WHERE CODIGO='"+codigo+"'";
            
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            ImageIcon ingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/ingresados.png"));
            JOptionPane.showMessageDialog(null,"Datos modificados!!","Mensaje",JOptionPane.DEFAULT_OPTION,ingresados);
            
        }catch(ClassNotFoundException | SQLException e){
            ImageIcon noingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/noingresados.png"));
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE,noingresados);
        }
        
        
    }// 
        
    public void delsec(int id){
       
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "DELETE FROM SECCION WHERE ID='"+id+"'";
            
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            ImageIcon ingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/ingresados.png"));
            JOptionPane.showMessageDialog(null,"Datos eliminados!!","Mensaje",JOptionPane.DEFAULT_OPTION,ingresados);
            
        }catch(ClassNotFoundException | SQLException e){
            ImageIcon noingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/noingresados.png"));
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE,noingresados);
        }
        
        
    }// 
    public void delcat(int id){
       
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "DELETE FROM CATEGORIA WHERE ID='"+id+"'";
            
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            ImageIcon ingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/ingresados.png"));
            JOptionPane.showMessageDialog(null,"Datos eliminados!!","Mensaje",JOptionPane.DEFAULT_OPTION,ingresados);
            
        }catch(ClassNotFoundException | SQLException e){
            ImageIcon noingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/noingresados.png"));
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE,noingresados);
        }
        
        
    }// 
    public void VERPORSEC(JTextField txtpasec,JTextField txtrasec,int id){
         
         try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            sentencia = conexion.createStatement();
            String sql = "SELECT PASILLO,RACK FROM SECCION WHERE ID='"+id+"'";
            
            resultados = sentencia.executeQuery(sql);
            txtpasec.setText(resultados.getString("PASILLO"));
            txtrasec.setText(resultados.getString("RACK"));

            
            resultados.close();
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            ImageIcon noingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/noingresados.png"));
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE,noingresados);
        }
    }
    
    public void VERPORCAR(JTextField txtnmcat,int id){
         
         try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            sentencia = conexion.createStatement();
            String sql = "SELECT CATEGORIA_NOMBRE FROM CATEGORIA WHERE ID='"+id+"'";
            
            resultados = sentencia.executeQuery(sql);
            txtnmcat.setText(resultados.getString("CATEGORIA_NOMBRE"));

            
            resultados.close();
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            ImageIcon noingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/noingresados.png"));
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE,noingresados);
        }
    }
    
    public void MODIFICARCATEGORIA(int id,String nombre){
       
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "UPDATE CATEGORIA SET "+
                    "CATEGORIA_NOMBRE='"+nombre+"' WHERE ID='"+id+"'";
            
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            ImageIcon ingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/ingresados.png"));
            JOptionPane.showMessageDialog(null,"Datos modificados!!","Mensaje",JOptionPane.DEFAULT_OPTION,ingresados);
            
        }catch(ClassNotFoundException | SQLException e){
            ImageIcon noingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/noingresados.png"));
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE,noingresados);
        }
        
        
    }// 
        public void MODIFICARSECCION(int id,String pasillo,String rack){
       
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "UPDATE SECCION SET "+
                    "PASILLO='"+pasillo+"',RACK='"+rack+"' WHERE ID='"+id+"'";
            
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            ImageIcon ingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/ingresados.png"));
            JOptionPane.showMessageDialog(null,"Datos modificados!!","Mensaje",JOptionPane.DEFAULT_OPTION,ingresados);
            
        }catch(ClassNotFoundException | SQLException e){
            ImageIcon noingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/noingresados.png"));
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE,noingresados);
        }
        
        
    }// 
    public void delpro(int codigo){
       
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "DELETE FROM PRODUCTO WHERE CODIGO='"+codigo+"'";
            
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            ImageIcon ingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/ingresados.png"));
            JOptionPane.showMessageDialog(null,"Datos eliminados!!","Mensaje",JOptionPane.DEFAULT_OPTION,ingresados);
            
        }catch(ClassNotFoundException | SQLException e){
            ImageIcon noingresados = new ImageIcon (Creacion_bbdd.class.getResource("/Imagenes/noingresados.png"));
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE,noingresados);
        }
        
        
    }// 
     //---------------------------------------------------------------------------------------------------------------------//
//        public static void main(String[] args) {
//        Creacion_bbdd cb= new Creacion_bbdd();
////        cb.IDSeccionn();
////        cb.IDCategoriaa();
////        cb.TablaCategoria();
////        cb.TablaSeccion();
//        cb.TablaProducto();
////        cb.verUSUARIO();
//////      cb.CrearBD();
//////      cb.TablaTipoUsuario();
//////      cb.TablaUsuario();
//////      cb.IDTIPOUSUARIO();
//////        cb.IDUSUARIO();
//    }
}
