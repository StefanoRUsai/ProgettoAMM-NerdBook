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

                        <img title="profilo" alt="immagine avatar" src="img/profilo.jpg">

                        </div>

                       
                    <div class="areaform">
                        <form action="Nuovogruppo?nuovogruppo=true" method="post"> <!-- pagin.java sull'action subnet java, il validatore fa funzionare pure l'indirizzo della bacheca-->

                            <div class="textform">
                                <label for="nome"><b>Nome</b></label> 
                                <input type="text" id="nome" name="nome" value="">
                            </div>


                            <div class="textform">
                                <label for="img"><b>Immagine</b></label> 
                                <input type="text" id="img" name="img" value="">
                            </div>


                            <div>
                                <button type="submit" >Registra il gruppo</button>

                            </div>



                </div>
            </div>
        </div>

    </body>
</html>



