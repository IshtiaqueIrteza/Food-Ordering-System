package member;
import javax.swing.*;
import java.awt.event.*;

/**
     @author Tisha
*/

class RegistrationConfirmedScreen extends JFrame implements ActionListener
{
	JLabel l = new JLabel("Registration Confirmed Successfully");
	JButton b = new JButton("OK");
	
	public RegistrationConfirmedScreen()
	{
		setSize(300,230);
		setVisible(true);
		setLayout(null);
		
		l.setBounds(50,100,230,30);
		add(l);
		
		b.setBounds(110,150,80,27);
		add(b);
		
		b.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent a)
	{
		this.setVisible(false);
	}
}