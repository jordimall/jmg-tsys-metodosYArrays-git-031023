package Actividad_08;

import javax.swing.JOptionPane;

public class RellenarYMostrarArrayApp {

	public static void main(String[] args) {
		int array[] = new int[10];
		rellenarArray(array);
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
	
	public static int[] rellenarArray(int array[]) {
		
		for (int i = 0; i < array.length; i++) {
			array[i] = obtenerEnteroDeUsuario("Escribe un número");
		}
		
		return array;
	}
	
	public static void mostrarArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("indice: " + i + ", valor: " + array[i]);
		}
	}

}
