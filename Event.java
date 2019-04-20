package guru99.junit;

public class Event {

	private int date;
	private int StartTime;
	private int EndTime;
	private String notes;
	private boolean sendInvites;
	private String reminder;
	private String name;

	public int getdate() {
		return date;
	}
	
	public void setdate(int date) {
		this.date = date;
	}
	
	public int getStartTime() {
		return StartTime;
	}
	
	public void setStartTime(int StartTime) {
		this.StartTime = StartTime;
	}
	
	public int getEndTime() {
		return EndTime;
	}
	
	public void setEndTime(int EndTime) {
		this.EndTime = EndTime;
	}
	
	public String getnotes() {
		return notes;
	}
	
	public void setnotes(String notes) {
		this.notes = notes;
	}
	public String getreminder() {
		return reminder;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	public boolean sendInvites() {
		return sendInvites;
	}

	public boolean AddEvent(Event E) {
	 E = new Event();
	 E.setdate(date);
	 E.setStartTime(StartTime);
	 E.setEndTime(EndTime);
	 E.setnotes(notes);
	 E.setname(name);
	 
	return true;
	}

	public boolean EditEvent (Event E) {
	
	return true;
	
	}

}	