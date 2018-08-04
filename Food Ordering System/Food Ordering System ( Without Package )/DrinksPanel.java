import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;

class DrinksPanel extends JPanel implements ActionListener
{
	DrinksData t;
	JPanel p[];
	JLabel image[];
	JLabel name[];
	JLabel price[];
	JButton b[];
	int row;
	Connection con;
	Statement stmnt;
	
	public DrinksPanel()
	{
        try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/food_shop","root","");
			stmnt = con.createStatement();
		}
		
		catch(SQLException e)
		{
			System.out.println("Unknown Error");
		}
		
		catch(Exception eg)
		{
			System.out.println("Unknown Error");
		}		
		
		setLayout(new GridLayout(3,4));
		
		t = new DrinksData();
		
		row = (t.DrinksList).getRowCount();
		
		p = new JPanel[row];
		image = new JLabel[row];
		name = new JLabel[row];
		price = new JLabel[row];
		b = new JButton[row];
		
		for(int i=0;i<row;i++)
		{	
			p[i] = new JPanel();
			p[i].setLayout(new BoxLayout(p[i],BoxLayout.PAGE_AXIS));
			p[i].add(Box.createRigidArea(new Dimension(50,50)));
			
			image[i] = new JLabel((ImageIcon)((t.DrinksList).getValueAt(i,4)));
			b[i] = new JButton("ADD");
			name[i] = new JLabel((String)(t.DrinksList).getValueAt(i,1));
			price[i] = new JLabel(((Double)((t.DrinksList).getValueAt(i,2))).toString());
			
			p[i].add(image[i]);
			p[i].add(name[i]);
			p[i].add(price[i]);
			p[i].add(b[i]);
			
			add(p[i]);
			
			b[i].addActionListener(this);
		}
	}
	
	public void actionPerformed(ActionEvent a)
	{
		   for(int i=0;i<row;i++)
			{
				if(a.getSource() == b[i])
				{
					String name = (String)(t.DrinksList).getValueAt(i,1);
					Double pro_Price = (Double)(t.DrinksList).getValueAt(i,2);
						
						try
						{
							stmnt.executeUpdate("INSERT INTO `Temp_Order` (`Product_Name`, `Product_Price`) VALUES ('"+name+"', '"+pro_Price+"');");
						}
						catch(SQLException e)
						{
							JOptionPane.showMessageDialog(null,"You have already inserted this item");
						}
						catch(Exception eg)
						{
							System.out.println("Unknown Error");
						}
				}
			}
	}
}