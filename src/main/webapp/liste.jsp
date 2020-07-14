<%-- 
    Document   : liste
    Created on : 3 juil. 2020, 05:27:08
    Author     : Hamza
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.hamza.beans.Personne"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liste</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" 
              integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    </head>
    <body>
        <c:import url="navbar.jsp"></c:import>
            <h1>Liste des adhérents</h1>

            <div class="col-md-6">

            <%
                if (request.getAttribute("adherents") == null) {
                    out.println("<h2>La liste est vide</h2>");
                } else {%>
            <table class="table table-striped table-dark">
                <thead>
                    <tr>
                        <th scope="col">Prénom</th>
                        <th scope="col">Nom</th>
                    </tr>
                </thead>
                <tbody>
                    <% ArrayList list = (ArrayList) request.getAttribute("adherents");
                            for (int i = 0; i < list.size(); i++) {
                                Personne p = (Personne) list.get(i);
                                out.println("<tr><td>" + p.getPrenom() + "</td>");
                                out.println("<td>" + p.getNom() + "</td>");
                                out.println("</tr>");
                            }
                        }
                    %>
                </tbody>
            </table>
        </div>


        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </body>
</html>
