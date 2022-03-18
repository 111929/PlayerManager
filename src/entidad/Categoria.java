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
public class Categoria {
    private int idDivision;
    private String categoria;

    public Categoria() {
    }

    public Categoria(int idDivision, String categoria) {
        this.idDivision = idDivision;
        this.categoria = categoria;
    }

    public int getIdDivision() {
        return idDivision;
    }

    public void setIdDivision(int idDivision) {
        this.idDivision = idDivision;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return getCategoria();
    }
    
}
