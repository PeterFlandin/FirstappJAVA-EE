<%-- 
    Document   : catalogue
    Created on : 17 mars 2023, 19:13:32
    Author     : Administrateur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>; 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body>
        <h1>Oeuvres du catalogue</h1> <BR/> <BR/>
        
        <c:forEach items="${listDesOeuvre}" var="work">
                    ${work.title} (${work.release}) <BR/> <BR/>
            </c:forEach>
        
        
    </body>
</html>
