/*
*
* Compilare con
*
* javac GraphSCCTest.java
*
* Eseguire con
*
* java GraphSCCTest <FILENAME>
*
* FILENAME e' il nome di un file che contiene la descrizione di un grafo:
* ad ogni riga del file si riportano gli indici di due nodi collegati da un arco
* separati da un TAB. 
* Dopo aver letto il grafo, lo crea, lo stampa, ricerca le componente fortemente
* connesse e stampa per ogni vertice la relativa componente
*
* Nel caso di grafi di grosse dimensioni puo' essere utile eseguire il programma
* con stack aumentato, ad esempio:
* java -Xss1g GraphSCCTest data/roadNet-TX.txt
*/

import java.io.*;
import java.util.*;
import datastructure.graph.*;
import algorithm.graph.SCC.*;
	
public class GraphSCCTest {	
		
	public static void main( String[] args ) {
			
		try {
			
			long start_t, end_t, elapsed, min;
			double sec;
			
			File file = new File(args[0]);
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			ArrayList<Integer> src = new ArrayList<Integer>();
			ArrayList<Integer> dst = new ArrayList<Integer>();
			String st;
			int max=0,s,d,v;
			while ((st = br.readLine()) != null) {
				v = st.indexOf("\t");
				s = Integer.valueOf(st.substring(0,v));
				d = Integer.valueOf(st.substring(v+1));
				if (s>max) max=s;
				if (d>max) max=d;
				src.add(s);
				dst.add(d);
			}
			Graph<Integer> g = new GraphAL<Integer>();
			ArrayList<Vertex<Integer>> nodi = new ArrayList<Vertex<Integer>>(max+1);
			for (int i=0; i<=max; i++) nodi.add(null);
			
			for (int j=0; j<src.size(); j++) {
				s = src.get(j);
				d = dst.get(j);
				if (nodi.get(s) == null) nodi.set(s, g.addVertex(s));
				if (nodi.get(d) == null) nodi.set(d, g.addVertex(d));
				g.addEdge(nodi.get(s),nodi.get(d));
			}
	
			System.out.println("GRAFO LETTO DA FILE");
			System.out.println(g.toString());
						
			System.out.println("Calcolo delle componenti fortemente connesse: vertice , indice componente");
			SCC<Integer> connection = new SCCcompute<Integer>();
			Map<Vertex<Integer>,Integer> scc = connection.StronglyConnectedComponents(g);
			for (int i=0; i<nodi.size(); i++) {
				Vertex<Integer> n = nodi.get(i);
				if (n != null) System.out.println(n.getData()+ " , "+scc.get(n));
			}
					
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
 
 
