<!DOCTYPE html>

<html>
    <head>
        <title>NerdBook il nuovo social network</title>
        <base href="M1">        <!--inidirizzo fittizzio--> 
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



            <div id="sidebar">
                <div id="persone">
                    <h3>Persone</h3>
                    <nav class="barralaterale">                        
                        <ul> 
                            <li><div class="botdiv"><a href="#mariorossi">Mario Rossi</a></div></li>
                            <li><div class="botdiv"><a href="#marcopinco">Marco Pinco</a></div></li>
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

            <div id="content">         

                <div class="newpost">
                    <div class="profilo">
                        <div class="imgprofilo">
                            <img title="profilo" alt="immagine avatar" src="img/avatar-placeholder.jpg" width="40" height="40">
                        </div>
                        <div class="nameprofilo">
                            <a href="#indirizzo_casuale">Giovanni Rodriguez</a>
                        </div>
                    </div>
                    <div class="testopost">
                        <p>
                            trallalero trallala che cosa si scriverà?
                        </p>
                    </div>
                    <div class="img_post">

                    </div>
                    <div class="link_post"></div>
                </div>

                <div class="newpost">
                    <div class="profilo">
                        <div class="imgprofilo">
                            <img title="profilo" alt="immagine avatar" src="img/avatar-placeholder.jpg" width="40" height="40">
                        </div>
                        <div class="nameprofilo">
                            <a href="#indirizzo_casuale">Marco Bianco</a>
                        </div>
                    </div>
                    <div class="testopost">
                        <p>
                            Divertente questa immagine di Pac-Man 
                        </p>
                    </div>
                    <div class="img_post">
                        <img alt="immagine casuale" src="img/b0979598-c427-4f71-b235-51e4c733753d.jpg">
                    </div>
                    <div class="link_post"></div>
                </div>

                <div class="newpost">
                    <div class="profilo">
                        <div class="imgprofilo">
                            <img title="profilo" alt="immagine avatar" src="img/avatar-placeholder.jpg" width="40" height="40">
                        </div>
                        <div class="nameprofilo">
                            <a href="#indirizzo_casuale">Mario Rossi</a>
                        </div>
                    </div>
                    <div class="testopost">
                        <p>
                            Simpatica la descrizione del minus world
                        </p>
                    </div>
                    <div class="img_post">

                    </div>
                    <div class="link_post"><a href="https://it.wikipedia.org/wiki/Super_Mario_Bros.">https://it.wikipedia.org/wiki/Super_Mario_Bros.</a></div>
                </div>


                <div class="newpost">
                    <div class="profilo">
                        <div class="imgprofilo">
                            <img title="profilo" alt="immagine avatar" src="img/avatar-placeholder.jpg" width="40" height="40">
                        </div>
                        <div class="nameprofilo">
                            <a href="#indirizzo_casuale">Marco Pinco</a>
                        </div>
                    </div>
                    <div class="testopost">
                        <p>
                            we we bello sto video!!
                        </p>
                    </div>
                    <div class="img_post">
                        <iframe 
                            src="https://www.youtube.com/embed/-Khe61uso_o">
                        </iframe>
                    </div>
                    <div class="link_post"></div>
                </div>



            </div>
        </div>
    </body>    
</html>