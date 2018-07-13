package br.com.condessalovelace.threadsjava;

/**
 * 
 * @author condessalovelace
 *
 */
public class ThreadLeituraDado implements Runnable {
	private Dado dado;

	public ThreadLeituraDado(Dado dado) {
		super();
		this.dado = dado;
	}

	@Override
	public void run() {
		dado.leDado();
	}
}
