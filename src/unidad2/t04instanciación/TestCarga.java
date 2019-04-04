package unidad2.t04instanciación;

import java.util.Random;

public class TestCarga {
	
	private static final int enteroEnClase;
	private static final String cadenaEnClase;
	private static final char caracterEnClase;
	
	private String atributo = cadenaEnClase;
	
	static {
		Random rnd = new Random();
		enteroEnClase = rnd.nextInt(10);
		caracterEnClase = (char) ('a' + rnd.nextInt(10));
		String s = "";
		char c = caracterEnClase;
		for (int i = 0; i < enteroEnClase; i++) {
			s += (char) c++;
		}
		cadenaEnClase = s;
		System.out. println("Se asigna la cadena " + s);
	}
	
	{
		this.atributo += "_I";
	}
	
	public TestCarga() {
		this.atributo += "_C1";
	}
	
	public TestCarga(String posfijo) {
		this();
		this.atributo += "_C2_" + posfijo;
	}
	
	public String getAtributo() {
		return atributo;
	}
}
