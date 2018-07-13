package br.com.condessalovelace.threadsjava;

/**
 * 
 * @author condessalovelace
 *
 */
public class Contador {
	public static void main(String args[]) {
		ContarTarefa tarefa = new ContarTarefa();
		Thread contador1 = new Thread(tarefa);
		Thread contador2 = new Thread(tarefa);
		Thread contador3 = new Thread(tarefa);
		Thread contador4 = new Thread(tarefa);
		contador1.start();
		contador2.start();
		contador3.start();
		contador4.start();
	}
}
