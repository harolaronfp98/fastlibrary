<%-- 
    Document   : home
    Created on : 6 dic. 2023, 00:40:30
    Author     : Harol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Libros</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <div class="container-fluid">
                    <div class="d-flex">
                        <a href="home.xhtml"><img src="${pageContext.request.contextPath}/resource/favicon.png" class="rounded" width="80px" height="80px" alt="..."></img></a>
                        <div class="m-2">
                            <h6 style="font-size: 12px">Usuario: hfigueroa</h6>
                            <h6 style="font-size: 12px">Código: h1548e</h6>
                            <h6 style="font-size: 12px">Estado: Activo</h6>
                        </div>
                    </div>
                    
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                        <div class="navbar-nav">
                            <a class="nav-link border-bottom text-dark" href="#">Configuración</a>
                            <a class="nav-link border-bottom text-dark" href="index.jsp">Cerrar Sesión</a>
                        </div>
                    </div>
                </div>
            </nav>
            <section class="m-3">
                <div class="d-flex justify-content-between">
                    <h6 class="my-2" style="font-size: 14px">Libros: </h6>
                    <form class="d-flex">
                        <div class="input-group mx-2">
                            <span class="input-group-text" id="basic-addon1">@</span>
                            <input type="text" class="form-control" placeholder="Titulo" aria-label="titulo" aria-describedby="basic-addon1">
                        </div>
                        <div class="input-group">
                            <span class="input-group-text" id="basic-addon1">@</span>
                            <input type="text" class="form-control" placeholder="Autor" aria-label="autor" aria-describedby="basic-addon1">
                        </div>
                    </form>
                </div>
                <div class="my-2">
                    <div class="d-flex justify-content-between border p-1">
                        <div class="d-flex">
                            <img src="${pageContext.request.contextPath}/resource/favicon.png" class="rounded" width="80px" height="80px" alt="..."></img>
                            <div class="m-2">
                                <h6 style="font-size: 12px">${username}</h6>
                                <h6 style="font-size: 12px">${password}</h6>
                                <h6 style="font-size: 12px">${email}</h6>
                                <h6 style="font-size: 12px">${celular}</h6>
                                <h6 style="font-size: 12px">Destino: Av.Universitaria 1536</h6>
                            </div>
                        </div>
                        <div class="m-2">
                            <h6 style="font-size: 12px">Estado: Preparación</h6>
                            <h6 style="font-size: 12px">Tiempo: 48min</h6>
                        </div>
                        <div class="my-4">
                            <a href=""><img src="${pageContext.request.contextPath}/resource/ojo.png" class="rounded mx-2" width="30px" height="30px" alt="vista"></img></a>
                        </div>
                    </div>
                </div>     
            </section>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    </body>
</html>
