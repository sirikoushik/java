package inheritance;

public class JournalPaper extends WrittenItem
{
	private int year;
    public JournalPaper(int id, String title, int copies) 
    {
		super(id, title, copies);
		
		// TODO Auto-generated constructor stub
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

}
