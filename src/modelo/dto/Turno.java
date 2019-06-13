package modelo.dto;

public enum Turno {

	ma�ana(0, 1), mediaMa�ana(2, 3), medioDia(4, 5), tarde(6, 7);

	private int filaUno;
	private int filaDos;

	private Turno(int filaUno, int filaDos) {
		this.filaUno = filaUno;
		this.filaDos = filaDos;
	}

	public int getFilaUno() {
		return filaUno;
	}

	public int getFilaDos() {
		return filaDos;
	}

}
