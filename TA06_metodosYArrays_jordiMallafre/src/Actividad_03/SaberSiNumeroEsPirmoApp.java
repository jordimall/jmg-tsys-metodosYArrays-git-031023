package Actividad_03;

import javax.swing.JOptionPane;

public class SaberSiNumeroEsPirmoApp {

	public static void main(String[] args) {
		int num = obtenerEnteroDeUsuario("Escribe el número que quieres comprovar");
		
		if(esNumeroPrimo(num)) {
			JOptionPane.showMessageDialog(null, "El número: " + num + " es primo");
		} else {
			JOptionPane.showMessageDialog(null, "El número: " + num + " no es primo");
		}

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
	
	public static boolean esNumeroPrimo(int num) {
		
		  for (int x = 2; x < num / 2; x++) {
		    // Si es divisible por cualquiera de estos números, no
		    // es primo
		    if (num % x == 0)
		      return false;
		  }
		  // Si no se pudo dividir por ninguno de los de arriba, sí es primo
		  return true;
	}

}
