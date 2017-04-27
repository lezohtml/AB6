/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ab6;

import java.util.ArrayList;

/**
 *
 * @author norman
 */
public class Question {
    private String texte;
    private int nbProposition;
    private ArrayList<Proposition> listeProposition;

    public Question(String texte, int nbProposition) {
        this.texte = texte;
        this.nbProposition = nbProposition;
        listeProposition= new ArrayList<>();
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public int getNbProposition() {
        return nbProposition;
    }

    public void setNbProposition(int nbProposition) {
        this.nbProposition = nbProposition;
    }

    public ArrayList<Proposition> getListeProposition() {
        return listeProposition;
    }

    public void setListeProposition(ArrayList<Proposition> listeProposition) {
        this.listeProposition = listeProposition;
    }
    
    public void addProposition(Proposition e){
        listeProposition.add(e);
    }


    
    
    
    
}
