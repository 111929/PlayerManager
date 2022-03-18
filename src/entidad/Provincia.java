/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

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

    @Override
    public String toString() {
        return "Provincia{" + "idProvincia=" + idProvincia + ", provincia=" + provincia + '}';
    }
    
}
