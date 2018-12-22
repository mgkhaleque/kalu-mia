package exception;

/* Java compiler can't catch arithmetical error during compile time except for run time
 * J/compiler only can catch Syntax errors during compile time
 * in order to handle run-time error Java offers "try-catch block'
 * which is called ExceptionHandling
 */
public class ExceptionHandling {

	public static void main(String[] args) {
		int num1 = 10;
		
		try {
		int result = num1/0;
		System.out.println(result);
		}catch (Exception r) {//r is Exception variable
			System.out.println("you are not allowed to divide number by zero");
		}
		System.out.println("where is my result");
	}

}
