<%-- 
    Document   : detalleventa
    Created on : 03-mar-2020, 22:48:22
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.20/css/jquery.dataTables.css"><font></font>
 <font></font>   
 <script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
 
 
   <script src="../jQuery/jQueryDetalleVenta.js" type="text/javascript"></script>
   <script src="../jQuery/jQueryDetalleVenta.js" type="text/javascript"></script>
   <script src="../jQuery/jQueryProdProveedor.js" type="text/javascript"></script>
   
     <link href="../CSS/estilos.css" rel="stylesheet" type="text/css"/>
      <link href="../CSS/cssUsuario.css" rel="stylesheet" type="text/css"/>
      
    
    <title>Detalle de Venta</title>
  </head>
  <body>
    
       <div id="nombre" style="border: 2px solid transparent;font-size:40px;">
         <img src="../Imagenes/photo.png" alt="" id="logo" /> <center>Wings Colin</center>
         </div>
       
      
        
   <center><header>
             <section id="menu">
             <ul>
	         <a href="usuarios.jsp">Usuarios</a>
                 <a href="empleados.jsp">Empleados</a>
                 <a href="productos.jsp">Productos</a>
		<a href="compras.jsp">Compras</a>
		<a href="detallecompra.jsp">Detalle de Compras</a>
	        <a href="ventas.jsp">Ventas</a>
                <a>Detalle de Ventas</a>
                <a href="proveedores.jsp">Proveedores</a>
                <a href="direcciones.jsp">Direcciones</a>
                <a href="sucursal.jsp">Sucursal</a>
                <a href="reportes.jsp">Reportes</a>
		     
            </ul>
                 </section>
             
     </header>
	 </center>
  
   <div id="partecentral2">
       <center>DETALLE DE VENTA</center>

       <div id="productosDetalleVenta">
    <table id="tablaProductos" class="table table-bordered table-lg">
               <thead><font></font>
               <tr class="table-active">
                   <th scope="col">Clave Producto</th>
                   <th scope="col">Nombre Producto</th>
                   <th scope="col">Precio del Producto</th>
                   <th scope="col">Existencias del Producto</th>
                   <th scope="col">Descripcion del Producto</th>
                   <th scope="col">Fecha de Cadocidad</th>
                   <th scope="col">Nombre del Proveedor</th>
                   <th scope="col">Acción</th>
               </tr><font></font>
               </thead>
               <tbody>
                   <tr><font></font>
               <td></td>
               <td></td>
               <td></td>
               <td></td>
               <td></td>
               <td></td>
               <td></td>
               <td></td>
               
               </tr>
               </tbody>
           </table>       
        
     </div>
       
   </div>
  <br> <br>
         <div id="productosTables">

           <table id="tablaDetalleVenta" class="table table-bordered table-lg">
               <thead><font></font>
               <tr class="table-active">
                   <th scope="col">Nombre Empleado</th>
                   <th scope="col">Nombre Sucursal</th>
                   <th scope="col">Fecha Venta</th>
                   <th scope="col">Hora Venta</th>
                   <th scope="col">Nombre Producto</th>
                   <th scope="col">Cantidad Producto</th>
                   <th scope="col">Subtotal Venta</th>
                   <th scope="col">Acción</th>
               </tr><font></font>
               </thead>
               <tbody>
                   <tr><font></font>
               <td></td>
               <td></td>
               <td></td>
               <td></td>
               <td></td>
               <td></td>
               <td></td>
               <td></td>
               </tr>
               </tbody>
           </table>

       </div>

 
  
    
   
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.js"></script><font></font>
    
    

</body>
</html>
