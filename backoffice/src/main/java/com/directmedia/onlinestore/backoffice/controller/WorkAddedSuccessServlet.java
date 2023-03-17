/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.directmedia.onlinestore.backoffice.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author Administrateur
 */
@WebServlet(name = "WorkAddedSuccessServlet", urlPatterns = {"/work-add-success"})
public class WorkAddedSuccessServlet extends HttpServlet {

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            PrintWriter out = response.getWriter();
                response.setContentType("text/html");

        out.print("<HTML> <Body> ");
        out.print("<p> l'oeuvre a bien été ajouté est voici son identifiant "+request.getAttribute("identifiantOeuvre")+" </p>");
        out.print("<a href=\"home.jsp\">Retourner à la page d'acceuil</a>");
        out.print(" </Body></HTML>");
        
        
        
    }

  
}
