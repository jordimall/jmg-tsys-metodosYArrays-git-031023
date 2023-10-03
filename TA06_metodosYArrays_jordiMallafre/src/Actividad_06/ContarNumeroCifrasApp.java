package Actividad_06;

import javax.swing.JOptionPane;

public class ContarNumeroCifrasApp {

	public static void main(String[] args) {
		int num = obtenerEnteroDeUsuario("Escribe el numero entero y positivo que quieres pasar a binario");
		int total_caracters = totalDeCaracteresDeNumero(num);
		JOptionPane.showMessageDialog(null, "El total de caracteres del número: " + num + " es: " + total_caracters);

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
	
	public static int totalDeCaracteresDeNumero(int num) {
		int total_caracteres = Integer.toString(num).length();
		return total_caracteres;
	}

}
