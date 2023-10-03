package Actividad_12;

import java.util.ArrayList;
import java.util.Scanner;

public class RellenarYfiltrarArrayApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamaño_array = Integer.parseInt(obtenerEnteroDeUsuario("Escribe el tamaño del array", sc));
		String numero_filtrado = obtenerEnteroDeUsuario("Escribe el número por el que filtrar los resultados", sc);
		sc.close();
		
		String array[] = new String[tamaño_array];
		ArrayList<String> array_filtrado = new ArrayList<String>();
		rellenarArrayAleatorio(numero_filtrado, array, array_filtrado);
		mostrarArrays(numero_filtrado, array, array_filtrado);
		
	}

	public static String obtenerEnteroDeUsuario(String mensaje, Scanner sc) {
		System.out.println(mensaje);
		String entrada_texto = sc.nextLine();

		while (!comprovarEntradaTextoEsNumero(entrada_texto)) {
			System.out.println("Debes introducir un número entero y positivo.");
			entrada_texto = sc.nextLine();
		}
		return entrada_texto;
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
	
	public static void rellenarArrayAleatorio(String num_filtrado, String array[], ArrayList<String> array_list) {
		final int MIN = 1;
		final int MAX = 300;
		String num = "";
		int range = MAX - MIN + 1;
		for (int i = 0; i < array.length; i++) {
			num = Integer.toString((int) (Math.random() * range) + MIN);
			array[i] = num;
			if(num.endsWith(num_filtrado)) {
				array_list.add(num);
			}
		}
	}
	
	public static void mostrarArrays(String num_filtrado, String array[], ArrayList<String> array_list) {
		System.out.println("array original:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+", ");
		}
		System.out.println("");
		System.out.println("array filtrado por: " +num_filtrado);
		for (int i = 0; i < array_list.size(); i++) {
			System.out.print(array_list.get(i)+", ");
		}
	}
}
