package Actividad_04;

import javax.swing.JOptionPane;

public class CalcularFactorialApp {

	public static void main(String[] args) {
		int num = obtenerEnteroDeUsuario("Escribe el número que quieras factorizar");
		int total_factorizado = factorizacion(num);
		JOptionPane.showMessageDialog(null, "La factorización del número: " + num + " es: " + total_factorizado);

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

	public static int factorizacion(int num) {
		int total = 1;
		while (num > 0) {
			total = total * num;
			num--;
		}
		return total;
	}

}
