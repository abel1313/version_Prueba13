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
public class Detalle_VentaDTO {
    private String nombre_Empleado;
    private String nombre_Sucursal;
    private String fecha_Venta;
    private String hora_Venta;
    private String nombre_Producto;
    private double cantidad_Producto;
    private double subTotal_Venta;
    private String calve_Producto;
    private int clave_DetalleVenta;

    public Detalle_VentaDTO(String nombre_Empleado, String nombre_Sucursal, String fecha_Venta, String hora_Venta, String nombre_Producto, double cantidad_Producto, double subTotal_Venta, String calve_Producto, int clave_DetalleVenta) {
        this.nombre_Empleado = nombre_Empleado;
        this.nombre_Sucursal = nombre_Sucursal;
        this.fecha_Venta = fecha_Venta;
        this.hora_Venta = hora_Venta;
        this.nombre_Producto = nombre_Producto;
        this.cantidad_Producto = cantidad_Producto;
        this.subTotal_Venta = subTotal_Venta;
        this.calve_Producto = calve_Producto;
        this.clave_DetalleVenta = clave_DetalleVenta;
    }

    public Detalle_VentaDTO(String nombre_Empleado, String nombre_Sucursal, String fecha_Venta, String hora_Venta, String nombre_Producto, double cantidad_Producto, double subTotal_Venta, int clave_DetalleVenta) {
        this.nombre_Empleado = nombre_Empleado;
        this.nombre_Sucursal = nombre_Sucursal;
        this.fecha_Venta = fecha_Venta;
        this.hora_Venta = hora_Venta;
        this.nombre_Producto = nombre_Producto;
        this.cantidad_Producto = cantidad_Producto;
        this.subTotal_Venta = subTotal_Venta;
        this.clave_DetalleVenta = clave_DetalleVenta;
    }
    

    public Detalle_VentaDTO() {
         this.nombre_Empleado = "";
        this.nombre_Sucursal = "";
        this.fecha_Venta = "";
        this.hora_Venta = "";
        this.nombre_Producto = "";
        this.cantidad_Producto = 0;
        this.subTotal_Venta = 0;
        this.calve_Producto = "";
        this.clave_DetalleVenta = 0;
    }

 

    public String getCalve_Producto() {
        return calve_Producto;
    }

    public void setCalve_Producto(String calve_Producto) {
        this.calve_Producto = calve_Producto;
    }

    public int getClave_DetalleVenta() {
        return clave_DetalleVenta;
    }

    public void setClave_DetalleVenta(int clave_DetalleVenta) {
        this.clave_DetalleVenta = clave_DetalleVenta;
    }

    
        
        
        
    public String getNombre_Empleado() {
        return nombre_Empleado;
    }

    public void setNombre_Empleado(String nombre_Empleado) {
        this.nombre_Empleado = nombre_Empleado;
    }

    public String getNombre_Sucursal() {
        return nombre_Sucursal;
    }

    public void setNombre_Sucursal(String nombre_Sucursal) {
        this.nombre_Sucursal = nombre_Sucursal;
    }

    public String getFecha_Venta() {
        return fecha_Venta;
    }

    public void setFecha_Venta(String fecha_Venta) {
        this.fecha_Venta = fecha_Venta;
    }

    public String getHora_Venta() {
        return hora_Venta;
    }

    public void setHora_Venta(String hora_Venta) {
        this.hora_Venta = hora_Venta;
    }

    public String getNombre_Producto() {
        return nombre_Producto;
    }

    public void setNombre_Producto(String nombre_Producto) {
        this.nombre_Producto = nombre_Producto;
    }

    public double getCantidad_Producto() {
        return cantidad_Producto;
    }

    public void setCantidad_Producto(double cantidad_Producto) {
        this.cantidad_Producto = cantidad_Producto;
    }

    public double getSubTotal_Venta() {
        return subTotal_Venta;
    }

    public void setSubTotal_Venta(double subTotal_Venta) {
        this.subTotal_Venta = subTotal_Venta;
    }
    
    
}
