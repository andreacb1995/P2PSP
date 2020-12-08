public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread classA = new Thread (new ClassA());
		 classA.start();
        Thread classB1=new Thread(new ClassB(classA));
        Thread classB2=new Thread(new ClassB(classA));
        Thread classB3=new Thread(new ClassB(classA));
        classB1.start();
        classB2.start();
        classB3.start();

	}

}
