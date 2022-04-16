/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DTO.JugadorDTO;
import entidad.Jugador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
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
    
        public void insertarJugador(Jugador nuevoJugador) {
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
     public void actualizarJugador(Jugador nuevoJugador) {
        try {

            Connection cnn = DriverManager.getConnection(url, user, pass);
            PreparedStatement st = cnn.prepareStatement("update Jugadores\n"
                    + "set FechaDeSeleccion=?,\n"
                    + "Documento=?\n"
                    + "where idJugador=?" );

            st.setString(1, nuevoJugador.getFecheDeSeleccion());
            st.setString(2, nuevoJugador.getDocumento());
            st.setInt(3, nuevoJugador.getIdJugador());
            st.executeUpdate();

            st.close();
            cnn.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en Insertar Jugador");
        }
    }
     
     public ArrayList<Jugador> obtenerJugador() {
        ArrayList<Jugador> lst = new ArrayList<>();
        ResultSet rs = null;

        try (Connection cnn = DriverManager.getConnection(url, user, pass);
                PreparedStatement ps = cnn.prepareStatement("select * from Jugadores\n" +
"where Documento is null")) {

            rs = ps.executeQuery();
            Jugador dat = new Jugador();
            dat.setIdJugador(0);
            dat.setNombre("Seleccione Jugador");
            dat.setApellido("");
            lst.add(dat);
            while (rs.next()) {
                int idJugador = rs.getInt("idJugador");
                String nombre = rs.getString("Nombre");
                String apellido= rs.getString("Apellido");

                Jugador j = new Jugador();
                j.setIdJugador(idJugador);
                j.setNombre(nombre);
                j.setApellido(apellido);
                lst.add(j);
            }
            rs.close();
            cnn.close();
        } catch (SQLException e) {
            System.out.println("Error de acceso a datos en obtener Jugadores");
        }
        return lst;

    }
      public ArrayList<JugadorDTO> obtenerJugadorSeleccionado() {
        ArrayList<JugadorDTO> lst = new ArrayList<>();
        ResultSet rs = null;

        try (Connection cnn = DriverManager.getConnection(url, user, pass);
                PreparedStatement ps = cnn.prepareStatement("select j.Nombre 'Nombre' ,Apellido,Documento,FechaDeNacimiento,Posicion, d.Categoria 'Division', de.Departamento 'Departamento',\n" +
"p.Nombre 'Provincia',Direccion,Telefono,TelefonoTutor, Observaciones\n" +
" from Jugadores j join Divisiones d on j.idDivision= d.idDivision join Departamentos de on de.idDepartamento= j.idDepartamento \n" +
" join Provincias p on p.idProvincia= de.idProvincia\n" +
"where Documento is not null")) {

            rs = ps.executeQuery();     
            while (rs.next()) {
                JugadorDTO dto = new JugadorDTO();
              dto.setNombre(rs.getString("Nombre"));
              dto.setApellido(rs.getString("Apellido"));
              dto.setDocumento(rs.getString("Documento"));
              dto.setFechaDeNacimiento(rs.getString("FechaDeNacimiento"));
              dto.setPosicion(rs.getString("Posicion"));
              dto.setDivision(rs.getString("Division"));
              dto.setDepartamento(rs.getString("Departamento"));
              dto.setProvincia(rs.getString("Provincia"));
              dto.setDireccion(rs.getString("Direccion"));
              dto.setTelefono(rs.getString("Telefono"));
              dto.setTelefonoTutor(rs.getString("TelefonoTutor"));
              dto.setObservaciones(rs.getString("Observaciones"));
                lst.add(dto);
            }
            rs.close();
            cnn.close();
        } catch (SQLException e) {
            System.out.println("Error de acceso a datos en obtener Jugadores");
        }
        return lst;

    }
}
