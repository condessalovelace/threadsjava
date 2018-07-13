package br.com.condessalovelace.threadsjava;

/**
 * 
 * @author condessalovelace
 *
 */
public class Dado {
	private boolean sujo;
	private int valor;

	public boolean isSujo() {
		return sujo;
	}

	public void setSujo(boolean sujo) {
		this.sujo = sujo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public synchronized void sincronizaDado() {
		System.out.println("Sincronizando dado...");
		
		try {
			if (!sujo)
				this.wait();
			
			sujo = false;
			Thread.sleep(5000);
			System.out.println("Dado sincronizado!");
			this.notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void leDado() {
		System.out.println("Lendo o dado...");

		try {
			if (sujo)
				this.wait();

			Thread.sleep(2000);
			System.out.println("Dado: " + valor);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
