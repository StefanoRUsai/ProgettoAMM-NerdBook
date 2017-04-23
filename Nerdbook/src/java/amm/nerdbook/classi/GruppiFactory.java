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
public class GruppiFactory {
    
        //Pattern Design Singleton
    private static GruppiFactory singleton;

    public static GruppiFactory getInstance() {
        if (singleton == null) {
            singleton = new GruppiFactory();
        }
        return singleton;
    }
    private ArrayList<Gruppi> listaGruppi = new ArrayList<Gruppi>();
    
    private GruppiFactory() {
        //Creazione utenti

        //Djanni
        Gruppi gruppi1 = new Gruppi();
        gruppi1.setIdGruppi(1);
        gruppi1.setNome("Giochi di Ruolo");
        gruppi1.setUrlAvatar("img/profilo.jpg");
        gruppi1.setData("25/04/2017");
        gruppi1.setFrase("aiuto");
    }
    
    
    public Gruppi getUtentiRegistratiById(int id) {
        for (Gruppi gruppi : this.listaGruppi) {
            if (gruppi.getIdGruppi() == id) {
                return gruppi;
            }
        }
        return null;
    }
    
}
