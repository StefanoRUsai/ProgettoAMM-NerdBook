<%-- 
    Document   : header
    Created on : 11-apr-2017, 17.22.06
    Author     : St3
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <header>
        <div id="title">
            
            Nerdbook 
        </div>

        <nav class="navbar navleft">                          
            <ul>
                <li><a class="nonqui" href="Bacheca">Bacheca</a></li>
                <li><a class="nonqui" href="Profilo">Profilo</a></li>
                <li><a class="nonqui" href="Descrizione">Descrizione</a></li>
            </ul>                
        </nav>
        <nav class="navbar navright">                        
            <ul>
                    <c:if test="${not empty utente.password}">
                    <li><a class="imgelement nonqui" href="login.html?logout=true"><c:out value="${utente.nome} ${utente.cognome}"/></a></li>
                    </c:if>
                    <c:if test="${empty utente.password}">
                    <li><a class="imgelement nonqui" href="login.html">Login</a></li>
                    </c:if>
                </ul>                
        </nav>

    </header>
