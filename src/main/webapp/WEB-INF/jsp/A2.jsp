<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestionar una guardia | Profesor</title>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css" >
    </head>
    <body>
        <div class="jumbotron"><h2 class="h2 text-center text-danger">Pringa profesor</h2></div>
        <div class="container">
            <div class="text-info">
                <h4 class="h4">Elige profesor para la guardia de la <span class="text-danger">${getHora}</span> hora</h4>
                <form:form method="POST" commandName="profesorForm">
                    <div class="col-xs-1 glyphicon glyphicon-user" style="padding: 10px"></div>
                    <div class="col-sm-2">
                        <form:select path="nombre" cssClass="form-control">
                            <c:forEach items="${profesores}" var="profesor">
                                <form:option value="${profesor.nombre}">${profesor.nombre}</form:option>
                            </c:forEach>
                        </form:select>
                    </div>
                </form:form>
            </div>
        </div>
    </body>
</html>
