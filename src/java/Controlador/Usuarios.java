/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.Hash;
import Modelo.Querys;
import Modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author abel_
 */
@WebServlet(name = "Usuarios", urlPatterns = {"/EditarEliminarUsuarios"})
public class Usuarios extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Usuarios</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Usuarios at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         PrintWriter out=response.getWriter();
         String claveUsuario=request.getParameter("dat");
         
         Querys eliminarUsuario=new Querys();
         Usuario usuElimar=new Usuario();
         usuElimar.setClave_Usuario(Integer.parseInt(claveUsuario));
         if(eliminarUsuario.delUsuario(usuElimar)){
             out.println(1);
         }else{
             out.println(2);
         }
         
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
      String ediEli=request.getParameter("edUsu").trim();
      Querys consUsuario=new Querys();

    
          String userName=request.getParameter("UserNameEditarUsuario").trim();
      String pass=request.getParameter("PasswordEditarUsuario").trim();
      String conpas=request.getParameter("confPasswordEditarUsuario").trim();
      String claempleado=request.getParameter("EmpleadoEditarUsuario").trim();
      String clausuario=request.getParameter("ClaveUsuariosEditar").trim();
      
      if(userName.equals("")&&pass.equals("")&&conpas.equals("")&&claempleado.equals("Seleccione Empleado")){
          out.println(1);
      }else if( !userName.equals("") && !pass.equals("") && !conpas.equals("") && !claempleado.equals("")){
    
          if(pass.equals(conpas)){
              
                if(consUsuario.buscarIguales(userName)==0){
                    String pasUpdate=Hash.sha1(pass);
                    Usuario updUsuarios=new Usuario();
                    updUsuarios.setNombre_Usuario(userName);
                    updUsuarios.setPass_Usuario(pasUpdate);
                    updUsuarios.setClave_Empleado(claempleado);
                    updUsuarios.setClave_Usuario(Integer.parseInt(clausuario));
                    if(consUsuario.updateUsuario(updUsuarios)){
                        
                        out.println(5);
                    }else{
                        out.println(6);
                    }
                    
                }else{
                    out.println(4);
                }
              
          }else{
              out.println(3);
          }
          
          
      }
      
      
      
      
      
            
                
                
        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
