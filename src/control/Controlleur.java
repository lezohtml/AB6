/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import ab6.GestionFichier;
import ab6.Niveau;
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
        n.getListeQuestion().remove(0); //Supprime l'element envoyer
        }
        return q;
    }
    
    
    public boolean receptionResultat(boolean choix){
        if(choix){
            //Possibilité d'aficher "bravo"
            return true;  //Passe à la prochaine question
        }
        else{
           //Envoi a la fenetre une vie en moins: 
           return false;
        }
    }
}
