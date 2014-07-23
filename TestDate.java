
public class TestDate extends Date {

	public TestDate(int theMonth, int theDay, int theYear) {
		super(theMonth, theDay, theYear);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] asrg){
		Date date = new Date(12,31,2014);
		date.nextDay();
		date.print();
		
		Date date1 = new Date(2,28,2013);
		date1.nextDay();
		date1.print();
	}

}
