package Actividad_01;

import javax.swing.JOptionPane;
public class CalculaAreaApp {

	public static void main(String[] args) {
		String entrada_texto = JOptionPane.showInputDialog("De que figura quieres calcular el area(Circulo, Triangulo o Cuadrado)");
		String comprovar_switch = entrada_texto.toUpperCase();
		String mensaje = "";
		double resultado = 0;
		
		switch (comprovar_switch) {
		case "CIRCULO":
			entrada_texto = JOptionPane.showInputDialog("Escribe el radio del circulo");
			
			if(!comprovarEntradaTextoEsNumero(entrada_texto)) {
				mensaje = "El radio ha de ser un numero";
				break;
			}
			double radio = Double.parseDouble(entrada_texto);
			resultado = calcularAreaCirculo(radio);
			mensaje = "El área del circulo con radio: " + radio + " es de " + resultado;
			
			break;
		case "TRIANGULO":
			double base = 0;
			double altura = 0;
			
			String base_texto = JOptionPane.showInputDialog("Escribe la base del triangulo");
			if(!comprovarEntradaTextoEsNumero(base_texto)) {
				mensaje = "La base ha de ser un numero";
				break;
			}
			
			String altura_texto = JOptionPane.showInputDialog("Escribe la altura del triangulo");
			
			if(!comprovarEntradaTextoEsNumero(altura_texto)) {
				mensaje = "La altura ha de ser un numero";
				break;
			}

			base = Double.parseDouble(base_texto);
			altura = Double.parseDouble(altura_texto);
			
			resultado = calcularAreaTriangulo(base, altura);
			mensaje = "El área del triangulo con base: " + base + " y altura: " + altura + " es de " + resultado;
			
			break;
		case "CUADRADO":
			double lado = 0;
			entrada_texto = JOptionPane.showInputDialog("Escribe el lado del triangulo");
			
			if(!comprovarEntradaTextoEsNumero(entrada_texto)) {
				mensaje = "L'altura ha de ser un numero";
				break;
			}
			
			lado = Double.parseDouble(entrada_texto);
			resultado = calcularAreaCuadrado(lado);
			mensaje = "El área del cuadrado con lado: " + lado + " es de " + resultado;
			
			break;

		default:
			mensaje = "Has de introducir una de las siguientes opciónes Circulo, Triangulo o Cuadrado";
			break;
		}
		
		JOptionPane.showMessageDialog(null, mensaje);

	}
	
	public static boolean comprovarEntradaTextoEsNumero (String texto_a_comprobar) {
		try {
			double comprovación = Double.parseDouble(texto_a_comprobar);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public static double calcularAreaCirculo(double radio) {
		double resultado = (Math.pow(radio, 2)) * 3.14;
		return resultado;
	}
	
	public static double calcularAreaTriangulo(double base, double altura) {
		double resultado = base * altura / 2;
		return resultado;
	}
	
	private static double calcularAreaCuadrado(double lado) {
		double resultado = lado * lado;
		return resultado;
	}

}
