/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutable;

import vistas.VentanaPrincipal;

/**
 *
 * @author dario
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        } catch (ClassNotFoundException e) {
            System.out.println("¡Ocurrió un error!...Driver no encontrado");
            return;
        }
        new VentanaPrincipal().setVisible(true);
    }
    
}
