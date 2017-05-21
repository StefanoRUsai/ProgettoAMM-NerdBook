<%-- 
    Document   : newjsp
    Created on : 21-mag-2017, 9.51.58
    Author     : St3
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<form class="nuovopost" name="nuovopost" action="Bacheca?postinviato" method="post"> 
    <div class="nuovopost">
        <div class="profilo"><img class="imgprofilo" title="profilo" alt="immagine avatar" src="${utente.urlAvatar}"></div>
        <textarea  name="testo" id="testo"></textarea>
    </div>
    <div class="nuovopost">
        <input type="text" name="image" id="avatar" placeholder="inserisci la tua immagine">
    </div>
    <div class="nuovopost">
        <input type="text" name="link" id="avatar" placeholder="inserisci il tuo link">
    </div>
    <div>
        <button type="submit" >Pubblica</button>
    </div>
</form>
