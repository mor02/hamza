/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hamza.controllers;

import com.hamza.beans.Personne;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hamza
 */
public class Accueil implements Icommand {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ArrayList listPersonne = new ArrayList();
        Personne personneUn = new Personne("Jean","Dujardin");
        Personne personneDeux = new Personne("Brad","Pitt");
        listPersonne.add(personneUn);
        listPersonne.add(personneDeux);
        request.setAttribute("listePersonne",listPersonne);
        
        return "/index.jsp";
    }

}
