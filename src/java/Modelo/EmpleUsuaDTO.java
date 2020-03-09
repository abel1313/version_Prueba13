/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author abel_
 */
public class EmpleUsuaDTO implements Serializable{
   
    private int clave_Usuario;
    private String nombre_Usuario;
    private String nombre_Empleado;
    private String apellido_Paterno;
    private String apellido_Materno;
    private int edad_Empleado;
    private String sexo_Empleados;
    private String cargo;
    private String pass_Usuarion;
    private String clave_Empleado;

    public EmpleUsuaDTO() {
     this.clave_Usuario=0;
     this.nombre_Usuario="";
     this.nombre_Empleado="";
     this.apellido_Paterno="";
     this.apellido_Materno="";
     this.edad_Empleado=0;
     this.sexo_Empleados="";
    this.cargo="";
    this.pass_Usuarion="";
    this.clave_Empleado="";
    }
    public EmpleUsuaDTO(int clave_Usuario,String nombre_Usuario,String nombre_Empleado,String clave_Empleado){
    this.clave_Usuario=clave_Usuario;
    this.nombre_Usuario=nombre_Usuario;
    this.nombre_Empleado=nombre_Empleado;
    this.clave_Empleado=clave_Empleado;
    }
  
    
       public EmpleUsuaDTO(String nombre_Usuario,String pass_Usuario,String clave_Empleado){
    this.nombre_Usuario=nombre_Usuario;
    this.pass_Usuarion=pass_Usuario;
    this.clave_Empleado=clave_Empleado;
    }

    public String getClave_Empleado() {
        return clave_Empleado;
    }

    public void setClave_Empleado(String clave_Empleado) {
        this.clave_Empleado = clave_Empleado;
    }

    public String getPass_Usuarion() {
        return pass_Usuarion;
    }

    public void setPass_Usuarion(String pass_Usuarion) {
        this.pass_Usuarion = pass_Usuarion;
    }

    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
    
    public int getClave_Usuario() {
        return clave_Usuario;
    }

    public void setClave_Usuario(int clave_Usuario) {
        this.clave_Usuario = clave_Usuario;
    }

    public String getNombre_Usuario() {
        return nombre_Usuario;
    }

    public void setNombre_Usuario(String nombre_Usuario) {
        this.nombre_Usuario = nombre_Usuario;
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

    public String getSexo_Empleados() {
        return sexo_Empleados;
    }

    public void setSexo_Empleados(String sexo_Empleados) {
        this.sexo_Empleados = sexo_Empleados;
        
    }
    
    
    
}
