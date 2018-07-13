package br.com.condessalovelace.threadsjava;

/**
 * 
 * @author condessalovelace
 *
 */
public class SistemaOnlineOffline {

	public static void main(String[] args) {
		Dado dado = new Dado();
		//dado.setSujo(true);
		Thread leituraDado = new Thread(new ThreadLeituraDado(dado));
		Thread sincronizaDado = new Thread(new ThreadSincronizaDado(dado));
		sincronizaDado.setDaemon(true);
		leituraDado.start();
		sincronizaDado.start();
	}

}
