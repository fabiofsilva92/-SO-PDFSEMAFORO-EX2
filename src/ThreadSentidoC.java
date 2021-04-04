import java.util.concurrent.Semaphore;

public class ThreadSentidoC extends Thread{
	
	private int idCarro;
	String sentidoCarro;
	
	public ThreadSentidoC(int idCarro, Semaphore semaforo) {
		this.idCarro = idCarro;
		this.semaforo = semaforo;
	}

	private Semaphore semaforo;
	
	@Override
	public void run() {
		
		try {
			semaforo.acquire();
			cruzarCarro();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			semaforo.release();
		}
	}

	
	public void cruzarCarro() {
		switch(idCarro) {		
		case 1: sentidoCarro = "Norte para Sul";
		break;
		case 2: sentidoCarro = "Leste para Oeste";
		break;
		case 3: sentidoCarro = "Sul para Norte";
		break;
		case 4: sentidoCarro = "Oeste para Leste";
		}	
		System.out.println("#ID "+idCarro+" -> cruzando: "+sentidoCarro);
		

		
		System.out.println("#ID "+idCarro+" cruzou.");
	}
	
}
