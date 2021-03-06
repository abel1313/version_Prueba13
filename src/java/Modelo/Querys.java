/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Usuarios;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

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
    
    public ResultSet mosUsu(){
    
        try {
            String sQL="CALL mostrarUsuarios()";
            ps=con.prepareStatement(sQL);
            return rs=ps.executeQuery();
            
        } catch (SQLException ex) {
            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
     }
       public ArrayList<EmpleUsuaDTO> mostrarUsuarioEditar(EmpleUsuaDTO edUsurio) {
       
        ArrayList<EmpleUsuaDTO> usuarioView = new ArrayList<>();
        String sQL = "CALL usuarioBuscarEditar(?)";
        try {
            ps = con.prepareStatement(sQL);
            ps.setInt(1, edUsurio.getClave_Usuario());
            rs = ps.executeQuery();
          
            while (rs.next()) {
          EmpleUsuaDTO empUsu=new EmpleUsuaDTO(rs.getInt("clvusuario"), rs.getString("username"),   
                  rs.getString("nomempleado"), rs.getString("clvempleado"));
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
 
             public ArrayList<Detalle_VentaDTO> agregarDetalle(Detalle_VentaDTO addDetalle) {
       
        ArrayList<Detalle_VentaDTO> agregaDetalle = new ArrayList<>();
        String sQL = "CALL buscarDetalleVenta(?)";
        try {
            ps = con.prepareStatement(sQL);
            ps.setString(1, addDetalle.getCalve_Producto());
            rs = ps.executeQuery();

            Calendar cal=new GregorianCalendar();
            int hra,min,seg;
            hra=cal.get(Calendar.HOUR_OF_DAY);
            min=cal.get(Calendar.MINUTE);
            seg=cal.get(Calendar.SECOND);
            int fec=0;
            String envHora=hra+":"+min+":"+seg;
            String envFecha=String.valueOf(cal.get(Calendar.YEAR)+":"+cal.get(Calendar.MONTH)+":"+cal.get(Calendar.DAY_OF_MONTH));
            
            if (rs.next()) {
                Detalle_VentaDTO detalle = new Detalle_VentaDTO();
               
                if (rs.getString(8).equals(addDetalle.getCalve_Producto())) {
                    
                    detalle.setNombre_Empleado(rs.getString(1));
                    detalle.setNombre_Sucursal(rs.getString(2));
                    detalle.setFecha_Venta(envFecha);
                    detalle.setHora_Venta(envHora);
                    detalle.setNombre_Producto(rs.getString(5));
                    detalle.setCantidad_Producto(rs.getDouble(6));
                    detalle.setSubTotal_Venta(rs.getDouble(7));
                    detalle.setCalve_Producto(rs.getString(8));
                        agregaDetalle.add(detalle);
                    
            }else if (!rs.getString(8).equals(addDetalle.getCalve_Producto())) {
                          
                    detalle.setNombre_Empleado(rs.getString(1));
                    detalle.setNombre_Sucursal(rs.getString(2));
                    detalle.setFecha_Venta(rs.getString(3));
                    detalle.setHora_Venta(rs.getString(4));
                    detalle.setNombre_Producto(rs.getString(5));
                    detalle.setCantidad_Producto(rs.getDouble(6) + rs.getDouble(6));
                    detalle.setSubTotal_Venta(rs.getDouble(7) * rs.getDouble(6));
                    detalle.setCalve_Producto(rs.getString(8));
                        agregaDetalle.add(detalle);
                }
                
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
        return agregaDetalle;
    }
 
             
       
       public ArrayList<EmpleUsuaDTO> mostrarrUsuarios() {
       
        ArrayList<EmpleUsuaDTO> usuarioView = new ArrayList<>();
        String sQL = "CALL mostrarUsuarios()";
        try {
            ps = con.prepareStatement(sQL);
            rs = ps.executeQuery();
          
            
            while (rs.next()) {
        EmpleUsuaDTO empUsu=new EmpleUsuaDTO();
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
    public boolean addUsuario(EmpleUsuaDTO usr) {

        try {
            String sQL = "CALL addUsuario(?,?,?)";
            ps = (PreparedStatement) con.prepareStatement(sQL);

            ps.setString(1, usr.getNombre_Usuario());
            ps.setString(2, usr.getPass_Usuarion());
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
        public int buscarIguales(String userName){
        try {
            String sQL="CALL buscaarUsuariosIguales(?)";
            ps=con.prepareStatement(sQL);
            ps.setString(1, userName);
            rs=ps.executeQuery();
            if(rs.next()){
                return rs.getInt(1);
            }
            return 1;
            
        } catch (SQLException ex) {
            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
       return 1;
        }
            
        }
        

           public ArrayList<ProductoProveedorDTO> mostrarProducto() {
       
        ArrayList<ProductoProveedorDTO> productoView = new ArrayList<>();
        String sQL = "CALL buscarProductos()";
        try {
            ps = con.prepareStatement(sQL);
            rs = ps.executeQuery();
          
            
            while (rs.next()) {
ProductoProveedorDTO productioProveedor=new ProductoProveedorDTO();
                productioProveedor.setClave_Producto(rs.getString(1));
               productioProveedor.setNombre_Producto(rs.getString(2));
               productioProveedor.setPrecio_Producto(rs.getDouble(3));
               productioProveedor.setExistencias_Producto(rs.getDouble(4));
               
               productioProveedor.setFecha_Cadocidad(rs.getString(5));
               productioProveedor.setNombre_Proveedor(rs.getString(6));
               
               productoView.add(productioProveedor);

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
        return productoView;
    }
        
    
   public static void main(String[] args) {
      Querys datosEditarUsuario=new Querys();
      Usuario uw=new Usuario();
      uw.setNombre_Usuario("Santorine");
      uw.setPass_Usuario("2");
      if(datosEditarUsuario.iniciarSesion(uw)){
          
      }else{
          System.out.println("no entro");
      }
   }
public boolean iniciarSesion(Usuario u){
        try {
            String sQL="CALL IniciarSesion(?)";
            ps=con.prepareStatement(sQL);
            ps.setString(1, u.getNombre_Usuario());
            rs=ps.executeQuery();
            if(rs.next()){
             
                String encr=AES.encrypt(u.getPass_Usuario(), "");
                String des=AES.decrypt(encr, "");
                String descDB=AES.decrypt(rs.getString("password"), "");
             
                if(descDB.equals(des)){
           
                    return true;
                }else{
                  return false;
                }
              
            
            }
            
            return false;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
   return false;
        }
}  
 

}
