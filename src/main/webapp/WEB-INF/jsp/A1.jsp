<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestionar una guardia</title>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css" >
    </head>
    <body>
        <div class="jumbotron"><h2 class="h2 text-center text-uppercase">Gestionar una Guardia</h2></div>

        <div class="container">
            <div class="col-xs-3">
                
                <form:form method="POST" commandName="elegirHora">
                    <form:select path="hora">
                        <form:option value="primera" >Primera</form:option>
                        <form:option value="segunda" >Segunda</form:option>
                        <form:option value="tercera" >Tercera</form:option>
                        <form:option value="cuarta" >Cuarta</form:option>
                        <form:option value="quinta" >Quinta</form:option>
                        <form:option value="sexta" >Sexta</form:option>
                    </form:select>
                </form:form>
                
                <form action="A2.php" method="POST">
                    <div class="form-group has-success">
                        <label for="hora">Hora</label>
                        <select id="hora" name="hora" class="form-control">
                            <option value="primera">Primera</option>
                            <option value="segunda">Segunda</option>
                            <option value="tercera">Tercera</option>
                            <option value="cuarta">Cuarta</option>
                            <option value="quinta">Quinta</option>
                            <option value="sexta">Sexta</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <input type="submit" id="submit" value="Enviar" class="btn btn-success">
                    </div>
                </form>
                <div class="form-group">
                    <a href="index.php"><button type="submit" id="submit" class="btn btn-danger" >Atrás</button></a>
                </div>
            </div>
            <div class="divider"></div>
        </div>
    </body>
</html>
