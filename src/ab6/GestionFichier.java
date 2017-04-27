

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package ab6;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


/**
*
* @author norman
*/
public class GestionFichier {
	
	
	
	public Niveau chargementQuestions(String niveauChoisi){
            
            
            //Inisialisation du paser de fichier XML
		final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Document document = null;
		try {
			document = builder.parse(new File("questions.xml"));
		} catch (SAXException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		final Element racine = document.getDocumentElement();
		NodeList listeNiveau =  racine.getElementsByTagName("Niveau");
		
		int i=0;
		boolean trigger=true;
		NodeList listeQuestion = null;
		Niveau unNiveau = null;
                Question uneQuestion = null;
                Proposition uneProposition = null;
                
                //Chargement du niveau de difficulté
		do{
			Element niveau = (Element) listeNiveau.item(i);
			if(listeNiveau.item(i).getNodeType() == Node.ELEMENT_NODE) {
				if(niveau.getAttribute("nom").equals(niveauChoisi)){
					listeQuestion = niveau.getElementsByTagName("Question");
					trigger=false;
					unNiveau = new Niveau(Integer.parseInt( niveau.getAttribute("id")),niveau.getAttribute("nom"), Integer.parseInt( niveau.getAttribute("temps")));
				}
			}
			i++;
		}while(trigger);
		
                
                
                //Chargement des Questions
		for(int e=0;e<listeQuestion.getLength();e++){
			if(listeQuestion.item(e).getNodeType() == Node.ELEMENT_NODE) {
				Element uneQuestionElement = (Element) listeQuestion.item(e);
				uneQuestion = new Question(uneQuestionElement.getAttribute("texte"), Integer.parseInt( uneQuestionElement.getAttribute("nbProposition")));
				NodeList listeProposition =  uneQuestionElement.getElementsByTagName("Proposition");
		//Chargement des Proposition pour chaque question
				for(int a=0;a<listeProposition.getLength();a++){
					if(listeQuestion.item(a).getNodeType() == Node.ELEMENT_NODE) {
						Element unePropositionElement = (Element) listeProposition.item(a);

						uneProposition = new Proposition(Integer.parseInt( unePropositionElement.getAttribute("id")),unePropositionElement.getAttribute("texte"), Integer.parseInt(unePropositionElement.getAttribute("vrai")));
						uneQuestion.addProposition(uneProposition);
					}
				}
				unNiveau.addQuestion(uneQuestion);
			}
		}
                return unNiveau;
	}
}
	