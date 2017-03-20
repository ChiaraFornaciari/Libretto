package it.polito.tdp.model;

import java.util.ArrayList;
import java.util.List;

public class Model {

	private List<Esame> esami;
	
	public Model(){
		this.esami= new ArrayList<Esame>();
	}
	/**
	 * Aggiunge un nuovo esame all'elenco degli esami presenti, verificando che non ci sia già
	 * @param e
	 */
	public boolean addEsame(Esame e){  // se restituisco un boolean so se ho inserito qualcosa di giusto o no, lo segnalo 
		if(!esami.contains(e)){
		esami.add(e);
		return true;
		}else
			return false;
	}
	/**
	 * Ricerca se esiste un esame con il codice specificato.
	 * Se esiste, lo restituisce, altrimenti restituisce null
	 * @param codice codice dell'esame da ricercare
	 * @return l'esame trovato oppure null se non trovato
	 */
	public Esame trovaEsame(String codice){
		int pos = esami.indexOf(new Esame(codice, null, null));    //devo passargli un oggetto dello stesso tipo della lista 
		if(pos==-1)
			return null;
		else
			return esami.get(pos);
	}
	
	
}


