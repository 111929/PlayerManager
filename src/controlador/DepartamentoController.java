/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidad.Categoria;
import entidad.Departamento;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dario
 */
public class DepartamentoController {
         public DepartamentoController() {
           try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DepartamentoController.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
        //agregar la database
    private final String url = "jdbc:sqlserver://localhost;databaseName=PruebaJugadores";
    private final String user = "sa";
    private final String pass = "123456";
    
      public Vector<Departamento> obtenerDepartamento(int idProvincia) {
        Vector<Departamento> lst = new Vector<>();
        ResultSet rs = null;

        try (Connection cnn = DriverManager.getConnection(url, user, pass);
                PreparedStatement ps = cnn.prepareStatement("SELECT * FROM Departamentos where idProvincia=" + idProvincia)) {
         Departamento  dat = new Departamento();
            dat.setIdDepartamento(0);
            dat.setDepartamento("Selecciona el Departamento");
            lst.add(dat);
            rs = ps.executeQuery();
            while (rs.next()) {
                int departamento = rs.getInt("idDepartamento");
                String nombre = rs.getString("Departamento");
               

                Departamento c = new Departamento();
                c.setIdDepartamento(departamento);
                c.setDepartamento(nombre);
              

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
