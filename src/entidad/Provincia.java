/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author dario
 */
public class Provincia {
    private int idProvincia;
    private String provincia;

    public Provincia() {
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    

    @Override
    public String toString() {
        return getProvincia();
    }
    
}
