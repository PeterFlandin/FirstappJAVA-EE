/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.directmedia.onlinestore.backoffice.controller;

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

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "AddWorkServlet", urlPatterns = {"/add-work"})
public class AddWorkServlet extends HttpServlet {

    @Override
    @SuppressWarnings("empty-statement")
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        boolean sucess = true;

        Work nouvelleOeuvre = new Work(request.getParameter("title"));
        nouvelleOeuvre.setGenre(request.getParameter("genre"));
        nouvelleOeuvre.setSummary(request.getParameter("summary"));
        nouvelleOeuvre.setMainArtist(new Artist(request.getParameter("artist")));
        try {
            nouvelleOeuvre.setRelease(Integer.parseInt(request.getParameter("release")));

        } catch (NumberFormatException nfe) {
            sucess = false;
        }

        for (Work work : Catalogue.listOfWorks) {
            if (work.getTitle().equals(nouvelleOeuvre.getTitle()) && work.getGenre().equals(nouvelleOeuvre.getGenre()) && work.getSummary().equals(nouvelleOeuvre.getSummary())) {
                sucess = false;
            }
        }

        RequestDispatcher dispatchSucess = null;

        if (sucess) {
            Catalogue.listOfWorks.add(nouvelleOeuvre);
            dispatchSucess = request.getRequestDispatcher("/work-add-success");
            request.setAttribute("identifiantOeuvre", nouvelleOeuvre.getId());
        } else {
            dispatchSucess = request.getRequestDispatcher("/work-add-failure");
        }
        dispatchSucess.forward(request, response);
    }

}
