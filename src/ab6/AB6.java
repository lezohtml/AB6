/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ab6;

import control.Controlleur;
import vue.fenetre;

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
        
       Controlleur nn = new  Controlleur();
       fenetre ff = new fenetre(nn);
    }
    
}
