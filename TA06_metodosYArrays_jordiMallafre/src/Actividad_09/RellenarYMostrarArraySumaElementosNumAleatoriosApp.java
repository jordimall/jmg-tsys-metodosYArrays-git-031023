package Actividad_09;

import javax.swing.JOptionPane;

public class RellenarYMostrarArraySumaElementosNumAleatoriosApp {

	public static void main(String[] args) {
		int max_longitud_array = obtenerEnteroDeUsuario("Escribe la longitud total del array");
		int array[] = new int[max_longitud_array];
		final int MIN = 0;
		final int MAX = 9;
		rellenarArrayAleatorio(array, MIN, MAX);
		mostrarArrayYSumaTotalElementos(array);
	}

	public static int obtenerEnteroDeUsuario(String mensaje) {
		String entrada_texto = JOptionPane.showInputDialog(mensaje);
		while (!comprovarEntradaTextoEsNumero(entrada_texto)) {
			JOptionPane.showMessageDialog(null, "Debes introducir un número entero y positivo.");
			entrada_texto = JOptionPane.showInputDialog(mensaje);
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

	public static int[] rellenarArrayAleatorio(int array[], int MIN, int MAX) {
		int rango = MAX - MIN + 1;
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * rango) + MIN;
		}

		return array;
	}

	public static void mostrarArrayYSumaTotalElementos(int array[]) {
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			total = total + array[i];
		}
		System.out.println("La suma total de los elementos del array es: " + total);
	}

}
