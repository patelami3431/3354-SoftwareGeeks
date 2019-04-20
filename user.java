package guru99.junit;

import java.util.ArrayList;
import java.util.List;

public class user {

	private int UID;
	private String password;
	private String email;
	private String Contactinfo;
	private String language;
	List<Event> events = new ArrayList<Event> ();
	
	public user(int uid, String P, String E, String C, String L, List<Event> Events)
	{
		UID = uid;
		password = P;
		email = E;
		Contactinfo = C;
		language = L;
		events = Events;
	}
	
	public int getUID()
	{
		return UID;
	}
	
	public List<Event> getEvents()
	{
		return events;
	}
}
