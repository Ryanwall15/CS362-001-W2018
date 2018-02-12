package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;


import org.junit.Test;


import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  { //Constructor part 1
	 	CalDay BadRandom = new CalDay();
	 	assertEquals(false,BadRandom.isValid());

	 }

	 @Test
	  public void test02()  throws Throwable  { //Constructor part 2
	 	GregorianCalendar GoodRandom = new GregorianCalendar(2018,6,26);
	 	CalDay Random = new CalDay(GoodRandom);

	 	assertEquals(true,Random.isValid());
	 	assertEquals(2018, Random.getYear());
	 	assertEquals(6, Random.getMonth());
	 	assertEquals(26, Random.getDay());
		 
	 }

	 @Test
	public void test03() throws Throwable { //Add 2 calendar's together
	 	GregorianCalendar GoodRandom = new GregorianCalendar(2018, 6, 26);
	 	CalDay Random = new CalDay(GoodRandom);
	 	assertTrue(Random.isValid());

		 int startHour=12;
		 int startMinute=30;
		 int startDay=26;
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

		 Random.addAppt(appt);


		 startHour=14;
		 startMinute=30;
		 startDay=26;
		 startMonth=06;
		 startYear=2018;
		 title="Fornite";
		 description="Gotta place first";

		 Appt appt2 = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);

		 Random.addAppt(appt2);

		 LinkedList<Appt> appts = Random.getAppts();

		 assertTrue(appts.contains(appt));
		 assertTrue(appts.contains(appt2));

		 assertEquals(12,Random.getAppts().get(0).getStartHour());

	 }
	 
//add more unit tests as you needed	
}
