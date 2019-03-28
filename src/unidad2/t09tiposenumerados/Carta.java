package unidad2.t09tiposenumerados;

public class Carta {
	
	public enum Palo {
		OROS,
		ESPADAS,
		COPAS,
		BASTOS 
	};
	
	public enum Figura {
		AS,
		DOS,
		TRES,
		CUATRO,
		CINCO,
		SEIS,
		SIETE,
		SOTA,
		CABALLO,
		REY
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