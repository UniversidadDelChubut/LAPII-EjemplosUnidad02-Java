package unidad2;

public class Pelota {
	
	private static Pelota pelota = new Pelota();
	
	public static Pelota getPelota() {
		return Pelota.pelota;
	}

	
	private Pelota() {
		// TODO Auto-generated constructor stub
	}

}
