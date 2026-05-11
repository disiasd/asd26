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

Per testare le strutture dati UnionFind, compilare UnionFindTest.java ed eseguire
- java UnionFindTest data/roadNET-TX.txt
- elaborerà la descrizione delle strade del Texas descritte come collegamenti fra incroci (numerati da 0 a 1393382). Successivamente, da terminale si possono inserire coppie di incroci, e il programma indicherà se tali incroci sono collegati oppure no. Ad esempio, potete provare con le coppie 1393132, 1393133 e 1393132,432567 che sono rispettivamente collegate e non collegate. Per testare le quattro possibili implementazioni bisogna modificare il file UnionFindTest.java alla riga 72, eseguendo una new su QuickFind, QuickUnion, QuickFindSize, QuickUnionRank. Attenzione, l'implementazione QuickFind impiega molto più tempo rispetto a tutte le altre per completare l'analisi del file di input.

Per testare l'implementazione dei grafi, compilare GraphTest.java ed eseguire
- java GraphTest data/grafo.txt 
- produrrà un grafo non orientato completo con 3 vertici e lo stamperà, poi rimuoverà il primo arco del primo vertice e lo ristamperà e poi rimuoverà completamente il primo vertice e lo ristamperà

Per testare l'implementazione delle visite dei grafi, compilare GraphVisitTest.java ed eseguire
- java GraphVisitTest data/roadNet-TX.txt
- leggerà il file data/roadNet-TX.txt poi stamperà il grafo letto e l'albero di visita BFS partendo dal vertice 0. Successivamente, per testare anche la visita DFS, decommentare da riga 76 a riga 89, ricompilare ed eseguire con "java -Xss1g GraphVisitTest data/roadNet-TX.txt" per calcolare e stampare anche l'albero di visita DFS. Il parametro -Xss1g serve per aumentare lo spazio dedicato allo stack in modo tale da evitare errori di tipo StackOverflow durante l'esecuzione ricorsiva della DFS

Per testare l'implementazione degli algoritmi per il calcolo del MST, compilare MSTTest.java ed eseguire
- java MSTTest data/grafoMST.txt 
- leggerà dal file grafoMST.txt un grafo scaricato da Kaggle (https://www.kaggle.com/datasets/anshikasharmacseai/500-cities-distance-daatset) usato come test di algoritmi per il MST, poi stamperà il minimum spanning tree calcolato ed il suo costo totale. Per testare le possibili implementazioni bisogna modificare il file MSTTest.java alla riga 82, eseguendo una new su Kruskal e Prim.

Per testare l'implementazione degli algoritmi per il calcolo dei cammini minimi da singola sorgente, compilare ShortestPathTest.java ed eseguire
- java ShortestPathTest data/grafoMST.txt 
- leggerà il grafo rappresentato nel file grafoMST.txt, poi stamperà le distanze dei vertici rispetto al vertice di partenza 0 ed il tempo di esecuzione dell'algoritmo di ricerca dei cammini minimi. Per testare le possibili implementazioni bisogna modificare il file ShortestPathTest.java alla riga 79, eseguendo una new su BellmanFord e Dijkstra.

Per testare l'implementazione dell'algoritmo di Floyd-Warshall compilare AllPairsShortestPathTest.java ed eseguire
- java AllPairsShortestPathTest data/grafoMST.txt 
- leggerà il grafo rappresentato nel file grafoMST.txt, calcolerà tutti i cammini minimi per ogni coppia di vertici, e poi si concentrerà solo sul vertice di partenza 0 e stamperà le distanze di tutti i vertici da esso (in modo tale da produrre lo stesso output del test dei cammini minimi da singola sorgente).

## Progetto: Componenti Fortemente Connesse (SCC)

### Descrizione

Il progetto consiste nell'implementazione di un algoritmo per il calcolo delle **Componenti Fortemente Connesse** (Strongly Connected Components, SCC) di un grafo orientato.

### File rilevanti

| File | Ruolo |
|------|-------|
| `algorithm/graph/SCC/SCC.java` | Interfaccia che definisce il metodo `StronglyConnectedComponents` — **non modificare** |
| `algorithm/graph/SCC/SCCcompute.java` | Classe scheletro da **implementare**: il metodo restituisce attualmente `null` |
| `GraphSCCTest.java` | Programma di test già pronto — **non modificare** |

### Cosa implementare

Nella classe `SCCcompute<D>` (file `algorithm/graph/SCC/SCCcompute.java`), completate il metodo:

```java
public Map<Vertex<D>, Integer> StronglyConnectedComponents(Graph<D> graph)
```

Il metodo deve restituire una `Map` che associa ad ogni `Vertex<D>` del grafo un `Integer` che rappresenta l'**indice** della sua componente fortemente connessa. Vertici che appartengono alla **stessa** componente devono avere lo **stesso** indice; vertici di componenti diverse devono avere indici diversi.


### Compilazione

Dalla **directory radice** del package (quella contenente `GraphSCCTest.java`), compilare con:

```bash
javac GraphSCCTest.java
```

Questo compila automaticamente anche tutti i file dipendenti (`SCC.java`, `SCCcompute.java` e le classi del package `datastructure`).

### Esecuzione

```bash
java GraphSCCTest data/roadNet-TX.txt
```

Il programma:
1. Legge il grafo dal file `data/roadNet-TX.txt` (archi tab-separati, uno per riga)
2. Costruisce il grafo orientato corrispondente
3. Invoca il vostro metodo `StronglyConnectedComponents`
4. Stampa per ogni vertice: `<dato_vertice> , <indice_SCC>`


**Nota sul dataset:** nel file `data/roadNet-TX.txt` la stragrande maggioranza dei vertici appartiene alla medesima componente (componente gigante), ma esistono centinaia di altre piccole componenti.

### Gestione dello StackOverflow su grafi grandi

Se la vostra implementazione è **ricorsiva**, su grafi di grandi dimensioni può verificarsi un errore `StackOverflowError`. In tal caso, aumentare lo spazio dedicato allo stack con il parametro `-Xss`:

```bash
java -Xss1g GraphSCCTest data/roadNet-TX.txt
```

Per generare tutta la documentazione in formato html:
- creare una directory <i>doc/</i> allo stesso livello delle directory <i>algorithm/</i> e <i>datastructure/</i>
- entrare nella directory <i>doc/</i>
- eseguire: javadoc ../algorithm/\*/\*.java ../datastructure/\*/\*.java
