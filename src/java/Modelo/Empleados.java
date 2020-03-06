/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author abel_
 */
public class Empleados {

    private String nombre_Empleado;
    private String apellido_Paterno;
    private String apellido_Materno;
    private int edad_Empleado;
    private String sexo_Empleado;
    private String email_Empleado;
    private double sueldo_Empleado;
    private String telefono_Empleado;
    private String puesto_Empleado;
    private String horaEntrada_Empleado;
    private String horaSalida_Empleado;
    private String clave_Direccion;
    private String clave_Sucursal;
    private Usuario usuario;
    

    public Empleados() {
        this.nombre_Empleado="";
        this.apellido_Paterno="";
        this.apellido_Materno="";
        this.edad_Empleado=0;
        this.sexo_Empleado="";
        this.email_Empleado="";
        this.sueldo_Empleado=0;
        this.telefono_Empleado="";
        this.puesto_Empleado="";
        this.horaEntrada_Empleado="";
        this.horaSalida_Empleado="";
        this.clave_Direccion="";
        this.clave_Sucursal="";
        
        
        
    }

    public Empleados(String nombre_Empleado, String apellido_Paterno, String apellido_Materno, int edad_Empleado,
        String sexo_Empleado, String email_Empleado, double sueldo_Empleado, String telefono_Empleado,
        String puesto_Empleado, String horaEntrada_Empleado, String horaSalida_Empleado, String clave_Direccion,
        String clave_Sucursal,Usuario usuario) {
        this.nombre_Empleado = nombre_Empleado;
        this.apellido_Paterno = apellido_Paterno;
        this.apellido_Materno = apellido_Materno;
        this.edad_Empleado = edad_Empleado;
        this.sexo_Empleado = sexo_Empleado;
        this.email_Empleado = email_Empleado;
        this.sueldo_Empleado = sueldo_Empleado;
        this.telefono_Empleado = telefono_Empleado;
        this.puesto_Empleado = puesto_Empleado;
        this.horaEntrada_Empleado = horaEntrada_Empleado;
        this.horaSalida_Empleado = horaSalida_Empleado;
        this.clave_Direccion = clave_Direccion;
        this.clave_Sucursal = clave_Sucursal;
        this.usuario=usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    public String getNombre_Empleado() {
        return nombre_Empleado;
    }

    public void setNombre_Empleado(String nombre_Empleado) {
        this.nombre_Empleado = nombre_Empleado;
    }

    public String getApellido_Paterno() {
        return apellido_Paterno;
    }

    public void setApellido_Paterno(String apellido_Paterno) {
        this.apellido_Paterno = apellido_Paterno;
    }

    public String getApellido_Materno() {
        return apellido_Materno;
    }

    public void setApellido_Materno(String apellido_Materno) {
        this.apellido_Materno = apellido_Materno;
    }

    public int getEdad_Empleado() {
        return edad_Empleado;
    }

    public void setEdad_Empleado(int edad_Empleado) {
        this.edad_Empleado = edad_Empleado;
    }

    public String getSexo_Empleado() {
        return sexo_Empleado;
    }

    public void setSexo_Empleado(String sexo_Empleado) {
        this.sexo_Empleado = sexo_Empleado;
    }

    public String getEmail_Empleado() {
        return email_Empleado;
    }

    public void setEmail_Empleado(String email_Empleado) {
        this.email_Empleado = email_Empleado;
    }

    public double getSueldo_Empleado() {
        return sueldo_Empleado;
    }

    public void setSueldo_Empleado(double sueldo_Empleado) {
        this.sueldo_Empleado = sueldo_Empleado;
    }

    public String getTelefono_Empleado() {
        return telefono_Empleado;
    }

    public void setTelefono_Empleado(String telefono_Empleado) {
        this.telefono_Empleado = telefono_Empleado;
    }

    public String getPuesto_Empleado() {
        return puesto_Empleado;
    }

    public void setPuesto_Empleado(String puesto_Empleado) {
        this.puesto_Empleado = puesto_Empleado;
    }

    public String getHoraEntrada_Empleado() {
        return horaEntrada_Empleado;
    }

    public void setHoraEntrada_Empleado(String horaEntrada_Empleado) {
        this.horaEntrada_Empleado = horaEntrada_Empleado;
    }

    public String getHoraSalida_Empleado() {
        return horaSalida_Empleado;
    }

    public void setHoraSalida_Empleado(String horaSalida_Empleado) {
        this.horaSalida_Empleado = horaSalida_Empleado;
    }

    public String getClave_Direccion() {
        return clave_Direccion;
    }

    public void setClave_Direccion(String clave_Direccion) {
        this.clave_Direccion = clave_Direccion;
    }

    public String getClave_Sucursal() {
        return clave_Sucursal;
    }

    public void setClave_Sucursal(String clave_Sucursal) {
        this.clave_Sucursal = clave_Sucursal;
    }
    
    
    
}
