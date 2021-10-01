<%-- 
    Document   : index
    Created on : 28/05/2021, 09:12:09 AM
    Author     : RICARDO
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin 2 - Dashboard</title>

    <!-- Custom fonts for this template-->
    <link href="../vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="../css/sb-admin-2.min.css" rel="stylesheet">
    <body>

        <div class="container">
        
        
        <div>
            <h1>FORMULARIO PARA CAPTURAR INFORMACIÓN WEB</h1>
        </div>




        <form action="VerDatos.jsp"  method="POST">
            <div class="row mb-3">
                <div class="col-6">
                  <input name="nombre"  type="text" class="form-control" placeholder="Nombre de Producto" aria-label="Nombre de Producto">
                </div>
                   
            </div>
            
            <div class="row mb-3">
                <div class="col-2">
                  <input name="cantidad"  type="text" class="form-control" placeholder="Cantidad" aria-label="Cantidad">
                </div>
                <div class="col-2 mb-3">
                  <input name="valor"  type="text" class="form-control" placeholder="Valor" aria-label="Valor">
                </div>
                <div class="col-2 mb-3">
                    <input name="fecha"  type="date" class="form-control" placeholder="fecha" aria-label="fecha">
                </div>
                   
            </div>
            
            <div class="row mb-3">
                <div class="col-2">
                  <input name="proveedor"  type="text" class="form-control" placeholder="proveedor" aria-label="proveedor">
                </div>
                <div class="col-2 mb-3">
                  <input name="descripcion"  type="text" class="form-control" placeholder="descripcion" aria-label="descripcion">
                </div>
                
                
                
            </div>    

            

            


            
            <button type="submit" class="btn btn-primary btn-circle">Registrar</button>
        </form>

        
        </div>  
        <!-- Bootstrap core JavaScript-->
        <script src="../vendor/jquery/jquery.min.js"></script>
        <script src="../vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="../vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="../js/sb-admin-2.min.js"></script>

        <!-- Page level plugins -->
        <script src="../vendor/chart.js/Chart.min.js"></script>

        <!-- Page level custom scripts -->
        <script src="../js/demo/chart-area-demo.js"></script>
        <script src="../js/demo/chart-pie-demo.js"></script>
        </body>
</html>
