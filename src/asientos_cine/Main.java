package asientos_cine;

import java.util.Scanner;

/*
 * Katherine Alderete
 */

/*
 * Instrucciones:
 *  1. Declarar una matriz de tamaño 4x4. Los valores pueden:
 *  • Ingresarse manualmente por el usuario, o asignarse directamente en el código para facilitar la prueba. => OK
 *  2. Recorrer la matriz para:
 *  • Calcular la suma de los valores en la diagonal principal (cuando fila = columna). => OK
 *  • Calcular la suma de la zona superior (cuando columna > fila). => OK
 *  • Calcular la suma de la zona inferior (cuando fila > columna). => OK
 *  3. Al finalizar, mostrar:
 *  • El valor total de cada una de las tres zonas. => OK  
 *  • Un mensaje indicando si la suma de la zona superior e inferior es menor que la diagonal principal, o si no se cumple la condición.  => OK
*/

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//1.declarando la matriz 4x4 con datos entregados
		int[][] asientos = {
				{1, 4, 3, 2},
				{7, 6, 5, 8},
				{8, 7, 6, 5},
				{3, 2, 4, 1}
		};
		
		//variables para almacenar las sumas
		int sumaDiagonal = 0; //cuando fila = columna
		int sumaSuperior = 0; //cuando columna > fila
		int sumaInferior = 0; //cuando fila > columna
		
		
		System.out.println("** Tabla de asientos **\n");
		//ciclo para cargar los valores manualmente
		for (int i = 0; i < asientos.length; i++) {
		    for (int j = 0; j < asientos[i].length; j++) {
		        if (asientos[i][j] < 10) {
		            System.out.print("0" + asientos[i][j] + " | ");
		        } else {
		            System.out.print(asientos[i][j] + " | ");
		        }
		    }
		    System.out.println(); // salto de línea al terminar cada fila
		}
		
		
		//2.ciclo para recorrer la matriz y clasificar las zonas
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					sumaDiagonal += asientos[i][j]; //diagonal principal
				} else if (j > i) {
					sumaSuperior += asientos[i][j]; //zona superior
				} else {
					sumaInferior += asientos[i][j]; //zona inferior
				}
			}
		}
		
		//3.resultados y mensajes
		//El valor total de cada una de las tres zonas. 
		 
		int sumaSupInf = sumaSuperior + sumaInferior;

		
		//mostrando resultados
		System.out.println("\nLos resutados del análisis son:");
		System.out.println("La suma de la diagonal principal es:" + sumaDiagonal);
		System.out.println("La suma de la zona superior es:" + sumaSuperior);
		System.out.println("La suma de la zona inferior es:" + sumaInferior);
		System.out.println("La suma de las zonas superior e inferior es:" + sumaSupInf);
		
		// mensaje indicando si se cumple la condicion asociada a la suma de la zona superior e inferior
		 if (sumaSupInf < sumaDiagonal) {
			System.out.println("La suma de las zonas superior e inferior es ** MENOR ** que la diagonal principal");
		} else {
			System.out.println("La suma de las zonas superior e inferior ** NO es MENOR ** que la diagonal");
		}
		 
		 scanner.close();
	}
}
