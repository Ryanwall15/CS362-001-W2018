package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;


import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable {
		 TimeTable RandomTable = new TimeTable();

		 GregorianCalendar next = new GregorianCalendar(2018, 6, 10);
		 GregorianCalendar prev = new GregorianCalendar(2018, 6, 30);

		 CalDay calday = new CalDay(next);
		 CalDay calday2 = new CalDay(prev);

		 LinkedList<CalDay> calDays = new LinkedList<CalDay>();


		 int startHour = 12;
		 int startMinute = 00;
		 int startDay = 15;
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

		 startHour = 12;
		 startMinute = 00;
		 startDay = 15;
		 startMonth = 06;
		 startYear = 2019;
		 title = "Work Meeting";
		 description = "Meeting to discuss project";

		 Appt appt2 = new Appt(startHour,
				 startMinute,
				 startDay,
				 startMonth,
				 startYear,
				 title,
				 description);

		 startHour = -1;
		 startMinute = 00;
		 startDay = 05;
		 startMonth = 06;
		 startYear = 2019;
		 title = "Work Meeting Bad";
		 description = "Meeting to discuss project";

		 Appt appt3 = new Appt(startHour,
				 startMinute,
				 startDay,
				 startMonth,
				 startYear,
				 title,
				 description);


		 LinkedList<Appt> appts = new LinkedList<Appt>();

		 appts.add(appt);
		 appts.add(appt2);
		 appts.add(appt3);

		 calDays = RandomTable.getApptRange(appts, next, prev);

		 assertEquals(false,appt3.getValid());
		 assertEquals(null, RandomTable.deleteAppt(appts, appt));
		 assertEquals(null, RandomTable.deleteAppt(appts, appt3));

	 }



	 @Test
	  public void test02()  throws Throwable  {
	 	TimeTable RandonTable = new TimeTable();

		 int startHour = 12;
		 int startMinute = 00;
		 int startDay = 15;
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

		 LinkedList<Appt> nullAppt = null;

		 assertEquals(null, RandonTable.deleteAppt(nullAppt, appt));

		 
	 }
//add more unit tests as you needed
}
