enum DaysOfWeek {
	MONDAY(8),
	TUESDAY(8),
	WEDNESDAY(8),
	THURSDAY(8),
	FRIDAY(8),
	SATURDAY(8),
	SUNDAY(8);

	private int timeOfSleep;

	DaysOfWeek(int sleepTime){
		setSleepTime(sleepTime);
	}

	public void setSleepTime(int sleepTime){
		this.timeOfSleep = sleepTime;
	}

	public int getSleepTime(){
		return timeOfSleep;
	}
}