<%-- 
    Document   : cambiar
    Created on : 12 dic. 2023, 00:57:15
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
<%@ include file="../view/header.jsp"%>
        <title>Cambiar a Premium</title>
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
                            <a class="nav-link border-bottom text-dark" href="cambiar.jsp">Cambiar a Premium</a>
                            <a class="nav-link border-bottom text-dark" href="#">Configuración</a>
                            <a class="nav-link border-bottom text-dark" href="../index.jsp">Cerrar Sesión</a>
                        </div>
                    </div>
                </div>
            </nav>
            <section class="m-3">
                <h1 class="text-center">FastLibrary</h1>
                <h5>Cambio de Plan</h5>
                <hr>
                <form action="">
                    
                </form>
            </section>
        </div>
<%@ include file="../view/footer.jsp"%>
