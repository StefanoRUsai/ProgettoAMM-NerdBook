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
                <div class="form">
                    <div class="immaginiprofilo">

                        <c:if test="${not empty utente.urlAvatar && empty img}"><img title="profilo" alt="immagine avatar" src="${utente.urlAvatar}"></c:if>
                        <c:if test="${not empty img}"><img title="profilo" alt="immagine avatar" src="${img}"></c:if>
                        <c:if test="${empty utente.urlAvatar && empty img}"><img title="profilo" alt="immagine avatar" src="img/profilo.jpg"></c:if>

                        </div>

                       
                    <div class="areaform">
                        <form action="NuovoUtente?nuovoutente=true" method="post"> <!-- pagin.java sull'action subnet java, il validatore fa funzionare pure l'indirizzo della bacheca-->

                            <div class="textform">
                                <label for="username"><b>Nome</b></label> 
                                <input type="text" id="username" name="username" value="">
                            </div>


                            <div class="textform">
                                <label for="lastname"><b>Cognome</b></label> 
                                <input type="text" id="lastname" name="lastname" value="">
                            </div>

                            <div class="textform">
                                <label for="avatar"><b>URL Avatar</b></label> 
                                <input type="text" name="img" id="avatar" value="">
                            </div>

                            <div class="textform">

                                <label for="bday"><b>Data di nascista</b></label> 
                                <input type="date" name="bday" id="bday" value=""> <!-- warning per il browser firefox, accettabile -->
                            </div>

                            <div class="textform">
                                <label for="primapsw"><b>Password</b></label> 
                                <input type="password" id="password" name="password" value="">
                            </div>
                                
                            <div class="textform">
                                <label for="email"><b>email</b></label> 
                                <input type="text" id="email" name="email" value="">
                            </div>

                            

                            <div class="textform">
                                <label for="presentazione"><b>Frase di presentazione</b></label> 
                                <textarea  name="presentazione" id="presentazione">Frase di presentazione </textarea>
                            </div>


                            <div>
                                <button type="submit" >Registrati</button>

                            </div>



                </div>
            </div>
        </div>

    </body>
</html>



