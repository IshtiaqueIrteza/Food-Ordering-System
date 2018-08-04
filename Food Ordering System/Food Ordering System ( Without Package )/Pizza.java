import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Pizza extends HomeDelivery 
{
JButton b = new JButton("ADD");

	public Pizza()
	{
		setSize(1000,1000);
		setVisible(true);
		setLayout(null);
		
		b.setBounds(110,100,100,30);
	
		add(b);
		}
		}