
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
                <div id="divnuovopost">
                    <form class="nuovopost" name="nuovopost" action="Bacheca?postinviato" method="post"> 
                        <div class="nuovopost">
                            <div class="profilo"><img class="imgprofilo" title="profilo" alt="immagine avatar" src="${utente.urlAvatar}"></div>
                            <textarea  name="testo" id="testo"></textarea>
                        </div>
                        <div class="nuovopost">
                            <input type="text" name="image" id="avatar" placeholder="inserisci la tua immagine">
                        </div>
                        <div>
                            <button type="submit" >Pubblica</button>
                        </div>
                    </form>
                       

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


