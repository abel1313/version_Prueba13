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
public class ProductoProveedorDTO {
    private String clave_Producto; 
    private String nombre_Producto;
    private double precio_Producto;
    private double existencias_Producto;
    private String descripcion_Producto;
    private String fecha_Cadocidad;
    private String nombre_Proveedor;
    private String clave_Proveedor;

    public ProductoProveedorDTO() {
        this.clave_Producto="";
        this.nombre_Producto="";
        this.precio_Producto=0;
        this.existencias_Producto=0;
        
        this.fecha_Cadocidad="";
        this.nombre_Proveedor="";
        
        
    }

    
    
    public ProductoProveedorDTO(String clave_Producto, String nombre_Producto, double precio_Producto, double existencias_Producto, String descripcion_Producto, String fecha_Cadocidad, String nombre_Proveedor, String clave_Proveedor) {
        this.clave_Producto = clave_Producto;
        this.nombre_Producto = nombre_Producto;
        this.precio_Producto = precio_Producto;
        this.existencias_Producto = existencias_Producto;
        this.descripcion_Producto = descripcion_Producto;
        this.fecha_Cadocidad = fecha_Cadocidad;
        this.nombre_Proveedor = nombre_Proveedor;
        this.clave_Proveedor = clave_Proveedor;
    }

    
    
    
    public String getClave_Producto() {
        return clave_Producto;
    }

    public void setClave_Producto(String clave_Producto) {
        this.clave_Producto = clave_Producto;
    }

        public String getNombre_Producto() {
        return nombre_Producto;
    }

    public void setNombre_Producto(String nombre_Producto) {
        this.nombre_Producto = nombre_Producto;
    }

    public double getPrecio_Producto() {
        return precio_Producto;
    }

    public void setPrecio_Producto(double precio_Producto) {
        this.precio_Producto = precio_Producto;
    }

    public double getExistencias_Producto() {
        return existencias_Producto;
    }

    public void setExistencias_Producto(double ecistencias_Producto) {
        this.existencias_Producto = ecistencias_Producto;
    }

    public String getDescripcion_Producto() {
        return descripcion_Producto;
    }

    public void setDescripcion_Producto(String descripcion_Producto) {
        this.descripcion_Producto = descripcion_Producto;
    }

    public String getFecha_Cadocidad() {
        return fecha_Cadocidad;
    }

    public void setFecha_Cadocidad(String fecha_Cadocidad) {
        this.fecha_Cadocidad = fecha_Cadocidad;
    }

    public String getNombre_Proveedor() {
        return nombre_Proveedor;
    }

    public void setNombre_Proveedor(String nombre_Proveedor) {
        this.nombre_Proveedor = nombre_Proveedor;
    }

    public String getClave_Proveedor() {
        return clave_Proveedor;
    }

    public void setClave_Proveedor(String clave_Proveedor) {
        this.clave_Proveedor = clave_Proveedor;
    }
    
    
    
    
}
