import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.*;
//import javax.swing.JPanel;

class Homepage extends JFrame implements ActionListener
{
JButton b1= new JButton();
JButton b2 = new JButton();
JButton b3 = new JButton();
JButton b4 = new JButton();
JButton b5 = new JButton();
JButton b6 = new JButton();

public Homepage()
{
		
		setVisible(true);
		
		setLayout(null);
		
		
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	
        setContentPane(new JLabel(new ImageIcon("C:/Users/lenovo/Desktop/project4FF/Picture/homepage.jpg")));
        
        
		
		add(b1);
		b1.setBounds(100,40,90,30);
		b1.setIcon(new ImageIcon("home.png"));
		
		
		add(b2);
		b2.setBounds(230,40,90,30);
		b2.setIcon(new ImageIcon("menu.png"));
		
		add(b3);
		b3.setBounds(360,40,190,30);
		b3.setIcon(new ImageIcon("delivery.png"));
		
		
		add(b4);
		b4.setBounds(580,40,150,30);
		b4.setIcon(new ImageIcon("contact.png"));
		
		add(b5);
		b5.setBounds(900,40,170,30);
		b5.setIcon(new ImageIcon("admin.png"));
		
		add(b6);
		b6.setBounds(1100,40,170,30);
		b6.setIcon(new ImageIcon("user.png"));
		
		 setSize(1500,1000);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
       
		
		}
public void actionPerformed(ActionEvent a)
	{
		   if(a.getSource() == b1)
			{
				this.setVisible(false);
				Homepage h = new Homepage();
			}
		   else if(a.getSource() == b2)
			{
				this.setVisible(false);
				Menu m = new Menu();
			}
		   else if(a.getSource() == b3)
			{
				HomeDelivery s = new HomeDelivery();
			}
			else if(a.getSource() == b4)
			{
				this.setVisible(false);
				ContactUs c = new ContactUs();
			}
			else if(a.getSource() == b5)
			{
				Admin A = new Admin();
			}
			else
			{
				Login n = new Login();
			}
	}


	

}
