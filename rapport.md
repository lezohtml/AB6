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
Le design est composé de 4 JPanel:
  - Un pour le nord
  - Un pour le centre
  - Un pour le sud
  - Un qui transforme
    
Le JPanel du Nord contiendra un JLabel pour la question.
Au milieu le JPanel contiendra la progresse bar avec le temps laisser à l’enfant pour répondre, et qui contient  plusieurs JLabel qui permettront de voir le nombre de vies restantes.
Le JPanel au Sud contiendra  4 JButton qui sont les plusieurs propositions de réponse, une seule est correcte.
Le dernier JPanel permettra de disposer c’est ligne en colonne.


## L'évolution :

La question qui tombe style Tetris (enlève le timer)
Faciliter l'ajout de questions pour les professeurs 
  - Designe --> Pour l’instant nous avons fait une progresse bar avec un système de vie, dans le futur il faudrait changer cela  pour faire tomber des petits objets qui s’imbriquent (tétris), le temps qui permet à l’objet de descendre pourrait être proportionnelle au niveau de l’enfant.
  - Niveau de l’enfant --> dans les progressions nous pensions pouvoir mettre en place un système de niveau, une petite fenêtre s’ouvrirait au lancement de l’application et l’enfant choisirait son niveau, et en fonction de cela, grâce à une propriété mise dans le xml, nous chargerions les questions en fonction du niveau. Si l’enfant veut changer de niveau par la suite, un choix sera possible dans le menu du haut.
  - Difficulté --> Si l’enfant retombe sur une même question où il s’est déjà trompé, alors le timer devient un peu plus long pour laisser à l’enfant plus de temps, ou alors, en fonction du souhait  du supérieur, un choix de réponse rétrécie.
  - Système de vie --> en fonction du niveau l’enfant peu commencé avec plus ou moins de vie au départ.


