/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import ab6.GestionFichier;
import ab6.Niveau;
import java.util.ArrayList;
import java.util.Iterator;
import vue.fenetre;

/**
 *
 * @author norman
 */
public class Controlleur {
    private fenetre f;
    private Niveau n;
    
     
    public Controlleur(){
        GestionFichier b = new GestionFichier();
        n =  b.chargementQuestions("CP");
        n.getListeQuestion();
        f = new fenetre();
        f.pack();
       // f.iterate();
    }
    
    
    public void envoiQuestion(){
        if(!n.getListeQuestion().isEmpty()){ //Si la liste n'est pas vide on affiche la prochaine question sinon on affiche la victoire !
             //Envoi vers la vue la question 
             f.affichageQuestion(n.getListeQuestion().get(0));
        n.getListeQuestion().remove(0); //Supprime l'element envoyer
        }
        else{
           //Afficher la victoire car il n'y a plus de question
           f.afficherVictoire();
        }
    }
    
    
    public void receptionResultat(boolean choix){
        if(choix){
            //Possibilité d'aficher "bravo"
            envoiQuestion();  //Passe à la prochaine question
        }
        else{
           //Envoi a la fenetre une vie en moins: 
           f.supprimeVie();
        }
    }
}
