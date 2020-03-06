<%-- 
    Document   : wingscolin
    Created on : 03-mar-2020, 16:24:03
    Author     : lenovo
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="Modelo.Querys"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
   <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    
            <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
 
        <link href="../CSS/estilos.css" rel="stylesheet" type="text/css"/>
        <link href="../CSS/cssUsuario.css" rel="stylesheet" type="text/css"/>
        
        
        <title>Menú</title>
    </head>
        
   <body>
     <div id="nombre" style="border: 2px solid transparent;font-size:40px;">
         
         <img src="../Imagenes/photo.png" id="logo" /> <center>Wings Colin</center>
         </div>
        
   <center>
       <header>
             <section id="menu">
             <ul>
	         <a href="usuarios.jsp">Usuarios</a>
                 <a href="empleados.jsp">Empleados</a>
                 <a href="productos.jsp">Productos</a>
		<a href="compras.jsp">Compras</a>
		<a href="detallecompra.jsp">Detalle de Compras</a>
	        <a href="ventas.jsp">Ventas</a>
                <a href="detalleventa.jsp">Detalle de Ventas</a>
                <a href="proveedores.jsp">Proveedores</a>
                <a href="direcciones.jsp">Direcciones</a>
                <a href="sucursal.jsp">Sucursal</a>
                <a href="reportes.jsp">Reportes</a>
		     
            </ul>
                 </section>
             
     </header>
	 </center>
  

       	     
        <div id="partecentral">

                              
            
	 </div>
	 
	 <div id="partebajo">
             
             <n>Pie de pagina</n>
	 </div>
           
               
                   
       
     
 



  </body>
</html>


