/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.EmpleUsuaDTO;
import Modelo.Querys;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author abel_
 */
@WebServlet(name = "actualizandoUsuariosAjax", urlPatterns = {"/cargandoUsuarios"})
public class actualizandoUsuariosAjax extends HttpServlet {

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
            out.println("<title>Servlet actualizandoUsuariosAjax</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet actualizandoUsuariosAjax at " + request.getContextPath() + "</h1>");
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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        String tablaUsuarios="";
        Querys actUsuariosAjax=new Querys();
        
        
                    tablaUsuarios+="<table class='table table-bordered table table-lg'>"
                            + "<thead>"
                            + "<tr class='table-active'>"
                            + " <th scope='col'>Nombre Empleado</th>"
                            + " <th scope='col'>Edad</th>"
                            + " <th scope='col'>Sexo</th>"
                            + " <th scope='col'>User Name</th>"
                            + " <th scope='col'>Cargo</th>"
                            
                            + " <th scope='col'>Acción</th>"
                            + " </tr>"
                            + " </thead>"
                            + " <tbody>";
                                            try {
                                        ArrayList<EmpleUsuaDTO> resUsuarios = null;
                                        Querys consultaUsuario = new Querys();
                                        resUsuarios = consultaUsuario.mostrarrUsuarios();
                                        for (EmpleUsuaDTO user : resUsuarios) {
                                            
               tablaUsuarios+="<tr>"

                                  +"<th scope='row'>"+user.getNombre_Empleado()+"</th>"
                                  +"<th scope='row'>"+user.getEdad_Empleado()+"</th>"
                                  +"<th scope='row'>"+user.getSexo_Empleados()+"</th>"
                                  +"<th scope='row'>"+user.getNombre_Usuario()+"</th>"
                                  +"<th scope='row'>"+user.getCargo()+"</th>"
                                  

                                  +"<th scope='row'>"

                                    


                                  +"<button class='btn btn-secondary editarUsuarios' id='editarUsuario' data-toggle='modal' data-target='#exampleModalEditar' value="+user.getClave_Usuario()+">Editar</button>"
                                  +"<button class='btn btn-danger' id='eliminarUsuario' data-toggle='modal' data-target='#exampleModalEliminar' value="+user.getClave_Usuario()+">Eliminar</button>"

                                  +"</th>"

                                +"</tr>";
                                
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Err" + e.getMessage());
                                    }

                              
      
 tablaUsuarios+="</tbody>"
+"</table>";
 
 String mensa="";
 
mensa+="<div class='modal fade' id='exampleModalMensajeUsuario' tabindex='-1' role='dialog' aria-labelledby='exampleModalLabel' aria-hidden='true'>"
  +"<div class='modal-dialog' role='document'>"
    +"<div class='modal-content'>"
      +"<div class='modal-header'>"
      +"  <h5 class='modal-title' id='mensajeUsuario'></h5>"
      +"  <button type='button' class='close' data-dismiss='modal' aria-label='Close'>"
      +"    <span aria-hidden='true'>&times;</span>"
      +"  </button>"
      +"</div>"
      +"<div class='modal-body mensajesUsuarios'>"
       
     +" </div>"
      +"<div class='modal-footer'>"
       +" <button type='button' class='btn btn-secondary' data-dismiss='modal'>Cerrar</button>"
        
     +" </div>"
   +" </div>"
  +"</div>"
+"</div>";
        
      out.println(mensa);
      out.println(tablaUsuarios);
        
        
        
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
