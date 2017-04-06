package unidad2;

import java.util.Random;

public class Bicicleta {
	
	public static final int MAXIMA_CANTIDAD_VELOCIDADES = 88;
	
	private static int cantidadCreadas = 0;
	
	static  {
		//Se ejecuta cuando se carga la calse
		System.out.println("Se carga la clase  " + Bicicleta.class.getName());
	
	}
	
	{
		
		System.out.println("Se ejecuta el inicializador de instancia");
		System.out.println("La bici tiene " + this.cantVelocidades);
		this.cantVelocidades = 5;
		System.out.println("La bici tiene " + this.cantVelocidades);
		
	}

	public Bicicleta() {
		
		// TODO Auto-generated constructor stub
		this(21);
		
	} 
	
	public Bicicleta(int cantVelocidades) {
		// TODO Auto-generated constructor stub
		this.cantVelocidades = cantVelocidades;
	}
	
	private int cantVelocidades = new Random().nextInt(3) + 1;
	
	public int getCantVelocidades() {
		return cantVelocidades;
	}
	
	public static void main(String[] args) {
		new Bicicleta();
	}
	
	
	

}
