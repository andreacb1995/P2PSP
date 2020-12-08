public class ClassA extends Thread{
	
	public void run() {
		EnterAndWait();
	}
	
	public synchronized static void EnterAndWait() {
		long t= Thread.currentThread().getId();
		System.out.println("Soy el hilo "+ t + " y estoy empezando a ejecutar el método EnterAndWait()");
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		 
		System.out.println("Soy el hilo "+ t + " y estoy acabando de ejecutar el método EnterAndWait()");
		}
		
	}

