<%-- 
    Document   : modification
    Created on : 3 juil. 2020, 05:25:13
    Author     : Hamza
--%>

<%@page import="com.hamza.beans.Personne"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modification</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" 
              integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    </head>
    <body>
        <c:import url="navbar.jsp"></c:import>
            <h1>Modification d'un adhérent</h1>
            
                <%
                if (request!=null
                        && request.getAttribute("personne") !=null) {
                    out.println("<form method=\"POST\" action=\"frontController?selection=modifier\">");
                    out.println("<select name=\"nom\" id=\"monSelectPersonne\">");
                    ArrayList list = (ArrayList) request.getAttribute("liste");
                    for (int i = 0; i < list.size(); i++) {
                        Personne p = (Personne) list.get(i);
                        String fullName = p.getFullName();
                        out.println("<option>" + p.getNom() + "</option>");
                    }
                    out.println("</select>");
                     out.println("<input type=\"submit\" value=\"Envoi\">");
                     out.println("</form>");
                    request.getParameter("nom");
                }
            
            else {
                    Personne p = new Personne();
                    p = (Personne) request.getAttribute("personne");
                    out.println("<h5>ok</h5>");

                    }%>

        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </body>
</html>
