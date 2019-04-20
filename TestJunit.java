package guru99.junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
public class TestJunit {
   @Test
   public void testSetup() {
	// Event 1
	    Event event1 = new Event();
	  	event1.setdate(5172019);
	  	event1.setStartTime(940);
	  	event1.setEndTime(950);
	  	event1.setname("Software engineering Final Project");	
	  	//Initialize the user 
	  	List<Event> events = new ArrayList<Event> ();
	  	events.add(event1);
	  	//events.add(event2);
	  	user user1 = new user(101, "JPatel2019", "JP2019@utdallas.edu", "4677699435", "English",events);
	   
	  	//Create the model
	  	model M = new model();
	  	assertEquals(true, M.timeConflict(user1, 5172019, 940));
   }
}