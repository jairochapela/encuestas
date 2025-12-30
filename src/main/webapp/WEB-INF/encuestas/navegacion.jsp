    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    <nav>
        <a href="<s:url action='index' namespace='/' />">Inicio</a>
        <a href="<s:url action='EncuestaSatisfaccion' namespace='/encuestas' />">Encuestas</a>
        <a href="<s:url action='Resultados' namespace='/encuestas' />">Resultados</a>

        <a href="<s:url action='Login' namespace='/example' />">Iniciar sesión</a>
    </nav>