
package Codigo;

import Grafica.registro;
import Grafica.revision;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class inicio_secion {
    Connection conexion = null;
    Statement sentencia = null;
    ResultSet resultados = null;
    String driver = "org.sqlite.JDBC";
    String nombreBD = "Bodega.sqlite";
    String url = "jdbc:sqlite:"+nombreBD;
    
     public void users(String usuario,String contrasena,int key){
//     String user="admin";
//     String password="123";
    
    try{ 
        Class.forName(driver);
        conexion = DriverManager.getConnection(url);
        sentencia = conexion.createStatement();
        String sql = "SELECT * FROM USUARIO where NOMBRE_USUARIO='"+usuario+"'and CONTRASENA='"+contrasena+"'";
        resultados = sentencia.executeQuery(sql);
        if (resultados.next()) {
            key=1;
        revision rv = new revision();
        rv.setVisible(true);
            JOptionPane.showMessageDialog(null,"BIENVENIDO \n" + usuario,"Bienvenida",JOptionPane.DEFAULT_OPTION);
        }
        if (key==0) {
            JOptionPane.showMessageDialog(null,"Usuario y/o contraseña incorrecto","Error",JOptionPane.DEFAULT_OPTION);
        registro rr = new registro();
        rr.setVisible(true);
                 
        }
        resultados.close();
        sentencia.close();
        conexion.close();
    }catch(ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null,"Error!! "+ e,"Error",JOptionPane.DEFAULT_OPTION);
    }



//        int i =0;
//        int a= 0;
//   try{
//        if (usuario.equalsIgnoreCase(user) && contrasena.equals(password)) {
//                JOptionPane.showMessageDialog(null, "Bienvenido \n" + user);
//        revision rv = new revision();
//        rv.setVisible(true);
//        
//        
//
//        }else {
//                    JOptionPane.showMessageDialog(null,"Usuario y/o contraseña incorrecto","Error",JOptionPane.DEFAULT_OPTION);
//                    a+=1;
//            }
//
//   }catch(HeadlessException e){
//       
//   }
     }
}
