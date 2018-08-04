import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;

class ConfirmYourOrder implements ActionListener
{
	JFrame f;
	ArrayList<String> name;
	ArrayList<Double> price;
	JLabel nameArr[],priceArr[];
	JPanel mainPanel;
	JPanel setLabel;
	JPanel items[];
	JLabel setName,setQuantity,setPrice,setCancel;
	JSpinner quantityArr[];
	SpinnerNumberModel model[];
	JButton delete[];
	JScrollPane scroll;
	int arrSize;
	JPanel order;
	JLabel topText;
	int flag;
	JLabel showTotal;
	JLabel netTotal;
	JPanel totalAmount;
	JButton confirm,cancel;
	JPanel confirmation;
	Double total;
	Connection con;
	Statement stmnt;
	
	public ConfirmYourOrder()
	{
		name = new ArrayList<String>();
		price = new ArrayList<Double>();
		total = 0.0;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/food_shop","root","");
			stmnt = con.createStatement();
			ResultSet rs = stmnt.executeQuery("SELECT * FROM `temp_order`");
			
			while(rs.next())
			{
				name.add(rs.getString(1));
				price.add(rs.getDouble(2));
			}
		}
		
		catch(SQLException e)
		{
			System.out.println("Unknown Error");
		}
		
		catch(Exception eg)
		{
			System.out.println("Unknown Error");
		}
		
		arrSize = name.size();
	
	    nameArr = new JLabel[arrSize];
	    priceArr = new JLabel[arrSize];
	    quantityArr = new JSpinner[arrSize];
	    delete = new JButton[arrSize];
		model = new SpinnerNumberModel[arrSize];
		items = new JPanel[arrSize];
		
		order = new JPanel();
		order.setLayout(new BoxLayout(order,BoxLayout.PAGE_AXIS));
		topText = new JLabel("Welcome");
		topText.setFont(new Font("Serif", Font.BOLD, 50));
		order.add(topText);
		
		setLabel = new JPanel();
		setLabel.setLayout(new BoxLayout(setLabel,BoxLayout.LINE_AXIS));
		setLabel.add(Box.createRigidArea(new Dimension(50,0)));
		
		setName = new JLabel("Food_Name");
		setQuantity = new JLabel("Quantity");
		setPrice = new JLabel("Total Price");
		setCancel = new JLabel("Cancel");
		
		setLabel.add(setName);
		setLabel.add(Box.createRigidArea(new Dimension(50,0)));
		setLabel.add(setQuantity);
		setLabel.add(Box.createRigidArea(new Dimension(50,0)));
		setLabel.add(setPrice);
		setLabel.add(Box.createRigidArea(new Dimension(50,0)));
		setLabel.add(setCancel);
		setLabel.add(Box.createRigidArea(new Dimension(50,0)));
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.PAGE_AXIS));
		mainPanel.add(Box.createRigidArea(new Dimension(50,50)));
		
		mainPanel.add(order);
		mainPanel.add(Box.createRigidArea(new Dimension(0,50)));
		
		mainPanel.add(setLabel);
		mainPanel.add(Box.createRigidArea(new Dimension(0,50)));
		
		for(int i=0;i<arrSize;i++)
		{
			items[i] = new JPanel();
			items[i].setLayout(new BoxLayout(items[i],BoxLayout.LINE_AXIS));
			items[i].add(Box.createRigidArea(new Dimension(50,0)));
			
			nameArr[i] = new JLabel(name.get(i));
			priceArr[i] = new JLabel((price.get(i)).toString());
			total+=price.get(i);
			model[i] = new SpinnerNumberModel(1,0,1000,1);
			quantityArr[i] = new JSpinner(model[i]);
			delete[i] = new JButton("C");
			
			items[i].add(nameArr[i]);
			items[i].add(Box.createRigidArea(new Dimension(50,0)));
			quantityArr[i].setMaximumSize(quantityArr[i].getPreferredSize());
			items[i].add(quantityArr[i]);
			items[i].add(Box.createRigidArea(new Dimension(50,0)));
			items[i].add(priceArr[i]);
			items[i].add(Box.createRigidArea(new Dimension(50,0)));
			items[i].add(delete[i]);
			items[i].add(Box.createRigidArea(new Dimension(50,0)));
			
			mainPanel.add(items[i]);
			mainPanel.add(Box.createRigidArea(new Dimension(50,50)));
		}
		
		totalAmount = new JPanel();
		totalAmount.setLayout(new BoxLayout(totalAmount,BoxLayout.LINE_AXIS));
		totalAmount.add(Box.createRigidArea(new Dimension(100,50)));
		
		netTotal = new JLabel("Net Total = ");
		totalAmount.add(netTotal);
		totalAmount.add(Box.createRigidArea(new Dimension(50,0)));
		showTotal = new JLabel(total.toString());
		totalAmount.add(showTotal);
		totalAmount.add(Box.createRigidArea(new Dimension(50,0)));
		mainPanel.add(totalAmount);
		mainPanel.add(Box.createRigidArea(new Dimension(50,50)));
		
		confirm = new JButton("Confirm");
		cancel = new JButton("Cancel");
		
		confirm.addActionListener(this);
		cancel.addActionListener(this);
		
		confirmation = new JPanel();
		confirmation.setLayout(new BoxLayout(confirmation,BoxLayout.LINE_AXIS));
		confirmation.add(Box.createRigidArea(new Dimension(50,50)));
		
		confirmation.add(confirm);
		confirmation.add(Box.createRigidArea(new Dimension(150,0)));
		confirmation.add(cancel);
		confirmation.add(Box.createRigidArea(new Dimension(50,0)));
		
		mainPanel.add(confirmation);
		mainPanel.add(Box.createRigidArea(new Dimension(50,50)));
		
		
		
		ChangeListener listener = new ChangeListener() {
        public void stateChanged(ChangeEvent e) {
    
	    JSpinner s = (JSpinner) e.getSource();
	
    for(int i=0;i<arrSize;i++)
	{
		if(s == quantityArr[i])
		{
			if(!(priceArr[i].getText()).equals("")) //a deleted row's  priceArr[i].getText() is equal to null
			{
				//total-=(Double.parseDouble(priceArr[i].getText()));
				Double d = price.get(i);
			    Double ans = (((Integer)s.getValue())*d);
			    priceArr[i].setText(ans.toString());
				total+=ans;
				showTotal.setText(total.toString());
			    break;
			}
		}
	}
      
	}
    
	};
	
	for(int i=0;i<arrSize;i++)
	{
		quantityArr[i].addChangeListener(listener);
		delete[i].addActionListener(this);
	}
		
		scroll = new JScrollPane(mainPanel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		f = new JFrame();
		f.setSize(800,800);
		f.add(scroll);
		
		f.setVisible(true);
	
	}
	
	String foodName;
	
	public void actionPerformed(ActionEvent a)
	{
		if(a.getSource() == confirm)
		{
			if(arrSize != 0)
			{
			
			JPanel panel = new JPanel();
			panel.setLayout(new BoxLayout(panel,BoxLayout.PAGE_AXIS));
			panel.add(Box.createRigidArea(new Dimension(20,20)));
			JLabel l = new JLabel("Enter your name");
			panel.add(l);
			panel.add(Box.createRigidArea(new Dimension(0,20)));
			JTextField field1 = new JTextField(10);
			panel.add(field1);
			panel.add(Box.createRigidArea(new Dimension(0,20)));
			JLabel l1 = new JLabel("Enter your address");
			panel.add(l1);
			panel.add(Box.createRigidArea(new Dimension(0,20)));
			JTextField field2 = new JTextField(10);
			panel.add(field2);
			panel.add(Box.createRigidArea(new Dimension(0,20)));
			JLabel l2 = new JLabel("Enter your contact no");
			panel.add(l2);
			panel.add(Box.createRigidArea(new Dimension(0,20)));
			JTextField field3 = new JTextField(10);
			panel.add(field3);
			panel.add(Box.createRigidArea(new Dimension(0,20)));
			
			int value = JOptionPane.showConfirmDialog(f, panel, "Enter text", JOptionPane.OK_CANCEL_OPTION);
			
			if (value == JOptionPane.OK_OPTION)
			{
				 String s1 = field1.getText();
				 String s2 = field2.getText();
				 String s3 = field3.getText();
				 
				 if((!s1.equals("")) && (!s2.equals("")) && (!s3.equals("")))
				 {
					 JOptionPane.showMessageDialog(null,"Please wait for confirmation call at your number");
				 }
                 else
				 {
					 JOptionPane.showMessageDialog(null,"You have not submitted required information !!");
				 }					 
			}
			
			}
			else
			{
				JOptionPane.showMessageDialog(null,"You have not selected any item !!");
			}
		}
		else if(a.getSource() == cancel)
		{
			 int ans = JOptionPane.showConfirmDialog(null," Are you sure ?",null, JOptionPane.YES_NO_OPTION);
				
				if (ans == JOptionPane.YES_OPTION)
				{
					try
					{
						stmnt.executeUpdate("TRUNCATE `temp_order`");
					    JOptionPane.showMessageDialog(null," Order cancelled !!! ");
					}
			
			catch(SQLException e)
			{
			    System.out.println("Unknown Error");
			}
			
			catch(Exception eg)
			{
				System.out.println("Unknown Error");
			}
				
				}
		}
		else
		{
			for(int i=0;i<arrSize;i++)
			{
				if(a.getSource() == delete[i])
				{
					flag = i;
					foodName = (nameArr[flag].getText());System.out.println(total);
					//total-=(Double.parseDouble(priceArr[flag].getText()));System.out.println(total);
					//showTotal.setText(total.toString());
					price.remove(flag);
					break;
				}
			}
			
			if(flag != (arrSize-1))
			{
				for(int i=flag+1;i<arrSize;i++)
				{
					//set current row to null
					
					nameArr[i-1].setText("");
					quantityArr[i-1].setValue(1);
					quantityArr[i-1].setVisible(false);
					priceArr[i-1].setText("");
					delete[i-1].setVisible(false);
					
					//copy next row to current row
					
					nameArr[i-1].setText(nameArr[i].getText());
					quantityArr[i-1].setValue(quantityArr[i].getValue());
					quantityArr[i-1].setVisible(true);
					priceArr[i-1].setText(priceArr[i].getText());
					delete[i-1].setVisible(true);
					
					//make next row null
					
					nameArr[i].setText("");
					quantityArr[i].setValue(1);
					quantityArr[i].setVisible(false);
					priceArr[i].setText("");
					delete[i].setVisible(false);
				}
			}
			else
			{
				    //set the last row to zero
				    
					nameArr[arrSize-1].setText("");
					quantityArr[arrSize-1].setValue(1);
				    quantityArr[arrSize-1].setVisible(false);
				    priceArr[arrSize-1].setText("");
				    delete[arrSize-1].setVisible(false);
			}
			
			arrSize--;
			
			try
			{
				stmnt.executeUpdate("DELETE FROM `temp_order` WHERE `temp_order`.`Product_Name` = '"+foodName+"'");
			}
			
		catch(SQLException e)
		{
			System.out.println("Unknown Error");
		}
		
		catch(Exception eg)
		{
			System.out.println("Unknown Error");
		}
		
		}
	}
}