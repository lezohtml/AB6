# Rapport du projet AB6 : 

## Sujet :

### Un jeu pédagogique : 
Le jeu que nous avions pour but de développer vise les enfants de 4 à 11 ans. Soit de la maternelle à la classe de sixième. Nous devions alors prévoir des questions pour les différents niveaux. Le but était de faire travailler les leçons apprises en classe à la maison de façon ludique, sous forme d'un jeu. Nous avons dès le début de la mise en place du projet, oublier les points, comme est actuellement le cas dans les programmes de l'Éducation Nationale. Nous avons décidé de mettre en place un système de "vies" comme il existe déjà dans les jeux actuels comme Mario, Crash, ... Une mauvaise réponse entraine la perte d'une "vie". L'enfant dispose d'un nombre de 10 vies lors du lancement de la partie.  
Il dispose aussi d'un nombre de temps limité pour répondre à chaque question. Ce temps est différent en fonction du niveau/classe de l'enfant. Un élève de CP a 20 secondes pour répondre à la question tandis qu'un élève de CM2 ne dispose que de 10 secondes. Bien sûr ce temps est modifiable dans le fichier XML qui contient les niveaux (§niveaux). 


### Choix du Java 

### Modulable :
Changement des questions / niveaux / temps 

## Code :

### Le fichier contenant les niveaux et les questions :
Le fichier *questions.xml* contient les différentes questions réparties dans différents niveaux. La synthaxe est la suivante :  
    <Niveau id="1" nom="CP" temps="20" >
        <Question texte="Question ?" nbProposition="2">
            <Proposition id="1" texte="Reponse 1" vrai="1">
            <Proposition id="2" texte="Reponse 2" vrai="0">
        </Question>
    </Niveau>  
La balise *<Niveau>* contient les différentes questions qui appartiennent à ce niveau. Les paramètres sont les suivants :
  - id : qui permet d'identifier le niveau
  - nom : qui contient le nom du niveau (CP, CE1, CE2, ...)
  - temps : c'est le temps dont dispose l'élève pour chaque question de ce niveau.
La balise *<Question>* contient la question ainsi que les propositions de réponse.  
  - texte : contient la question
  - nbProposition : contient le nombre de réponses (fausses ou vraies) que contient la question  
La balise *<Proposition>* contient une proposition  
  - id : identifiant de la proposition
  - texte : contient le texte de la réponse/proposition
  - vrai : ce paramètre permet de savoir quelle proposition est vraie (1) ou fausse (0)  
  
Les questions ainsi que les niveaux peuvent tout aussi bien être rentrées dans une base de données ...

### La lecture du fichier XML

### Le design 


## L'évolution :

La question qui tombe style Tetris (enlève le timer)
Faciliter l'ajout de questions pour les professeurs 

