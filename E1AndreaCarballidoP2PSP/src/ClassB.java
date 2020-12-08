
public class ClassB implements Runnable {
	Object objetoClassA;

	ClassB(Object objeto) {
		objetoClassA = objeto;
	}

	@Override
	public void run() {
		ClassA.EnterAndWait();
	}

}
