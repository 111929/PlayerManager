/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidad.Jugador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dario
 */
public class JugadorController {
    
              public JugadorController() {
           try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JugadorController.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
        //agregar la database
    private final String url = "jdbc:sqlserver://localhost;databaseName=PruebaJugadores";
    private final String user = "sa";
    private final String pass = "123456";
    
        public void insertarContacto(Jugador nuevoJugador) {
        try {

            Connection cnn = DriverManager.getConnection(url, user, pass);
            PreparedStatement st = cnn.prepareStatement("INSERT Jugadores VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");

            st.setString(1, nuevoJugador.getNombre());
            st.setString(2, nuevoJugador.getApellido());
            st.setString(3, nuevoJugador.getDocumento());
            st.setString(4, nuevoJugador.getFechaDeNacimiento());
            st.setString(5, nuevoJugador.getFechaDePreSeleccion());
            st.setString(6, nuevoJugador.getPosicion());
            st.setInt(7, nuevoJugador.getDivision().getIdDivision());
            st.setInt(8, nuevoJugador.getDepartamento().getIdDepartamento());
            st.setString(9, nuevoJugador.getDireccion());
            st.setString(10, nuevoJugador.getTelefono());
            st.setString(11, nuevoJugador.getTelefonoTutor());
            st.setString(12, nuevoJugador.getObservaciones());
            st.setString(13, nuevoJugador.getFecheDeSeleccion());
            st.executeUpdate();

            st.close();
            cnn.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en Insertar Contacto");
        }
    }
}
