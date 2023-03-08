package Tarea1Acumuladores;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Acumuladores{

	private static final boolean Integer = false;

	static public boolean todosPares(int[][] mat) {
        if (mat == null)
        	return false;
        
        boolean ret = false;
        for(int i=0; i < mat.length; i++){
            for(int j=0; j < mat[0].length; j++)
                ret = ret || (mat[i][j]%2 == 0);
            }
        return ret;
        }

    // devuelve verdadero si todos los elementos de alguna fila de mat son pares
    static public boolean algunaFilaPar(int[][] mat){
        if (mat == null)
        	return false;
        
        boolean ret = true;
        for(int i=0; i < mat.length; i++){
            for(int j=0; j < mat[0].length; j++)
                ret = ret && (filaPar(mat[i]));
            
            }
        return ret;
    }
    static public boolean filaPar(int [] mat){
        boolean par = false;
        for (int h = 0; h < mat.length; h++){
            par = par || (mat [h] % 2 == 0);
        }
        return par;
    }

	//#devuelve verdadero si alguna fila de mat suma menos que 30
	static public boolean algunaFilaSumaMenosQue30(int[][] mat){
		 if (mat == null)
			 return false;
		 
		boolean sumamas = false;
		for (int i = 0; i < mat.length; i++){
			for (int j = 0; j < mat[0].length; j++)
				sumamas = sumamas || revisaLaSumaDeFilas(mat [i]);
		}
		return sumamas;
	}
	static public boolean revisaLaSumaDeFilas(int [] lista){
		int cont = 0;
		for (int i = 0; i < lista.length; i++) 
			cont = cont + lista[i];
		
		return cont<30;
	}
	
	//devuelve verdadero si alguna columna de mat suma mas que 50
	static public boolean algunaColSumaMasQue50(int[][] mat){
		boolean masque50 = false;
		for (int j = 0; j < mat[0].length; j++)
				masque50 = masque50 || revisaSumaDeCol(mat, j);
		
		return masque50;
	}
	static public boolean revisaSumaDeCol(int [][] mat, int col){
		int contador = 0;
		for (int i = 0; i < mat.length; i++)
			contador = contador + mat[i][col];
		return contador>50;
	}
	
	//devuelve verdadero si alguna fila es par y alguna columna suma mas que 50
 	static public boolean algunaFilaParYColMasQue50(int[][] mat){
		boolean parmasque50 = false;
		for (int i = 0; i < mat.length; i++){
			for (int j = 0; j < mat[0].length; j++)
				parmasque50 = parmasque50 || (filaPar(mat[i]) && revisaSumaDeCol (mat, j));
		}
		return parmasque50;
	}
	
	// devuelve verdadero si alguna fila de mat es igual a lista.
	// Lista tiene tantos elementos como las columnas de mat
	static public boolean algunaFilaIgualLista(int[][] mat, int[] lista){
		boolean igual = false;
		if (mat.length==0 || lista.length ==0)
			return false;
		for (int i = 0; i < mat.length; i++){
			for (int j = 0; j < mat[0].length; j++)
				igual = igual || listasIguales (mat[i], lista);
		}
		return igual;
	}
	static public boolean listasIguales (int [] listauno, int [] listados){
		boolean soniguales = true;
		for (int i = 0; i < listauno.length && soniguales; i++)
			soniguales = soniguales && listauno[i]!= listados[i];
		
		return soniguales;
	}

    // Al menos una columna que multiplicado k*vec sea igual a la columna de mat
    public static boolean existeColumnaMultiplo(int[][]mat, int[] vec, int k){
    	if(vec.length== 0 || mat.length==0)
    		return false;
    	
    	boolean existeColumna;
    	boolean estanTodos= false;
    	
    	for (int col = 0; col < mat[0].length; col++){
    		existeColumna = true;
    		for (int fila = 0; fila < mat.length; fila++)
    			existeColumna = existeColumna && (mat[fila][col] == vec[fila]*k);
    		estanTodos = estanTodos || existeColumna;
    	}
    return estanTodos;
    }
   
    // Filas multiplo 3, columna multiplo 5
    public static boolean fila3col5(int [][] mat){
    	return recorroCol5(mat) && recorroFil3(mat);
    }

    // Recorre matriz MxN. Si hay una columna, todos multiplos de 5
    public static boolean recorroCol5 (int [][]mat){
    	boolean col5;
    	boolean algunacol =false;
    	
    	for (int fil = 0; fil < mat[0].length; fil++){
    		col5 = true;
    		for (int col = 0; col < mat.length; col++){
    			col5 = col5 && (mat[col][fil] % 5==0);
    			System.out.print(mat[col][fil]+" ");
			}
    		System.out.println();
    		algunacol = algunacol || col5;
		}
    	return algunacol;
    }
   
    // Recorro fila y si existe un multiplo de 3 por cada fila
    public static boolean recorroFil3(int [][]mat){
    	boolean fil3;
    	boolean todasfil3 = true;
    	
    	for (int fil = 0; fil < mat.length; fil++){
    		fil3=false;
			for (int col = 0; col < mat[0].length; col++)
				fil3 = fil3 || (mat[fil][col] % 3==0);
			todasfil3 = todasfil3 && fil3;
		}
    	return todasfil3;
    }
  
    public static boolean tieneColIgualaFila(int[][] mat, int fil){
    	if (mat.length==0 || fil>mat[0].length || fil<0)
    		return false;
    	
    	return todasIguales(mat, mat[fil]);
    }
    public static boolean todasIguales(int [][] mat, int [] fila){
    	boolean algunaIgual;
    	boolean existeUna =false;
    	
    	for (int col = 0; col < mat[0].length; col++){
    		algunaIgual = true;
    		for (int fil = 0; fil < mat.length; fil++)
    			algunaIgual = algunaIgual && (mat[fil][col] == fila[fil]);
    		existeUna = existeUna || algunaIgual;
		}
    	return existeUna;
    }
    
    // Imprimir la matriz por filas, columnas
    public static void imprimirPorFilas(int[][] m)
	{
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[0].length; j++)
                System.out.println(m [i][j]);
        }
    }
    public static void imprimirPorColumnas(int[][] m){
        for (int col = 0; col < m[0].length; col++){
            for (int fila = 0; fila < m.length; fila++)
                System.out.print(m [fila][col]+",");
            System.out.println();
        }
    }
    public static void imprimirLista(int[] l){
        for (int i = 0; i < l.length; i++){
            if (l.length != 0)
                System.out.print( l[i] + " ");
            }
        System.out.println();
    }
    
    public static boolean cadaFila10(int [] fila){
    	int cont= 0;
    	for (int i = 0; i < fila.length; i++){
			cont = cont+fila[i];}
    	return cont==10;
    }
    public static boolean algunaCol20(int col, int[][]mat){
    	int cont = 0;
    	for (int i = 0; i < mat.length; i++)
			cont = cont + mat[i][col];
		
    	return cont==20;
    }
    public static boolean sumaMatriz(int[][] mat){
    	boolean filas = true;
    	boolean columna= false;
    	for (int i = 0; i < mat.length; i++){
			filas= filas && cadaFila10(mat[i]);
					for (int j = 0; j < mat[0].length; j++)
						columna = columna || algunaCol20(j, mat);
		}
    	return filas && columna;
    }
   
    public static boolean parImpar(int[] arr){
    	boolean esParImpar = true;
    	
    	for (int i = 0; i < arr.length; i++)
    		esParImpar = esParImpar && i%2 != arr[i]%2;
    	
    	return esParImpar;
	}
    
    public static boolean parImpar1(int[] arr){
    	for (int i = 0; i < arr.length; i++)
			if(i%2 == arr[i]%2)
				return false;
    	return true;
    }
     
    
    public static boolean colSumaFila( int [][]mat, int []arr){
    	boolean verifico = false;
    	
    	for (int col = 0; col < mat[0].length; col++){
    		int sumaCol = 0;
    		for (int fila = 0; fila < mat.length; fila++)
				sumaCol = sumaCol + mat[fila][col];
			
    		verifico = verifico || sumaArr(arr) == sumaCol;
		}
    	return verifico;
    }
	private static int sumaArr(int[] arr){
		int cont = 0;
		for (int i = 0; i < arr.length; i++)
			cont = cont + arr[i];
		
		return cont;
	}
    
	//recorre un arraylist y devuelve cuantas veces aparece repetido cada elemento en la lista
	public static Map<Integer, Integer> cantidades (ArrayList<Integer> A){
		Map<Integer, Integer> ret=new TreeMap<Integer, Integer> ();
		for(Integer elem:A)
			ret.put (elem, apariciones (A, elem));
		
		return ret;
	}
	private static int apariciones (ArrayList<Integer> A, Integer elem){
	int ret= 0;
	for(Integer valor: A)
		ret+= elem == valor? 1: 0;
	
	return ret;
	}

}
