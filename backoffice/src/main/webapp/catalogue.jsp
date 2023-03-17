<%-- 
    Document   : catalogue
    Created on : 17 mars 2023, 19:13:32
    Author     : Administrateur
--%>
<%@page  import="com.directmedia.onlinestore.core.entity.Artist"%>
<%@page  import="com.directmedia.onlinestore.core.entity.Work"%>
<%@page  import="com.directmedia.onlinestore.core.entity.Catalogue"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
if(Catalogue.listOfWorks.isEmpty()){
      
       
Artist KeanuReevs = new Artist("Keanu Reevs");
Artist HenryCalvin = new Artist("Henry Calvin");
Artist oiseau = new Artist("oiseau");

          
Work JhonWick = new Work("Jhon Wick");       
Work Superman = new Work("Superman");
Work AngryBirds = new Work("Angry Birds");
       
Superman.setMainArtist(HenryCalvin);
JhonWick.setMainArtist(KeanuReevs);
AngryBirds.setMainArtist(oiseau);
       
       
Superman.setRelease(2013);
JhonWick.setRelease(2023);
AngryBirds.setRelease(2016);
   
Catalogue.listOfWorks.add(Superman);
Catalogue.listOfWorks.add(JhonWick);
Catalogue.listOfWorks.add(AngryBirds);
} %>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body>
        <h1>Oeuvres du catalogue</h1> <BR/> <BR/>
        <% for (Work listOfWorks : Catalogue.listOfWorks ){%>
        <%=listOfWorks.getTitle()%> (<%=listOfWorks.getRelease()%>) <BR/> <BR/><%}%>
        
        
    </body>
</html>
