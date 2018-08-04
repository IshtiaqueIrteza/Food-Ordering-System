import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;

class MemberDatabase
{	
    JTable memberList;	
	
	public MemberDatabase()
	{	
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/food_shop","root","");
			Statement stmnt = con.createStatement();
			ResultSet rs = stmnt.executeQuery("SELECT * FROM `member`");
			
			ResultSetMetaData rsmetadata = rs.getMetaData();
			int col = rsmetadata.getColumnCount();
			DefaultTableModel dtm = new DefaultTableModel();
			
			Vector<String> col_name = new Vector<String>();
			Vector<Object> row_data = new Vector<Object>();
			
			for(int i=1;i<=col;i++)
			{
				col_name.addElement(rsmetadata.getColumnName(i));
			}
			
			dtm.setColumnIdentifiers(col_name);
			
			while(rs.next())
			{
				row_data = new Vector<Object>();
				
				for(int i=1;i<=col;i++)
				{
					row_data.addElement(rs.getObject(i));
				}
				
				dtm.addRow(row_data);
			}
			
			memberList = new JTable();
			
			memberList.setModel(dtm);
		}
		
		catch(SQLException e)
		{
			System.out.println("Unknown Error");
		}
		
		catch(Exception eg)
		{
			System.out.println("Unknown Error");
		}
	}
	
	public MemberDatabase(String query)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/food_shop","root","");
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate(query);	
		}
		
		catch(SQLException e)
		{
			System.out.println("Unknown Error");
		}
		
		catch(Exception eg)
		{
			System.out.println("Unknown Error");
		}
	}
} 