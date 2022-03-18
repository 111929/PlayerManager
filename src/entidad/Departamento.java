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
public class Departamento {
    private int idDepartamento;
    private Provincia provincia;
    private String Departamento;

    public Departamento() {
    }

    public Departamento(int idDepartamento, Provincia provincia, String Departamento) {
        this.idDepartamento = idDepartamento;
        this.provincia = provincia;
        this.Departamento = Departamento;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    @Override
    public String toString() {
        return "Departamento{" + "idDepartamento=" + idDepartamento + ", provincia=" + provincia + ", Departamento=" + Departamento + '}';
    }
         
}
