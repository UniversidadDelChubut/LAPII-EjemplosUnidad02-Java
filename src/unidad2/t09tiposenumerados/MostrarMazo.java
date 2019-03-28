package unidad2.t09tiposenumerados;

public class MostrarMazo {

	public static void main(String[] args) {
		Mazo mazo = new Mazo();
		Carta c = null;
		while ( (c =  mazo.sacarCarta() )!= null) {
			System.out.println(c);
		}
		
		
		

	}

}
