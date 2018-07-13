package br.com.condessalovelace.threadsjava;

/**
 * 
 * @author condessalovelace
 *
 */
public class Corredor implements Runnable {
	public Corredor(Corrida corrida, String corredor) {
		super();
		this.corrida = corrida;
		this.corredor = corredor;
	}

	public Corrida corrida;
	public String corredor;

	@Override
	public void run() {
		System.out.println(corredor + " correndo...");
		while (!corrida.isTerminada()) {
			corrida.setTerminada(true);
			System.out.println("Vencedor: " + corredor);
			return;
		}
		System.out.println(corredor + " parou de correr porque perdeu :(");
	}
}
