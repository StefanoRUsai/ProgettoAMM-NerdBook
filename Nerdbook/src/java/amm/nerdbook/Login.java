/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import amm.nerdbook.classi.UtentiRegistrati;
import amm.nerdbook.classi.UtentiRegistratiFactory;

/**
 *
 * @author St3
 */
public class Login extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            UtentiRegistrati user = new UtentiRegistrati();

            user.setNome(request.getParameter("username"));
            user.setPassword(request.getParameter("password"));

            if (UtentiRegistratiFactory.verifica(user) != false) {
                System.out.println("Login Successful");
                HttpSession session = request.getSession();
                session.setAttribute("authenticatedUser", user);
                response.sendRedirect("/Bacheca");
            }
        } catch (Throwable theException) {
            System.out.println("reinserisci i dati");
        }

    }
}