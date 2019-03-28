package unidad2.t09tiposenumerados;

public class Carta {
	
	public enum Palo {
		OROS,
		ESPADAS,
		COPAS,
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
	
	private Palo palo;
	private Figura figura;
	
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


/*

enum dia_de_la_semana
{
	lunes, martes, miercoles, jueves, viernes, 	sabado, domingo
};


...

enum dia_de_la_semana hoy;


...

hoy = sabado;



Los valores definidos en enum son constantes enteras que se pueden usar en cualquier punto del programa, usando un operador de moldeo (ver ejemplo).
Se empiezan a numerar de cero en adelante (en el ejemplo, lunes vale cero, martes vale uno, etc.)

int dia = (int)sabado;	// dia = 5 


*/