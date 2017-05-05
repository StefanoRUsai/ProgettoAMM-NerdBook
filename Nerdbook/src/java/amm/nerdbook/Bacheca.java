/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook;

import amm.nerdbook.classi.Post;
import amm.nerdbook.classi.PostFactory;
import amm.nerdbook.classi.UtentiRegistrati;
import amm.nerdbook.classi.UtentiRegistratiFactory;
import amm.nerdbook.classi.Gruppi;
import amm.nerdbook.classi.GruppiFactory;
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
public class Bacheca extends HttpServlet {

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


        List<Gruppi> DBgruppi = GruppiFactory.getInstance().getDBGruppi();
        request.setAttribute("DBgruppi", DBgruppi);

        if (request.getParameter("postinviato") != null) {
            request.setAttribute("postinviato", true);
        }

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

            if (utente != null) {
                this.gestionePost(utente, request, session);
                if (session.getAttribute("flagId") != null) {

                    
                        String flagIdString= (String)session.getAttribute("flagId");
                        Integer id = Integer.parseInt(flagIdString);
                        int idBacheca = id;
                        UtentiRegistrati utenteNomeBacheca = UtentiRegistratiFactory.getInstance().getUtentiRegistratiById(idBacheca);
                        String nomeInBacheca = utenteNomeBacheca.getNome() + " " + utenteNomeBacheca.getCognome();
                        request.setAttribute("nomeInBacheca", nomeInBacheca);
                    }
            

                this.nuovoPost(utente, request, session, response);

                request.getRequestDispatcher("bacheca.jsp").forward(request, response);

            } else {

                response.setStatus(HttpServletResponse.SC_NOT_FOUND);

            }

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

    public void gestionePost(UtentiRegistrati utente, HttpServletRequest request, HttpSession session) {

        request.setAttribute("utente", utente);

        List<UtentiRegistrati> DButenti = UtentiRegistratiFactory.getInstance().getDataBaseUtenti(utente);
        request.setAttribute("DButenti", DButenti);

        if (request.getParameter("postgruppivisualizati") != null) {

            String idGroup = request.getParameter("idGruppoSideBar");
            int idGruppo = Integer.parseInt(idGroup);
            List<Post> posts = PostFactory.getInstance().getPostListGruppi(idGruppo);
            request.setAttribute("posts", posts);
            request.setAttribute("postgruppivisualizati", null);

        } else {

            if (request.getParameter("postvisualizati") != null) {

                if (request.getParameter("idOtherUser") != null) {

                    String tmp = request.getParameter("idOtherUser");
                    if(session.getAttribute("flagId")!= null || 
                           ((request.getParameter("idOtherUser") != null) && 
                                (request.getParameter("idOtherUser") != session.getAttribute("flagId")) ))
                    session.setAttribute("flagId", tmp);
                    int idDaVisualizzare = Integer.parseInt(tmp);
                    
                    List<Post> posts = PostFactory.getInstance().getPostListforId(idDaVisualizzare);
                    request.setAttribute("posts", posts);
                    request.setAttribute("postvisualizati", null);

                } else {

                    List<Post> posts = PostFactory.getInstance().getGlobalPostList();
                    request.setAttribute("posts", posts);
                    request.setAttribute("postvisualizati", null);
                }

            } else {

                List<Post> posts = PostFactory.getInstance().getPostList(utente);
                request.setAttribute("posts", posts);
            }

        }
    }

    public void nuovoPost(UtentiRegistrati utente, HttpServletRequest request, HttpSession session, HttpServletResponse response)
            throws ServletException, IOException {

        if (request.getParameter("postinviato") != null) {

            request.setAttribute("postinviato", true);

            String testo = request.getParameter("testo");
            request.setAttribute("testo", testo);

            String image = request.getParameter("image");
            request.setAttribute("image", image);

        }
    }

}



