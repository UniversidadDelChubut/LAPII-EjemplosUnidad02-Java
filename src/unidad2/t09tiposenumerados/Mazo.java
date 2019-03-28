package unidad2.t09tiposenumerados;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import unidad2.t09tiposenumerados.Carta.Figura;
import unidad2.t09tiposenumerados.Carta.Palo;

public class Mazo {
	
	List<Carta> cartas = new LinkedList<>(); 
	
	public Mazo() {
		for (Palo palo: Palo.values()) {
			for (Figura figura: Figura.values()) {
				Carta carta = new Carta(palo, figura);
				this.cartas.add(carta);
			}
		}
	}
	
	public void mezclar () {
		Collections.shuffle(this.cartas);
	}
	
	public Carta sacarCarta() {
		return this.cartas.size() == 0 ? null: this.cartas.remove(0);
	}
	

}
