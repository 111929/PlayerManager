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
public class Jugador {
    private int idJugador;
    private String nombre;
    private String Apellido;
    private String documento;
    private String fechaDeNacimiento;
    private String fechaDePreSeleccion;
    private String Posicion;
    private Categoria division;
    private Departamento departamento;
    private String direccion;
    private String telefono;
    private String telefonoTutor;
    private String observaciones;
    private String fecheDeSeleccion;

    public Jugador() {
    }

    public Jugador(int idJugador, String nombre, String Apellido, String documento, String fechaDeNacimiento, String fechaDePreSeleccion, String Posicion, Categoria division, Departamento departamento, String direccion, String telefono, String telefonoTutor, String observaciones, String fecheDeSeleccion) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.documento = documento;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.fechaDePreSeleccion = fechaDePreSeleccion;
        this.Posicion = Posicion;
        this.division = division;
        this.departamento = departamento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.telefonoTutor = telefonoTutor;
        this.observaciones = observaciones;
        this.fecheDeSeleccion = fecheDeSeleccion;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
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

    public String getFechaDePreSeleccion() {
        return fechaDePreSeleccion;
    }

    public void setFechaDePreSeleccion(String fechaDePreSeleccion) {
        this.fechaDePreSeleccion = fechaDePreSeleccion;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public Categoria getDivision() {
        return division;
    }

    public void setDivision(Categoria division) {
        this.division = division;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
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

    public String getFecheDeSeleccion() {
        return fecheDeSeleccion;
    }

    public void setFecheDeSeleccion(String fecheDeSeleccion) {
        this.fecheDeSeleccion = fecheDeSeleccion;
    }

}
