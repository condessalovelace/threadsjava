package br.com.condessalovelace.threadsjava;

/**
 * 
 * @author condessalovelace
 *
 */
public class ContarTarefa extends Thread implements Runnable {
	private int contador;

	@Override
	public void run() {
		synchronized (this) {
			contador++;
			System.out.println(Thread.currentThread().getName() + ": " + contador);
		}
	}

}
