package Conversores;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConversorDivisas {
 
	private DecimalFormat nuevaDivisa = new DecimalFormat("#.##");
	
	public ConversorDivisas() {
		String[] opciones = {"Pesos a Euros", "Pesos a Dolar", "Pesos a Libras Esterlinas", "Pesos a Yen Japones",
				"Pesos a Won Surcoreano", "Pesos a Rublo Ruso"};
		String conversion = (String) JOptionPane.showInputDialog(null, "¿Qué opción desea elegir?", "Conversor de divisas",
				JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
		
		String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad en pesos mexicanos que desea convertir");
		double pesos = 1;
		
		try {
			pesos = Double.parseDouble(input);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Valor invalido");
		}
		
		if (conversion.equals("Pesos a Euros")) {
			double euros = pesos * 0.055;
			JOptionPane.showMessageDialog(null, pesos + " pesos mexicanos son: " + nuevaDivisa.format(euros) + " Euros.");
		} else if(conversion.equals("Pesos a Dolar")) {
			double dolar = pesos * 0.058;
			JOptionPane.showMessageDialog(null, pesos + " pesos mexicanos son: " + nuevaDivisa.format(dolar) + " Dolares.");
		} else if(conversion.equals("Pesos a Libras Esterlinas")) {
			double librasEsterlinas = pesos * 0.047;
			JOptionPane.showMessageDialog(null, pesos + " pesos mexicanos son: " + nuevaDivisa.format(librasEsterlinas) + " Libras.");
		} else if(conversion.equals("Pesos a Yen Japones")) {
			double yenes = pesos * 8.60;
			JOptionPane.showMessageDialog(null, pesos + " pesos mexicanos son: " + nuevaDivisa.format(yenes) + " Yenes.");
		} else if(conversion.equals("Pesos a Won Surcoreano")) {
			double wones = pesos * 77.41;
			JOptionPane.showMessageDialog(null, pesos + " pesos mexicanos son: " + nuevaDivisa.format(wones) + " Wones");
		} else if(conversion.equals("Pesos a Rublo Ruso")) {
			double rublos = pesos * 5.61;
			JOptionPane.showMessageDialog(null, pesos + " pesos mexicanos son: " + nuevaDivisa.format(rublos) + " Rublos.");
		}
	}
}
