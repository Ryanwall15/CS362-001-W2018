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

		 appt.compareTo(appt);
	 }

	 @Test
	  public void test02()  throws Throwable  {
	 	Appt appt = new Appt (15, 40, 10, 06, 2018, "meeting", "for work");
	 	assertEquals(true, appt.getValid());

		 
	 }

	 @Test
	public void test03() throws Throwable {
		 int startHour=16;
		 int startMinute=00;
		 int startDay=2;
		 int startMonth=06;
		 int startYear=2018;
		 String title="Work Meeting";
		 String description="Meeting to discuss project";

		 Appt appt = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);

		 appt.setStartHour(16);
		 appt.setStartMinute(00);
		 appt.setStartDay(2);
		 appt.setStartMonth(06);
		 appt.setStartYear(2018);
	 }

	 @Test
	public void test04() {
		 int startHour=-1;
		 int startMinute=00;
		 int startDay=2;
		 int startMonth=06;
		 int startYear=2018;
		 String title="Work Meeting";
		 String description="Meeting to discuss project";

		 Appt appt = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);

		 assertEquals(false, appt.getValid());

		 appt.setStartHour(1);
		 assertEquals(true,appt.getValid());


	}

	@Test
	public void test05() {
		int startHour=05;
		int startMinute=00;
		int startDay=2;
		int startMonth=06;
		int startYear=2018;
		String title="Work Meeting";
		String description="Meeting to discuss project";

		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);

		assertEquals(true,appt.getValid());


		Appt appt2 = new Appt(10,00,2,06,2018,"work","project");

		assertEquals(-5, appt.compareTo(appt2));


	}

//add more unit tests as you needed
	
}
