    
package modelo.dto;

public enum DiasDeLaSemana {
	Monday(1), Tuesday(2), Wednesday(3), ThursDay(4), Friday(5), Saturday(6), Sunday(7);
	
	private int valor;
	
	private DiasDeLaSemana(int valor) {
		this.valor=valor;
	}

	public int getValor() {
		return valor;
	}
	
}