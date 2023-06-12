package Metodi;

public class Metodi {

//	public Integer calcolaConnesse() {
//		ConnectivityInspector<People, DefaultEdge> inspector = new ConnectivityInspector<>(this.grafo);
//		return inspector.connectedSets().size();
//	}
	
	
	
	
	
//	public Integer calcolaConnessa(Integer objId) {
//		DepthFirstIterator<ArtObject, DefaultWeightedEdge> iterator = new DepthFirstIterator<>(this.graph,this.idMap.get(objId));
//		List<ArtObject> compConnessa = new ArrayList<>();
//		while(iterator.hasNext()) {
//			compConnessa.add(iterator.next());
//		}
//		return compConnessa.size();
//	}
	
	
	
	
	
//	public Integer getPesoConnesse(Retailers r) {
//		ConnectivityInspector<Retailers, DefaultWeightedEdge> insp = new ConnectivityInspector<>(grafo);
//		Set<Retailers> connesse = insp.connectedSetOf(r);
//		int n = 0;
//		for(DefaultWeightedEdge arco : this.grafo.edgeSet()) {
//			if(connesse.contains(this.grafo.getEdgeSource(arco)) && connesse.contains(this.grafo.getEdgeTarget(arco)))
//			n+=(int)this.grafo.getEdgeWeight(arco);
//		}
//		return n;
//	}
	
	
	
	
	
//	public List<Grado> gradoMassimo() {
//		List<Grado> list = new ArrayList<>();
//		int bestGrado = 0;
//		for(People p : this.vertici) {
//			int grado = grafo.degreeOf(p);
//			if(grado==bestGrado) {
//				list.add(new Grado(p,grado));
//			}
//			else if(grado>bestGrado) {
//				list.clear();
//				list.add(new Grado(p,grado));
//				bestGrado=grado;
//			}
//		}
//		return list;
//	}
	
	
	
	
	
//	public List<bilancioAlbum> getAdiacenti(Album a){
//		List<Album> successori = Graphs.successorListOf(this.graph, a);
//		List<bilancioAlbum> bilancioSuccessori = new ArrayList<>();
//		for(Album al : successori) {
//			bilancioSuccessori.add(new bilancioAlbum(al,getBilancio(al)));
//		}
//		bilancioSuccessori.sort(null);
//		return bilancioSuccessori;
//	}
	
	
	
	
	
//	private int getBilancio(Album a) {
//		int bilancio = 0;
//		List<DefaultWeightedEdge> edgesIn = new ArrayList<>(this.graph.incomingEdgesOf(a));
//		List<DefaultWeightedEdge> edgesOut = new ArrayList<>(this.graph.outgoingEdgesOf(a));
//		for(DefaultWeightedEdge edge : edgesIn) {
//			bilancio += this.graph.getEdgeWeight(edge);
//		}
//		for(DefaultWeightedEdge edge : edgesOut) {
//			bilancio -= this.graph.getEdgeWeight(edge);
//		}
//		return bilancio;
//	}
	
//	public boolean esistePercorso(Airport origin, Airport destination) {
//		ConnectivityInspector<Airport, DefaultWeightedEdge> inspect = new ConnectivityInspector<Airport, DefaultWeightedEdge>(this.grafo);
//		Set<Airport> componenteConnessaOrigine = inspect.connectedSetOf(origin);
//		return componenteConnessaOrigine.contains(destination);
//	}
	
	
	
	
	
//	public List<Airport> trovaPercorso(Airport origin, Airport destination){
//		List<Airport> percorso = new ArrayList<>();
//	 	BreadthFirstIterator<Airport,DefaultWeightedEdge> it = new BreadthFirstIterator<>(this.grafo, origin);
//	 	Boolean trovato = false;
//	 	
//	 	//visito il grafo fino alla fine o fino a che non trovo la destinazione
//	 	while(it.hasNext() & !trovato) {
//	 		Airport visitato = it.next();
//	 		if(visitato.equals(destination))
//	 			trovato = true;
//	 	}
//	 
//	 
//	 	/* se ho trovato la destinazione, costruisco il percorso risalendo l'albero di visita in senso
//	 	 * opposto, ovvero partendo dalla destinazione fino ad arrivare all'origine, ed aggiiungo gli aeroporti
//	 	 * ad ogni step IN TESTA alla lista
//	 	 * se non ho trovato la destinazione, restituisco null.
//	 	 */
//	 	if(trovato) {
//	 		percorso.add(destination);
//	 		Airport step = it.getParent(destination);
//	 		while (!step.equals(origin)) {
//	 			percorso.add(0,step);
//	 			step = it.getParent(step);
//	 		}
//		 
//		 percorso.add(0,origin);
//		 return percorso;
//	 	} else {
//	 		return null;
//	 	}
//		
//	}
	
	
	
	
	
//	public List<Fermata> percorso(Fermata partenza, Fermata arrivo) {
////		//visita il grafo partendo da "partenza"
////		BreadthFirstIterator<Fermata,DefaultWeightedEdge> visita = new BreadthFirstIterator<>(grafo,partenza);
////		List<Fermata> raggiungibili = new ArrayList<>();
////		while(visita.hasNext()) {
////			Fermata f = visita.next();
//////			raggiungibili.add(f);
////		}
//////		System.out.println(raggiungibili);
////		
////		//Trova il percorso sull'albero di visita
////		List<Fermata> percorso = new ArrayList<>();
////		Fermata corrente = arrivo;
////		percorso.add(arrivo);
////		DefaultWeightedEdge e = visita.getSpanningTreeEdge(corrente);
////		while(e!=null) {
////			Fermata precedente = Graphs.getOppositeVertex(grafo, e, corrente);
////			percorso.add(0,precedente);
////			corrente = precedente;
////			e = visita.getSpanningTreeEdge(corrente);
////		}
//		DijkstraShortestPath<Fermata, DefaultWeightedEdge> sp = new DijkstraShortestPath<>(grafo);
//		GraphPath<Fermata,DefaultWeightedEdge> gp = sp.getPath(partenza, arrivo);
//		
//		return gp.getVertexList();
//	}
	
	
	
	
	
//	public List<Country> raggiungibili(Country partenza){
//		DepthFirstIterator<Country,DefaultEdge> visita = new DepthFirstIterator<>(grafo,partenza);
//		List<Country> raggiungibili = new ArrayList<>();
//		while(visita.hasNext()) {
//			Country c = visita.next();
//			raggiungibili.add(c);
//		}
//		return raggiungibili;
//	}
}
