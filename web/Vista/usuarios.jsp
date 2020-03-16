<%-- 
    Document   : usuarios
    Created on : 03-mar-2020, 22:44:53
    Author     : lenovo
--%>

<%@page import="Modelo.EmpleUsuaDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.SQLException"%>
<%@page import="Modelo.Querys"%>
<%@page import="Modelo.Usuario"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
   <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    
  
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"/>
  <link href="../Librerias/alertifyjs/css/alertify.css" rel="stylesheet" type="text/css"/>
  <link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.12/css/jquery.dataTables.css">
   
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>

   <script src="../Librerias/jquery-3.4.1.min.js" type="text/javascript"></script>
  <script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
  
<script type="text/javascript" charset="utf8" src="//cdn.datatables.net/1.10.12/js/jquery.dataTables.js"></script>
    <!-- Bootstrap CSS -->
    <script src="../Librerias/alertifyjs/alertify.js" type="text/javascript"></script>  
 
  
 
        <link href="../CSS/estilos.css" rel="stylesheet" type="text/css"/>
        <link href="../CSS/cssUsuario.css" rel="stylesheet" type="text/css"/>
        <script src="../jQuery/jQueryUsuarios.js" type="text/javascript"></script>
        
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

                                <!-- Button trigger modal -->
                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
                     Agregar Usuario
                    </button>
                         

                    <!-- Modal -->
                    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                      <div class="modal-dialog" role="document">
                        <div class="modal-content">
                          <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">Agregar Nuevo Usuario</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                              <span aria-hidden="true">&times;</span>
                            </button>
                          </div>
                          <div class="modal-body">
                              <div class="loader"></div>
                <form id="formAddUsuario">

                   <div class="form-group">
                        <label for="userName">User Name</label>
                        <input type="text" class="form-control" id="userName" name="UserName"  placeholder="Ingrese Usuario">
                       
                   </div>

                   <div class="form-group">
                        <label for="password">Password</label>
                        <input type="password" class="form-control" id="password" name="Password" placeholder="Password">
                   </div>
                    
                       <div class="form-group">
                        <label for="confpassword">Confirmar Password</label>
                        <input type="password" class="form-control" id="confpassword" name="confPassword" placeholder="Confirme Password">
                        </div>
                    
                   <div class="form-group">
                        <label for="empleado">Empleado</label>
                        <select class="form-control form-control-sm" id="empleado" name="EmpleadoAgregar">
                        
                            <option value="0">Seleccione Empleado</option>
                        <%
                            try{
                        ResultSet resEmpleado=null;
                        Querys consultasEmpleado=new Querys();
                        resEmpleado=consultasEmpleado.mostEmpleado();
                             while(resEmpleado.next()){
                        %>
                        <option value="<%=resEmpleado.getString(1)%>"><%=resEmpleado.getString(2)%></option>
                        <%
                            }
                        }catch(SQLException e){

                            }
                            
                        %>
                        
                     </select>
                    
                   </div>
                    
                    
                   

                </form>
                              
                          </div>
                        
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                            <button type="button" class="btn btn-primary" id="addUser">Agregar Usuario</button>
                        </div>
                        </div>
                      </div>
                    </div>


                    <div class="tableUsuario">

                        <table class="table table-bordered" id="tablaUsuario">
                            <thead>
                                <tr class="table-active">
                                    <th scope="col">Nombre Empleado</th>
                                    <th scope="col">Edad</th>
                                    <th scope="col">Sexo</th>
                                    <th scope="col">User Name</th>
                                    <th scope="col">Cargo</th>
                                    
                                    <th scope="col">Acción</th>

                                </tr>
                            </thead>
                            <tbody>
                                <%            try {
                                        ArrayList<EmpleUsuaDTO> resUsuarios = null;
                                        Querys consultaUsuario = new Querys();
                                        resUsuarios = consultaUsuario.mostrarrUsuarios();
                                        for (EmpleUsuaDTO user : resUsuarios) {


                                %>

                                <%-- 
                            ArrayList<DTO> resUsuarios=null;
                            Querys consultaUsuario=new Querys();
                             resUsuarios=consultaUsuario.mostrarrUsuariosDTO();
                             for(DTO user:resUsuarios){ --%>
                                <tr>

                                    <th scope="row"><%=user.getNombre_Empleado()%></th>
                                    <th scope="row"><%=user.getEdad_Empleado()%></th>
                                    <th scope="row"><%=user.getSexo_Empleados()%></th>
                                    <th scope="row"><%=user.getNombre_Usuario()%></th>
                                    <th scope="row"><%=user.getCargo()%></th>
                                    

                                    <th scope="row">

                                        <%--  
                                        <th scope="row"><%=user.getEmplea().getNombre_Empleado()%></th>
                                        <th scope="row"><%=user.getEmplea().getEdad_Empleado()%></th>
                                        <th scope="row"><%=user.getEmplea().getSexo_Empleado()%></th>
                                        <th scope="row"><%=user.getUsrs().getNombre_Usuario()%></th>
                                        <th scope="row"><%=user.getUsrs().getClave_Usuario()%></th>
                                        --%>


                                        <button class="btn btn-secondary editarUsuarios" id="editarUsuario" data-toggle="modal" data-target="#exampleModalEditar" value="<%=user.getClave_Usuario()%>"><span class="glyphicon glyphicon-circle-arrow-down">Editar</span></button>
                                        <button class="btn btn-danger glyphicon glyphicon-remove enviarEliminarUsuario" id="eliminarUsuario" data-toggle="modal" data-target="#exampleModalEliminar" value="<%=user.getClave_Usuario()%>">Eliminar</button>

                                    </th>

                                </tr>
                                <%
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Err" + e.getMessage());
                                    }

                                %>

                            </tbody>
                        </table>

          
           <div class="modal fade" id="exampleModalEditar" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                      <div class="modal-dialog" role="document">
                        <div class="modal-content">
                          <div class="modal-header">
                            <h5 class="modal-title mensajeEdUs" id="exampleModalLabel">Editar Usuarios</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                              <span aria-hidden="true">&times;</span>
                            </button>
                          </div>
                          <div class="modal-body">
                              <div class="loader"></div>
                              
                             
                <form id="formEditarUsuario">

                   <div class="form-group">
                       <input type="hidden" id="claveUsuario" name="ClaveUsuariosEditar"/>
                       
                       <input type="hidden" id="ediEmpleado" name="edUsu" value="ediarUsuario"/>
                       
                        <label for="userName">User Name</label>
                        <input type="text" class="form-control" id="userNameEditar" name="UserNameEditarUsuario"  placeholder="Ingrese Usuarios"/>
                       
                   </div>

                   <div class="form-group">
                        <label for="password">Password</label>
                        <input type="password" class="form-control" id="passwordEditar" name="PasswordEditarUsuario" placeholder="Password"/>
                   </div>
                    
                       <div class="form-group">
                        <label for="confpassword">Confirmar Password</label>
                        <input type="password" class="form-control" id="confpasswordEditar" name="confPasswordEditarUsuario" placeholder="Confirme Password">
                        </div>
                    
                   <div class="form-group">
                        <label for="empleado">Empleado</label>
                        <select class="form-control form-control-sm" id="empleadoEditar" name="EmpleadoEditarUsuario">
                        
                        <option>Seleccione Empleado</option>
                        <%
                            try{
                        ResultSet resEmpleado=null;
                        Querys consultasEmpleado=new Querys();
                        resEmpleado=consultasEmpleado.mostEmpleado();
                             while(resEmpleado.next()){
                        %>
                        <option value="<%=resEmpleado.getString(1)%>"><%=resEmpleado.getString(2)%></option>
                        <%
                            }
                        }catch(SQLException e){

                            }
                            
                        %>
                        
                     </select>
                    
                   </div>
                    
                    
                   

                </form>
                              
                          </div>
                          <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                            <button type="button" class="btn btn-primary" id="updateUsuario">Editar Usuario</button>
                          </div>
                        </div>
                      </div>
                    </div>
                   
          
          
          
          
<div class="modal fade" id="exampleModalEliminar" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Mensaje de Confirmacion</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
       ¿Está seguro de Elimar éste Usuario?
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
        <button type="button" class="btn btn-primary recibirEliminarUsuario">Eliminar</button>
      </div>
    </div>
  </div>
</div>
                        
                        
<div class="modal fade" id="exampleModalMensajeUsuario" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="mensajeUsuario"></h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body mensajesUsuarios">
        <div class="loader"></div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
        
      </div>
    </div>
  </div>
</div>
                        
          
                    </div>
            
            
            
	 </div>
	 
	 <div id="partebajo">
             
             <n>Pie de pagina</n>
	 </div>
           
               
                   
       
     


    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    <script>
        
    
        
    </script>
  </body>
</html>