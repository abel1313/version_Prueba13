$(function(){
       
   $(".btnmostrarLogin").click(function(){
       $(".loader").fadeIn("show");       
                    setTimeout(function ()
                {
           $(".loader").fadeOut("show"); 
                    
                }, 2000);
            
       
   }); 
    
    
    $("#InciarSesion").click(function(){
        $(".loader").fadeIn("show"); 
alertify.success("Hola");
            $.ajax({
                url:"Sesion",
                type:"POST",
                data:$("#LoginSesion").serialize(),
                success:function(r){
                    console.log(r);
               if(r==1){
                  
                    setTimeout(function ()
                {
                        $(".loader").fadeOut("show");
                       
                     
                    }, 3000);
              
                setTimeout(
                        function ()
                        {
                        
                      $("#exampleModal").modal("hide");
                        $("#ModalMensajeUsuario").modal("show");
                        
                            $("#mensajeUsuario").text("Mensaje");
                        $(".mensajesUsuarios").text("Bienvenido");
                        $(location).attr("href","Vista/detalleventa.jsp");
                        
                        }, 2000);
                        
                   
               }else if(r==2){
                   
                     setTimeout(function ()

                        {
                 $(".loader").fadeOut("show");       
                $("#exampleModal").modal("hide");
                $("#ModalMensajeUsuario").modal("show");
                $("#mensajeUsuario").text("Mensaje");
                $(".mensajesUsuarios").text("Las contraseñas no coinciden");

                }, 3000);
           
               }else if(r==3){                   
                     setTimeout(function ()
                        {
                 $(".loader").fadeOut("show");       
                $("#exampleModal").modal("hide");
                $("#ModalMensajeUsuario").modal("show");
                $("#mensajeUsuario").text("Mensaje");
                $(".mensajesUsuarios").text("No deje campos vacíos");

                }, 3000);
           
               }
                },
                error:function(xhr,status){
                    console.log("Error "+status);
                }
                
            });
                     
    }); 
    $(".botonCerrarUsuario").click(function(){
        $("#exampleModal").modal("show");
        
    });
    
});






function iniciarSesion(url,datos){
    
            $.ajax({
                url:url,
                type:"POST",
                data:datos,
                success:function(r){
                    console.log(r);
                },
                error(xhr,status){
                    console.log(status);
                }
                
            });
             
}
function addUsrs(url, datos) {
    
    $.ajax({
        url: url,
        type: "POST",
        data: datos,
        success: function (res) {
            console.log(res);
        },
        error: function (jqXHR, status, error) {
            console.log(status);
        }, complete: function (jqXHR, status) {
            console.log(status);
        }, timeoute: 4000

    });
    return false;


}
