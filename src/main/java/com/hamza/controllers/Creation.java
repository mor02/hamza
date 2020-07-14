/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hamza.controllers;

import com.hamza.beans.Personne;
import com.hamza.services.IPersonneService;
import com.hamza.services.PersonneServiceImpl;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hamza
 */
public class Creation implements Icommand{
    
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
    throws Exception{
        if(request.getParameter("nom") != null && request.getParameter("prenom") != null){
        Personne p = new Personne();
        p.setNom(request.getParameter("nom"));
        p.setPrenom(request.getParameter("prenom"));
        IPersonneService service = new PersonneServiceImpl();
        service.lister().add(p);
        }
        return "/creation.jsp";
    }
}
