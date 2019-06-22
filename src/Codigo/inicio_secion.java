
package Codigo;

import Grafica.revision;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class inicio_secion {
    
     public void users(String usuario,String contrasena){
     String user="admin";
     String password="123";
    
        int i =0;
        int a= 0;
   try{
        if (usuario.equalsIgnoreCase(user) && contrasena.equals(password)) {
                JOptionPane.showMessageDialog(null, "Bienvenido \n" + user);
        revision rv = new revision();
        rv.setVisible(true);
        
        

        }else {
                    JOptionPane.showMessageDialog(null,"Usuario y/o contraseña incorrecto","Error",JOptionPane.DEFAULT_OPTION);
                    a+=1;
            }

   }catch(HeadlessException e){
       
   }
     }
}
