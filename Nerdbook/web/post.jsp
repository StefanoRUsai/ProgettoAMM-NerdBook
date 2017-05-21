<%-- 
    Document   : newpost
    Created on : 23-apr-2017, 15.54.27
    Author     : St3
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="amm.nerdbook.classi.UtentiRegistratiFactory"%>
<%@page import="amm.nerdbook.*"%>

<!DOCTYPE html>
    <!-- gestione post tramite la variabile post creata in bacheca (si veda la servlet -->
    <c:forEach var="post" items="${posts}">
        <div class="newpost">
            
            <div>
              <c:if test="${loggedUserID == post.user.idUtente || loggedUserID == 1}">
            <form  name="close" action="Bacheca" method="post">
                <input class="close" type="image" name="cancella" src="img/cancel.png" value="${post.id}" >
            </form>
            </c:if>   
            </div>
                
            <div class="profilo">
                <img class="imgprofilo" title="profilo" alt="immagine avatar" src="${post.imageUser}">
                <div class="nameprofilo"><a href="#indirizzo_casuale">${post.nomeUtente}</a></div>
            </div>
                <c:if test="${not empty post.content}"><div class="testopost"><p>${post.content}</p></div></c:if>
                <c:if test="${not empty post.image}"><div class="img_post"> <img alt="immagine casuale" src="${post.image}"> </div></c:if>
                <c:if test="${not empty post.urlVideo}"><div class="img_post"> <iframe  src="${post.urlVideo}"> </iframe></div></c:if>
                <c:if test="${not empty post.link}"><div class="link_post"><a href="${post.link}">${post.link}</a></div></c:if>
            </div>
    </c:forEach>
