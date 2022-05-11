enum DaysOfWeek {
	MONDAY(8, "HAPPY"),
	TUESDAY(8, "HAPPY"),
	WEDNESDAY(4, "SAD"),
	THURSDAY(2, "SAD"),
	FRIDAY(8, "HAPPY"),
	SATURDAY(8, "HAPPY"),
	SUNDAY(7, "GOOD");

	private int timeOfSleep;
	private String feeling;

	DaysOfWeek(int sleepTime, String feeling){
		setSleepTime(sleepTime);
		setFeeling(feeling);
	}

	public void setSleepTime(int sleepTime){
		this.timeOfSleep = sleepTime;
	}

	public int getSleepTime(){
		return timeOfSleep;
	}

	public void setFeeling(String feeling){
		this.feeling = feeling;
	}

	public String getFeeling(){
		return feeling;
	}

	public String toString(){
		return "The " + name() + " I've slept  " + this.timeOfSleep + "h and I felt " + this.feeling ;
	}
}