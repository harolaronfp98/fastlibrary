<%-- 
    Document   : agergar.jsp
    Created on : 6 dic. 2023, 06:06:42
    Author     : Harol
--%>

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
        <title>Agregar Libro</title>
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
                            <a class="nav-link border-bottom text-dark" href="../index.jsp">Cerrar Sesión</a>
                        </div>
                    </div>
                </div>
            </nav>
            <div class="my-5">
                <div class="row justify-content-center">
                    <div class="col-md-6 shadow p-3 mb-5 bg-body rounded-3">
                        <h1 class="text-center my-4">FastLibrary</h1>
                        <h2 class="text-center my-4">Registro de Libro</h2>
                        <form action="../libro" method="post" enctype="multipart/form-data">
                            <div class="form-group px-4 py-2">
                                <strong><label class="form-label">Imagen de Libro</label></strong>
                                <input id="editorial_libro" name="editorial_libro" class="form-control form-control-sm" type="file" accept=".jpg .jpeg .png" required>
                            </div>
                            <div class="form-group px-4 py-2">
                                <strong><label class="form-label">Titulo</label></strong>
                                <input id="autornombre_libro" name="autornombre_libro" class="form-control" type="text" required>
                            </div>
                            <div class="form-group px-4 py-2">
                                <strong><label class="form-label">Nombres del autor</label></strong>
                                <input id="autorapepater_libro" name="autorapepater_libro" class="form-control" type="text" required>
                            </div>
                            <div class="form-group px-4 py-2">
                                <strong><label class="form-label">Apellidos del autor</label></strong>
                                <input id="autorapemater_libro" name="autorapemater_libro" class="form-control" type="text" required>
                            </div>
                            <div class="form-group px-4 py-2">
                                <strong><label class="form-label">Año</label></strong>
                                <input id="aniopubl_libro" name="aniopubl_libro" class="form-control" type="date" required>
                            </div>
                            <div class="form-group px-4 py-2">
                                <strong><label class="form-label">Editorial</label></strong>
                                <input id="editorial_libro" name="editorial_libro" class="form-control" type="text" required>
                            </div>
                            <div class="form-group px-4 py-2">
                                <strong><label class="form-label">Subir Libro</label></strong>
                                <input class="form-control form-control-sm" id="file" name="file" type="file" accept=".pdf" required>
                            </div>
                            <h6 class="text-success">${message}</h6>
                            <div class="text-center my-4">
                                <button type="submit" class="my-2 btn btn-success rounded-3">Añadir</button>
                            </div>              
                        </form>
                    </div>
                </div>
            </div>              
        </div>
    </body>
</html>
