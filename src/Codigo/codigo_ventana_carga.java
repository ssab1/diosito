
package Codigo;

import Grafica.Ventana_carga;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class codigo_ventana_carga {
        public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            Ventana_carga vc = new Ventana_carga();
            vc.setSize(960,550);
            vc.setLocationRelativeTo(null);
            vc.setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+e);
        }
    }
}
