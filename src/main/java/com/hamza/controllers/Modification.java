/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hamza.controllers;

import com.hamza.beans.Personne;
import com.hamza.services.IPersonneService;
import com.hamza.services.PersonneServiceImpl;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

/**
 *
 * @author Hamza
 */
public class Modification implements Icommand {
    Logger logger = Logger.getLogger(Modification.class);
    
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
       logger.debug("test "+request.getParameter("nom"));
        
       if (request !=null && request.getParameter("nom")==null) {
            IPersonneService service = new PersonneServiceImpl();
            request.setAttribute("liste", service.lister());
        } 
       else {
           
       
            Personne p = new Personne();
            p.setNom(request.getParameter("nom"));
            request.setAttribute("personne", p);
//            return "/jsp2.jsp";
       }
//            
//        }
        return "/modification.jsp";
    }
}
