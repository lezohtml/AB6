/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import ab6.GestionFichier;
import ab6.Niveau;
import ab6.Proposition;
import ab6.Question;
import java.util.ArrayList;
import java.util.Iterator;
import vue.fenetre;

/**
 *
 * @author norman
 */
public class Controlleur {
    private Niveau n;
    
     
    public Controlleur(){
        GestionFichier b = new GestionFichier();
        n =  b.chargementQuestions("CP");
        n.getListeQuestion();
    }
    
    
    public Question getQuestion(){
        Question q = null;
        if(!n.getListeQuestion().isEmpty()){ //Si la liste n'est pas vide on affiche la prochaine question sinon on affiche la victoire !
             //Envoi vers la vue la question 
             q =  n.getListeQuestion().get(0);
        }
        return q;
    }
    
    
    public boolean receptionResultat(String choix){
        
        if(TrouverReponse(n.getListeQuestion().get(0), choix)){  //On envoie la question en cours avec le choix du joueur
            //Possibilité d'aficher "bravo"
                    n.getListeQuestion().remove(0);
            return true;  //Passe à la prochaine question
        }
        else{
           //Envoi a la fenetre une vie en moins: 
           return false;
        }
    }
    
    
    public boolean TrouverReponse(Question q,String s){
        for(int e=0;e< q.getNbProposition();e++){
            Proposition p = q.getListeProposition().get(e);
                        System.out.println(p.getTexte() + "  "+ s +"   " + p.getVrai());
            if(p.getTexte().equals(s) && p.getVrai()){
                System.out.println("HEY u rignt boy");
                return true;
            }
        }
                        System.out.println("false");

        return false;
        
    }
    
    
}
