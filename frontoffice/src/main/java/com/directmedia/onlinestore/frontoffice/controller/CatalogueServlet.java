/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.directmedia.onlinestore.frontoffice.controller;

import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CatalogueServlet", urlPatterns = {"/catalogue"})
public class CatalogueServlet extends HttpServlet {
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
       if(Catalogue.listOfWorks.isEmpty()){
         
         Work JhonWick = new Work("Jhon Wick");       
       Work Superman = new Work("Superman");
       Work AngryBirds = new Work("Angry Birds");
       
       
       Artist KeanuReevs = new Artist("Keanu Reevs");
       Artist HenryCalvin = new Artist("Henry Calvin");
       Artist oiseau = new Artist("oiseau");

       
       Superman.setMainArtist(HenryCalvin);
       JhonWick.setMainArtist(KeanuReevs);
       AngryBirds.setMainArtist(oiseau);
       
       
       Superman.setRelease(2013);
       JhonWick.setRelease(2023);
       AngryBirds.setRelease(2016);
   
       Catalogue.listOfWorks.add(Superman);
       Catalogue.listOfWorks.add(JhonWick);
       Catalogue.listOfWorks.add(AngryBirds);
       }
        
       request.setAttribute("listDesOeuvre", Catalogue.listOfWorks);
       RequestDispatcher disp = request.getRequestDispatcher("/catalogue.jsp"); 
       disp.forward(request, response);
    }
}
