import javax.swing.*;
import java.awt.event.*;

class LoginFailedScreen extends JFrame implements ActionListener
{
	JLabel l = new JLabel("Invalid Credential");
	JLabel l1 = new JLabel("Login Failed !!");
	JButton b = new JButton("Back");
	
	public LoginFailedScreen()
	{
		setSize(400,400);
		setVisible(true);
		setLayout(null);
		setContentPane(new JLabel(new ImageIcon("loginfail.jpg")));
		
		l.setBounds(150,200,200,30);
		add(l);
		
		l1.setBounds(160,230,200,30);
		add(l1);
		
		b.setBounds(170,280,50,25);
		add(b);
		
		b.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent a)
	{
		this.setVisible(false);
	}
}