package utiles;

import java.util.regex.Pattern;

import javax.swing.JTextField;

public class Validator {

	public static boolean isNumber(String string) {
		boolean retorno = true;
		try {
			Double.parseDouble(string);
			char charAt = string.charAt(string.length() - 1);
			if (charAt == 'f' || charAt == 'd')
				retorno = false;
		} catch (NumberFormatException e) {
			retorno = false;
		}
		return retorno;
	}

	public static boolean isID(String string) {
		return isInteger(string) && comprobarEspacios(string);
	}

	public static boolean isNombre(String string) {
		return isWord(string);
	}


	public static boolean isNIF(String string) {
		return comprobarEspacios(string) && Pattern.matches("\\d{8}[A-H J-N P-T V-Z]", string);
	}
	public static boolean isDireccion(String string) {
		return Pattern.matches("^(Calle|Plaza|Avenida)[\\s][a-zA-Z]{2,}[\\s]\\d{1,}", string);
	}
	public static boolean isFechaNacimiento(String string) {
		return Pattern.matches("^(0?[1-9]|[12][0-9]|3[01])[\\/](0?[1-9]|1[012])[/\\\\/](19|20)\\d{2}$", string);
	}

	public static boolean isPhone(String string) {
		return Pattern.matches("[6-7-9]\\d{8}", string);
	} 

	public static boolean isInteger(String string) {
		return Pattern.matches("\\d{" + String.valueOf(string.length()) + "}", string);
	}

	public static boolean isWord(String string) {
		return Pattern.matches("[a-zA-Z\\s]+", string); 
	}

	public static boolean comprobarEspacios(String string) {
		return !Pattern.matches(".* .*", string);
	}

}
