/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.*;
import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abel_
 */
public class Querys {

    PreparedStatement ps = null;
    ResultSet rs = null;
    conectaBD cone = new conectaBD();
    private Connection con = cone.conexionBD();
   public ArrayList<EmpleUsuaDTO> mostrarrUsuarios() {
       
        ArrayList<EmpleUsuaDTO> usuarioView = new ArrayList<>();
        String sQL = "CALL mostrarUsuarios()";
        try {
            ps = con.prepareStatement(sQL);
            rs = ps.executeQuery();
          
            EmpleUsuaDTO empUsu=new EmpleUsuaDTO();
            while (rs.next()) {
               empUsu.setClave_Usuario(rs.getInt(1));
               empUsu.setNombre_Empleado(rs.getString(2));
               empUsu.setEdad_Empleado(rs.getInt(3));
               empUsu.setSexo_Empleados(rs.getString(4));
               empUsu.setNombre_Usuario(rs.getString(5));
               empUsu.setCargo(rs.getString(6));
               usuarioView.add(empUsu);

            }
        } catch (SQLException ex) {

            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("err "+ex.getMessage());
        } finally {
            try {
                ps.close();
                con.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("cone "+ex.getMessage());
            }
        }
        return usuarioView;
    }
   
   public ArrayList<DTO> mostrarrUsuariosDTO() {
       
        ArrayList<DTO> usuarioDTO = new ArrayList<>();
        String sQL = "CALL mostrarUsuarios()";
        try {
            ps = con.prepareStatement(sQL);
            rs = ps.executeQuery();
          
            DTO dto=new DTO();
            while (rs.next()) {
               dto.getUsrs().setClave_Usuario(rs.getInt(1));
               dto.getEmplea().setNombre_Empleado(rs.getString(2));
               dto.getEmplea().setEdad_Empleado(rs.getInt(3));
               dto.getEmplea().setSexo_Empleado(rs.getString(4));
               dto.getUsrs().setNombre_Usuario(rs.getString(5));
               dto.getEmplea().setPuesto_Empleado(rs.getString(6));
               usuarioDTO.add(dto);

            }
        } catch (SQLException ex) {

            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("err "+ex.getMessage());
        } finally {
            try {
                ps.close();
                con.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("cone "+ex.getMessage());
            }
        }
        return usuarioDTO;
    }
   
   
   public ResultSet mostrarUsuarios2(){
        
        try {
            String sQL="CALL mostrarUsuarios()";
            ps=con.prepareStatement(sQL);
            return rs=ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
    public boolean addUsuario(Usuario usr) {

        try {
            String sQL = "CALL addUsuario(?,?,?)";
            ps = (PreparedStatement) con.prepareStatement(sQL);

            ps.setString(1, usr.getNombre_Usuario());
            ps.setString(2, usr.getPass_Usuario());
            ps.setString(3, usr.getClave_Empleado());

            ps.executeUpdate();

            return true;
        } catch (SQLException ex) {
            System.out.println("err " + ex.getMessage());
            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }

    public boolean updateUsuario(Usuario us) {
        try {
            String sQL = "CALL updateUsuario(?,?,?,?)";
            ps = con.prepareStatement(sQL);
            ps.setString(1, us.getNombre_Usuario());
            ps.setString(2, us.getPass_Usuario());
            ps.setString(3, us.getClave_Empleado());
            ps.setInt(4, us.getClave_Usuario());
            ps.executeUpdate();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public boolean delUsuario(Usuario uus) {
        try {
            String sQL = "CALL delUsuario(?)";
            ps = con.prepareStatement(sQL);
            ps.setInt(1, uus.getClave_Usuario());
            ps.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.out.println("e" + ex.getMessage());
            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public boolean addDetalleVenta(Detalle_Venta dtlle){
    
               try {
            String sQL = "CALL addDetalleVenta(?,?,?,?)";
            ps = (PreparedStatement) con.prepareStatement(sQL);

            ps.setString(1, dtlle.getClave_Venta());
            ps.setString(2, dtlle.getClave_Producto());
            ps.setDouble(3, dtlle.getCantidad_Producto());
            ps.setDouble(4, dtlle.getSubTotalDetalleVenta());

            ps.executeUpdate();

            return true;
        } catch (SQLException ex) {
            System.out.println("err " + ex.getMessage());
            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public boolean updateDetalleVenta(Detalle_Venta dtlleVe) {
        try {
            String sQL = "CALL updateDetalleVenta(?,?,?,?,?)";
            ps = con.prepareStatement(sQL);
            ps.setString(1, dtlleVe.getClave_Venta());
            ps.setString(2, dtlleVe.getClave_Producto());
            ps.setDouble(3, dtlleVe.getCantidad_Producto());
            ps.setDouble(4, dtlleVe.getSubTotalDetalleVenta());
            ps.setInt(5, dtlleVe.getClave_DetalleVenta());
            ps.executeUpdate();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

        public boolean delDetalleVenta(Detalle_Venta dtVenta) {
        try {
            String sQL = "CALL delDetalleVenta(?)";
            ps = con.prepareStatement(sQL);
            ps.setInt(1, dtVenta.getClave_DetalleVenta());
            ps.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.out.println("e" + ex.getMessage());
            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
        public ResultSet mostEmpleado(){
        try {
            String sQL="SELECT clvempleado,nomempleado FROM empleados";
            ps=con.prepareStatement(sQL);
            return rs=ps.executeQuery();
            
        } catch (SQLException ex) {
            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
       return null;
        }
        }
    

  

}
