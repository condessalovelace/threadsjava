package br.com.condessalovelace.threadsjava;

/**
 * 
 * @author condessalovelace
 *
 */
public class CorridaMain {
	public static void main(String args []) {
		Corrida corrida = new Corrida();
		Thread corredor1 = new Thread(new Corredor(corrida, "Corredor 1"));
		Thread corredor2 = new Thread(new Corredor(corrida, "Corredor 2"));
		System.out.println("Iniciando a corrida...");
		corredor1.start();
		corredor2.start();
	}
}
