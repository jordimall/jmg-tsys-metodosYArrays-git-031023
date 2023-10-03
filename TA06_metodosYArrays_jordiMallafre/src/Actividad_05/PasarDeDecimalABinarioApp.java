package Actividad_05;

import javax.swing.JOptionPane;
public class PasarDeDecimalABinarioApp {

	public static void main(String[] args) {
		int num = obtenerEnteroDeUsuario("Escribe el numero entero que quieres pasar a binario");
		String binario = conversorDecimalBinario(num);
		JOptionPane.showMessageDialog(null, binario);

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
	
	public static String conversorDecimalBinario(int num) {
		String binario = Integer.toBinaryString(num);
		return binario;
	}

}
