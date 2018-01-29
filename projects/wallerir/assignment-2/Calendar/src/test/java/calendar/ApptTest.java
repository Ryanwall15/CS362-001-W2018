package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(21, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(15, appt.getStartDay());
		 assertEquals(01, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	 @Test
	  public void test02()  throws Throwable  {
			 int startHour=8;
			 int startMinute=15;
			 int startDay=10;
			 int startMonth=05;
			 int startYear=2018;
			 String title="Work Meeting";
			 String description="Meeting for work.";
			 //Construct a new Appointment object with the initial data
			 Appt appt = new Appt(startHour,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					 description);
			 // assertions
			 assertTrue(appt.getValid());
			 assertEquals(8, appt.getStartHour());
			 assertEquals(15, appt.getStartMinute());
			 assertEquals(10, appt.getStartDay());
			 assertEquals(05, appt.getStartMonth());
			 assertEquals(2018, appt.getStartYear());
			 assertEquals("Work Meeting", appt.getTitle());
			 assertEquals("Meeting for Work.", appt.getDescription());

		 }
//add more unit tests as you needed
	
}
