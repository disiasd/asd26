Repository della libreria di algoritmi e strutture dati per il corso di "Algoritmi e Strutture di Dati" AA.2025-2026 del Dipartimento di Informatica - Scienza e Ingegneria dell'Università di Bologna. La libreria contiene classi di test, interfacce e classi parzialmente implementate che dovrebbero essere completate dagli studenti. Fare riferimento al materiale disponibile sulla pagina web del corso su [Virtuale](https://virtuale.unibo.it/course/view.php?id=70234) per il background teorico e per le specifiche implementative.

Per testare gli algoritmi di ordinamento su array di interi, compilare SortingTest.java ed eseguire
- java SortingTest data/list.random.txt mergesort
- java SortingTest data/list.random.txt quicksort
- ...

Per testare gli algoritmi di ordinamento generici, compilare GenericSortingTest.java ed eseguire
- java GenericSortingTest data/list.random.txt mergesort
- java GenericSortingTest data/list.random.txt quicksort
- ...

Per testare la struttura dati Lista, compilare ListTest.java ed eseguire
- java ListTest data/ListOperations.txt
- Confrontare l'ouptut con il contenuto del file data/ListOperations.log.txt

Per testare la struttura dati Coda, compilare QueueTest.java ed eseguire
- java QueueTest data/QueueOperations.txt
- Confrontare l'ouptut con il contenuto del file data/QueueOperations.log.txt

Per testare la struttura dati Pila, compilare StackTest.java ed eseguire
- java StackTest data/StackOperations.txt
- Confrontare l'ouptut con il contenuto del file data/StackOperations.log.txt

Per testare le strutture dati Albero Binario di Ricerca e Albero AVL compilare TreeTest.java ed eseguire
- java TreeTest data/TreeOperations.txt BST
- java TreeTest data/TreeOperations.txt AVL
- Confrontare l'ouptut con il contenuto del file data/TreeOperations.BST.log.txt per verificare l'implementazione dell'Albero Binario di Ricerca
- Confrontare l'ouptut con il contenuto del file data/TreeOperations.AVL.log.txt per verificare l'implementazione dell'Albero AVL

Per testare le strutture dati Dizionario implementata con Alberi AVL, compilare DictionaryTest.java ed eseguire
- java DictionaryTest data/DictionaryOperations.txt AVL
- Confrontare l'output con il contenuto del file data/DictionaryOperations.AVL.log.txt

Per confrontare i tempi di calcolo di tre differenti implementazioni della struttura dati dizionario, HashMap (libraria Java), HashTable (implementazione con concatenamento) e AVLDictionary (implementazione con Alberi AVL), compilare DictionarySpeedTest.java ed eseguire
(il parametro intero 1000000 indica il numero di coppie (key,data) generate randomicamente):
- java DictionarySpeedTest 1000000

Per testare le strutture dati PriorityQueue, compilare PriorityQueueTest.java ed eseguire
- java PriorityQueueTest data/words.txt data/orderedWords.txt
- produrrà il file data/orderedWords.txt che conterrà tutte le parole nel file data/words.txt ordinate in modo non decrescente rispetto alla loro lunghezza

Per generare tutta la documentazione in formato html:
- creare una directory <i>doc/</i> allo stesso livello delle directory <i>algorithm/</i> e <i>datastructure/</i>
- entrare nella directory <i>doc/</i>
- eseguire: javadoc ../algorithm/\*/\*.java ../datastructure/\*/\*.java
