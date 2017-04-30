/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.classi;

/**
 *
 * @author St3
 */
public class Gruppi {
   
    private int idGruppi;
    private String nome;
    private String urlAvatar;
    private String data;
    private String frase;

    public Gruppi(){
        
        
        this.idGruppi = -1  ;
        this.nome = "";
        this.urlAvatar = "";
        this.data = "";
        this.frase = "";
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
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the frase
     */
    public String getFrase() {
        return frase;
    }

    /**
     * @param frase the frase to set
     */
    public void setFrase(String frase) {
        this.frase = frase;
    }
    
    
    
}
