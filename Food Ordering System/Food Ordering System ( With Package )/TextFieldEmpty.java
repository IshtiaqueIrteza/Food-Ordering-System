package checking;
import javax.swing.*;
import java.awt.event.*;

/**
     @author Tisha
*/

public class TextFieldEmpty extends JFrame implements ActionListener
{
	JLabel l = new JLabel("You need to fill up every required field !!");
	JButton b = new JButton("Back");
	
	public TextFieldEmpty()
	{
		setSize(300,250);
		setVisible(true);
		setLayout(null);
		
		l.setBounds(40,115,250,30);
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