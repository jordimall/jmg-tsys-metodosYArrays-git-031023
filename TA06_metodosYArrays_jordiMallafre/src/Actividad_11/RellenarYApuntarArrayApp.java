package Actividad_11;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class RellenarYApuntarArrayApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamaño_array = obtenerEnteroDeUsuario("Escribe el tamaño de los array", sc);
		sc.close();

		int array1[] = new int[tamaño_array];
		int array2[] = new int[tamaño_array];

		rellenarArrayAleatorio(array1);
		array2 = array1;
		rellenarArrayAleatorio(array2);
		int array3[] = multiplicarContanidoArray(array1, array2);
		
		mostrarArray(array1);
		mostrarArray(array2);
		mostrarArray(array3);
	}

	public static int obtenerEnteroDeUsuario(String mensaje, Scanner sc) {
		System.out.println(mensaje);
		String entrada_texto = sc.nextLine();

		while (!comprovarEntradaTextoEsNumero(entrada_texto)) {
			System.out.println("Debes introducir un número entero y positivo.");
			entrada_texto = sc.nextLine();
		}
		return Integer.parseInt(entrada_texto);
	}

	public static boolean comprovarEntradaTextoEsNumero(String texto_a_comprobar) {
		try {
			int comprovación = Integer.parseInt(texto_a_comprobar);
			if (comprovación >= 0) {
				return true;
			}
			return false;
		} catch (Exception e) {
			return false;
		}

	}

	public static int[] rellenarArrayAleatorio(int array[]) {

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}

		return array;
	}

	public static int[] multiplicarContanidoArray(int array1[], int array2[]) {
		int new_array[] = new int[array1.length];
		
		for (int i = 0; i < new_array.length; i++) {
			new_array[i] = array1[i] * array2[i];
		}

		return new_array;
	}
	
	public static void mostrarArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println("");
	}

}
