package unidad2;

import java.util.Random;

import unidad2.t03atributosymetodosdeclase.Pelota;
import unidad2.t06clasesinternas.Lista;
import unidad2.t06clasesinternas.Lista.Iterador;

/**
 * Unidad 2: Clases en Java - Temario
 *   01. Declaración de clases. Atributos y métodos. 
 *   02. Paquetes. Modificadores de acceso. 
 *   03. Atributos y métodos de clase. 
 *   04. Instanciación. Carga de clases. Inicalizadores estáticos y de instancia. 
 *   05. Clases de envoltura, autoboxing y autounboxing. 
 *   06. Clases internas. 
 * 	 07. Garbage collecting. 
 * 	 08. Introspección. 
 * 	 09. Tipos Enumerados.
 *  
 * @author sadellatorre
 * 
 */
public class Principal {
	
	public static void main(String[] args) {

		Principal.ejemploDeBiciletas();
		Principal.ejemploDeSingleton();
		Principal.ejemploDeListas();

	}
	
	public static void ejemploDeBiciletas() {
		System.out.println("Se va crear una bici");
		Bicicleta bici = new Bicicleta();
		System.out.println("Se creo una bici de " + bici.getCantVelocidades() + " velocidades");
	}
	
	public static void ejemploDeSingleton() {
		Pelota pelota1 = Pelota.getPelota();
		Pelota pelota2 = Pelota.getPelota();
		Pelota[] pelotas  = {Pelota.getPelota(), Pelota.getPelota(), Pelota.getPelota(), pelota1, pelota2 };
	}

	public static void ejemploDeListas() {
		
		Lista <String> listaEstudiantes  = new Lista<String>();
		Lista <Integer>listaEnteros = new Lista<Integer>();
		
		listaEstudiantes.add("Mariano Gómez");
		listaEstudiantes.add("Franco Vart");
		listaEstudiantes.add("Norberto García");
		listaEstudiantes.add("Diana García");
		
		listaEnteros.add(2);
		listaEnteros.add(new Integer (3));
		
		System.out.println("Cant estudiantes " + listaEstudiantes.size());
		System.out.println("Cant enteros " + listaEnteros.size());
		
		for (String estudiante: listaEstudiantes) {
			System.out.println(estudiante);
		}
		
	}
	
	
	

}
