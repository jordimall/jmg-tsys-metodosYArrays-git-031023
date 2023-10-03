package Actividad_10;

import javax.swing.JOptionPane;

public class RellenarYMostrarArrayNumPrimosAleatoriosApp {

	public static void main(String[] args) {
		int max_longitud_array = obtenerEnteroDeUsuario("Escribe la longitud total del array");
		int array[] = new int[max_longitud_array];
		int min = obtenerEnteroDeUsuario("Introduce el número minimo que quieres generar");
		int max = obtenerEnteroDeUsuario("Introduce el número maximo que quieres generar");
		rellenarArrayAleatorio(array, min, max);
		mostrarArrayYElementoMayor(array);
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

	public static int[] rellenarArrayAleatorio(int array[], int min, int max) {

		for (int i = 0; i < array.length; i++) {
			array[i] = generarNumAleatorioPrimo(min, max);
		}

		return array;
	}

	public static int generarNumAleatorioPrimo(int min, int max) {
		int rango = max - min + 1;
		boolean comprovante = false;
		int num_primo = 0;
		while (!comprovante) {
			num_primo = (int) (Math.random() * rango) + min;
			comprovante = comprovarNumPrimo(num_primo);
		}

		return num_primo;
	}

	public static boolean comprovarNumPrimo(int num) {
		if (num % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void mostrarArrayYElementoMayor(int array[]) {
		int mas_grando = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			if (mas_grando < array[i]) {
				mas_grando = array[i];
			}
		}
		System.out.println("El elemento mas grande del array es: " + mas_grando);
	}

}
