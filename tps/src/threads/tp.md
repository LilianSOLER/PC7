# Mini Project Threads

## 5 - Compréhension d’un petit programme multi-threadé

- Est-ce que la trace « End of program » peut s’afficher avant les traces «.. completed» ?
    - Non, car la trace « End of program » est affichée par le thread principal après avoir attendu la fin de tous les
      autres threads (loop join).
- Est-ce que les traces « .. says ..» peuvent s’entrelacer entre les différents threads ?
    - Oui, si le quantum de temps est faible, les threads peuvent s’interrompre entre les traces.
- Est-ce qu’une trace « .. says..» peut être tronquée (ne pas s’afficher complètement) ?
    - Non, car les threads affichent leurs traces avant de laisser la main aux autres threads (yield).

## 6- Ecriture d’un petit programme multi-threadé

- Ecrire un programme Java qui crée un thread par héritage et un autre par délégation. Chaque
  thread crée affiche son nom, puis s’endort pendant 3 secondes et affiche un message de fin
  avant de terminer. Le thread principal attend la fin des deux fils et affiche « That’s all folks ».
  Si le temps le permet, exécuter ce programme sous Eclipse.

## 7. Threads et Interruptions

- Reprendre le programme précédent, et faire en sorte que le thread principal interrompe l’un
  des deux threads créés au bout d’environ 1 seconde d’exécution. Au niveau de chaque thread,
  afficher un message particulier si la sortie du Sleep() a été provoquée par une interruption.

## 8. Paralléliser un traitement sur des objets

- Etant donné le programme séquentiel ci-après, écrire une (ou plusieurs) versions parallèles,
  dans lesquelles le traitement effectué sur chaque objet est réalisé par un thread différent.
  Si le temps le permet, exécuter votre programme dans Eclipse en mode debug. Placez un
  point d’arrêt au début de votre méthode main, et suivez en pas à pas. Voyez comment Eclipse
  montre les threads en cours (on peut voir leur état courant et leur pile d’exécution).
- De manière générale, quelles sont les conditions dans lesquelles ce schéma de traitement
  parallèle s’applique ?
