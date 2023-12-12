<%-- 
    Document   : index
    Created on : 6 dic. 2023, 00:40:06
    Author     : Harol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="view/header.jsp"%>
        <title>Inicio de Sesión</title>
    </head>
    <body>
        <div class="container my-5">
            <div class="row justify-content-center">
                <div class="col-md-6 shadow p-3 mb-5 bg-body rounded-3">
                    <h1 class="text-center my-4">FastLibrary</h1>
                    <div class="text-center">
                        <img src="${pageContext.request.contextPath}/resource/favicon.png" class="rounded w-50 h-50" alt="FastLibrary">
                    </div>
                    <h2 class="text-center my-4">Inicio de Sesión</h2>
                    <form action="usuario" method="post">
                        <div class="form-group px-4 py-2">
                            <input class="d-none" id="rule" name="rule" class="form-control" value="iniciar">
                            <strong><label class="form-label">Correo Electronico</label></strong>
                            <input type="email" class="form-control" id="usuario_email" name="usuario_email" required>
                        </div>
                        <div class="form-group px-4 py-2">
                            <strong><label class="form-label">Contraseña</label></strong>
                            <input type="password" class="form-control" id="usuario_password" name="usuario_password" required>
                        </div>
                        <h6 class="text-danger">${message}</h6>
                        <div class="text-center my-4">
                            <button type="submit" class="my-2 btn btn-success rounded-3">Iniciar Sesión</button>
                        </div>              
                    </form>
                    <h6 class="my-2 px-4">¿Olvido su Contraseña?</h6>
                    <h6 class="my-2 px-4">¿No tiene cuenta?<a class="mx-2" href="register.jsp">Crear una</a></h6>
                </div>
            </div>
        </div>
<%@ include file="view/footer.jsp"%>