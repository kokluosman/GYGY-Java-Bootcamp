package Assignment6;

public class OracleDatabaseManager implements IDatabaseManager {

	@Override
	public String getData(String query) {
		System.err.println("Sorgu Çalıştırıldı");
		return query;
		
	}

	@Override
	public String getDbContext() {
		return "Data Source=|DataDirectory|Oracle.sdf";
	}

	@Override
	public boolean setData(String query) {
		System.out.println("X rows affected!");
		return true;
	}

}
