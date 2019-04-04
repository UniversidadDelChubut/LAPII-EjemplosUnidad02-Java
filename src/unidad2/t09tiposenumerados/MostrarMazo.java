package unidad2.t09tiposenumerados;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MostrarMazo {

	public static void main(String[] args) {
		/*
	
		List<String> cadenas = new LinkedList<String>();
		
		cadenas.add("pepe");
		cadenas.add("coso");
		cadenas.add("momo");
		cadenas.add("jose");
		for (String s: cadenas) {
			System.out.println(s);
		}
		System.out.println("Ordenada");

		Collections.sort(cadenas);
		for (String s: cadenas) {
			System.out.println(s);
		}
	*/
		
		Mazo mazo = new Mazo();
		Carta c = null;
		while ( (c =  mazo.sacarCarta() )!= null) {
			System.out.println(c);
		}
		System.out.println("MEZCLA");
		mazo = new Mazo();
		mazo.mezclar();
		
		
		List <Carta> todas = new LinkedList<>();
		while ( (c =  mazo.sacarCarta() )!= null) {
			todas.add(c);
		}
		
		Collections.sort(todas, new ComparadorTruco());
		
		
		
		
		
		for( Carta carta : todas ) {
			System.out.println(carta);
		}
		
		
		

	}

}
