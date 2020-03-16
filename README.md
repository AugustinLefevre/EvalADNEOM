# EvalADNEOM

# Sujet du test

1 - Écrivez une fonction « partition » qui prend un paramètre « liste » et un paramètre « taille » et retourne une liste de sous liste, où chaque sous liste a au maximum « taille » éléments.
Exemples d'entrées et sorties :
partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ]
partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ]
partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ]

2 - Écrivez des tests unitaires avec Junit4 pour vérifier votre implémentation.
Important : Partez du principe que votre implémentation fera partie d'une librairie utilisé par plein d'autres applications (en production)
Livraison attendu : une archive contenant les sources du projet, et les instructions pour les utiliser.

# Instruction deploiement

Dans eclipse cliquez sur l'onglet Window / Show View / Other. Puis selectionner Git / Git repositoties

Dans la fenetre Git repositories cliquez sur l'icone "Clone a git repositories and add the clone to this view"

remplisser les champ:
URI : "https://github.com/AugustinLefevre/EvalADNEOM".
HOST : github.com
Repositotry path : /AugustinLefevre/EvalADNEOM

Cliquez sur "Finish"

Dans la fenetre "Git repositories" faites un clique droit sur votre repertoire et selectionnez "Import project" 
Cochez le dossier EvalADNEOM/ADNEOMEval puis cliquez sur "Finish"

Ouvrez la fenetre "Project explorer", dans le projet ADNEOMEval.
la solution a l'exercice ce trouve dans le package src/com.ADNEOMEval.augustinLefevre.copy
Faites un clique droit sur la classe test "TestSolution.java" et selectionner "Run as" puis "JUnit4".
