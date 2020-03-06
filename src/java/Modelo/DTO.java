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
public class DTO {

private Empleados emplea;
private Usuario usrs;

    public DTO() {
        emplea=null;
        usrs=null;
    }



    public DTO(Empleados emplea, Usuario usrs) {
        this.emplea = emplea;
        this.usrs = usrs;
    }




    public Empleados getEmplea() {
        return emplea;
    }

    public void setEmplea(Empleados emplea) {
        this.emplea = emplea;
    }

    public Usuario getUsrs() {
        return usrs;
    }

    public void setUsrs(Usuario usrs) {
        this.usrs = usrs;
    }



    
    
}
