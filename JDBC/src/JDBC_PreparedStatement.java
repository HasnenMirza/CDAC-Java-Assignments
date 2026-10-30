import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class JDBC_PreparedStatement {

	public static void main(String[] args) {
		
		Properties dbproperties=new Properties();
		Scanner sc=new Scanner(System.in);
	
		try( FileInputStream file=new FileInputStream("src/db.properties");)
	  {
			dbproperties.load(file);
			
			String databaseUser=dbproperties.getProperty("connection.username");
			String databasePassword=dbproperties.getProperty("connection.password");
			String databaseURL=dbproperties.getProperty("connection.url");

			try(Connection connection=DriverManager.getConnection(databaseURL, databaseUser, databasePassword);
				PreparedStatement Select=connection.prepareCall("Select * from users");
				PreparedStatement Update=connection.prepareCall("update users set username=? where name=?");
				PreparedStatement Insert=connection.prepareCall("Insert into users values (?,?,?,?,?)");      )
			{
				
				//insert the values
				System.out.println("<===========Insert the values in the table===========>");
				System.out.println("<====================================================>");
				System.out.println("Enter the username");
				String username=sc.nextLine();
				System.out.println("Enter the password");
				String pswd=sc.nextLine();
				System.out.println("Enter the name");
				String name=sc.nextLine();
				System.out.println("Enter the gmail");
				String gmail=sc.nextLine();
				System.out.println("Enter the Mobile number");
				String Mno=sc.nextLine();	
				
				Insert.clearParameters();
				Insert.setString(1, username);
				Insert.setString(2, pswd);
				Insert.setString(3, name);
				Insert.setString(4, gmail);
				Insert.setString(5, Mno);
				
				Insert.executeUpdate();
				System.out.println("RECORD INSERTED\n");
				
				//update the username in users table
				System.out.println("<===========UPDATE the USERNAME in the table===========>");
				System.out.println("<======================================================>");
				System.out.println("Enter the username");
				String updateUsername=sc.nextLine();
				System.out.println("Enter the existing name where username need to be updated");
				String nameCheck=sc.nextLine();
				
				Update.setString(1, updateUsername);
				Update.setString(2,nameCheck);
				Update.executeUpdate();
				System.out.println("RECORD UPDATED\n");

			    ResultSet result=Select.executeQuery();
			    
			  //insert the values
				System.out.println("<===========PRINTING THE USERS TABLE===========>");
				System.out.println("<==============================================>");
				while(result.next()) {
					System.out.println("Username: " +result.getString("username"));
					System.out.println("Password: "+ result.getString("password"));
					System.out.println("Name: " +result.getString("name"));
					System.out.println("Gmail: " +result.getString("email"));
					System.out.println("Mobile_No: "+ result.getString("mobile_no"));
					System.out.println("<================================================>");
				}
					
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
