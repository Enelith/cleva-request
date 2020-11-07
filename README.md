# cleva-request

Projet utilisé pour interroger la BDD Cleva (SELECT uniquement) en mode API

==========================================

CUSTOM JPA : 

Controller -> Business -> Service -> Repository

Pour initialiser des méthodes custom dans un JPA, 
Créer une interface qui va étendre à la fois le JPA Repository (pure), et une classe custom (ici FPolicesCustomRepository & FPolicesCustomRepositoryImpl)

/!\ : l'implémentation de l'interface custom DOIT se terminer en IMPL (Framework Spring) pour être pris en compte