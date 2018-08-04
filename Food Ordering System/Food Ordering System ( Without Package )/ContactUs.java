import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ContactUs extends Homepage
{
	JLabel l = new JLabel("FR Tower ,Ground Floor ");
	JLabel l1 = new JLabel("32, Kamal Ataturk Avenue, Banani");
	JLabel l2 = new JLabel(" Contact #+88001700-00000 ");
	JLabel l3 = new JLabel("Saturday to Thursday 10:00 am – 10:00 pm ");
	JLabel l4 = new JLabel("Friday	3:00 – 10:00 pm  ");
	JLabel l5 = new JLabel("Please Give Us Your Valuable Feedback ");
	JLabel l6 = new JLabel("Email");
	JTextField f = new JTextField();
	JLabel l7 = new JLabel("Feedback");
	JTextField f1 = new JTextField();
	JButton b = new JButton();
	
	
	
	public ContactUs()
	{
		//setSize(1500,1000);
		//setVisible(true);
		//setLayout(null);
		
		l.setBounds(110,100,600,30);
		l.setFont(new Font("Monotype Corsiva",25,25));
		l.setForeground (Color.white);
		add(l);
		
		l1.setBounds(110,130,600,30);
		l1.setFont(new Font("Monotype Corsiva",25,25));
		l1.setForeground (Color.white);
		add(l1);
		
		l2.setBounds(110,160,600,30);
		l2.setFont(new Font("Monotype Corsiva",25,25));
		l2.setForeground (Color.white);
		add(l2);
		
		l3.setBounds(110,190,600,30);
		l3.setFont(new Font("Monotype Corsiva",25,25));
		l3.setForeground (Color.white);
		add(l3);
		
		l4.setBounds(110,220,600,30);
		l4.setFont(new Font("Monotype Corsiva",25,25));
		l4.setForeground (Color.white);
		add(l4);
		
		l5.setBounds(800,350,600,30);
		l5.setFont(new Font("Monotype Corsiva",25,25));
		l5.setForeground (Color.white);
		add(l5);
		
		
		l6.setBounds(850,400,100,30);
		l6.setFont(new Font("Monotype Corsiva",25,25));
		l6.setForeground (Color.white);
		add(l6);
		
		f.setBounds(950,400,250,30);
		f.setForeground (Color.white);
		add(f);
		
		l7.setBounds(850,450,100,30);
		l7.setFont(new Font("Monotype Corsiva",25,25));
		l7.setForeground (Color.white);
		add(l7);
		
		f1.setBounds(950,450,250,120);
		f1.setForeground (Color.white);
		add(f1);
		
		add(b);
		b.setBounds(950,600,150,30);
		b.setIcon(new ImageIcon("C:/Users/lenovo/Desktop/project4FF/Picture/submit.png"));
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
				Admin B = new Admin();
			}
			else
			{
				Login n = new Login();
			}
	}
}