package Assignment6;

public interface IDatabaseManager {
	
	public String getData(String query);
	
	public String getDbContext();

	public boolean setData(String query);
	
}
