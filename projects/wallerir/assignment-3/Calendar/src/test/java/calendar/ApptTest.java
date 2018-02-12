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


		 //Setters
		 appt.setStartHour(16);
		 appt.setStartMinute(00);
		 appt.setStartDay(2);
		 appt.setStartMonth(06);
		 appt.setStartYear(2018);

	 }

	 @Test
	 public void test04() { //testing hour ranges
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

		 appt.setStartHour(-1);
		 assertEquals(false,appt.getValid());

		 appt.setStartHour(25);
		 assertEquals(false,appt.getValid());

		 appt.setStartHour(0);
		 assertEquals(true,appt.getValid());

		 appt.setStartHour(23);
		 assertEquals(true,appt.getValid());


	 }

	@Test
	public void test05() { //testing minute ranges
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

		appt.setStartMinute(-1);
		assertEquals(false,appt.getValid());

		appt.setStartMinute(60);
		assertEquals(false, appt.getValid());

		appt.setStartMinute(61);
		assertEquals(false,appt.getValid());

		appt.setStartMinute(1);
		assertEquals(true,appt.getValid());

		appt.setStartMinute(59);
		assertEquals(true,appt.getValid());


	}

	 @Test
	public void test06() {
		 int startHour=16;
		 int startMinute=00;
		 int startDay=02;
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


		 appt.setStartDay(-1);
		 assertEquals(false,appt.getValid());

		 appt.setStartDay(32);
		 assertEquals(false,appt.getValid());

		 appt.setStartDay(1);
		 assertEquals(true,appt.getValid());

		 appt.setStartDay(30);
		 assertEquals(true,appt.getValid());

		 //Forgot year but not working for mutation
		 appt.setStartYear(2019);
		 assertEquals(true,appt.getValid());

	}

	@Test
	public void test07() {
		int startHour=16;
		int startMinute=00;
		int startDay=02;
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


		assertEquals(06,appt.getStartMonth());

		appt.setStartMonth(12);
		assertEquals(true,appt.getValid());

		appt.setStartMonth(1);
		assertEquals(true,appt.getValid());

	}

	@Test
	public void test08() {
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

	@Test
	public void test09() throws Throwable {
		int startHour = 16;
		int startMinute = 00;
		int startDay = 2;
		int startMonth = 06;
		int startYear = 2018;
		String title = "Work Meeting";
		String description = "Meeting to discuss project";

		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		appt.setTitle(null);
		assertEquals("", appt.getTitle());

		appt.setDescription(null);
		assertEquals("", appt.getDescription());

	}

	@Test
	public void test10() {
		int startHour = 16;
		int startMinute = -15;
		int startDay = 2;
		int startMonth = 06;
		int startYear = 2018;
		String title = "Work Meeting";
		String description = "Meeting to discuss project";

		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		assertEquals(null,appt.toString());


	}

	@Test
	public void test11() {
		int startHour = -1;
		int startMinute = 00;
		int startDay = 2;
		int startMonth = 06;
		int startYear = 2018;
		String title = "Work Meeting";
		String description = "Meeting to discuss project";

		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		assertEquals(false,appt.isRecurring());

		int[] recurDayArray = null;

		//appt.setRecurrence(null,2,2,2);
		appt.setRecurrence(null, Appt.RECUR_BY_MONTHLY, 2, Appt.RECUR_NUMBER_NEVER);
		assertEquals(0,appt.getRecurNumber());
		assertEquals(2,appt.getRecurBy());
		assertEquals(2,appt.getRecurIncrement());
		assertEquals(0,appt.getRecurNumber());

	}


//add more unit tests as you needed
	
}
