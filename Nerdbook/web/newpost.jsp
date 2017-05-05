<%-- 
    Document   : newpost
    Created on : 2-mag-2017, 12.41.27
    Author     : St3
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="amm.nerdbook.classi.UtentiRegistratiFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<div class="newpost">


    <div class="profilo">
        <img class="imgprofilo" title="profilo" alt="immagine avatar" src="${utente.urlAvatar}">
        <div class="nameprofilo"><a href="#indirizzo_casuale">${utente.nome} ${utente.cognome}</a></div>
    </div>
    <form class="nuovopost" name="nuovopost" action="Bacheca?nuovopost=null&idBacheca=null" method="post"> 
        <c:if test="${nomeInBacheca != null}"><h3>stai scrivendo nella bacheca di:</h3> 
            <h2>${nomeInBacheca}</h2></c:if>
            <h3>Hai inserito il seguente testo:</h3> 
            <p>${testo}</p>
        <h3>Hai inserito la seguente immagine:</h3>
        <p>${image}</p>
        <div>
            <button type="submit" >Pubblica</button>
        </div>

</div>




        


                
                
