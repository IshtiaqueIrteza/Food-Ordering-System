package member;
import checking.*;
import javax.swing.*;
import java.awt.event.*;

/**
     @author Tisha
*/

class MemberPanel extends JFrame implements ActionListener
{
	JButton cngUserName,cngPass,cngAddress,cngMail,cngContact;
	JLabel firstName,lastName,userName,Pass,Address,Mail,Contact,Gender;
	JLabel fname,lname,uname,pass,address,mail,contact,gender;
	Login k;
	
	public MemberPanel(Login k)
	{
        this.k = k;		
		
		setSize(1280,900);
		setVisible(true);
		setLayout(null);
		setContentPane(new JLabel(new ImageIcon("C:/Users/lenovo/Desktop/project4FF/Picture/member.jpg")));
		firstName = new JLabel("First Name");
		lastName = new JLabel("Last Name");
		userName = new JLabel("User Name");
		Pass = new JLabel("Password");
		Address = new JLabel("Address");
		Mail = new JLabel("Email");
		Contact = new JLabel("Contact No.");
		Gender = new JLabel("Gender");
		
		firstName.setBounds(200,250,100,30);
		lastName.setBounds(200,300,100,30);
		userName.setBounds(200,350,100,30);
		Pass.setBounds(200,400,100,30);
		Address.setBounds(200,450,100,30);
		Mail.setBounds(200,500,100,30);
		Contact.setBounds(200,550,100,30);
		Gender.setBounds(200,600,100,30);
		
		add(firstName);
		add(lastName);
		add(userName);
		add(Pass);
		add(Address);
		add(Mail);
		add(Contact);
		add(Gender);
		
		fname = new JLabel(k.first);
		lname = new JLabel(k.last);
		uname = new JLabel(k.userName);
		pass = new JLabel(k.password);
		address = new JLabel(k.address);
		mail = new JLabel(k.mail);
		contact = new JLabel(k.contact);
		
		if((k.gender).equals("M"))
		{
			gender = new JLabel("Male");
		}
		else
		{
			gender = new JLabel("Female");
		}
		
		fname.setBounds(350,250,250,30);
		lname.setBounds(350,300,250,30);
		uname.setBounds(350,350,250,30);
		pass.setBounds(350,400,250,30);
		address.setBounds(350,450,350,30);
		mail.setBounds(350,500,250,30);
		contact.setBounds(350,550,250,30);
		gender.setBounds(350,600,250,30);
		
		add(fname);
		add(lname);
		add(uname);
		add(pass);
		add(address);
		add(mail);
		add(contact);
		add(gender);
		
		
		
		cngUserName = new JButton("Change Name");
		cngPass = new JButton("Change Password");
		cngAddress = new JButton("Change Address");
		cngMail = new JButton("Change Email");
		cngContact = new JButton("Change ContactNO");
		
		cngUserName.setBounds(750,350,150,25);
		cngPass.setBounds(750,400,150,25);
		cngAddress.setBounds(750,450,150,25);
		cngMail.setBounds(750,500,150,25);
		cngContact.setBounds(750,550,150,25);
		
		add(cngUserName);
		add(cngPass);
		add(cngAddress);
		add(cngMail);
		add(cngContact);
		
		cngUserName.addActionListener(this);
		cngPass.addActionListener(this);
		cngAddress.addActionListener(this);
		cngMail.addActionListener(this);
		cngContact.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent a)
	{
		if(a.getSource() == cngUserName)
		{
			String input = JOptionPane.showInputDialog("New Username");
			
			if(input.length() > 0)
			{
				MemberDatabase n = new MemberDatabase("UPDATE `member` SET `User Name` = '"+input+"' WHERE `member`.`User Name` = '"+k.userName+"'");
			}
			else
			{
				JOptionPane.showMessageDialog(this,"You have not submitted required information !!");
			}
		}
		else if(a.getSource() == cngPass)
		{
			String input = JOptionPane.showInputDialog("New Password");
			
			if(input.length() > 0)
			{
				MemberDatabase n = new MemberDatabase("UPDATE `member` SET `Password` = '"+input+"' WHERE `member`.`User Name` = '"+k.userName+"'");
			}
			else
			{
				JOptionPane.showMessageDialog(this,"You have not submitted required information !!");
			}
		}
		else if(a.getSource() == cngAddress)
		{
			String input = JOptionPane.showInputDialog("New Address");
			
			if(input.length() > 0)
			{
				MemberDatabase n = new MemberDatabase("UPDATE `member` SET `Address` = '"+input+"' WHERE `member`.`User Name` = '"+k.userName+"'");	
			}
			else
			{
				JOptionPane.showMessageDialog(this,"You have not submitted required information !!");
			}
		}
		else if(a.getSource() == cngMail)
		{
			String input = JOptionPane.showInputDialog("New Email");
			
			if(input.length() > 0)
			{
				MemberDatabase n = new MemberDatabase("UPDATE `member` SET `Email` = '"+input+"' WHERE `member`.`User Name` = '"+k.userName+"'");
			}
			else
			{
				JOptionPane.showMessageDialog(this,"You have not submitted required information !!");
			}
		}
		else
		{
			String input = JOptionPane.showInputDialog("New ContactNo");
			
			if(input.length() > 0)
			{
				MemberDatabase n = new MemberDatabase("UPDATE `member` SET `Contact No.` = '"+input+"' WHERE `member`.`User Name` = '"+k.userName+"'");
			}
			else
			{
				JOptionPane.showMessageDialog(this,"You have not submitted required information !!");
			}
		}
	}
}