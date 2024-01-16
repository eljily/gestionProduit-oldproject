package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {
private static Connection connection ;
static {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		try {
		Connection	connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gproduit","root","36612045Dd");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	
}
public static Connection getConnection() {
	return connection;
}
}
