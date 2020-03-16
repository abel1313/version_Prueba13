/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Detalle_VentaDTO;

import Modelo.Querys;
import com.google.gson.Gson;
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
@WebServlet(name = "DetalleVenta", urlPatterns = {"/DetalleVentaDTO"})
public class DetalleVenta extends HttpServlet {

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
            out.println("<title>Servlet DetalleVenta</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DetalleVenta at " + request.getContextPath() + "</h1>");
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
        String condProducto=request.getParameter("id");
          PrintWriter out=response.getWriter();
       Querys consDetalle=new Querys();
          ArrayList<Detalle_VentaDTO>recDetalle=null;
          Detalle_VentaDTO detVenta=new Detalle_VentaDTO();
          detVenta.setCalve_Producto(condProducto);
         recDetalle=consDetalle.agregarDetalle(detVenta);
         
         String tabDetalle="";
         tabDetalle+="<tr class='table-active'>";
         
         for (Detalle_VentaDTO detalle_VentaDTO : recDetalle) {
            tabDetalle+="<td>" +detalle_VentaDTO.getNombre_Empleado()+ "</td>"+
                        "<td>" +detalle_VentaDTO.getNombre_Sucursal()+ "</td>"+
                        "<td>" +detalle_VentaDTO.getFecha_Venta()+ "</td>"+
                        "<td>" +detalle_VentaDTO.getHora_Venta()+ "</td>"+
                        "<td>" +detalle_VentaDTO.getNombre_Producto()+ "</td>"+
                        "<td>" +detalle_VentaDTO.getCantidad_Producto()+ "</td>"+
                        "<td>" +detalle_VentaDTO.getSubTotal_Venta()+ "</td>"+
                        "<td><button id='masome' class='"+detalle_VentaDTO.getCalve_Producto()+" masoMenos'><span class=fi-trash></span></button></td></tr>";
         }
         
         
    //     Gson reenviarDetalle=new Gson();
      //   String jsonDetalle=reenviarDetalle.toJson(recDetalle);
         
        //out.println(jsonDetalle);
        out.println(tabDetalle);
        
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
