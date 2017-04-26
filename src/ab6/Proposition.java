/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ab6;

/**
 *
 * @author norman
 */
public class Proposition {
    private int id;
    private String texte;
    private int vrai;

    public Proposition(int id, String texte, int vrai) {
        this.id = id;
        this.texte = texte;
        this.vrai = vrai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public int getVrai() {
        return vrai;
    }

    public void setVrai(int vrai) {
        this.vrai = vrai;
    }
    
    
    
    
}
