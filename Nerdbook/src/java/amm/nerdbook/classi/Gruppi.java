/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.classi;

import java.util.List;

/**
 *
 * @author St3
 */
public class Gruppi {

    private int idGruppi;
    private String nome;
    private String urlAvatar;
    private int admin;
    
    
    public Gruppi(){
        
        
        this.idGruppi = -1  ;
        this.nome = "";
        this.urlAvatar = "";
        this.admin = -1;
    } 
    
    
    
    
    
    /**
     * @return the idGruppi
     */
    public int getIdGruppi() {
        return idGruppi;
    }

    /**
     * @param idGruppi the idGruppi to set
     */
    public void setIdGruppi(int idGruppi) {
        this.idGruppi = idGruppi;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the urlAvatar
     */
    public String getUrlAvatar() {
        return urlAvatar;
    }

    /**
     * @param urlAvatar the urlAvatar to set
     */
    public void setUrlAvatar(String urlAvatar) {
        this.urlAvatar = urlAvatar;
    }

   
    /**
     * @return the admin
     */
    public int getAdmin() {
        return admin;
    }

    /**
     * @param admin the admin to set
     */
    public void setAdmin(int admin) {
        this.admin = admin;
    }

    
    
    
}

