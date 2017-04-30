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

        
        UtentiRegistrati utentiRegistrati1 = new UtentiRegistrati();
        utentiRegistrati1.setIdUtente(1);
        utentiRegistrati1.setNome("Giovanni");
        utentiRegistrati1.setCognome("Rodriguez");
        utentiRegistrati1.setUrlAvatar("img/avatar-placeholder.jpg");
        utentiRegistrati1.setData("25/12/0000");
        utentiRegistrati1.setEmail("giovannirodriguez@gmail.com");        
        utentiRegistrati1.setPassword("123456");
        utentiRegistrati1.setFrase("ma che bella frase");
      

        
        UtentiRegistrati utentiRegistrati2 = new UtentiRegistrati();
        utentiRegistrati2.setIdUtente(2);
        utentiRegistrati2.setNome("Marco");
        utentiRegistrati2.setCognome("Bianco");
        utentiRegistrati2.setUrlAvatar("img/avatar-placeholder.jpg");
        utentiRegistrati2.setData("25/12/0000");
        utentiRegistrati2.setEmail("marcobianco@gmail.com");        
        utentiRegistrati2.setPassword("123456");
        utentiRegistrati2.setFrase("ma che bella frase");
        
        
        UtentiRegistrati utentiRegistrati3 = new UtentiRegistrati();
        utentiRegistrati3.setIdUtente(3);
        utentiRegistrati3.setNome("Reginaldo");
        utentiRegistrati3.setCognome("Rossi");
        utentiRegistrati3.setUrlAvatar("img/avatar-placeholder.jpg");
        utentiRegistrati3.setData("25/12/0000");
        utentiRegistrati3.setEmail("mariorossi@gmail.com");        
        utentiRegistrati3.setPassword("123456");
        utentiRegistrati3.setFrase("ma che bella frase");
        
        UtentiRegistrati utentiRegistrati4 = new UtentiRegistrati();
        utentiRegistrati4.setIdUtente(4);
        utentiRegistrati4.setNome("Mario");
        utentiRegistrati4.setCognome("Bros");
        utentiRegistrati4.setUrlAvatar("img/mario_face.jpg");
        utentiRegistrati4.setData("25/12/0000");
        utentiRegistrati4.setEmail("marcobianco@gmail.com");        
        utentiRegistrati4.setPassword("123456");
        utentiRegistrati4.setFrase("ma che bella frase");
        
        UtentiRegistrati utentiRegistrati5 = new UtentiRegistrati();
        utentiRegistrati5.setIdUtente(5);
        utentiRegistrati5.setNome("Prova");
        utentiRegistrati5.setCognome("");
        utentiRegistrati5.setUrlAvatar("img/mario_face.jpg");
        utentiRegistrati5.setData("00/00/0000");
        utentiRegistrati5.setEmail("sonoinprova@gmail.com");        
        utentiRegistrati5.setPassword("2332");
        utentiRegistrati5.setFrase("ma che bella frase");
        
        
        UtentiRegistrati utentiRegistrati6 = new UtentiRegistrati();
        utentiRegistrati6.setIdUtente(6);
        utentiRegistrati6.setNome("Marco");
        utentiRegistrati6.setCognome("Pinco");
        utentiRegistrati6.setUrlAvatar("img/mario_face.jpg");
        utentiRegistrati6.setData("00/00/0000");
        utentiRegistrati6.setEmail("sonoinprova@gmail.com");        
        utentiRegistrati6.setPassword("56789");
        utentiRegistrati6.setFrase("ma che bella frase");
      

        listaUtentiRegistrati.add(utentiRegistrati1);
        listaUtentiRegistrati.add(utentiRegistrati2);
        listaUtentiRegistrati.add(utentiRegistrati3);
        listaUtentiRegistrati.add(utentiRegistrati4);
        listaUtentiRegistrati.add(utentiRegistrati5);
        listaUtentiRegistrati.add(utentiRegistrati6);
    }
    
    
    public UtentiRegistrati getUtentiRegistratiById(int id) {
        for (UtentiRegistrati utentiRegistrati : this.listaUtentiRegistrati) {
            if (utentiRegistrati.getIdUtente() == id) {
                return utentiRegistrati;
            }
        }
        return null;
    }
    
    public ArrayList<UtentiRegistrati> getDataBaseUtenti(UtentiRegistrati utenteloggato) {
        ArrayList<UtentiRegistrati> nuovalista = new ArrayList<UtentiRegistrati>();
        for(UtentiRegistrati utente : this.listaUtentiRegistrati ){
            if(!(utente.equals(utenteloggato))){
            nuovalista.add(utente);
            }
        }
        return nuovalista;
    }

    public ArrayList<UtentiRegistrati> getDataBaseUtenti() {
        
        return this.listaUtentiRegistrati;
    }
    
    
    
    
    public UtentiRegistrati getUtentiRegistratiByNome(String nome) {
        for (UtentiRegistrati utentiRegistrati : this.listaUtentiRegistrati) {
            if (utentiRegistrati.getNome()== nome) {
                return utentiRegistrati;
            }
        }
        return null;
    }
    
    public int getIdByUserAndPassword(String user, String password){
        for(UtentiRegistrati utente: this.listaUtentiRegistrati){
            if(utente.getNome().equals(user) && utente.getPassword().equals(password)){
                return utente.getIdUtente();
            }
        }
        return -1;
    }

}


