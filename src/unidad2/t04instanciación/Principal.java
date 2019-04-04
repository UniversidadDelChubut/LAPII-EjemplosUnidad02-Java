package unidad2.t04instanciación;

public class Principal {

	public static void main(String[] args) {
		new TestCarga();
		new TestCarga();
		
		System.out.println( new TestCarga().getAtributo());
		System.out.println( new TestCarga("KUNGFU").getAtributo());
	}
	
}
