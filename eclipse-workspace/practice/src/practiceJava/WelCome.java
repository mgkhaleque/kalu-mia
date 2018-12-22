package practiceJava;
/**
 * This program displays a greeting from author
 * @author zibonibrahim
 *
 */
public class WelCome {

	public static void main(String []args) {
		
		String [] greeting = new String [2];
		greeting [0] = "Welcome to Core Java";
		greeting [1] = "by zibonIbrahim";
		
		for (String g : greeting)
			System.out.println(g);
		
	}
}
