/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook;

import amm.nerdbook.classi.Gruppi;
import amm.nerdbook.classi.GruppiFactory;
import amm.nerdbook.classi.UtentiRegistrati;
import amm.nerdbook.classi.UtentiRegistratiFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author St3
 */
public class Nuovogruppo extends HttpServlet {

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


        if (session != null && session.getAttribute("loggedIn") != null
                && session.getAttribute("loggedIn").equals(true)) {
            
            

            String user = request.getParameter("user");

            int userID;

            if (user != null) {
                userID = Integer.parseInt(user);
            } else {
                Integer loggedUserID = (Integer) session.getAttribute("loggedUserID");
                userID = loggedUserID;
            }

            UtentiRegistrati utente = UtentiRegistratiFactory.getInstance().getUtentiRegistratiById(userID);

            request.setAttribute("utente", utente);

            List<UtentiRegistrati> DButenti = UtentiRegistratiFactory.getInstance().getDataBaseUtenti(utente);
            request.setAttribute("DButenti", DButenti);
            
            
        List<Gruppi> DBgruppi = GruppiFactory.getInstance().getDBGruppi();
        request.setAttribute("DBgruppi", DBgruppi);
        
        


            this.addgruppo(session, request, response, utente);

            request.getRequestDispatcher("nuovogruppo.jsp").forward(request, response);
            
            
        }
        
        request.getRequestDispatcher("Bacheca").forward(request, response);
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

    public void addgruppo(HttpSession session, HttpServletRequest request, HttpServletResponse response, UtentiRegistrati utente)
            throws ServletException, IOException {

        if (request.getParameter("nuovogruppo") != null) {

            String username = request.getParameter("nome");

            String lastname = request.getParameter("img");

            Gruppi gruppo = new Gruppi();

            gruppo.setNome(username);
            gruppo.setUrlAvatar(lastname);
            gruppo.setAdmin(utente.getIdUtente());

            GruppiFactory.getInstance().addNewGroup(gruppo);

            request.getRequestDispatcher("Bacheca").forward(request, response);

        }
    }
}
