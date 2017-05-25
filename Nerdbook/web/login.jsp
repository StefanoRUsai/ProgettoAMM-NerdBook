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
                <c:set var="title" value="Bacheca Personale"/>
                <jsp:include page="header.jsp"/>
                
                
            <div id="content">
                <div id="divlogin">
                    <c:if test="${loggedIn == null}"><form action="Login" method="post"></c:if>
                    <c:if test="${loggedIn != null}"><form action="Login?seiloggato=true" method="post"></c:if>    
                        <div id="divform">

                            <div id="texar">
                                <label for="username"><b>E-mail</b></label>
                                <input class="inserimento" type="text" id="username" name="username">

                                <label for="password"><b>Password</b></label>
                                <input class="inserimento" type="password" id="password"  name="password">
                            </div>
                            <button type="submit">Accedi</button> 
                            <input class="scatola" type="checkbox"> rimani collegato

                        </div>

                        <div id="passworddimenticata">
                            <a href="bacheca.html">Hai dimenticato la password?</a>
                        </div>
                    </form>
               <!-- da il messaggio di errore nel caso queste variabili non esistano-->     
                 <c:if test="${invalidData == true}">
                    <div id="invalidDataWarning">I dati inseriti non sono corretti</div>
                </c:if>
                <c:if test="${nonloggato != null && invalidData != true}">
                    <div id="loggedOut">Devi essere loggato</div>
                </c:if>
                <c:if test="${seiloggato != null}">
                    <div id="loggedOut">Sei gia loggato loggato</div>
                </c:if>

                    
                </div>
            </div>
        </div>
    </body>
</html>



