import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DataCom {
	
	private Connection con;
	
	public DataCom() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://:localhost:3306/java-project","root","");
	}
	
	public ResultSet selectAllItems() throws Exception
	{
		PreparedStatement statement = con.prepareStatement("select * from item");
		
		ResultSet res = statement.executeQuery();
		return res;
	}
	
	public ResultSet selectAllFromBin(int binNum) throws Exception
	{
		PreparedStatement statement = con.prepareStatement("select * from item where bin_number="+binNum);
		
		ResultSet res = statement.executeQuery();
		return res;
	}
	
	public void insertItem(String name, int quantity, int binNum) throws Exception
	{
		PreparedStatement statement = con.prepareStatement("INSERT INTO `java-project`.item(item_name,item_quantity,bin_number) VALUES ("+name+","+quantity+","+binNum+")");
		
		ResultSet res = statement.executeQuery();
	}
}
