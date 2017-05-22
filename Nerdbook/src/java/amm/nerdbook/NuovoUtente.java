/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook;

import amm.nerdbook.classi.UtentiRegistrati;
import amm.nerdbook.classi.UtentiRegistratiFactory;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author St3
 */
public class NuovoUtente extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(false);
        
        
        
        this.nuovoutente(session, request, response);
        
        request.getRequestDispatcher("nuovoutente.jsp").forward(request, response);
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

    public void nuovoutente(HttpSession session, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if (request.getParameter("nuovoutente") != null) {

            String username = request.getParameter("username");

            String lastname = request.getParameter("lastname");

            String img = request.getParameter("img");

            String bday = request.getParameter("bday");

            String email = request.getParameter("email");

            String password = request.getParameter("password");

            String presentazione = request.getParameter("presentazione");

            UtentiRegistrati utente = new UtentiRegistrati();

            utente.setNome(username);
            utente.setCognome(lastname);
            utente.setPassword(password);
            utente.setEmail(email);
            utente.setUrlAvatar(img);
            utente.setData(bday);
            utente.setFrase(presentazione);
            utente.setType(1);
            
            UtentiRegistratiFactory.getInstance().addNewUser(utente);
            
             request.getRequestDispatcher("Login").forward(request, response);

            
        }
    }
}
