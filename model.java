package guru99.junit;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class model{

	private String Eventlist; 
	private String language;
	List<Event> events = new ArrayList<Event> ();
	List<user> user = new ArrayList<user>();
	
	public boolean timeConflict(user User, int date, int time) 
	{
		events = User.getEvents();
			
		Iterator<Event> iterator1 = events.iterator();
		//int i = -1;
		//iterator2.hasNext();
		//while (iterator1.hasNext())
		for (int i = 0; i < events.size(); i++)
		{
			    //i++;
				if (events.get(i).getdate() != date)
				{
					System.out.println("no Time conflict!");
			           //there is no time conflict!!!
						return true;
				}
				else 
				{
					 if (events.get(i).getStartTime() != time)
					 {
						 System.out.println("no Time conflict!");
				           //there is no time conflict!!!
							return true;
					 }
				}
				
		}
				
										
		//}
		
		System.out.println("failuer! time conflict!");
		return false;
	}
	
	
}
