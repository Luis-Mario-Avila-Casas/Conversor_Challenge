package Conversores;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConversorTemperatura {
	
	private DecimalFormat nuevaTemp = new DecimalFormat();
	
	public ConversorTemperatura() {
		
		String[] opciones= {"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Kelvin Celsius", "De Kelvin a Fahrenheit", 
				"De Fahrenheit a Celsius", "De Fahrenheit a Kelvin"};
		String conversion = (String) JOptionPane.showInputDialog(null, "¿Qué opción desea elegir?", "Conversor de temperatura",
				JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
		
		String input = JOptionPane.showInputDialog(null, "Ingrese los grados que desee convertir");
		double tempConversion = 1;
		
		try {
			tempConversion = Double.parseDouble(input);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Valor invalido.");
		}
		
		if (conversion.equals("De Celsius a Fahrenheit")) {
			double fahrenheit = (tempConversion * 9/5) + 32;
			JOptionPane.showMessageDialog(null, tempConversion + " grados Celsius son " + nuevaTemp.format(fahrenheit) + " grados Fahrenheit.");
		} else if(conversion.equals("De Celsius a Kelvin")) {
			double kelvin = tempConversion + 273.15;
			JOptionPane.showMessageDialog(null, tempConversion + " grados Celsius son: " + nuevaTemp.format(kelvin) + " Kelvin.");
		} else if(conversion.equals("De Kelvin Celsius")) {
			double celsius = tempConversion - 273.15;
			JOptionPane.showMessageDialog(null, tempConversion + " Kelvin son: " + nuevaTemp.format(celsius) + " grados Celsius.");
		} else if(conversion.equals("De Kelvin a Fahrenheit")) {
			double kelvinFahren = (tempConversion - 273.15) * 9/5 + 32;
			JOptionPane.showMessageDialog(null, tempConversion + " Kelvin son: " + nuevaTemp.format(kelvinFahren) + " grados Fahrenheit.");
		}else if(conversion.equals("De Fahrenheit a Celsius")) {
			double fahrenCel = (tempConversion - 32) * 5/9;
			JOptionPane.showMessageDialog(null, tempConversion + " grados Fahrenheit son: " + nuevaTemp.format(fahrenCel) + " grados Celsius.");
		} else if(conversion.equals("De Fahrenheit a Kelvin")) {
			double fahrenKel = (tempConversion - 32) * 5/9 + 273.15;
			JOptionPane.showMessageDialog(null, tempConversion + " grados Fahrenheit son: " + nuevaTemp.format(fahrenKel) + " Kelvin.");
		}
	}

}
