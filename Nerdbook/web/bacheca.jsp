
<%-- 
    Document   : newpost
    Created on : 23-apr-2017, 15.54.27
    Author     : St3
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <title>NerdBook il nuovo social network</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Stefano Raimondo Usai">
        <meta name="keywords" content="cerca nerd giochi GDR RPG GRV MMPORG libri fantasy code programming languages music programmazione linguaggi games musica">
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
        <script src="js/jquery-3.2.1.min.js"></script>
        <script src="js/javascript.js"></script>

    </head>

    <body>
        <div id="page">
            <!--header contenente in titolo della pagina-->
            <c:set var="title" value="Bacheca Personale" scope="request"/>
            <jsp:include page="header.jsp"/>

            <!--Barra di navigazione tra le pagine del sito-->
            <c:set var="page" value="Bacheca Personale" scope="request"/>
            <jsp:include page="sidebar.jsp"/>

            <div id="content">
                
                <c:if test="${uttmp == null}">
                <div id="frase">
                    <h2>Ciao ${utente.nome} ${utente.cognome}</h2>
                    <h3>Il tuo motto è: ${utente.frase}</h3>
                </div>
                </c:if>
                
                 <c:if test="${uttmp != null}">
                <div id="frase">
                    <h2>Ciao ${utente.nome} ${utente.cognome} stai visitando ${uttmp.nome} ${uttmp.cognome}</h2>
                    <h3>Il suo motto è: ${uttmp.frase}</h3>
                </div>
                </c:if>
                
                
                
                <div id="divnuovopost">
                    <c:set var="page" value="Bacheca Personale" scope="request"/>
                    <jsp:include page="formpost.jsp"/>
                </div>

                <div id="contentpost">
                    <c:set var="page" value="Bacheca Personale" scope="request"/>
                    <jsp:include page="post.jsp"/>
                </div>

            </div>

        </div>
    </div>
</body>    
</html>



