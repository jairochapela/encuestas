<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="<s:url value='/css/estilos.css'/>">
</head>
<body>
    <s:include value="/WEB-INF/encuestas/navegacion.jsp" />

    <h1>Resultados de la Encuesta de Satisfacción</h1>

    <table>
        <thead>
            <tr>
                <th>Nombre</th>
                <th>Email</th>
                <th>Edad</th>
                <th>Sexo</th>
                <th>Puntuación</th>
                <th>Grado de Satisfacción</th>
                <th>Recomendar a Amigos</th>
                <th>Comentarios</th>
            </tr>
        </thead>
        <tbody>
            <s:iterator value="resultados">
                <tr>
                    <td><s:property value="nombre" /></td>
                    <td><s:property value="email" /></td>
                    <td><s:property value="edad" /></td>
                    <td><s:property value="sexo" /></td>
                    <td><s:property value="puntuacion" /></td>
                    <td><s:property value="gradoSatisfaccion" /></td>
                    <td><s:property value="recomendarAmigos" /></td>
                    <td><s:property value="comentarios" /></td>
                </tr>
            </s:iterator>
        </tbody>
    </table>
</body>
</html>