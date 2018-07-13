package br.com.condessalovelace.threadsjava;

/**
 * 
 * @author condessalovelace
 *
 */
public class Corrida {
	private volatile boolean terminada;

	public boolean isTerminada() {
		return terminada;
	}

	public void setTerminada(boolean terminada) {
		this.terminada = terminada;
	}
}
