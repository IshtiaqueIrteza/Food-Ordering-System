import javax.swing.*;
import java.awt.event.*;

class Admin extends JFrame implements ActionListener 
{
	JButton b = new JButton("Admin Login");
	JLabel l = new JLabel("Admin Username");
	JLabel l1 = new JLabel("Admin Password");
	JTextField f = new JTextField();
	JTextField f1 = new JTextField();
	
	public Admin()
	{	
		setSize(600,600);
		setVisible(true);
		setLayout(null);
		setContentPane(new JLabel(new ImageIcon("admin.jpg")));
		
		b.setBounds(400,350,120,40);
		add(b);
		
		l.setBounds(100,150,130,20);
		add(l);
		
		l1.setBounds(100,250,130,20);
		add(l1);
		
		f.setBounds(250,150,200,25);
		add(f);
		
		f1.setBounds(250,250,200,25);
		add(f1);
		
		b.addActionListener(this);
	}
	
	String adminName,adminPassword;
	
	public void actionPerformed(ActionEvent a)
	{
		if(a.getSource() == b)
		{
			adminName = f.getText();
		    adminPassword = f1.getText();
			    
				if(!adminName.equals("") && !adminPassword.equals(""))
			    {
					AdminDatabase s = new AdminDatabase(this);
			    }
				else
			    {
				    JOptionPane.showMessageDialog(null,"Please Fill up required Fields for Login !!!");
			    }
		}
	}
}