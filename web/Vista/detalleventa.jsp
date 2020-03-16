<%-- 
    Document   : detalleventa
    Created on : 03-mar-2020, 22:48:22
    Author     : lenovo
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Querys"%>
<%@page import="Modelo.ProductoProveedorDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <script
            src="https://code.jquery.com/jquery-2.2.4.js"
            integrity="sha256-iT6Q9iMJYuQiMWNd9lDyBUStIq/8PuOW33aOqmvFpqI="
        crossorigin="anonymous"></script>


        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"/>
        <link href="../Librerias/alertifyjs/css/alertify.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.12/css/jquery.dataTables.css">
        
        
        
        <link href="../open-iconic-master/font/css/open-iconic-foundation.css" rel="stylesheet" type="text/css"/>

        <script type="text/javascript" charset="utf8" src="//cdn.datatables.net/1.10.12/js/jquery.dataTables.js"></script>
        
        <!-- Bootstrap CSS -->
        <script src="../Librerias/alertifyjs/alertify.js" type="text/javascript"></script>
        <link href="../CSS/estilos.css" rel="stylesheet" type="text/css"/>
        <link href="../CSS/cssDetalleVenta.css" rel="stylesheet" type="text/css"/>


        <script src="../jQuery/jQueryProdProveedor.js" type="text/javascript"></script>

        <title>Detalle Venta</title>
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

        <div id="divProductos">
           

       

                    <div class="bodyTabla">

                        <table class="table table-hover" id="tablaPro">
                            <thead>
                                <tr>
                                    
                                    <th scope="col">Nombre Producto</th>
                                    <th scope="col">Precio Producto</th>
                                    <th scope="col">Existencias Producto</th>
                                    
                                    <th scope="col">Fecha Cadocida</th>
                                    <th scope="col">Nombre Proveedor</th>
                                    
                                    <th scope="col">Acción</th>
                                    

                                </tr>
                            </thead>
                            <tbody>
           <%
                                    try {
                                        ArrayList<ProductoProveedorDTO> mostrar = null;
                                        Querys mosProducto = new Querys();
                                        mostrar = mosProducto.mostrarProducto();
                                        for (ProductoProveedorDTO elem : mostrar) {


                                %>   

                                <tr>

                                    <td scope="row"><%=elem.getNombre_Producto()%></td>
                                    <td scope="row"><%=elem.getPrecio_Producto()%></td>
                                    <td scope="row"><%=elem.getExistencias_Producto()%></td>
                                    <td scope="row"><%=elem.getFecha_Cadocidad()%></td>
                                    <td scope="row"><%=elem.getNombre_Proveedor()%></td>
                                    <td scope="row"><button class="btn btn-secondary btn-sm ventaProducto" value="<%=elem.getClave_Producto()%>"><span class="fi-circle-check"></span></button></td>

                                </tr>

                                <%
                                        }

                                    } catch (Exception e) {
                                    }

                                %>
                            </tbody>
                        </table>

                 
            </div>



        </div>


    </div>

    <div id="parteCentral3">

      
        <div id="detalleVentaDiv" class="table-responsive">

                    <table class="table table-hover" id="tablDeta">
                        <thead>
                            <tr class="bg-danger">
                                    <th scope="col">Nombre Empleado</th>
                                    <th scope="col">Nombre Sucursal</th>
                                    <th scope="col">Fecha Venta</th>
                                    <th scope="col">Hora Venta</th>
                                    <th scope="col">Nombre Producto</th>
                                    <th scope="col">Cantidad Producto</th>
                                    <th scope="col">Subtotal</th>
                                    <th scope="col">Acción</th>


                            </tr>
                        </thead>
                        <tbody>
                            
                            
                        </tbody>
                      
                    </table>


        </div>

    </div>


</div>













<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.js"></script><font></font>


</body>
</html>
