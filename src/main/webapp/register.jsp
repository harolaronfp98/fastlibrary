<%-- 
    Document   : register
    Created on : 6 dic. 2023, 00:40:19
    Author     : Harol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Usuario</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    </head>
    <body>
        <div class="container my-5">
            <div class="row justify-content-center">
                <div class="col-md-6 shadow p-3 mb-5 bg-body rounded-3">
                    <h1 class="text-center my-4">FastLibrary</h1>
                    <div class="text-center">
                        <img src="${pageContext.request.contextPath}/resource/favicon.png" class="rounded w-50 h-50" alt="FastLibrary">
                    </div>
                    <h2 class="text-center my-4">Registro de Usuario</h2>
                    <form action="usuario" method="post">
                        <div class="form-group px-4 py-2">
                            <input class="d-none" id="rule" name="rule" class="form-control" value="registrar">
                            <strong><label class="form-label">Usuario</label></strong>
                            <input id="usuario_codigo" name="usuario_codigo" class="form-control" type="text" required>
                        </div>
                        <div class="form-group px-4 py-2">
                            <strong><label class="form-label">Correo Electronico</label></strong>
                            <input id="usuario_email" name="usuario_email" class="form-control" type="email" required>
                        </div>
                        <div class="form-group px-4 py-2">
                            <strong><label class="form-label">Celular</label></strong>
                            <input id="usuario_celular" name="usuario_celular" class="form-control" type="text" required>
                        </div>
                        <div class="form-group px-4 py-2">
                            <strong><label class="form-label">Telefono fijo</label></strong>
                            <input id="usuario_fijo" name="usuario_fijo" class="form-control" type="text" required>
                        </div>
                        <div class="form-group px-4 py-2">
                            <strong><label class="form-label">DNI</label></strong>
                            <input id="usuario_numdoc" name="usuario_numdoc" class="form-control" type="text" required>
                        </div>
                        <div class="form-group px-4 py-2">
                            <strong><label class="form-label">Contraseña</label></strong>
                            <input id="usuario_password" name="usuario_password" class="form-control" type="password" required>
                        </div>
                        <div class="text-center my-4">
                            <button type="submit" class="my-2 btn btn-success rounded-3">Registrarme</button>
                        </div>              
                    </form>
                    <h6 class="my-2 px-4">¿Ya tiene cuenta?<a class="mx-2" href="index.jsp">Iniciar Sesión</a></h6>
                </div>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    </body>
</html>
