package br.com.condessalovelace.threadsjava;

/**
 * 
 * @author condessalovelace
 *
 */
public class ImprimirHelloTarefa implements Runnable {
	private String nome;

	public ImprimirHelloTarefa(String nome) {
		this.nome = nome; 
	}

	@Override
	public void run() {
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			System.out.println(nome + "foi interrompida!");
			e.printStackTrace();
		}
		System.out.println("Hello " + nome + "!");
	}

}
