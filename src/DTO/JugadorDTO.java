/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author dario
 */
public class JugadorDTO {
    private String nombre;
    private String apellido;
    private String documento;
    private String fechaDeNacimiento;
    private String posicion;
    private String division;
    private String departamento;
    private String provincia;
    private String direccion;
    private String telefono;
    private String telefonoTutor;
    private String observaciones;

    public JugadorDTO() {
    }

    public JugadorDTO(String nombre, String apellido, String documento, String fechaDeNacimiento, String fechaDePreSeleccion, String posicion, String division, String departamento, String provincia, String direccion, String telefono, String telefonoTutor, String observaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.posicion = posicion;
        this.division = division;
        this.departamento = departamento;
        this.provincia = provincia;
        this.direccion = direccion;
        this.telefono = telefono;
        this.telefonoTutor = telefonoTutor;
        this.observaciones = observaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }


    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefonoTutor() {
        return telefonoTutor;
    }

    public void setTelefonoTutor(String telefonoTutor) {
        this.telefonoTutor = telefonoTutor;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "JugadorDTO{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", fechaDeNacimiento=" + fechaDeNacimiento + " posicion=" + posicion + ", division=" + division + ", departamento=" + departamento + ", provincia=" + provincia + ", direccion=" + direccion + ", telefono=" + telefono + ", telefonoTutor=" + telefonoTutor + ", observaciones=" + observaciones + '}';
    }
    
}
