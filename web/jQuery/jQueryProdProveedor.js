$(function(){
 $("#tablaProductos").DataTable();   
    datosProductoProveedor();
 
 
 
  
    
});

function datosProductoProveedor() {
    $.ajax({
        url: "../cargarProductoProveedorDTO",
        type: "post",
         success: function (llenarDatosUsuarios) {
            console.log(llenarDatosUsuarios);
           var uno=JSON.parse(llenarDatosUsuarios);
             console.log(uno);
           
            for (var item in uno) {
                console.log(uno[item].clave_Producto);
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

