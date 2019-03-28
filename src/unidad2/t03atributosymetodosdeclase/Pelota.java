package unidad2.t03atributosymetodosdeclase;

public class Pelota {
	
	private static Pelota pelota = new Pelota();
	
	public static Pelota getPelota() {
		return Pelota.pelota;
	}

	
	private Pelota() {
		// TODO Auto-generated constructor stub
	}

}
