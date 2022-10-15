package Assignment6;

import java.util.List;

public class Driver {

	public static void main(String[] args) {
		
		IDatabaseManager databaseManager = new MySQLDatabaseManager();
		databaseManager.getData("SELECT country FROM dvd_rental");
		IDatabaseManager databaseManager2 = new OracleDatabaseManager();
		databaseManager.
		setData("INSERT INTO Customers (CustomerName, City, Country)+ VALUES ('Cardinal', 'Stavanger', 'Norway')");
		
		IDatabaseManager databaseManager3 = new PostgreSQLManager();
		databaseManager3.getData("SELECT COUNT(CustomerID), Country + FROM Customers + GROUP BY Country;");
		ILogger logger = new SQLLogger(databaseManager2, databaseManager3, databaseManager);
		List<String> list = logger.log();
		for (String x : list) {
			System.out.println(x);
		}	
	}
}
