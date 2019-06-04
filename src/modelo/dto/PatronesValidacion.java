package modelo.dto;

public enum PatronesValidacion {

	telefono("[67]\\\\d{8}"),	 fecha(
			"^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$"),direccion("(((Calle)|(Plaza))(\\s)[a-zA-Z]{3,20})");
	private String regex;

	private PatronesValidacion(String regex) {
		this.regex = regex;
	}

	public String getRegex() {
		return regex;
	}

}
