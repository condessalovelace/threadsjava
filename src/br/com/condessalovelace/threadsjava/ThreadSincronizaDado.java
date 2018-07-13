package br.com.condessalovelace.threadsjava;

/**
 * 
 * @author condessalovelace
 *
 */
public class ThreadSincronizaDado implements Runnable {
	private Dado dado;

	public ThreadSincronizaDado(Dado dado) {
		super();
		this.dado = dado;
	}

	@Override
	public void run() {
		dado.sincronizaDado();
	}
}
