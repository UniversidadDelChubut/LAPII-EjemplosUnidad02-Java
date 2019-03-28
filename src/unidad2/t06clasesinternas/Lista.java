package unidad2.t06clasesinternas;

import java.util.Iterator;

public class Lista <E> implements Iterable<E> {
	
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

	
	
	public class Iterador  <E> implements Iterator<E>{
		private Nodo <E> nodoActual = Lista.this.cabecera;
		
		@Override
		public boolean hasNext() {
			return nodoActual != null;
		}

		@Override
		public E next() {
			E valor = null;
			if( nodoActual != null) {
				valor = nodoActual.dato;
				nodoActual = nodoActual.siguiente;
			}
			return valor;
		}
		
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new Iterador <E>();
	}
		
}
