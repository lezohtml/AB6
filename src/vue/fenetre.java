/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package vue;

import ab6.Proposition;
import ab6.Question;
import control.Controlleur;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

/**
*
* @author pc_achoura
*/
public class fenetre extends JFrame implements ActionListener {
	private JMenuBar menuBar = new JMenuBar();
	private JMenu options = new JMenu("options");
	private JMenuItem item1 = new JMenuItem("relancer");
	private JMenuItem item2 = new JMenuItem("quiter");
	private JPanel pan1;
	private JLabel BtnN1;
	private Icon imageP;
	private JLabel BtnN2;
	private Icon imagel;
	private JPanel pan3;
	private JButton JLouest;
	private JLabel JLcentre;
	private Icon image;
	private JLabel JLest, JLest2 ,JLest3 ,JLest4;
	private JPanel pan2;
	private JButton JL, JL2, JL3, JL4;
	private JPanel pan4;
	private Controlleur control;
	
	JProgressBar current = new JProgressBar(0, 10000);
	int num = 0;
	
	
	public fenetre(Controlleur control) {
		this.control = control;
		this.setTitle("AB6");
		this.setSize(800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		//On initialise nos menus
		this.options.add(item1);
		this.options.add(item2);
		this.menuBar.add(options);
		this.setJMenuBar(menuBar);
		



		item1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			}
			
			
		});
		//quiter l'application
		item2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int option = JOptionPane.showConfirmDialog(null, "Voulez-vous arrêter le jeux ?", "Arrêter ?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				
				if(option == JOptionPane.OK_OPTION){
					System.exit(0);
				}
			}
		});
		
                this.chargementQuestion();
		this.setVisible(true);
            //    this.iterate();
	}
	
	
	public void iterate() {
		for(int val = 0; val <= 5000; val++){
			current.setValue(num);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
			num += 100;
		}
		
	}
	
	
	//Permet D'afficher la Question avec ces propositions
	public void affichageQuestion() {
		Question q = control.getQuestion();
	}
	
	
	//Affiche la victoire pour l'utilisateur
	public void afficherVictoire() {
		JOptionPane.showMessageDialog(this, "Victoire !");
	}
	
	public void supprimeVie() {
//TODO Supprime une vie int Vie-- 
        }
	

        
            private void chargementQuestion() {
            //Creation des nouveau panel
            pan2 = new JPanel();
            pan1 = new JPanel();
            
            //Chargement des proposition
            Question q;
            q = control.getQuestion();
            int e= q.getNbProposition();
           for(int i=0;i<e;i++){
               Proposition p = q.getListeProposition().get(i);
               JButton b = new JButton(p.getTexte());
                b.addActionListener((ActionListener) this);
               pan2.add(b);
           }
            this.add(pan2,BorderLayout.PAGE_END);
            
            
          
		//charchement question
            BtnN1 = new JLabel(q.getTexte());
		BtnN1.setPreferredSize(new Dimension(100, 100));
                pan1.add(BtnN1);
		this.add(pan1,BorderLayout.CENTER);
                
            }

            
             public void actionPerformed(ActionEvent e) {
                  JButton button = (JButton) e.getSource();
                 String command = button.getActionCommand();
                 System.out.println(command);
                 if(control.receptionResultat(command)){
                     this.chargementQuestion();
                 }
                 else{
                     //enleve vie
                     System.out.println("aie");
                 }
        }

}