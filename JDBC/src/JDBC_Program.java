import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class JDBC_Program {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
		
			Properties dbproperties=new Properties();
			try(FileInputStream file=new FileInputStream("src/db.properties")) {
				dbproperties.load(file);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String user=dbproperties.getProperty("connection.username");
			String password=dbproperties.getProperty("connection.password");
			String url=dbproperties.getProperty("connection.url");


			
			try(Connection connection=DriverManager.getConnection(url,user,password);
					Statement stSelect=connection.createStatement();
					Statement stInsert=connection.createStatement();
					Statement stUpdate=connection.createStatement();
					PreparedStatement Select1=connection.prepareStatement("insert into users set=? where Username=?");
					) {
			
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
			
			stInsert.executeUpdate("insert into users values('"+username+"','"+pswd+"','"+name+"','"+
					gmail+"','"+Mno+"')");
			System.out.println("Inserted value");
			
			stUpdate.executeUpdate("Update users set username='"+username+"' where name='"+name+"'");
			System.out.println("updated");
			
					
			ResultSet result=stSelect.executeQuery("Select * from users");
				
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
