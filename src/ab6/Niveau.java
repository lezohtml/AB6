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
public class Niveau {
    private int id;
    private String nom;
    private int temps;
    private ArrayList<Question> listeQuestion;

    public Niveau(int id, String nom, int temps) {
        this.id = id;
        this.nom = nom;
        this.temps = temps;
        listeQuestion=new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTemps() {
        return temps;
    }

    public void setTemps(int temps) {
        this.temps = temps;
    }

    public ArrayList<Question> getListeQuestion() {
        return listeQuestion;
    }

    public void setListeQuestion(ArrayList<Question> listeQuestion) {
        this.listeQuestion = listeQuestion;
    }
    
    public void addQuestion(Question e){
        listeQuestion.add(e);
    }
    
    
    
    
    
    
    
}
