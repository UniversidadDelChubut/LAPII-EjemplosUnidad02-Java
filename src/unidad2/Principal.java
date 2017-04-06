package unidad2;

import java.util.Random;

import unidad2.Lista.Iterador;

public class Principal {

	public Principal() {
		Lista <String> listaEstudiantes  = new Lista<String>();
		Lista <Integer>listaEnteros = new Lista<Integer>();
	
		
		listaEstudiantes.add("Pablo \"Doblemente enlazada\" Carro");
		listaEstudiantes.add("Franco Vera");
		listaEstudiantes.add("Macarena García Arcija");
		
		listaEnteros.add(2);
		listaEnteros.add(new Integer (3));
		
	
		
		
		
		
		System.out.println("Cant estudiantes" + listaEstudiantes.size());
		System.out.println("Cant enteros" + listaEnteros.size());
		
		
		Iterador  i = listaEstudiantes.getIterador();
		Iterador  i2 = listaEstudiantes.getIterador();
				
		if(i.hasMoreElements()) {
			String estudiante = (String) i.nextElement();
			System.out.println("Estudiante " + estudiante );
		}

		if(i.hasMoreElements()) {
			String estudiante = (String) i.nextElement();
			System.out.println("Estudiante " + estudiante );
		}

		if(i2.hasMoreElements()) {
			String estudiante = (String) i2.nextElement();
			System.out.println("Estudiante " + estudiante + " de it 2");
		}
		
		
	}
	
	public static void main(String[] args) {
		//new Principal();
		

			System.out.println("Se va crear una bici");
			Bicicleta bici = new Bicicleta();
			System.out.println("Se creo una bici de " + bici.getCantVelocidades() + " velocidades");
	
			Pelota pelota1 = Pelota.getPelota();
			Pelota pelota2 = Pelota.getPelota();
			
			Pelota[] pelotas  = {Pelota.getPelota(), Pelota.getPelota(), Pelota.getPelota()};
			
			System.out.println(new Random().nextInt(67));

	}
	
	
	

}
