/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidad.Provincia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dario
 */
public class ProvinciaController {
          public ProvinciaController() {
           try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProvinciaController.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
        //agregar la database
    private final String url = "jdbc:sqlserver://localhost;databaseName=PruebaJugadores";
    private final String user = "sa";
    private final String pass = "123456";
    
    public ArrayList<Provincia> obtenerDepartamento() {
        ArrayList<Provincia> lst = new ArrayList<>();
        ResultSet rs = null;

        try (Connection cnn = DriverManager.getConnection(url, user, pass);
                PreparedStatement ps = cnn.prepareStatement("select * from Provincias")) {

            rs = ps.executeQuery();
            while (rs.next()) {
                int provincia = rs.getInt("idProvincia");
                String nombre = rs.getString("Nombre");
               

                Provincia p = new Provincia();
                p.setIdProvincia(provincia);
                p.setProvincia(nombre);
              

                lst.add(p);
            }
            rs.close();
            cnn.close();
        } catch (SQLException e) {
            System.out.println("Error de acceso a datos en obtener autores");
        }
        return lst;

    }
}
