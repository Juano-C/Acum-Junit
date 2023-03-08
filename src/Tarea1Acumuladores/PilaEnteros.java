package Tarea1Acumuladores;

import java.util.LinkedList;

public class PilaEnteros {
//	 TAREA PARA EL MARTES 31:
//	 1) Armar un Junit para probar los métodos de PilaEnteros
//	 2) Hacer una implementacion diferente (con otra representacion)
//	 3) Probar que el mismo Junit armado en (1) siga funcionando correctamente
//	    para la nueva implementacion

	LinkedList<Integer> pila;

	public PilaEnteros() 
	{
		pila = new LinkedList<Integer>();
	}
	
	public void apilar(Integer elem)
	{
		pila.addLast(elem);
	}

	public Integer desapilar()
	{
		if (esVacia())
			throw new RuntimeException("La pila esta vacia");
		return pila.removeLast();
	}
	
	public Integer tope()
	{
		if (esVacia())
			throw new RuntimeException("La pila esta vacia");
		return pila.getLast();
	}
	
	public boolean esVacia()
	{
		return pila.isEmpty();
	}
}
