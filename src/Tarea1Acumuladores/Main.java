package Tarea1Acumuladores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
						
		 int mat3 [][]  = {{0,5,4},
				          {0,10,0},
				          {6,5,0}};
		 
		 int mat1[] = {1,3,2};
		 		 
		 ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 2, 5));
		 
//		12   135
//		34   246
//		56
//		System.out.println(Acumuladores.tieneColIgualaFila(mat3, 1));
//		System.out.println(Acumuladores.recorre0(mat3));
//		Acumuladores.recorre0(mat3);
//		System.out.println(Acumuladores.parImpar1(mat1));
//		System.out.println(Acumuladores.sumaMatriz(mat3));
//		System.out.println(Acumuladores.colSumaFila(mat3, mat1));	
		System.out.println(Acumuladores.cantidades(list));
		}
//		Acumuladores.recorre1(mat3);



}
