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
        <script src="js/jquery-ui.min.js"></script>
        <script src="js/jquery-3.1.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="jumbotron"><h2 class="h2 text-center text-uppercase text-primary">Bienvenido al Gestor de Guardias</h2></div>
        <div class="container">
            <div class="col-xs-4">
                <form:form method="POST" modelAttribute="elegirOpcion" >
                    <div class="form-group">
                        <form:radiobutton id="gestionar" path="opcionElegida" value="A1" />
                        <label for="opcionElegida">Gestionar una Guardia</label>
                    </div>
                    <div class="form-group">
                        <form:radiobutton id="eliminar" path="opcionElegida" value="B1" />
                        <label for="opcionElegida">Eliminar registros de guardia</label>
                    </div>
                    <div class="form-group">
                        <form:radiobutton id="mostrar" path="opcionElegida" value="C1" />
                        <label for="opcionElegida">Mostrar cuandrante de horas (en modo pantalla)</label>
                    </div>
                    <div class="form-group">
                        <form:radiobutton id="mostrar_pdf" path="opcionElegida" value="D1" />
                        <label for="opcionElegida">Mostrar cuandrante de horas (en pdf)</label>
                    </div>
                    <div class="form-group">
                        <form:radiobutton id="importar" path="opcionElegida" value="E1" />
                        <label for="opcionElegida">Importar desde archivo</label>
                    </div>
                    <div class="form-group">
                        <form:errors path="opcionElegida" id="error" cssClass="alert alert-danger" />
                    </div>
                    <br>
                    <input type="submit" value="Enviar" class="btn btn-success">
                </form:form>
            </div>
        </div>

    </body>
</html>
