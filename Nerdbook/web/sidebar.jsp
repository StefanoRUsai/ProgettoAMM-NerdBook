<%-- 
    Document   : header
    Created on : 11-apr-2017, 17.22.06
    Author     : St3
--%>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div id="sidebar">
    <div id="search">
        <form name="search" action="Filter"   method="post">
            <input class="serside" id="searchField" type="text" placeholder="cerca un tuo amico" value="">
            <button class="serside" id="searchUser">Cerca</button>
    </div>
</form>

<div id="persone">
    <h3>Persone</h3>
    <nav class="barralaterale">                        
        <ul>
            <!--ciclo la lista dei nomi degli utenti tramite la variabile DButenti che si trovano bacheca, descrizione e profilo-->
            <c:forEach var="nomiutenti" items="${DButenti}">
                <li><div class="botdiv"><a href="bacheca.html?postvisualizati=true&idOtherUser=${nomiutenti.idUtente}">
                            ${nomiutenti.nome} ${nomiutenti.cognome}</a></div></li>
                        </c:forEach>
        </ul>                
    </nav>

</div>
<div id="gruppi">
    <div id="inline">

        <div id="tastoplus">    
            <h3>Gruppi</h3>
        </div>
        <div id="plus">    
            <form  name="plus" action="Nuovogruppo" method="post">
                <input  type="image" name="plus" src="img/plus.png">
            </form>
        </div>
    </div>
    <nav class="barralaterale">                        
        <ul> 
            <!--ciclo la lista dei nomi degli utenti tramite la variabile DBgruppi che si trovano in bacheca, descrizione e profilo-->
            <c:forEach var="gruppi" items="${DBgruppi}">                
                <li><div class="botdiv"><a href="bacheca.html?postgruppivisualizati=true&idGruppoSideBar=${gruppi.idGruppi}">
                            ${gruppi.nome}</a></div></li>                
                        </c:forEach>
        </ul>                
    </nav>
</div>

<c:if test="${not empty idGruppoSideBar}">
    <div id="persone">
        <form action="Bacheca?cancellagruppo=true" method="post"> <!-- pagin.java sull'action subnet java, il validatore fa funzionare pure l'indirizzo della bacheca-->

            <div>
                <button type="submit" >Cancella Gruppo</button>

            </div>


        </form>
    </div>
</c:if>
</div>

