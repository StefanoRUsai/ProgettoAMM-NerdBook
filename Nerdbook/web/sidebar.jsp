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
                <c:forEach var="nomiutenti" items="${DButenti}">
                
                    <li><div class="botdiv"><a href="bacheca.html?postvisualizati=true&IdOtherUser=${nomiutenti.idUtente}">${nomiutenti.nome} ${nomiutenti.cognome}</a></div></li>
                
                </c:forEach>
            </ul>                
        </nav>
        
    </div>
    <div id="gruppi">
        <h3>Gruppi</h3>
        <nav class="barralaterale">                        
            <ul> 
                <li><div class="botdiv"><a href="#GDR">Giochi di Ruolo</a></div></li>
                <li><div class="botdiv"><a href="#FPW">Fondamenti Web...</a></div></li>
            </ul>                
        </nav>
    </div>
</div>