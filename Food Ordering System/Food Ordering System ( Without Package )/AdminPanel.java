import javax.swing.*;
import java.awt.event.*;

class AdminPanel extends JFrame implements ActionListener
{
	JButton manage,placeOrder,adminProfile;
	String name,pass,address,mail,contact,gender;
	int id;
	AdminDatabase m;
	
	public AdminPanel(AdminDatabase m)
	{
		this.m = m;
		
		setSize(900,800);
		setVisible(true);
		setLayout(null);
		 setContentPane(new JLabel(new ImageIcon("C:/Users/lenovo/Desktop/project4FF/Picture/admin.jpg")));
		
		manage = new JButton("Manage Food");
		placeOrder = new JButton("Place Order");
		adminProfile = new JButton(m.name);
		
		manage.setBounds(150,100,150,30);
		placeOrder.setBounds(350,100,150,30);
		adminProfile.setBounds(550,100,150,30);
		
		add(manage);
		add(placeOrder);
		add(adminProfile);
		
		manage.addActionListener(this);
		placeOrder.addActionListener(this);
		adminProfile.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent a)
	{
		if(a.getSource() == manage)
		{
			//gfhgf
		}
		else if(a.getSource() == placeOrder)
		{
		    PlaceOrder p = new PlaceOrder();
		}
		else
		{
			AdminProfile j = new AdminProfile(m);
		}
	}
}