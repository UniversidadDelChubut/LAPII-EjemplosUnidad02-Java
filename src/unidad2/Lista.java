package unidad2;

public class Lista <E> {
	
	private Nodo cabecera;
	
	public Lista() {
		
	}
	
	/*
	public Lista(Lista original) {
		
	}
	*/
	
	public void add (E elemento) {
		Nodo nuevo = new Nodo();
		nuevo.dato = elemento;
		if (this.cabecera == null) {
			this.cabecera = nuevo;
		} else {
			this.ultimoNodo().siguiente = nuevo;
		}
	}
	
	private Nodo ultimoNodo() {
		Nodo n = this.cabecera;
		while (n != null && n.siguiente != null) {
			n = n.siguiente;
		}
		return n;
	}
	
	
	public int size() {
		int count = 0;
		Nodo n = this.cabecera;
		while (n != null) {
			count++;
			n = n.siguiente;
		}
		return count;
		
	}

	public class Nodo <E> {
		
		private E dato;
		private Nodo siguiente;
		
		
	}

	public Iterador <E> getIterador() {
		return new Iterador <E>();
	}
	
	
	public class Iterador  <E>{
		private Nodo <E> nodoActual = Lista.this.cabecera;
		
		public E nextElement() {
			E valor = null;
			if( nodoActual != null) {
				valor = nodoActual.dato;
				nodoActual = nodoActual.siguiente;
			}
			return valor;
		}
		
		public boolean hasMoreElements() {
			return nodoActual != null;
		}
		
		
	}
		
}




