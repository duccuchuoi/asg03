import static org.junit.Assert.*;

import org.junit.Test;


public class DateTest {

	@Test
	public void test() {
		Date date=new Date(2,28,2012);
		Date date1=new Date(2,29,2012);
		date.nextDay();
		date1.equals(date);
		fail("Not yet implemented");
	}

}
