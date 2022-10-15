package Assignment6;

import java.util.LinkedList;
import java.util.List;

public class SQLLogger implements ILogger{
	
	IDatabaseManager oracleDatabaseManager;
	IDatabaseManager postgreSQLManager;
	IDatabaseManager mySQLDatabaseManager;
	
	public SQLLogger(IDatabaseManager databaseManager2, IDatabaseManager databaseManager3,
			IDatabaseManager databaseManager) {
		super();
		this.oracleDatabaseManager = databaseManager2;
		this.postgreSQLManager = databaseManager3;
		this.mySQLDatabaseManager = databaseManager;
	}

	@Override
	public List<String> log() {
		List<String> list = new LinkedList<>(); 
		list.add(oracleDatabaseManager.getDbContext());
		list.add(postgreSQLManager.getDbContext());
		list.add(mySQLDatabaseManager.getDbContext());
		return list;
	}
}
