<%-- 
    Document   : VerDatos
    Created on : 11/06/2021, 08:32:26 AM
    Author     : RICARDO
--%>

<%@page import="java.sql.Date"%>
<%@page import="java.util.List"%>
<%@page import="com.adsi.app.modelo.Producto"%>
<%@page import="com.adsi.app.controlador.Controlador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
        
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado de Productos</h1>
        
        
        
        <% 
               String nombre;
               String cantidad ;
               String valor ;
               Integer fk_proveedor ;
               String descripcion;
              
               
                nombre = request.getParameter("nombre");
                cantidad = request.getParameter("cantidad") ;
                valor = request.getParameter("valor") ;
                fk_proveedor  =  Integer.parseInt(request.getParameter("fk_proveedor")); 
                descripcion = request.getParameter("descripcion");
               
                
               
            
            
           Controlador controlador = new Controlador();
           
           controlador.conectar();
           
           if (controlador.hayConexion()) {
               
               //Agregar un producto de pruebas
               Producto producto = new Producto();
               
               
               
               producto.setNombre(nombre);
               producto.setCantidad(cantidad);
               producto.setValor(valor);
               producto.setFk_proveedor(fk_proveedor);
               producto.setDescripcion(descripcion);
               
               controlador.addProductos(producto);
               
               
               
               List<Producto> lista = controlador.findAllProductos();
               
               Long totalProductos = controlador.totalProductos();
               

               

   
                  
        %>
        
        
        <div class="azul" >Total Productos Método : <%=totalProductos %></div>

        <div>
                <span class="position-absolute top-0 start-100 translate-middle badge rounded-pill bg-danger">
                99+
                <span class="visually-hidden">unread messages</span>
                 </span>        
        </div>
        
        <div>
        <select  class="rojo" name="productos" id="productos">
            
            <%
              for (Producto item:lista)
              {
            %>
            <option value="<%=item.getId() %>"><%=item.getNombre() + " -  "+ item.getFk_proveedor() %></option>
            <% }%>
       </select>
       </div> 
       
       
       
                
        
        <%
          List<Producto> listaEscasos = controlador.listarProductosEscasos(5);
        %>
        <div class="azul" >Total Productos Escasos : <%=listaEscasos.stream().count() %></div>
        
        <div>
        <select  class="rojo" name="productos" id="productos">
            
            <%
              for (Producto item:listaEscasos)
              {
            %>
            <option value="<%=item.getId() %>"><%=item.getNombre() + " -  "+ item.getFk_proveedor() %></option>
            <% }%>
       </select>
       </div> 
       
       
       
       
        <%}else { %>
        
           <h1> NO ME PUDE CONECTAR</h1>
        
        
        <%}%>
        
        
        <div id="resumen" class="rojo">  Resumen  Productos </div
        
        
        
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" integrity="sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT" crossorigin="anonymous"></script>

        
    </body>
</html>
