/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidad.Categoria;
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
public class CategoriaController {
          public CategoriaController() {
           try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CategoriaController.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
        //agregar la database
    private final String url = "jdbc:sqlserver://localhost;databaseName=PruebaJugadores";
    private final String user = "sa";
    private final String pass = "123456";
    
        public ArrayList<Categoria> obtenerCategoria() {
        ArrayList<Categoria> lst = new ArrayList<>();
        ResultSet rs = null;

        try (Connection cnn = DriverManager.getConnection(url, user, pass);
                PreparedStatement ps = cnn.prepareStatement("SELECT * FROM Divisiones ")) {

            rs = ps.executeQuery();
            Categoria  dat = new Categoria();
            dat.setIdDivision(0);
            dat.setCategoria("Selecciona la Division");
            lst.add(dat);
            while (rs.next()) {
                int codigo = rs.getInt("idDivision");
                String nombre = rs.getString("Categoria");
               

                Categoria c = new Categoria();
                c.setIdDivision(codigo);
                c.setCategoria(nombre);
              

                lst.add(c);
            }
            rs.close();
            cnn.close();
        } catch (SQLException e) {
            System.out.println("Error de acceso a datos en obtener autores");
        }
        return lst;

    }
}
