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
            <c:set var
                   ="title" value="Bacheca Personale" scope="request"/>
            <jsp:include page="header.jsp"/>




            <!--Barra di navigazione tra le pagine del sito-->
            <c:if test="${loggedIn==true}"> 
                <c:set var="page" value="Bacheca Personale" scope="request"/>
                <jsp:include page="sidebar.jsp"/>
            </c:if>
                <div id="content">
                    <div id="box_descrizione">  

                        <h1 id="Descrizione">Descrizione</h1>
                        <ul>    
                            <li><a class="dice" href="#siamo">Chi siamo</a>
                                <ul>
                                    <li><a class="dice" href="#storia">Storia</a></li>
                                    <li><a class="dice" href="#futuro">Futuro</a></li>                    
                                </ul>
                            </li>
                            <li><a class="dice" href="#occupazione">Di cosa ci occupiamo</a>
                                <ul>
                                    <li><a class="dice" href="#interessi">Interessi</a></li>
                                    <li><a class="dice" href="#attività ">Attività </a></li>                    
                                </ul>
                            </li>
                        </ul>
                        <h2 id="siamo">Chi siamo</h2>

                        <p>Nerdbook è un servizio di rete sociale lanciato il 15 marzo 2015, ed è posseduto e gestito dalla società  Nerdbook s.p.a.,
                            basato su una piattaforma software scritta in vari linguaggi di programmazione. 
                            Il sito, fondato a Cagliari in Italia da Caio Sempronio, Mario Rossi, Pasquale Bianchi e Lello Ortu, 
                            era originariamente stato progettato esclusivamente per gli studenti dell'Università  di Cagliari, 
                            ma fu presto aperto anche agli studenti di altre scuole della zona di Cagliari.
                        </p>
                        <img title="immagine dadi" alt="immagine dadi" src="img/14192785_10208873012176928_1747629557378886297_n.jpg" width="476" height="317">

                        <h3 id="storia">Storia</h3>
                        <p>Nato inizialmente come Blog per la condivisione di interessi si è presto tramutato in un social network grazie ai tanti utenti che settimanalmente
                            si recavano a commentare sul blog.
                        </p>

                        <h3 id="futuro">Futuro</h3>
                        <p>Per il futuro speriamo di raccogliere utenti da ogni parte del mondo, in modo da poter condividere la nostra filosofia con pià¹ persone possibili   
                        </p>

                        <h2 id="occupazione">Di cosa ci occupiamo</h2>

                        <p>Questa comunità  nasce con lo scopo di aiutarti a trovare altre persone che si interessano degli stessi argomenti
                            che ti appassionano.In modo completamente gratuito.
                            Conoscendo, molto bene, le difficoltà  di ammalgamere le persone nei luoghi comuni: 
                            come scuole, università  o luoghi di lavoro. Vogliamo dare la possibilità  di incontrarvi o scambiarvi idee in modo semplice.
                        </p>
                        <img title="immagine dadi" alt="immagine dadi" src="img/476px-Dungeons_and_Dragons_game.jpg" width="476" height="357">

                        <h3 id="interessi">Interessi</h3>
                        <p>Vogliamo darvi la possibilità  di creare  gruppi per condividere: i vostri pensieri vostre collezioni, giochi, foto, programmi e tutto quello che pensiate
                            possa interessare alla nostra comunità 
                        </p>

                        <h3 id="attività ">Attività </h3>
                        <p>Con il passare del tempo ci siamo occupati anche di organizzare eventi con lo scopo di ragruppare i nostri utenti e far conoscere anche da esterni
                            la nostra rete sociale.
                        </p>


                    </div>      
                </div>
            </div>
        </body>
    </html>
