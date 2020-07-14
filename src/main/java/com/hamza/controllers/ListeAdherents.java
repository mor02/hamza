/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hamza.controllers;

import com.hamza.services.PersonneServiceImpl;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hamza
 */
public class ListeAdherents implements Icommand{
    
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
    throws Exception{
        PersonneServiceImpl service = new PersonneServiceImpl();
        request.setAttribute("adherents",service.lister());
        return "/liste.jsp";
    }
    
}
