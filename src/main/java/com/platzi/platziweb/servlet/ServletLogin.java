package com.platzi.platziweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(description = "Servlet para manipular la petición de login.", urlPatterns = {"/ServletLogin"})
public class ServletLogin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String user = req.getParameter("usuario");
        String company = req.getParameter("empresa");

        if (user != null && company != null) {
            if (company.equals("Platzi")) {
                out.println("Bienvenido a Platzi");
            } else {
                out.println("Bienvenido");
            }
        } else {
            out.println("Usuario incorrecto!!");
        }

        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
