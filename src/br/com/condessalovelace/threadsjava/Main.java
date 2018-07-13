package br.com.condessalovelace.threadsjava;

/**
 * 
 * @author condessalovelace
 *
 */
public class Main {
	public static void main(String [] args) {
		Thread tarefa1 = new Thread(new ImprimirHelloTarefa("Tarefa 1"));
		Thread tarefa2 = new Thread(new ImprimirHelloTarefa("Tarefa 2"));
		Thread tarefa3 = new Thread(new ImprimirHelloTarefa("Tarefa 3"));
		Thread tarefa4 = new Thread(new ImprimirHelloTarefa("Tarefa 4"));
		tarefa1.start();
		tarefa2.start();
		tarefa3.start();
		tarefa4.start();
	}
}
