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
public class AB6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GestionFichier b = new GestionFichier();
        Niveau n =  b.chargementQuestions("CP");
        n.getListeQuestion();
    }
    
}
