package unidad2.visibilidad.otropaquete;

import unidad2.visibilidad.TestA;

public class HijoDeA extends TestA {

	public HijoDeA() {
		// TODO Auto-generated constructor stub
		this.metodoProtegido();
	}
	
	
	public void metodoFoo(HijoDeA otroHijoDeA, TestA testA) {
		
		this.metodoProtegido();
		otroHijoDeA.metodoProtegido();
		testA.metodoPublico();
		//testA.metodoProtegido();
		
	}

}
