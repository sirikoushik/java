package inheritance;

public abstract class MediaItem extends item 
{
	private int Runtime;
	public MediaItem(int id, String title, int copies) {
		super(id, title, copies);
		
		// TODO Auto-generated constructor stub
	}
	public int getRuntime() {
		return Runtime;
	}
	public void setRuntime(int runtime) {
		Runtime = runtime;
	}
	

}
