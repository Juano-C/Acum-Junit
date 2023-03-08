package Tarea1Acumuladores;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {				
		 int mat3 [][]  = {{0,5,4},
				          {0,10,0},
				          {6,5,0}};
		 
		 int mat1[] = {1,3,2};		 
		 ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 2, 5));

		System.out.println(Acumuladores.tieneColIgualaFila(mat3, 1));
		System.out.println(Acumuladores.parImpar1(mat1));
		System.out.println(Acumuladores.sumaMatriz(mat3));
		System.out.println(Acumuladores.colSumaFila(mat3, mat1));	
		System.out.println(Acumuladores.cantidades(list));
	}
}
