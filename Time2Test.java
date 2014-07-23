import static org.junit.Assert.*;

import org.junit.Test;


public class Time2Test {

	@Test
	// test tang 1 phut
	public void testcase1 () {
		Time2 time1= new Time2(3,24,59);
		Time2 time2 = new Time2(3,25,0);
		time1.tick();
		time2.equals(time1);
		fail("Not yet implemented");
	}
	
	@Test
	// tang 1 gio
	public void testcase2(){
		Time2 time1= new Time2(13,59,59);
		Time2 time2 = new Time2(14,0,0);
		time1.tick();
		time2.equals(time1);
		fail("Not yet implemented");
	}
	
	@Test
	// sang ngay moi
	public void Testcase3(){
		Time2 time1= new Time2(23,59,59);
		Time2 time2 = new Time2(0,0,0);
		time1.tick();
		time2.equals(time1);
		fail("Not yet implemented");
	}

}
