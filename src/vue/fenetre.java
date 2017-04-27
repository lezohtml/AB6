/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

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
public class fenetre extends JFrame{
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
         
      JProgressBar current = new JProgressBar(0, 10000);
      int num = 0;
         
	 
	public fenetre() {
    	this.setTitle("AB6");
		this.setSize(1100, 650);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);  
	    
	  //On initialise nos menus   
	    this.options.add(item1);
	    this.options.add(item2);
	    this.menuBar.add(options);
	    this.setJMenuBar(menuBar);
	    
	    //dÃ©finition du type de bordure
	    Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
	    
	    //Nord
	    pan1 = new JPanel();
	    pan1.setPreferredSize(new Dimension(970, 100));
	    BtnN1 = new JLabel("ma question");
	    BtnN1.setPreferredSize(new Dimension(480, 100));
	    BtnN1.setBorder(loweredetched);
		

	    pan1.add(BtnN1);
	    
	    //Milieu
	    pan3 = new JPanel();
	    pan3.setPreferredSize(new Dimension(1000, 300));
//
//	    //Ouest
//	    JLouest = new JButton();
//	    JLouest.setPreferredSize(new Dimension(200, 300));
//	    pan3.add(JLouest);
	    //Centre
	    JLcentre = new JLabel();
	    JLcentre.setPreferredSize(new Dimension(600, 300));
	    JLcentre.setBorder(loweredetched);
            
             current.setValue(0);
             current.setStringPainted(true);
  
//	    JButton image = new JButton("test");
//            image.setPreferredSize(new Dimension(100, 200));
//            JLcentre.add(image);
	    pan3.add(current);
	    
	    //Est
            

	    JLest = new JLabel();
	    JLest.setPreferredSize(new Dimension(80, 100));
            JLest2 = new JLabel();
	    JLest2.setPreferredSize(new Dimension(80, 100));
            JLest3 = new JLabel();
	    JLest3.setPreferredSize(new Dimension(80, 100));
            JLest4 = new JLabel();
	    JLest4.setPreferredSize(new Dimension(80, 100));
            

            ImageIcon image = new ImageIcon( "C:/Users/pc_achoura/Documents/NetBeansProjects/AB_6/AB6/src/vue/coeur.jpg"); // Tu créer ton objet ImageIcon comme tu veux
            image = new ImageIcon(image.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
            JLest.setText(null);
            JLest.setIcon(image);


            ImageIcon image2 = new ImageIcon( "C:/Users/pc_achoura/Documents/NetBeansProjects/AB_6/AB6/src/vue/coeur.jpg"); // Tu créer ton objet ImageIcon comme tu veux
            image2 = new ImageIcon(image2.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
            JLest2.setText(null);
            JLest2.setIcon(image2);


            ImageIcon image3 = new ImageIcon( "C:/Users/pc_achoura/Documents/NetBeansProjects/AB_6/AB6/src/vue/coeur.jpg"); // Tu créer ton objet ImageIcon comme tu veux
            image3 = new ImageIcon(image3.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
            JLest3.setText(null);
            JLest3.setIcon(image2);

            ImageIcon image4 = new ImageIcon( "C:/Users/pc_achoura/Documents/NetBeansProjects/AB_6/AB6/src/vue/coeur.jpg"); // Tu créer ton objet ImageIcon comme tu veux
            image4 = new ImageIcon(image4.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
            JLest4.setText(null);
            JLest4.setIcon(image2);





	    pan3.add(JLest);
	    pan3.add(JLest2);
            pan3.add(JLest3);
            pan3.add(JLest4);
		  //Sud
                  
            
	    pan2 = new JPanel();
	    pan2.setPreferredSize(new Dimension(960, 110));
	    JL = new JButton("proposition");
	    JL.setPreferredSize(new Dimension(230, 100));
	    JL.setBorder(loweredetched);
            JL2 = new JButton("proposition");
	    JL2.setPreferredSize(new Dimension(230, 100));
	    JL2.setBorder(loweredetched);
            JL3 = new JButton("proposition");
	    JL3.setPreferredSize(new Dimension(230, 100));
	    JL3.setBorder(loweredetched);
            JL4 = new JButton("proposition");
	    JL4.setPreferredSize(new Dimension(230, 100));
	    JL4.setBorder(loweredetched);
	    pan2.add(JL);
            pan2.add(JL2);
            pan2.add(JL3);
            pan2.add(JL4);
	    
	    pan4 = new JPanel();
	    pan4.setPreferredSize(new Dimension(1000, 550));
	  //On positionne maintenant ces trois lignes en colonne
	    pan4.add(pan1);
	    pan4.add(pan3);
	    pan4.add(pan2);
	    
	    //ecoute des menus
    	//relancer le jeux
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

	    this.getContentPane().add(pan4);
	    this.setVisible(true);
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
}
