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


        <div class="jumbotron"><h2 class="h2 text-center text-uppercase text-info">${bienvenido}</h2></div>
        <div class="container">
            <div class="col-xs-4">

                <form:form method="POST" co >
                    <label for="gestionar">Gestionar una Guardia</label>
                    <form:radiobutton id="gestionar" path="opcion" value="gestionar" cssClass="form-control" />
                </form:form>
            </div>
        </div>

    </body>
</html>
