/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.classi;

import java.util.ArrayList;

/**
 *
 * @author St3
 */
public class UtentiRegistratiFactory {


    //Pattern Design Singleton
    private static UtentiRegistratiFactory singleton;

    public static UtentiRegistratiFactory getInstance() {
        if (singleton == null) {
            singleton = new UtentiRegistratiFactory();
        }
        return singleton;
    }

    private ArrayList<UtentiRegistrati> listaUtentiRegistrati = new ArrayList<UtentiRegistrati>();

    private UtentiRegistratiFactory() {
        //Creazione utenti

        //Djanni
        UtentiRegistrati utentiRegistrati1 = new UtentiRegistrati();
        utentiRegistrati1.setIdUtente();
        utentiRegistrati1.setNome("Giovanni");
        utentiRegistrati1.setCognome("Rodriguez");
        utentiRegistrati1.setUrlAvatar("http://nonesisto.com");
        utentiRegistrati1.setData("25/12/0000");
        utentiRegistrati1.setEmail("giovannirodriguez@gmail.com");        
        utentiRegistrati1.setPassword("123456");
      

        //HeavyBreathing
       UtentiRegistrati utentiRegistrati2 = new UtentiRegistrati();
        utentiRegistrati2.setIdUtente();
        utentiRegistrati2.setNome("Marco");
        utentiRegistrati2.setCognome("Bianco");
        utentiRegistrati2.setUrlAvatar("http://nonesisto.com");
        utentiRegistrati2.setData("25/12/0000");
        utentiRegistrati2.setEmail("marcobianco@gmail.com");        
        utentiRegistrati2.setPassword("123456");

        //GymWorkOut
        UtentiRegistrati utentiRegistrati3 = new UtentiRegistrati();
        utentiRegistrati3.setIdUtente();
        utentiRegistrati3.setNome("Mario");
        utentiRegistrati3.setCognome("Rossi");
        utentiRegistrati3.setUrlAvatar("http://nonesisto.com");
        utentiRegistrati3.setData("25/12/0000");
        utentiRegistrati3.setEmail("mariorossi@gmail.com");        
        utentiRegistrati3.setPassword("123456");
        
               //GymWorkOut
        UtentiRegistrati utentiRegistrati4 = new UtentiRegistrati();
        utentiRegistrati4.setIdUtente();
        utentiRegistrati4.setNome("Marco");
        utentiRegistrati4.setCognome("Bianco");
        utentiRegistrati4.setUrlAvatar("http://nonesisto.com");
        utentiRegistrati4.setData("25/12/0000");
        utentiRegistrati4.setEmail("marcobianco@gmail.com");        
        utentiRegistrati4.setPassword("123456");


      

        listaUtentiRegistrati.add(utentiRegistrati1);
        listaUtentiRegistrati.add(utentiRegistrati2);
        listaUtentiRegistrati.add(utentiRegistrati3);
        listaUtentiRegistrati.add(utentiRegistrati4);
    }

    public UtentiRegistrati getUtentiRegistratiById(int id) {
        for (UtentiRegistrati utentiRegistrati : this.listaUtentiRegistrati) {
            if (utentiRegistrati.getIdUtente() == id) {
                return utentiRegistrati;
            }
        }
        return null;
    }
}
