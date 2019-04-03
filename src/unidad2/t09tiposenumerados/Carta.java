package unidad2.t09tiposenumerados;

public class Carta {
	
	public enum Palo {
		OROS,
		COPAS,
		ESPADAS,
		BASTOS 
	};	
	
	public enum Figura {
		AS(1),
		DOS(2),
		TRES(3),
		CUATRO(4),
		CINCO(5),
		SEIS(6),
		SIETE(7),
		SOTA(10),
		CABALLO(11),
		REY(12);
		
		private final int valor;
		
		private Figura(int valor) {
			this.valor = valor;
		}
		
		public int getValor() {
			return valor;
		}
		
		
	};
	
	private final Palo palo;
	private final Figura figura;
			
	public Carta(Palo palo, Figura figura) {
		this.palo = palo;
		this.figura = figura;
	}

	public Palo getPalo() {
		return palo;
	}
	
	public Figura getFigura() {
		return figura;
	}
	
	@Override
	public String toString() {
		return this.getFigura().name() + " DE " + this.getPalo().name();
	}
	
}
