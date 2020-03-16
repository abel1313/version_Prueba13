$(function () {
    
          $("#tablaUsuario").DataTable();
          
             setTimeout(function ()
        {
          $(".loader").fadeOut("slow"); 
        }, 2000);
soloLetras($("#userName"));
    soloLetras($("#userNameEditar"));
    
    $(".editarUsuarios").click(function () {
        editarEliminar("../AgregarUsuario", $(this).val());

    });

    $("#addUser").click(function () {
        setTimeout(function ()
        {
           
        }, 2000);
        addUsrs("../addUser", $("#formAddUsuario").serialize())
        
    });
    
    
    $("#updateUsuario").click(function(){
        
        
        
        editarUsuario("../EditarEliminarUsuarios",$("#formEditarUsuario").serialize());
        
    });
    
    
    $("#eliminarUsuario").click(function(){
        $("#exampleModalEliminar").modal("show");
        $(".recibirEliminarUsuario").val($(this).val());
    });
    
    $(".recibirEliminarUsuario").click(function(){
        
        eliminarEditar("../EditarEliminarUsuarios",$(this).val());
        
    });
    

});


function addUsrs(url, datos) {
    
    $.ajax({
        url: url,
        type: "POST",
        data: datos,
        success: function (res) {
            console.log(res);
        
            if (res == 1) {
                $("#exampleModal").modal("hide");
                $("#exampleModalMensajeUsuario").modal("show");
                $("#mensajeUsuario").text("Mensaje");
                $(".mensajesUsuarios").text("No deje campos vacios");
                setTimeout(
                        function ()
                        {
                            $("#exampleModalMensajeUsuario").modal("hide");
                            $("#exampleModal").modal("show");
                            

                        }, 2000);

            } else if (res == 2) {

            } else if (res == 3) {
                $("#exampleModal").modal("hide");
                $("#exampleModalMensajeUsuario").modal("show");
                $("#mensajeUsuario").text("Mensaje");
                $(".mensajesUsuarios").text("Las contraseñas no coinciden");
                setTimeout(
                        function ()
                        {
                            $("#exampleModalMensajeUsuario").modal("hide");
                            $("#exampleModal").modal("show");
                            

                        }, 2000);

            } else if (res == 4) {
                $("#exampleModal").modal("hide");
                $("#exampleModalMensajeUsuario").modal("show");
                $("#mensajeUsuario").text("Mensaje");
                $(".mensajesUsuarios").text("Éste usuario ya existe");
                setTimeout(
                        function ()
                        {
                            $("#exampleModalMensajeUsuario").modal("hide");
                            $("#exampleModal").modal("show");

                        }, 2000);
            } else if (res == 5) {
                $("#exampleModal").modal("hide");
                $("#exampleModalMensajeUsuario").modal("show");
                $("#mensajeUsuario").text("Mensaje");
                $(".mensajesUsuarios").text("Éste usuario se Agrego correctamente");
                $(location).attr("href","../Vista/usuarios.jsp");
                
                setTimeout(
                        function ()
                        {
                           
                            $("#exampleModal").modal("hide");
                            
                        }, 2000);
            } else if (res == 6) {
                $("#exampleModal").modal("hide");
                $("#exampleModalMensajeUsuario").modal("show");
                $("#mensajeUsuario").text("Mensaje");
                $(".mensajesUsuarios").text("El usuario no se Agregó");
                setTimeout(
                        function ()
                        {
                            $("#exampleModalMensajeUsuario").modal("hide");
                            $("#exampleModal").modal("hide");

                        }, 2000);
            }

        },
        error: function (jqXHR, status, error) {
            console.log(status);
        }, complete: function (jqXHR, status) {
            console.log(status);
        }, timeoute: 4000

    });
    return false;


}

function editarEliminar(url, data) {
    $.ajax({
        url: url,
        type: "post",
        data: {da: data},
        success: function (respuesta) {
            console.log(respuesta);
            setTimeout(
                    function ()
                    {
                        $(".loader").fadeOut("slow");
                    }, 2000);
            $("#claveUsuario").val(respuesta.clave_Usuario);
            
            $("#userNameEditar").val(respuesta.nombre_Usuario);


            console.log(respuesta.clave_Empleado);


        },
        error: function (jqXHR, status, error) {
            console.log(status);
        }, complete: function (jqXHR, status) {
            console.log(status);
        }, timeoute: 4000

    });
    return false;
}

function eliminarEditar(url, data) {
    $.ajax({
        url: url,
        type: "GET",
        data: {dat: data},
        success: function (r) {
            console.log(r);
            if (r == 1) {

                $("#exampleModalEditar").modal("hide");
                $("#exampleModalMensajeUsuario").modal("show");
                $("#mensajeUsuario").text("Mensaje");
                $(".mensajesUsuarios").text("Éste usuario se elimino correctamente");
                 $("#exampleModalEliminar").modal("hide");

                setTimeout(
                        function ()
                        {

                            $("#exampleModalMensajeUsuario").modal("hide");
                            $(location).attr("href","../Vista/usuarios.jsp");
//                           actualizandoDatosAjax();
                        }, 2000);
            } else if (r == 2) {
                $("#exampleModal").modal("hide");
                $("#exampleModalMensajeUsuario").modal("show");
                $("#mensajeUsuario").text("Mensaje");
                $(".mensajesUsuarios").text("El usuario no se elimino");
                setTimeout(
                        function ()
                        {
                            $("#exampleModalMensajeUsuario").modal("hide");
                            $("#exampleModal").modal("hide");

                        }, 2000);

            }
            setTimeout(
                    function ()
                    {
                        $(".loader").fadeOut("slow");
                    }, 2000);




        },
        error: function (jqXHR, status, error) {
            console.log(status);
        }, complete: function (jqXHR, status) {
            console.log(status);
        }, timeoute: 4000

    });
    return false;
}

function editarUsuario(url, data) {
    $.ajax({
        url: url,
        type: "post",
        data:data,
        success: function (respuesta) {
            console.log(respuesta);
            if(respuesta==1){
                  $("#exampleModalEditar").modal("hide");
                $("#exampleModalMensajeUsuario").modal("show");
                $("#mensajeUsuario").text("Mensaje");
                $(".mensajesUsuarios").text("No deje campos vacios");
                setTimeout(
                        function ()
                        {
                            $("#exampleModalMensajeUsuario").modal("hide");
                            $("#exampleModal").modal("show");
                            

                        }, 2000);
            }else if(respuesta==3){
                
                 $("#exampleModalEditar").modal("hide");
                $("#exampleModalMensajeUsuario").modal("show");
                $("#mensajeUsuario").text("Mensaje");
                $(".mensajesUsuarios").text("Las contraseñas no coinciden");
                setTimeout(
                        function ()
                        {
                            $("#exampleModalMensajeUsuario").modal("hide");
                            $("#exampleModal").modal("show");
                            

                        }, 2000);
                
            }else if(respuesta==4){
                $("#exampleModal").modal("hide");
                $("#exampleModalMensajeUsuario").modal("show");
                $("#mensajeUsuario").text("Mensaje");
                $(".mensajesUsuarios").text("Éste usuario ya existe");
                setTimeout(
                        function ()
                        {
                            $("#exampleModalMensajeUsuario").modal("hide");
                            $("#exampleModal").modal("show");

                        }, 2000);
            }else if(respuesta==5){
                     
                $("#exampleModalEditar").modal("hide");
                $("#exampleModalMensajeUsuario").modal("show");
                $("#mensajeUsuario").text("Mensaje");
                $(".mensajesUsuarios").text("Éste usuario se Actualizo correctamente");
            
                
                setTimeout(
                        function ()
                        {
                           
                            $("#exampleModalMensajeUsuario").modal("hide");
//                           actualizandoDatosAjax();
                        }, 5000);
                
            }else if(respuesta==6){
                
                $("#exampleModal").modal("hide");
                $("#exampleModalMensajeUsuario").modal("show");
                $("#mensajeUsuario").text("Mensaje");
                $(".mensajesUsuarios").text("El usuario no se Agregó");
                setTimeout(
                        function ()
                        {
                            $("#exampleModalMensajeUsuario").modal("hide");
                            $("#exampleModal").modal("hide");

                        }, 2000);
                        
            }
            setTimeout(
                    function ()
                    {
                        $(".loader").fadeOut("slow");
                    }, 2000);
  


        },
        error: function (jqXHR, status, error) {
            console.log(status);
        }, complete: function (jqXHR, status) {
            console.log(status);
        }, timeoute: 4000

    });
    return false;
}

function actualizandoDatosAjax() {
    $.ajax({
        url: "../cargandoUsuarios",
        type: "post",
         success: function (llenarDatosUsuarios) {
            console.log(llenarDatosUsuarios);
            $(".tableUsuario").html(llenarDatosUsuarios);
            
        },
        error: function (jqXHR, status, error) {
            console.log(status);
        }, complete: function (jqXHR, status) {
            console.log(status);
        }, timeoute: 4000

    });
    return false;
    }




function valNum(num) {
    $(num).bind('keypress', function (e) {
        var value = $(num).val();
        var characterCode = (e.which) ? e.which : e.keyCode;

        if (characterCode == 46 && value.indexOf('.') != -1)
            return false;
        if (characterCode != 46 && characterCode > 31 && (characterCode < 48 || characterCode > 57))
            return false;
        return true;
    });
}
function soloLetras(letra) {
    $(letra).keypress(function (key) {

        if ((key.charCode < 97 || key.charCode > 122)//letras mayusculas
                && (key.charCode < 65 || key.charCode > 90) //letras minusculas
                && (key.charCode != 45) //retroceso
                && (key.charCode != 241) //ñ
                && (key.charCode != 209) //Ñ
                && (key.charCode != 32) //espacio
                && (key.charCode != 225) //á
                && (key.charCode != 233) //é
                && (key.charCode != 237) //í
                && (key.charCode != 243) //ó
                && (key.charCode != 250) //ú
                && (key.charCode != 193) //Á
                && (key.charCode != 201) //É
                && (key.charCode != 205) //Í
                && (key.charCode != 211) //Ó
                && (key.charCode != 218) //Ú

                )
            return false;
    });

}


