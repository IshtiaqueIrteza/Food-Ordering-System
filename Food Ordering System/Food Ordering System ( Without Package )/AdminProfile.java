import javax.swing.*;
import java.awt.event.*;

class AdminProfile extends JFrame implements ActionListener
{
	JButton cngName,cngPass,cngAddress,cngMail,cngContact;
	JLabel Id,Name,Pass,Address,Mail,Contact,Gender;
	JLabel id,name,pass,address,mail,contact,gender;
	AdminDatabase l;
	
	public AdminProfile(AdminDatabase l)
	{
		this.l = l;
		
		setSize(1000,600);
		setVisible(true);
		setLayout(null);
		
	  setContentPane(new JLabel(new ImageIcon("C:/Users/lenovo/Desktop/project4FF/Picture/adminpro.jpg")));
		
		
		
		Id = new JLabel("Id");
		Name = new JLabel("Name");
		Pass = new JLabel("Password");
		Address = new JLabel("Address");
		Mail = new JLabel("Email");
		Contact = new JLabel("Contact");
		Gender = new JLabel("Gender");
		
		/*Id.setForeground (Color.green);
		Name.setForeground (Color.green);
		Pass.setForeground (Color.green);
		Address.setForeground (Color.green);
		Contact.setForeground (Color.green);
		Gender.setForeground (Color.green);*/
		
		Id.setBounds(200,200,50,30);
		Name.setBounds(200,250,50,30);
		Pass.setBounds(200,300,80,30);
		Address.setBounds(200,350,50,30);
		Mail.setBounds(200,400,50,30);
		Contact.setBounds(200,450,50,30);
		Gender.setBounds(200,500,50,30);
		
		add(Id);
		add(Name);
		add(Pass);
		add(Address);
		add(Mail);
		add(Contact);
		add(Gender);
		
		id = new JLabel(Integer.toString(l.id));
		name = new JLabel(l.name);
		pass = new JLabel(l.pass);
		address = new JLabel(l.address);
		mail = new JLabel(l.mail);
		contact = new JLabel(l.contact);
		
		if((l.gender).equals("M"))
		{
			gender = new JLabel("Male");
		}
		else
		{
			gender = new JLabel("Female");
		}
		
		id.setBounds(300,200,50,30);
		name.setBounds(300,250,100,30);
		pass.setBounds(300,300,100,30);
		address.setBounds(300,350,500,30);
		mail.setBounds(300,400,200,30);
		contact.setBounds(300,450,100,30);
		gender.setBounds(300,500,100,30);
		
		add(id);
		add(name);
		add(pass);
		add(address);
		add(mail);
		add(contact);
		add(gender);
		
		cngName = new JButton("Change Name");
		cngPass = new JButton("Change Password");
		cngAddress = new JButton("Change Address");
		cngMail = new JButton("Change Email");
		cngContact = new JButton("Change ContactNO");
		
		cngName.setBounds(900,250,145,25);
		cngPass.setBounds(900,300,145,25);
		cngAddress.setBounds(900,350,145,25);
		cngMail.setBounds(900,400,145,25);
		cngContact.setBounds(900,450,145,25);
		
		add(cngName);
		add(cngPass);
		add(cngAddress);
		add(cngMail);
		add(cngContact);
		
		cngName.addActionListener(this);
		cngPass.addActionListener(this);
		cngAddress.addActionListener(this);
		cngMail.addActionListener(this);
		cngContact.addActionListener(this);
		
		
	}
	
	public void actionPerformed(ActionEvent a)
	{
		if(a.getSource() == cngName)
		{
			String input = JOptionPane.showInputDialog("New Name");
			
			if(input.length() > 0)
			{
				AdminDatabase n = new AdminDatabase("UPDATE `admin` SET `Name` = '"+input+"' WHERE `admin`.`ID_No` = '"+l.id+"'");
			}
		}
		else if(a.getSource() == cngPass)
		{
			String input = JOptionPane.showInputDialog("New Password");
			
			if(input.length() > 0)
			{
				AdminDatabase n = new AdminDatabase("UPDATE `admin` SET `Password` = '"+input+"' WHERE `admin`.`ID_No` = '"+l.id+"'");
			}
		}
		else if(a.getSource() == cngAddress)
		{
			String input = JOptionPane.showInputDialog("New Address");
			
			if(input.length() > 0)
			{
				AdminDatabase n = new AdminDatabase("UPDATE `admin` SET `Address` = '"+input+"' WHERE `admin`.`ID_No` = '"+l.id+"'");	
			}
		}
		else if(a.getSource() == cngMail)
		{
			String input = JOptionPane.showInputDialog("New Email");
			
			if(input.length() > 0)
			{
				AdminDatabase n = new AdminDatabase("UPDATE `admin` SET `Email` = '"+input+"' WHERE `admin`.`ID_No` = '"+l.id+"'");
			}
		}
		else
		{
			String input = JOptionPane.showInputDialog("New ContactNo");
			
			if(input.length() > 0)
			{
				AdminDatabase n = new AdminDatabase("UPDATE `admin` SET `Contact_No` = '"+input+"' WHERE `admin`.`ID_No` = '"+l.id+"'");
			}
		}
	}
}