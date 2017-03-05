<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <title>Gestor de Guardias</title>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css" >

    </head>
    <body>


        <div class="jumbotron"><h2 class="h2 text-center text-uppercase text-primary">${bienvenido}</h2></div>
        <div class="container">
            <div class="col-xs-4">
                <form:form method="POST" modelAttribute="opcionElegida" >
                    <div class="form-group">
                    <form:radiobutton id="gestionar" path="name" value="A1" />
                    <label for="name">Gestionar una Guardia</label>
                    </div>
                    <div class="form-group">
                    <form:radiobutton id="eliminar" path="name" value="B1" />
                    <label for="name">Eliminar registros de guardia</label>
                    </div>
                    <div class="form-group">
                    <form:radiobutton id="mostrar" path="name" value="C1" />
                    <label for="name">Mostrar cuandrante de horas (en modo pantalla)</label>
                    </div>
                    <div class="form-group">
                    <form:radiobutton id="mostrar_pdf" path="name" value="D1" />
                    <label for="name">Mostrar cuandrante de horas (en pdf)</label>
                    </div>
                    <div class="form-group">
                    <form:radiobutton id="importar" path="name" value="E1" />
                    <label for="name">Importar desde archivo</label>
                    </div>
                    <input type="submit" value="Enviar" class="btn btn-success">
                </form:form>
            </div>
        </div>

    </body>
</html>
