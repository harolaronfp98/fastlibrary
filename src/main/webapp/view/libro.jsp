<%-- 
    Document   : libro
    Created on : 11 dic. 2023, 23:44:50
    Author     : Harol
--%>

<%@page import="java.util.List"%>
<%@page import="model.Libro"%>
<%@page import="controlador.LibroControlador"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
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
<%@ include file="header.jsp"%>
        <title>JSP Page</title>
    </head>
    <body>
        <%
            UsuarioControlador usuarioControlador = new UsuarioControlador();
            Usuario usuario = new Usuario();
            usuario = usuarioControlador.verificarUno(userId);
            String ruta = "../library/home.jsp";
            if(usuario.getIdNivel() == 3){
                ruta = "../admin/home.jsp";
            }
        %>
        <div class="container">
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <div class="container-fluid">
                    <div class="d-flex">
                        <a href="<%= ruta %>"><img src="${pageContext.request.contextPath}/resource/favicon.png" class="rounded" width="80px" height="80px" alt="..."></img></a>
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
                            <a class="nav-link border-bottom text-dark" href="#">Configuración</a>
                            <a class="nav-link border-bottom text-dark" href="../index.jsp">Cerrar Sesión</a>
                        </div>
                    </div>
                </div>
            </nav>
            <%
                String idStr = request.getParameter("id");
                System.out.println("dato obtenido: "+idStr);
                Integer id = Integer.parseInt(idStr);
                LibroControlador libroControlador = new LibroControlador();
                Libro libro = new Libro();
                libro = libroControlador.listarUno(id);
            %>
            <div class="m-3">
                <h1 class="text-center">FastLibrary</h1>
                <h6>Libro: <%= libro.getAutornombreLibro() %></h6>
                <h6>Autor: <%= libro.getAutorapepaterLibro()%>, <%= libro.getAutorapematerLibro()%></h6>
                <h6>Fecha: <%= libro.getAniopublLibro()%></h6>
                <embed src="${pageContext.request.contextPath}/resource/<%= libro.getCodigoLibro()%>" type="application/pdf" class="w-100" height="500px">
            </div>
        </div>
<%@ include file="footer.jsp"%>
