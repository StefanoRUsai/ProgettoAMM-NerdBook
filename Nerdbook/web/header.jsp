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
                <li><a class="nonqui" href="bacheca.html?postvisualizati=true">Bacheca</a></li>
                <li><a class="nonqui" href="profilo.html">Profilo</a></li>
                <li><a class="nonqui" href="descrizione.html">Descrizione</a></li>
            </ul>                
        </nav>
        <nav class="navbar navright">                        
            <ul>
                    <!--se l'utente ha una password  vuol dire che è loggato, si potrebbe fare pure sul valore loggedin -->
                    <c:if test="${not empty utente.password}">
                    <li><img class="imgprofiloside" title="profilo" alt="immagine avatar" src="${utente.urlAvatar}"><a class="imgelement nonqui" href="bacheca.html"><c:out value="${utente.nome} ${utente.cognome}"/></a></li>
                    </c:if>
                    <c:if test="${not empty utente.password}">
                    <li><a class="nonqui" href="login.html?logout=true">Logout</a></li>
                    </c:if>
                    <c:if test="${empty utente.password}">
                    <li><a class="imgelement nonqui" href="NuovoUtente">Registrati</a></li>
                    </c:if>
                    <c:if test="${empty utente.password}">
                    <li><a class="imgelement nonqui" href="login.html">Login</a></li>
                    </c:if>
            </ul>   
            
        </nav>

    </header>

