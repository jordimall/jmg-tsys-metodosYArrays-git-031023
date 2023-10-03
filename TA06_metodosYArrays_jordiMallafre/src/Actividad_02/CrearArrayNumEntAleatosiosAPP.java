
package Actividad_02;

import javax.swing.JOptionPane;

public class CrearArrayNumEntAleatosiosAPP {

	public static void main(String[] args) {
		int tamaño_array = obtenerEnteroDeUsuario("Escribe cuantos numeros enteros aleatorios quieres crear");
		int min = obtenerEnteroDeUsuario("Introduce el número minimo que quieres generar");
		int max = obtenerEnteroDeUsuario("Introduce el número maximo que quieres generar");

		int array[] = new int[tamaño_array];
		rellenarArrayAutomaticamente(array, min, max);
		mostrarArray(array);

	}
	
	public static int obtenerEnteroDeUsuario(String mensaje) {
		String entrada_texto = JOptionPane.showInputDialog(mensaje);
		while (!comprovarEntradaTextoEsNumero(entrada_texto)) {
			JOptionPane.showMessageDialog(null, "Debes introducir un número entero.");
			entrada_texto = JOptionPane.showInputDialog(mensaje);
		}
		return Integer.parseInt(entrada_texto);
	}

	public static boolean comprovarEntradaTextoEsNumero(String texto_a_comprobar) {
		try {
			int comprovación = Integer.parseInt(texto_a_comprobar);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public static void rellenarArrayAutomaticamente(int array[], int min, int max) {
		int rango = max - min + 1;
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * rango) + min;
		}
	}

	public static void mostrarArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
