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
    private boolean vrai;

    public Proposition(int id, String texte, int vrai) {
        this.id = id;
        this.texte = texte;
        if(vrai==0){
            this.vrai=false;
        }
        else{
            this.vrai=true;
        }
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

    public boolean getVrai() {
        return vrai;
    }

    public void setVrai(boolean vrai) {
        this.vrai = vrai;
    }
    
    
    
    
}
