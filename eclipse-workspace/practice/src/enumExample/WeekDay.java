package enumExample;

public class WeekDay {
	
	Week day;
	
	public WeekDay() {}
	
	public WeekDay (Week day) {
		this.day = day;
	}
	
	public void whatIShouldDoToday() {
		switch (day) {
		case Monday:
			System.out.println("Review Sunday class materials");
			break;
		case Tuesday:
			System.out.println("Start doing homeWork");
			break;
		case Wednesday:
			System.out.println("Continue with CodeLab");
			break;
		case Thursday:
			System.out.println("Continue with CodeLab");
			break;
		case Friday:
			System.out.println("Prepare Saturday class materials");
			break;
		case Saturday:
			System.out.println("Join Saturday class");
			break;
		case Sunday:
			System.out.println("Join Sunday class");
			break;
		default:
			System.out.println("no more day left, lets find another planet having 8 days of week");
			break;
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}
