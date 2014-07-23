
public class TestTime2 extends Time2{
	public static void main(String[] asrg) {
		Time2 time=new Time2 (4,23,59);
		time.PrintTime();
		time.tick();
		time.PrintTime();
		
		
		Time2 time2=new Time2(15,59,59);
		time2.PrintTime();
		time2.tick();
		time2.PrintTime();
		
		Time2 time3=new Time2(23,59,59);
		time3.PrintTime();
		time3.tick();
		time3.PrintTime();
	}

}
