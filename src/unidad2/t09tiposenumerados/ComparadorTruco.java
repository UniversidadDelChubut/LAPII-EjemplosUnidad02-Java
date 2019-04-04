package unidad2.t09tiposenumerados;

import java.util.Comparator;

import unidad2.t09tiposenumerados.Carta.Figura;
import unidad2.t09tiposenumerados.Carta.Palo;

public class ComparadorTruco implements Comparator<Carta> {

	@Override
	public int compare(Carta c1, Carta c2) {
		return this.getPeso(c1) - this.getPeso(c2);
	}
	
	private int getPeso(Carta c) {
		if (c.soy (Figura.AS, Palo.ESPADAS))
			return 20;
		if (c.soy (Figura.AS, Palo.BASTOS))
			return 19;
		if (c.soy (Figura.SIETE, Palo.ESPADAS))
			return 18;
		if (c.soy (Figura.SIETE, Palo.OROS))
			return 17;
		if (c.getFigura().equals(Figura.TRES))
			return 16;
		if (c.getFigura().equals(Figura.DOS))
			return 15;
		if (c.getFigura().equals(Figura.AS))
			return 14;
		return c.getFigura().getValor();
	}
}
