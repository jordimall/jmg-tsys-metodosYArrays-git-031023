package Actividad_07;

import javax.swing.JOptionPane;

public class ConversionEuroApp {

	public static void main(String[] args) {
		double euro = obtenerNumeroDeUsuario("Introduce un número que quiers convertir");
		String opcion = JOptionPane.showInputDialog("Introduce una de las siguientes opciones dolares, yenes o libra");
		
		switch (opcion.toUpperCase()) {
		case "DOLARES":
			double dolar = conversorEuroDolar(euro);
			JOptionPane.showMessageDialog(null, euro + "€ es en dolares: " + dolar);
			break;
		case "YENES":
			double yene = conversorEuroYene(euro);
			JOptionPane.showMessageDialog(null, euro + "€ es en yenes: " + yene);
			break;
		case "LIBRA":
			double libra = conversorEuroLibra(euro);
			JOptionPane.showMessageDialog(null, euro + "€ es en libras: " + libra);
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
	
	public static double conversorEuroDolar(double euro) {
		double dolar =euro*1.05;
		
		return dolar;
	}
	
	public static double conversorEuroYene(double euro) {
		double yene =euro*156.02;
		
		return yene;
	}
	
	public static double conversorEuroLibra(double euro) {
		double libra =euro*0.87;
		
		return libra;
	}
}
