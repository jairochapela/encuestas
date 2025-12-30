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

    <img src="<s:url value='/images/thankyou.png'/>" alt="Gracias">
    <h1>Gracias por completar la encuesta de satisfacción</h1>

    <a href="<s:url action='index' namespace='/' />">Volver al inicio</a>
</body>
</html>