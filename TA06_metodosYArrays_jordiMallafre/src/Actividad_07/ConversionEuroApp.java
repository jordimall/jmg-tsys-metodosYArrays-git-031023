package Actividad_07;

import javax.swing.JOptionPane;

public class ConversionEuroApp {

	public static void main(String[] args) {
		double euro = obtenerNumeroDeUsuario("Introduce la cantidad de euros que quiers convertir");
		String opcion = JOptionPane.showInputDialog("Introduce una de las siguientes opciones dolar, yen o libra");

		switch (opcion.toUpperCase()) {
		case "DOLAR":
			conversorEuroDolar(euro);
			break;
		case "YEN":
			conversorEuroYene(euro);
			break;
		case "LIBRA":
			conversorEuroLibra(euro);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Has de seleccionar una de las tres opciones");
			break;
		}
	}

	public static double obtenerNumeroDeUsuario(String mensaje) {
		String entrada_texto = JOptionPane.showInputDialog(mensaje);
		while (!comprovarEntradaTextoEsNumero(entrada_texto)) {
			JOptionPane.showMessageDialog(null, "Debes introducir un número positivo.");
			entrada_texto = JOptionPane.showInputDialog(mensaje);
		}
		return Integer.parseInt(entrada_texto);
	}

	public static boolean comprovarEntradaTextoEsNumero(String texto_a_comprobar) {
		try {
			double comprovación = Double.parseDouble(texto_a_comprobar);
			if (comprovación >= 0) {
				return true;
			}
			return false;
		} catch (Exception e) {
			return false;
		}
	}

	public static void conversorEuroDolar(double euro) {
		double dolar = euro * 1.05;
		JOptionPane.showMessageDialog(null, euro + "€ es en dolares: " + dolar);
	}

	public static void conversorEuroYene(double euro) {
		double yene = euro * 156.02;
		JOptionPane.showMessageDialog(null, euro + "€ es en yenes: " + yene);
	}

	public static void conversorEuroLibra(double euro) {
		double libra = euro * 0.87;
		JOptionPane.showMessageDialog(null, euro + "€ es en libras: " + libra);
	}
}
