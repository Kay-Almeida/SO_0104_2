package controller;

import java.util.concurrent.Semaphore;

public class ThreadAvioes extends Thread {
	
	int id; 
	private Semaphore semaforo; 
	private Semaphore semaforo2; 
	
	public ThreadAvioes (Semaphore semaforo, Semaphore semaforo2, int id) {
		this.semaforo = semaforo; 
		this.semaforo2 = semaforo2; 
		this.id = id; 
	}
	
	public void run () {
		if(id%2==0) {
			try {
				semaforo.acquire();
			int manobra = (int) ((Math.random()*401)+300);
			int taxiar = (int) ((Math.random()*501)+500);
			int decolagem = (int) ((Math.random()*201)+600);
			int afastamento = (int) ((Math.random()*501)+300);
			
			try {
				System.out.println("O avião " + id + " está na fase de Manobra por "+ manobra + " milisegundos");
				sleep(manobra);
				System.out.println("O avião " + id + " está na fase de Taxiar por "+ taxiar + " milisegundos");
				sleep(taxiar);
				System.out.println("O avião " + id + " está na fase de Decolagem na pista Norte por "+ decolagem + " milisegundos");
				sleep(decolagem);
				System.out.println("O avião " + id + " está na fase de Afastamento por "+ afastamento + " milisegundos");
				sleep(afastamento);
				System.out.println("O avião " + id + " terminou as 4 fases da Decolagem");
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally {
				semaforo.release();
			}
		}else {
			try {
				semaforo2.acquire();
			int manobra = (int) ((Math.random()*401)+300);
			int taxiar = (int) ((Math.random()*501)+500);
			int decolagem = (int) ((Math.random()*201)+600);
			int afastamento = (int) ((Math.random()*501)+300);
			
			try {
				System.out.println("O avião " + id + " está na fase de Manobra por "+ manobra + " milisegundos");
				sleep(manobra);
				System.out.println("O avião " + id + " está na fase de Taxiar por "+ taxiar + " milisegundos");
				sleep(taxiar);
				System.out.println("O avião " + id + " está na fase de Decolagem na pista Sul por "+ decolagem + " milisegundos");
				sleep(decolagem);
				System.out.println("O avião " + id + " está na fase de Afastamento por "+ afastamento + " milisegundos");
				sleep(afastamento);
				System.out.println("O avião " + id + " terminou as 4 fases da Decolagem");
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally {
				semaforo2.release();
			}

		}
		
	}
	
	
}
