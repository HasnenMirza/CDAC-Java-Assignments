import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Program {

	public static void main(String[] args) {
		Connection connection=null;
		Statement stSelect=null;
		ResultSet result=null;
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
		String user = "root";
		String password = "root";
		
		try {
			connection=DriverManager.getConnection(url,user,password);
			stSelect=connection.createStatement();
			result=stSelect.executeQuery("Select * from users");
			
			while(result.next()) {
				System.out.println("Username: " +result.getString("username"));
				System.out.println("Password: "+ result.getString("password"));
				System.out.println("Name: " +result.getString("name"));
				System.out.println("Gmail: " +result.getString("email"));
				System.out.println("Mobile_No: "+ result.getString("mobile_no"));
				System.out.println("<================================================>");
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
