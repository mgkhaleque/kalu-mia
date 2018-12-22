package inheritance;

public class TestClass {
	public static void main(String []args) {
		
		ClassA ca = new ClassA();
		ca.methodA();
		ca.methodB();
		ca.methodC();
		
		
		ClassB cb = new ClassB();
		cb.methodB();
		cb.methodC();
		
		ClassC cc = new ClassC();
		cc.methodC();
		
		ClassD cd = new ClassD();
		cd.methodD();
		cd.methodC();
		
		ClassE ce = new ClassE();
		ce.methodE();
		ce.methodC();
		
		
	}

}
