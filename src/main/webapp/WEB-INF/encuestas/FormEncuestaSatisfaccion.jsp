<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Encuesta de Satisfacción</title>
    <link rel="stylesheet" href="<s:url value='/css/estilos.css'/>">
</head>
<body>
    <s:include value="/WEB-INF/encuestas/navegacion.jsp" />

    <h1>Encuesta de Satisfacción</h1>

    <s:form action="ProcesarEncuestaSatisfaccion">
        <s:textfield name="datos.nombre" label="Nombre" required="true" />
        <s:textfield name="datos.email" label="Correo Electrónico" type="email" required="true" />
        <s:textfield name="datos.edad" label="Edad" type="number" required="true" />
        <s:select name="datos.sexo" label="Sexo" list="#{'M':'Masculino', 'F':'Femenino', 'O':'Otro'}" required="true" />
        <s:radio name="datos.gradoSatisfaccion" label="Nivel de Satisfacción" list="#{'1':'Muy Insatisfecho', '2':'Insatisfecho', '3':'Neutral', '4':'Satisfecho', '5':'Muy Satisfecho'}" required="true" />
        <s:textfield name="datos.puntuacion" label="Puntuación (1-10)" type="number" required="true" />
        <s:radio name="datos.recomendarAmigos" label="¿Recomendarías nuestro servicio a amigos?" list="#{'S':'Sí', 'N':'No'}" required="true" />
        <s:textarea name="datos.comentarios" label="Comentarios Adicionales" rows="5" cols="30" />
        <s:submit value="Enviar Encuesta" />
    </s:form>
</body>
</html>