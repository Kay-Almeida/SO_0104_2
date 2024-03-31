package view;

import java.util.concurrent.Semaphore;

import controller.ThreadAvioes;

public class Main {
	
	public static void main(String[] args) {
		
		Semaphore semaforo = new Semaphore (1); 
		Semaphore semaforo2 = new Semaphore (1); 
		
		for(int id=1; id<13; id++) {
			ThreadAvioes ta = new ThreadAvioes(semaforo, semaforo2, id); 	
			ta.start(); 
		}
		
	}
}
