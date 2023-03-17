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
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author Administrateur
 */
@WebServlet(name = "AuthenticationServlet", urlPatterns = {"/login"})
public class AuthenticationServlet extends HttpServlet {

   

   
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String identifiant = request.getParameter("identifiant");
        String password = request.getParameter("password");
        
        
        PrintWriter out = response.getWriter();
        
             out.print("<HTML> <Body> ");

                     if(identifiant.equals("michel") && password.equals("123456")){
                                 HttpSession session = request.getSession();
                                 session.setAttribute("identifiant", identifiant);
                         
                         out.print("<p>Vous etes connecté</p>");
                                          out.print("<a href=\"home.jsp\">Retourner à la page d'acceuil</a>");

                     } else {
                   out.print("<p>Vous etes pas connecté</p>");
                       out.print(" <a href=\"login.html\">Nouvel essai</a><BR/>");
                                          out.print("<a href=\"home.jsp\">Retourner à la page d'acceuil</a>");

                     }
             
        out.print(" </Body></HTML>");
        
        
        
        
        
    }

  
}
