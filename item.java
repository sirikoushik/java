package inheritance;

public abstract class item
{
	private int id;
	private String title;
	private int copies;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	@Override
	public String toString() {
		return "item [id=" + id + ", title=" + title + ", copies=" + copies + "]";
	}
	public item(int id, String title, int copies) {
		super();
		this.id = id;
		this.title = title;
		this.copies = copies;
	}
	public boolean checkIn()
	{
		return false;
	}
	public boolean checkOut()
	{
		return false;
	}
	void print()
	{
		System.out.println();
	}
	
}
