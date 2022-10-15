package Assignment6;

public class PostgreSQLManager implements IDatabaseManager {

	@Override
	public String getData(String query) {
		System.err.println("Sorgu Çalıştırıldı");
		return query;
	}

	@Override
	public String getDbContext() {
		return "Data Source=|DataDirectory|PostgreSQL.sdf";
	}

	@Override
	public boolean setData(String query) {
		System.out.println("X rows affected!");
		return true;
	}

}
