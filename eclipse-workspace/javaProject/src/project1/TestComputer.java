package project1;

public class TestComputer {

	public static void main(String[] args) {
		
		Computer shohag = new Computer();
		shohag.model = "HP";
		shohag.price = 800;
		shohag.quality = 'A';
		shohag.madeInUsa = false;
		shohag.review = 2.5f;
			
		shohag.computerConfiguration();
		
	}

}
