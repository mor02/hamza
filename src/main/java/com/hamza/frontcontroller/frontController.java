/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hamza.frontcontroller;

import com.hamza.controllers.Accueil;
import com.hamza.controllers.Icommand;
import com.hamza.controllers.Creation;
import com.hamza.controllers.ListeAdherents;
import com.hamza.controllers.Modification;
import com.hamza.controllers.Suppression;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

/**
 *
 * @author Hamza
 */
@WebServlet(name = "frontController", urlPatterns = {"/frontController"})
public class frontController extends HttpServlet {
    
    private Map commands = new HashMap();
    String urlPage ="";
    Logger logger = Logger.getLogger(Modification.class);

    @Override
    public void init(){
        commands.put(null, new Accueil());
        commands.put("ajouter", new Creation());
        commands.put("modifier", new Modification());
        commands.put("supprimer", new Suppression());
        commands.put("lister", new ListeAdherents());
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        logger.debug("fdfs");
        response.setContentType("text/html;charset=UTF-8");
      // Récupération du paramètre se trouvant dans l'url
      String selection = request.getParameter("selection");
     
      
      try
      {
          // Récupération de l'instance du contrôleur en question
          Icommand objController = (Icommand) commands.get(selection);
          
          //Appel de la méthode execute sur notre objet contrôleur
          urlPage = objController.execute(request, response);
          
      }
      // En cas d'erreur renvoi de la page d'erreur 
      catch(Exception e){
          request.setAttribute("message", "Site inaccessible");
          urlPage ="erreur.jsp";
        }
      finally {
          request.getRequestDispatcher(urlPage).forward(request,response);
      }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("doget");
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
