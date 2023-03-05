package Dependies_Zeline;
import java.sql.Connection;
import java.sql.DriverManager;
public class MySQL_Connector {
	public static Connection getConnection() {
		Connection con=null;
		try {
			con=DriverManager.getConnection("jdbc:mysql://mydb.cafjfk8jwlx1.ap-south-1.rds.amazonaws.com:3306/lockdownbrow?autoReconnect=true&useSSL=false","admin","13May2003");
			//con=DriverManager.getConnection("jdbc:mysql://localhost/Lockdownbrow","root","");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
	public static void main(String args[]) {
		Connection con=getConnection();
		if(con==null) {
			System.out.println("Not Connected!");
		}
		else
			System.out.println("***Connected!***");	
	}
}

//@Author: Zeline Project Services

