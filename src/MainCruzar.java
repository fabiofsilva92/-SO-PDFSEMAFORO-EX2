import java.util.concurrent.Semaphore;

public class MainCruzar {

	public static void main(String[] args) {	
		
		Semaphore semaforo = new Semaphore(1);
		
		for(int i = 1; i<5; i++) {

			Thread sc = new ThreadSentidoC(i, semaforo);
			sc.start();
			
		}
		

	}

}
