package uniad2.autoboxing;

public class AutoBoxingUnboxingTest {

	public AutoBoxingUnboxingTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		int i = 567;
		Integer i2 = new Integer(567);
		Integer i3 = new Integer(567);
		Integer i4 = i;
		int v = i2;
		System.out.println(i2 == i3);
		System.out.println(i2.equals(i3));
		System.out.println(i2 == (int)i3);
		
	}
}
