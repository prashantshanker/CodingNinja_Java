/*
 * Define a “Clock” class that does the following: -
    a. Accept hours, minutes and seconds.
    b. Check the validity numbers.
    c. Set the time to AM/PM mode.
  Use necessary constructors and methods to do the above task.
 */
public class Clock {
	private int hour;
	private int min;
	private int sec;

	public Clock(int hour, int min, int sec) {
		this.hour = hour;
		this.min = min;
		this.sec = sec;

	}

	public void validity() {
		if (0 <= hour && hour <= 24 && 0 <= min && min <= 60 && 0 <= sec && sec <= 60) {
			if (12 <= hour && hour <= 24) {
				System.out.println("valid Time;" + hour + ":" + min + ":" + sec + "PM");
			} else {
				System.out.println("valid Time;" + hour + ":" + min + ":" + sec + "AM");
			}
		}
	}

}
