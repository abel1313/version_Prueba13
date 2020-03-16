$(function(){
       $(".ventaProducto").click(function(){
       // alert($(this).find("td:eq(0)").text()); tomar el valor de una fila
       
      // alertify.success($(this).find("td:eq(1)").text());
  $.ajax({
      url:"../DetalleVentaDTO",
      type:"POST",
      data:{"id":$(this).val()},
      success:function(res){
          console.log(res);
          $("#detalleVentaDiv table tbody").append(res);
   /*      var re=JSON.parse(res);
                    console.log(re);
                    var contado=0;
                for (var item in re) {
                    contado=contado+(re[item].cantidad_Producto*re[item].subTotal_Venta);
       $("#detalleVentaDiv table tbody").append(
                      "<tr class='table-active'><td>"+re[item].nombre_Empleado+"</td>"+
                        "<td>"+re[item].nombre_Sucursal+"</td>"+
                        "<td>"+re[item].fecha_Venta+"</td>"+
                        "<td>"+re[item].hora_Venta+"</td>"+
                        "<td>"+re[item].nombre_Producto+"</td>"+
                        "<td>"+re[item].cantidad_Producto+"</td>"+
                        "<td>"+re[item].subTotal_Venta+"</td>"+
                        "<td>"+re[item].calve_Producto+"</td>"+
                      
                        "</tr>"
                        );                
          
          }
          
          alert(contado);
         console.log(" hola "+contado); */
          
      },
      error:function(xhr,status){
          
      }
      
      
  });            
      
      
      
   });
   
   $("#masome").click(function(){
       
       alert("diste");
       
   });
   
    $(".editaProductoc").click(function(){
        alert($(this).val());
        
    });
   
  $("#tablaPro").DataTable({
      responsive:true
  });
    
    $(".ventaProducto").click(function(){
alertify.success('Ok');
var ids=$(this).val();


        
        /*
        $.ajax({
            url:"../DetalleVentaDTO",
            type:"POST",
            data:{"id":ids},
            success:function(rep){
                    console.log(rep);
                    
                    var re=JSON.parse(rep);
                    console.log(re);
                for (var item in re) {
       $("#detalleVentaDiv table tbody").append(
                      "<tr><td>"+re[item].nombre_Empleado+"</td>"+
                        "<td>"+re[item].nombre_Sucursal+"</td>"+
                        "<td>"+re[item].fecha_Venta+"</td>"+
                        "<td>"+re[item].hora_Venta+"</td>"+
                        "<td>"+re[item].nombre_Producto+"</td>"+
                        "<td>"+re[item].cantidad_Producto+"</td>"+
                        "<td>"+re[item].subTotal_Venta+"</td>"+
                        "<td>"+re[item].calve_Producto+"</td>"+
                      
                        "</tr>"
                        );                
                }
                
            
                 
            },
            error:function(xhr,status){
                console.log(status);
            }
            
            
        }); 
        return false;
           */ 
        
        
    });
    
    
    
   
    
   
});

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

/*
$("#tablaPro").DataTable({
       "ajax":{
       "url":"../cargarProductoProveedorDTO",
        "type":"POST",
       "dataSrc":""
        },
        "columns":[
            {data : "clave_Producto"},
            {data : "nombre_Producto"},
            {data : "precio_Producto"},
            {data : "existencias_Producto"},
            
            {data : "fecha_Cadocidad"},
            {data : "nombre_Proveedor"},      
            {defaultContent:'<button class="btn btn-danger editaProductoc" value="nombre_Proveedor" id="dos"><span class="fi-circle-check"></span></Button>'}
        
        ]
        
        
       
   });

*/