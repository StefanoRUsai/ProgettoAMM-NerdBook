<%-- 
    Document   : header
    Created on : 11-apr-2017, 17.22.06
    Author     : St3
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div id="sidebar">
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
        <h3>Gruppi</h3>
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
</div>

