<%-- 
    Document   : index
    Created on : 2/03/2020, 11:02:44 PM
    Author     : abel_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!doctype html>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link href="Librerias/alertifyjs/css/alertify.css" rel="stylesheet" type="text/css"/>
      

   <script src="Librerias/jquery-3.4.1.min.js" type="text/javascript"></script>
  <script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
  
    <link href="CSS/estilos.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/cssUsuario.css" rel="stylesheet" type="text/css"/>
        
     <script src="Librerias/alertifyjs/alertify.js" type="text/javascript"></script>   
     <script src="jQuery/IniciarSesion.js" type="text/javascript"></script>    
       
    <title>Login</title>
  </head>
  <body>
    
       <div id="nombre" style="border: 2px solid transparent;font-size:40px;">
         
         <img src="Imagenes/photo.png" id="logo" /> <center>Bienvenidos</center>
         </div>
        
   <center>
       <header>
             <section id="menu">
                 <div class="login col-12 col-sm-6 col-lg-3">
                     
                       <!-- Button trigger modal -->
                    <button type="button" class="btn btn-primary btnmostrarLogin" data-toggle="modal" data-target="#exampleModal">
                     Login
                    </button>
                     
                 </div>
                         
                 
                 </section>
             
     </header>
	 </center>
  

       	     
        <div id="partecentral">

                             

                    <!-- Modal -->
                    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                      <div class="modal-dialog" role="document">
                        <div class="modal-content">
                          <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">Login</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                              <span aria-hidden="true">&times;</span>
                            </button>
                          </div>
                          <div class="modal-body">
                              
                               <div class="loader"></div>
                              <form id="LoginSesion">

                                  <div class="form-group">
                                      <label for="userName">User Name</label>
                                      <input type="text" class="form-control" id="userName" name="UserName"  placeholder="Ingrese Usuario">

                                  </div>

                                  <div class="form-group">
                                      <label for="password">Password</label>
                                      <input type="password" class="form-control" id="password" name="Password" placeholder="Password">
                                  </div>
                                  
                              </form>
                              <button class="btn btn-primary" id="InciarSesion">Iniciar Sesión</button>
                              
                          </div>
                          <div class="modal-footer">
                            <button class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                            
                          </div>
                        </div>
                      </div>
                    </div>
                    
                    
                              
  <div class="row" id="gallery" data-toggle="modal" data-target="#exampleModal">
  <div class="col-12 col-sm-6 col-lg-3">
      <img class="w-100" src="Imagenes/Menu10.jfif" data-target="#carouselExample" data-slide-to="0" style="width :200px; height: 420px;"  id="imgHamburgesa">
  </div>
  <div class="col-12 col-sm-6 col-lg-3">
    <img class="w-100" src="Imagenes/Menu2.jfif" data-target="#carouselExample" data-slide-to="1">
    <img class="w-100" src="Imagenes/Menu5.jfif" data-target="#carouselExample" data-slide-to="1">
  </div>
  <div class="col-12 col-sm-6 col-lg-3">
    
    <img class="w-100" src="Imagenes/Menu6.jfif" data-target="#carouselExample" data-slide-to="1">
  </div>
  <div class="col-12 col-sm-6 col-lg-3">
    <img class="w-100" src="Imagenes/Menu4.jfif" data-target="#carouselExample" data-slide-to="3">
  </div>
</div>
        
                    <div class="modal fade" id="ModalMensajeUsuario" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                    <button type="button" class="btn btn-secondary botonCerrarUsuario" data-dismiss="modal">Cerrar</button>

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


</body>
</html>
