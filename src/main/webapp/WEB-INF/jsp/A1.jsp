<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestionar una guardia | Hora</title>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css" >
    </head>
    <body>
        <div class="jumbotron"><h2 class="h2 text-center text-uppercase">Gestionar una Guardia</h2></div>

        <div class="container">
            <div class="col-xs-3">
                <form:form method="POST" commandName="horaForm">
                    <form:select path="name" cssClass="form-control">
                        <form:option value="primera" >Primera</form:option>
                        <form:option value="segunda" >Segunda</form:option>
                        <form:option value="tercera" >Tercera</form:option>
                        <form:option value="cuarta" >Cuarta</form:option>
                        <form:option value="quinta" >Quinta</form:option>
                        <form:option value="sexta" >Sexta</form:option>
                    </form:select>
                    <div class="form-group">
                        <input type="submit" id="submit" value="Enviar" class="btn btn-success">
                    </div>
                </form:form>
                <div class="form-group">
                    <a href="/GuardiasSpringMVC"><button type="submit" id="submit" class="btn btn-danger" >Atrás</button></a>
                </div>
            </div>
            <div class="divider"></div>
        </div>
    </body>
</html>