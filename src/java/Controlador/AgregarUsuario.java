/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.EmpleUsuaDTO;
import Modelo.Hash;
import Modelo.Querys;
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
@WebServlet(name = "AgregarUsuario", urlPatterns = {"/addUser"})
public class AgregarUsuario extends HttpServlet {

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
            out.println("<title>Servlet AgregarUsuario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AgregarUsuario at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
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
        PrintWriter out=response.getWriter();
      
      String UserName=request.getParameter("UserName").trim();
      String Pass=request.getParameter("Password").trim();
      String conPass=request.getParameter("confPassword").trim();
      String claveEmpleado=request.getParameter("EmpleadoAgregar").trim();
      Querys consultasUsuarios=new Querys();
      
      if(UserName.equals("")&& Pass.equals("") && conPass.equals("") && claveEmpleado.equals("0")){
          out.println(1);
      }else if(!UserName.equals("")&& !Pass.equals("") && !conPass.equals("") && !claveEmpleado.equals("")){
          if(Pass.equals(conPass)){
              if(consultasUsuarios.buscarIguales(UserName)==0){
                  String contraEncriptada=Hash.sha1(Pass);
      EmpleUsuaDTO addUsuarios=new EmpleUsuaDTO(UserName, contraEncriptada, claveEmpleado);
                  if(consultasUsuarios.addUsuario(addUsuarios)){
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
