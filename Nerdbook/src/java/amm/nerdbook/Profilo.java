/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook;

import amm.nerdbook.classi.Gruppi;
import amm.nerdbook.classi.GruppiFactory;
import amm.nerdbook.classi.Post;
import amm.nerdbook.classi.PostFactory;
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
public class Profilo extends HttpServlet {

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
        
        
        if(request.getParameter("cancellabacheca") != null)
            request.setAttribute("cancellabacheca", true);
        
        if(request.getParameter("cancellautente") != null)
            request.setAttribute("cancellautente", true);
        
            
        List<Gruppi> DBgruppi = GruppiFactory.getInstance().getDBGruppi();
        request.setAttribute("DBgruppi", DBgruppi);

        //se la sessione esiste ed esiste anche l'attributo loggedIn impostato a true
        if (session != null && session.getAttribute("loggedIn") != null && session.getAttribute("loggedIn").equals(true)) {

            this.gestioneProfilo(request, session, response);

        } else {

            request.setAttribute("nonloggato", true);
            request.getRequestDispatcher("login.jsp").forward(request, response);

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

    public void gestioneProfilo(HttpServletRequest request, HttpSession session, HttpServletResponse response)
            throws ServletException, IOException {

        String user = request.getParameter("user");

        int userID;

        if (user != null) {
            userID = Integer.parseInt(user);
        } else {
            Integer loggedUserID = (Integer) session.getAttribute("loggedUserID");
            userID = loggedUserID;
        }

        UtentiRegistrati utente = UtentiRegistratiFactory.getInstance().getUtentiRegistratiById(userID);
        if (utente != null) {
            
            if(request.getParameter("cancellautente") != null){
            PostFactory.getInstance().deleteAllPost(utente);
            UtentiRegistratiFactory.getInstance().deleteUser(utente);
            session.invalidate();
            request.getRequestDispatcher("login.jsp").forward(request, response);
            }
            if (request.getParameter("cambio") != null) {
                this.SalvataggioParametri(session, request);

            } else {

                request.setAttribute("utente", utente);

            }
            List<UtentiRegistrati> DButenti = UtentiRegistratiFactory.getInstance().getDataBaseUtenti(utente);
            request.setAttribute("DButenti", DButenti);

            if(request.getParameter("deleteAllPost") != null) {
            PostFactory.getInstance().deleteAllPost(utente);
            }
            
            if(request.getParameter("deleteUser") != null) {
            UtentiRegistratiFactory.getInstance().deleteUser(utente);
            }
            
            
            
            request.getRequestDispatcher("profilo.jsp").forward(request, response);
        } else {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        }

    }

    public void SalvataggioParametri(HttpSession session, HttpServletRequest request) {

        request.setAttribute("cambio", true);

        String username = request.getParameter("username");
        request.setAttribute("username", username);

        String lastname = request.getParameter("lastname");
        request.setAttribute("lastname", lastname);

        String img = request.getParameter("img");
        request.setAttribute("img", img);

        String bday = request.getParameter("bday");
        request.setAttribute("bday", bday);

        String email = request.getParameter("email");
        request.setAttribute("email", email);

        String password = request.getParameter("password");
        request.setAttribute("password", password);

        String presentazione = request.getParameter("presentazione");
        request.setAttribute("presentazione", presentazione);

    }

}

