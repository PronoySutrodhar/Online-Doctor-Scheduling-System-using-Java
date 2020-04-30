
public class Time {
	
	// -------------------------- Data Field ----------------------------
	private int hour;
	private int minute;
	private int second;
	
	
	
	
	
	// -------------------------- Constructors -------------------------------
	public Time() {
		
	}
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}





	// ------------------ Getter & Setter Methods -------------------
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}



	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}



	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	
	
	
	
	
	// ------------------ Necessary Methods -------------------
	public Time getTime() {
		System.out.print("\n\t\t   Enter hour : ");
	    this.hour = Main.input.nextInt();
	    System.out.println("\t\t   ");
	    System.out.print("\n\t\t   Enter min : ");
	    this.minute = Main.input.nextInt();
	    System.out.println("\t\t   ");
	    System.out.print("\n\t\t   Enter second : ");
	    this.second = Main.input.nextInt();
	    System.out.println("\t\t   ");
	    
	    Time time = new Time(hour, minute, second);
	    return time;
	}
	
	
}
