package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCtry {
	public static void main(String[] args) throws ClassNotFoundException{
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		String cs="jdbc:oracle:thin:@localhost:1521:XE";
		
		try {
			Connection conn=DriverManager.getConnection(cs,"hr","hr");
			if(conn!=null)
				System.out.println("connected!");
			else
				System.out.println("not connected!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}

}
