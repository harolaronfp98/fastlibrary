<%-- 
    Document   : home
    Created on : 6 dic. 2023, 04:35:50
    Author     : Harol
--%>

<%@page import="java.util.List"%>
<%@page import="model.Libro"%>
<%@page import="controlador.LibroControlador"%>
<%@page import="model.Usuario"%>
<%@page import="controlador.UsuarioControlador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Cookie[] cookies = request.getCookies();

   String userId = "";
   if (cookies != null) {
       for (Cookie cookie : cookies) {
           if (cookie.getName().equals("userEmail")) {
               userId = cookie.getValue();
               break;
           }
       }
   }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrador</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    </head>
    <body>
        <%
            UsuarioControlador usuarioControlador = new UsuarioControlador();
            Usuario usuario = new Usuario();
            usuario = usuarioControlador.verificarUno(userId);
        %>
        <div class="container">
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <div class="container-fluid">
                    <div class="d-flex">
                        <a href="home.jsp"><img src="${pageContext.request.contextPath}/resource/favicon.png" class="rounded" width="80px" height="80px" alt="..."></img></a>
                        <div class="m-2">

                            <h6 style="font-size: 12px">Correo: <%= userId %></h6>
                            <h6 style="font-size: 12px">Código: <%= usuario.getUsuarioCodigo() %></h6>
                            <h6 style="font-size: 12px">Estado: Activo</h6>
                        </div>
                    </div>
                    
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                        <div class="navbar-nav">
                            <a class="nav-link border-bottom text-dark" href="agregar.jsp">Nuevo Libro</a>
                            <a class="nav-link border-bottom text-dark" href="../index.jsp">Cerrar Sesión</a>
                        </div>
                    </div>
                </div>
            </nav>
            <section class="m-3">
                <div class="d-flex justify-content-between">
                    <h6 class="my-2" style="font-size: 14px">Libros: </h6>
                    <form action="home.jsp" method="get" class="d-flex">
                        <div class="input-group mx-2">
                            <span class="input-group-text" id="basic-addon1">@</span>
                            <input type="text" class="form-control" placeholder="Titulo" aria-label="titulo" aria-describedby="basic-addon1" name="titulo">
                        </div>
                        <div class="input-group">
                            <span class="input-group-text" id="basic-addon1">@</span>
                            <input type="text" class="form-control" placeholder="Autor" aria-label="autor" aria-describedby="basic-addon1" name="autor">
                        </div>
                    </form>
                </div>
                <%
                    LibroControlador libroControlador = new LibroControlador();
                    
                    List<Libro> lista = libroControlador.listarTodos();
                %>
                <div class="my-2">
                    <%for(int i=0; i<lista.size(); i++){%>
                    <div class="d-flex justify-content-between border p-1 mt-2">
                        <div class="d-flex">
                            <img src="${pageContext.request.contextPath}/resource/<%=lista.get(i).getDistritopublLibro()%>" class="rounded" width="80px" height="80px" alt="..."></img>
                            <div class="m-2">
                                <h6 style="font-size: 12px">Nombre: <%=lista.get(i).getAutornombreLibro()%></h6>
                                <h6 style="font-size: 12px">Autor: <%=lista.get(i).getAutorapepaterLibro()+" "+lista.get(i).getAutorapematerLibro()%></h6>
                                <h6 style="font-size: 12px">Año: <%=lista.get(i).getAniopublLibro()%></h6>
                            </div>
                        </div>
                        <div class="my-4">
                            <form action="../view/libro.jsp" method="get">
                                <input type="hidden" name="id" value="<%=lista.get(i).getIdLibro()%>">
                                <button class="bg-transparent border-0" type="submit"><img src="${pageContext.request.contextPath}/resource/ojo.png" class="rounded mx-2" width="30px" height="30px" alt="vista"></button>
                            </form>
                            <!--<a href="${pageContext.request.contextPath}/view/libro.jsp?id=<%=lista.get(i).getIdLibro()%>" target="_blank"><img src="${pageContext.request.contextPath}/resource/ojo.png" class="rounded mx-2" width="30px" height="30px" alt="vista"></img></a>-->
                        </div>
                    </div>
                    <%}%>
                </div>     
            </section>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    </body>
</html>
