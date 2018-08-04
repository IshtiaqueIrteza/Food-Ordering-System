import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;

class HomeDelivery extends JFrame
{
	JTabbedPane menu;
	JPanel pizza,pastry,drinks,confirm;
	Connection con;
	Statement stmnt;
	
	public HomeDelivery()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/food_shop","root","");
			stmnt = con.createStatement();
			stmnt.executeUpdate("TRUNCATE `temp_order`");
		}
		
		catch(SQLException e)
		{
			System.out.println("Unknown Error");
		}
		
		catch(Exception eg)
		{
			System.out.println("Unknown Error");
		}		
		
		setSize(800,800);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		menu = new JTabbedPane();
	
		menu.addTab("Burger",new JScrollPane(new BurgerPanel(),JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));
		
		menu.addTab("Pizza",new JScrollPane(new PizzaPanel(),JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));
		
		menu.addTab("Pastry",new JScrollPane(new PastryPanel(),JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));
		
		menu.addTab("Drinks",new JScrollPane(new DrinksPanel(),JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));
		
		menu.addTab("Confirm your Order",new CheckStatusPanel());
		
		add(menu);
	}
}