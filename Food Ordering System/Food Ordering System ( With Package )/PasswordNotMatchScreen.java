package checking;
import javax.swing.*;
import java.awt.event.*;

/**
     @author Ishtiaque
*/

public class PasswordNotMatchScreen extends JFrame implements ActionListener
{
	JLabel l = new JLabel("Password field doesn't match with");
	JLabel l1 = new JLabel("confirmed password !!");
	
	JButton b = new JButton("Back");
	
	public PasswordNotMatchScreen()
	{
		setSize(400,200);
		setVisible(true);
		setLayout(null);
		
		l.setBounds(100,80,200,30);
		add(l);
		
		l1.setBounds(130,110,150,30);
		add(l1);
		
		b.setBounds(165,150,80,27);
		add(b);
		
		b.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent a)
	{
		this.setVisible(false);
	}
}