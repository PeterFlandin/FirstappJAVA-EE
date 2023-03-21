<%-- 
    Document   : home
    Created on : 16 mars 2023, 20:44:34
    Author     : Administrateur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> OnlineStore : Gestion de la boutique </h1>
        <c:if test="${not empty login}">
      
        Bonjour ${sessionScope.identifiant} (<a href="logout">Deconnexion</a>) <BR/>
        </c:if>
                 <a href="add-work-form.html">Ajouter une oeuvre au catalogue</a>
                 <a href="catalogue">Catalogue des oeuvres</a>
                 <a href="login.html">Identification administrateur</a>
    </body>
</html>