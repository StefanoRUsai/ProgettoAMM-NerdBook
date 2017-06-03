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
                <div class="form">
                    <div class="immaginiprofilo">

                        <c:if test="${not empty utente.urlAvatar && empty img}"><img title="profilo" alt="immagine avatar" src="${utente.urlAvatar}"></c:if>
                        <c:if test="${not empty img}"><img title="profilo" alt="immagine avatar" src="${img}"></c:if>
                        <c:if test="${empty utente.urlAvatar && empty img}"><img title="profilo" alt="immagine avatar" src="img/profilo.jpg"></c:if>

                        </div>

                        <div class="areaform">
                            <form action="Profilo?cambio=true" method="post"> <!-- pagin.java sull'action subnet java, il validatore fa funzionare pure l'indirizzo della bacheca-->

                                <div class="textform">
                                    <label for="username"><b>Nome</b></label> 
                                    <input type="text" id="username" name="username" placeholder="Nome" 
                                    <c:if test="${not empty username}">value="${username}"</c:if>
                                    <c:if test="${not empty utente.nome}">value="${utente.nome}"</c:if>>
                                </div>
                                <div class="textform">
                                    <label for="lastname"><b>Cognome</b></label> 
                                    <input type="text" id="lastname" name="lastname" placeholder="Cognome"
                                    <c:if test="${not empty lastname}">value="${lastname}"</c:if>
                                    <c:if test="${not empty utente.cognome}">value="${utente.cognome}"</c:if>>
                                </div>

                                <div class="textform">
                                    <label for="avatar"><b>URL Avatar</b></label> 
                                    <input type="text" name="img" id="avatar" placeholder="inserisci url"
                                    <c:if test="${not empty img}">value="${img}"</c:if>
                                    <c:if test="${not empty utente.urlAvatar}">value="${utente.urlAvatar}"</c:if>>
                                </div>

                                <div class="textform">

                                    <label for="bday"><b>Data di nascista</b></label> 
                                    <input type="date" name="bday" id="bday"
                                    <c:if test="${not empty bday}">value="${bday}"</c:if>
                                    <c:if test="${not empty utente.data}">value="${utente.data}"</c:if>> <!-- warning per il browser firefox, accettabile -->
                                </div>

                                <div class="textform">
                                    <label for="email"><b>E-mail</b></label> 
                                    <input type="text" id="email" name="email" placeholder="inserisci la tua e-mail"
                                    <c:if test="${not empty email}">value="${email}"</c:if>   
                                    <c:if test="${not empty utente.email}">value="${utente.email}"</c:if>>
                                </div>

                                <div class="textform">
                                    <label for="primapsw"><b>Password</b></label> 
                                    <input type="password" id="primapsw" name="password" placeholder="password"
                                    <c:if test="${not empty password}">value="${password}"</c:if>
                                    <c:if test="${not empty utente.password}">value="${utente.password}"</c:if>>
                                </div>

                                <div class="textform">
                                    <label for="verifica"><b>Conferma password</b></label> 
                                    <input type="password" id="verifica"  name="verifica" placeholder="password"
                                    <c:if test="${not empty password}">value="${password}"</c:if>
                                    <c:if test="${not empty utente.password}">value="${utente.password}"</c:if>>     
                                </div>

                                <div class="textform">
                                    <label for="presentazione"><b>Frase di presentazione</b></label> 
                                    <textarea  name="presentazione" id="presentazione" placeholder="scrivi una frase di presentazione...">
                                    <c:if test="${not empty presentazione}">value="${presentazione}"</c:if>
                                    <c:if test="${not empty utente.frase}">value="${utente.frase}"</c:if>
                                    </textarea>
                                </div>


                                <div>
                                    <button type="submit" >Aggiorna</button>

                                </div>


                            </form>
                        <c:if test="${cancellabacheca != true || cancellautente != true || cambio != true}">
                            <div id="cancella">
                                <form action="Profilo" method="post">
                                    <label for="cancellabacheca">Cancella Bacheca</label>
                                    <input type="radio" name="cancellabacheca" id="cancellaBacheca" value="true"><br>
                                    <label for="cancellautente">Cancella Utente</label>
                                    <input type="radio" name="cancellautente" id="cancellaUtente" value="true">
                                    <button type="submit" >Cancella</button>
                                </form>
                            </div>
                        </c:if>

                        </form>
                        <c:if test="${ cancellautente == true}">
                            <div id="cancella">
                                <form action="Profilo?confermau=true" method="post">
                                    <button type="submit" >Confermi</button>
                                </form>
                            </div>
                        </c:if>

                        <c:if test="${ cancellabacheca == true}">
                            <div id="cancella">
                                <form action="Profilo?confermab=true" method="post">
                                    <button type="submit" >Confermi</button>
                                </form>
                            </div>
                        </c:if>

                        <c:if test="${cambio == true}">
                            <div id="validate">I dati sono stati inseriti correttamente</div>
                        </c:if>
                    </div>

                </div>
            </div>
        </div>

    </body>
</html>



