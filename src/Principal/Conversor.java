package Principal;



import javax.swing.JOptionPane;

import Conversores.ConversorDivisas;
import Conversores.ConversorTemperatura;

public class Conversor {
	
	public static void main(String[] args) {
		
		String[] options = {"Conversor de divisas", "Conversor de temperatura", "Salir"};
		String elegir = (String) JOptionPane.showInputDialog(null, "¿Qué desea realizar?", "Conversor de unidades",
			JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		
		if (elegir == "Conversor de divisas") {
			
			boolean continuarPrograma = true;
			
			while (continuarPrograma) {
				ConversorDivisas conversorDivisas = new ConversorDivisas();
				
				int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar",
						JOptionPane.YES_NO_CANCEL_OPTION);
				if (confirmar == JOptionPane.NO_OPTION || confirmar == JOptionPane.CANCEL_OPTION) {
					continuarPrograma = false;
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				}
			}
			
		}
		
		if (elegir == "Conversor de temperatura") {
			boolean continuarPrograma = true;
			while(continuarPrograma) {
				
				ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
				
				int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar",
						JOptionPane.YES_NO_CANCEL_OPTION);
				if (confirmar == JOptionPane.NO_OPTION || confirmar == JOptionPane.CANCEL_OPTION) {
					continuarPrograma = false;
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				}	
			}
			
		}
	
	
		if (elegir == "Salir") {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
			System.exit(0);
		}
	}
	
	
	
}
