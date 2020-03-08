<%-- 
    Document   : Login
    Created on : 2/03/2020, 11:27:36 PM
    Author     : abel_
--%>

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
  
   <script
  src="https://code.jquery.com/jquery-1.12.4.js"
  integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU="
  crossorigin="anonymous"></script>
  
 
        <link href="CSS/estilos.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/cssUsuario.css" rel="stylesheet" type="text/css"/>
        <script src="jQuery/jQueryUsuarios.js" type="text/javascript"></script>
        
        <title>Menú</title>
    </head>
        
   <body>
     <div id="nombre" style="border: 2px solid transparent;font-size:40px;">
         
         <img src="Imagenes/photo.png" id="logo" /> <center>Wings Colin</center>
         </div>
        
   <center>
       <header>
             <section id="menu">
          <!-- Button trigger modal -->
                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
                     Agregar Usuario
                    </button>
                         
                 
                 </section>
             
     </header>
	 </center>
  

       	     
        <div id="partecentral">

                             

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
                              
                              <form action="${pageContext.request.contextPath}/Sesion" method="POST">

                                  <div class="form-group">
                                      <label for="userName">User Name</label>
                                      <input type="text" class="form-control" id="userName" name="UserName"  placeholder="Ingrese Usuario">

                                  </div>

                                  <div class="form-group">
                                      <label for="password">Password</label>
                                      <input type="password" class="form-control" id="password" name="Password" placeholder="Password">
                                  </div>
                                  <button type="submit" class="btn btn-primary">Save changes</button>
                              </form>
                              
                          </div>
                          <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                            
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
