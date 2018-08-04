import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxEditor;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
 
class PlaceOrder extends AbstractListModel implements ComboBoxModel,KeyListener,ItemListener,ActionListener
 {
    ArrayList<String> db;
    ArrayList<String> data;
    String selection;
    JComboBox<String> cb;
    ComboBoxEditor cbe;
    int currPos = 0;
	BurgerData t;
	JFrame f;
	JButton add;
	int row;
	String s;
	Double price;
	JLabel l[],l1[],l3[];
	JSpinner l2[];
	SpinnerNumberModel n[];
	JLabel name,uprice,quantity,total,cancel;
	JButton delete[];
	JPanel panel,subPanel1,subPanel2;
	JPanel subPanel3[];
	JScrollPane scroll;
	int click = -1;
	Integer val = 1;
	int flag;
	Double mtotal;
	JLabel showTotal;
	JButton set;
	JButton confirm;
 
    public PlaceOrder() 
	{
		t = new BurgerData();
		mtotal = 0.0;
		showTotal = new JLabel();
		set = new JButton("Net = ");
		set.addActionListener(this);
		confirm = new JButton("Confirm");
		confirm.addActionListener(this);
        
		cb = new JComboBox<String>();
        cbe = cb.getEditor();
        // here we add the key listener to the text field that the combobox is
        // wrapped around
        cbe.getEditorComponent().addKeyListener(this);
 
        // set up our "database" of items - in practice you will usuallu have a
        // proper db.
		
		db = new ArrayList<String>();
		
		row = (t.BurgerList).getRowCount();
		
		for(int i=0;i<row;i++)
		{
			db.add(((t.BurgerList).getValueAt(i,1)).toString());
		}
		
		data = new ArrayList<String>();
		
		f = new JFrame();
		f.setSize(1280,1000);
		f.setLayout(new BoxLayout(f.getContentPane(),BoxLayout.PAGE_AXIS));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.PAGE_AXIS));
		panel.add(Box.createRigidArea(new Dimension(0,50)));
		
		subPanel1 = new JPanel();
		subPanel1.setLayout(new BoxLayout(subPanel1,BoxLayout.LINE_AXIS));
		subPanel1.add(Box.createRigidArea(new Dimension(50,0)));
		
        cb.setEditable(true);
        cb.setModel(this);
        cb.addItemListener(this);
		cb.setMaximumSize(cb.getPreferredSize());
        subPanel1.add(cb);
		subPanel1.add(Box.createRigidArea(new Dimension(50,0)));
		
		add = new JButton("ADD");
		subPanel1.add(add);
		subPanel1.add(Box.createRigidArea(new Dimension(50,0)));
		
		subPanel1.add(set);
		subPanel1.add(Box.createRigidArea(new Dimension(50,0)));
		
		subPanel1.add(showTotal);
		subPanel1.add(Box.createRigidArea(new Dimension(50,0)));
		
		subPanel1.add(confirm);
		subPanel1.add(Box.createRigidArea(new Dimension(50,0)));
		
		
		panel.add(subPanel1);
		panel.add(Box.createRigidArea(new Dimension(0,50)));
		
		subPanel2 = new JPanel();
		subPanel2.setLayout(new BoxLayout(subPanel2,BoxLayout.LINE_AXIS));
		subPanel2.add(Box.createRigidArea(new Dimension(50,0)));
		
		name = new JLabel("Name");
		uprice = new JLabel("Per Unit Price");
		quantity = new JLabel("Quantity");
		total = new JLabel("Total");
		cancel = new JLabel("Cancel");
		
		subPanel2.add(name);
		subPanel2.add(Box.createRigidArea(new Dimension(50,0)));
		subPanel2.add(uprice);
		subPanel2.add(Box.createRigidArea(new Dimension(50,0)));
		subPanel2.add(quantity);
		subPanel2.add(Box.createRigidArea(new Dimension(50,0)));
		subPanel2.add(total);
		subPanel2.add(Box.createRigidArea(new Dimension(50,0)));
		subPanel2.add(cancel);
		
		panel.add(subPanel2);
		panel.add(Box.createRigidArea(new Dimension(0,50)));
		
		l = new JLabel[row];
		l1 = new JLabel[row];
		l2 = new JSpinner[row];
		l3 = new JLabel[row];
		
		delete = new JButton[row];
		
		subPanel3 = new JPanel[row];
		
		n = new SpinnerNumberModel[row];
		
		for(int i=0;i<row;i++)
		{
			n[i] = new SpinnerNumberModel(1,0,1000,1);
			
			l[i] = new JLabel();
			l1[i] = new JLabel();
			l2[i] = new JSpinner(n[i]);
			l3[i] = new JLabel();
			delete[i] = new JButton("C");
			
			subPanel3[i] = new JPanel();
			subPanel3[i].setLayout(new BoxLayout(subPanel3[i],BoxLayout.LINE_AXIS));
			subPanel3[i].add(Box.createRigidArea(new Dimension(50,0)));
			
			subPanel3[i].add(l[i]);
			subPanel3[i].add(Box.createRigidArea(new Dimension(50,0)));
			subPanel3[i].add(l1[i]);
			subPanel3[i].add(Box.createRigidArea(new Dimension(50,0)));
			subPanel3[i].add(l2[i]);
			l2[i].setVisible(false);
			subPanel3[i].add(Box.createRigidArea(new Dimension(50,0)));
			subPanel3[i].add(l3[i]);
			subPanel3[i].add(Box.createRigidArea(new Dimension(50,0)));
			
			panel.add(subPanel3[i]);
			
			panel.add(Box.createRigidArea(new Dimension(0,50)));
		}
		
		add.addActionListener(this);
		
		for(int i=0;i<row;i++)
		{
			delete[i].addActionListener(this);
		}
		
	ChangeListener listener = new ChangeListener() {
    public void stateChanged(ChangeEvent e) {
    
	JSpinner s = (JSpinner) e.getSource();
	
	for(int i=0;i<row;i++)
	{
		if(s == l2[i])
		{
			if(!(l1[i].getText()).equals("")) //a deleted row's  l1[i].getText() is equal to null
			{
		    	Double d = Double.valueOf(Double.parseDouble(l1[i].getText()));
			    Double ans = (((Integer)s.getValue())*d);
			    l3[i].setText(ans.toString());
			    break;
			}
		}
	}
      
	}
    
	};
	
	for(int i=0;i<row;i++)
	{
		l2[i].addChangeListener(listener);
	}
	
	scroll = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	f.add(scroll);
	f.setVisible(true);
    
	}
	
	public void actionPerformed(ActionEvent a)
	{
		if(a.getSource() == add)
		{
			price = 0.0;
			
			s = (cb.getSelectedItem()).toString();
		
		for(int i=0;i<row;i++)
		{
			if((((t.BurgerList).getValueAt(i,1)).toString()).equals(s))
			{
				price = (Double)((t.BurgerList).getValueAt(i,2));
				break;
			}
		}
		
		if(price != 0)
		{
			click++;
			l[click].setText(s);
		    l1[click].setText(price.toString());
			l2[click].setMaximumSize(l2[click].getPreferredSize());
		    l2[click].setVisible(true); //adding JSpiiner
			subPanel3[click].add(Box.createRigidArea(new Dimension(50,0)));
			l2[click].setVisible(true);
		    l3[click].setText(((Double)(price)).toString());
			subPanel3[click].add(delete[click]); //adding delete button
			delete[click].setVisible(true);
		}
		
		}
		else if(a.getSource() == set)
		{
			mtotal = 0.0;
			
			for(int i=0;i<=click;i++)
			{
				mtotal+=(Double.parseDouble(l3[i].getText()));
			    showTotal.setText(mtotal.toString());
			}
		}
		else if(a.getSource() == confirm)
		{
			if(mtotal != 0.0)
			{
				JOptionPane.showMessageDialog(null,"Printing Invoice ...");
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Please select some food first ...");
			}
		}
		else
		{
			for(int i=0;i<row;i++)
			{
				if(a.getSource() == delete[i])
				{
					flag = i;
					break;
				}
			}
			
			if(flag != click)
			{
				for(int i=flag+1;i<=click;i++)
				{
					//set current row to null
					
					l[i-1].setText("");
					l1[i-1].setText("");
					l2[i-1].setValue(1);
					l2[i-1].setVisible(false);
					l3[i-1].setText("");
					delete[i-1].setVisible(false);
					
					//copy next row to current row
					
					l[i-1].setText(l[i].getText());
					l1[i-1].setText(l1[i].getText());
					l2[i-1].setValue(l2[i].getValue());
					l2[i-1].setVisible(true);
					l3[i-1].setText(l3[i].getText());
					delete[i-1].setVisible(true);
					
					//make next row null
					
					l[i].setText("");
					l1[i].setText("");
					l2[i].setValue(1);
					l2[i].setVisible(false);
					l3[i].setText("");
					delete[i].setVisible(false);
				}
			}
			else
			{
				    //set the last row to zero
				    
					l[click].setText("");
				    l1[click].setText("");
					l2[click].setValue(1);
				    l2[click].setVisible(false);
				    l3[click].setText("");
				    delete[click].setVisible(false);
			}
			
			click--;
		}
}
 
    public void updateModel(String in)
	{   
     	data.clear();
        // lets find any items which start with the string the user typed, and
        // add it to the popup list
        // here you would usually get your items from a database, or some other
        // storage...
        for (String s : db)
            if (s.contains(in))
                data.add(s);
 
        super.fireContentsChanged(this, 0, data.size());
 
        // this is a hack to get around redraw problems when changing the list
        // length of the displayed popups
        cb.hidePopup();
        cb.showPopup();
        if (data.size() != 0)
            cb.setSelectedIndex(0);
    }
 
    public int getSize() {
        return data.size();
    }
 
    public Object getElementAt(int index) {
        return data.get(index);
    }
 
    public void setSelectedItem(Object anItem) {
        selection = (String) anItem;
    }
 
    public Object getSelectedItem() {
        return selection;
    }
 
    public void keyTyped(KeyEvent e) {
    }
 
    public void keyPressed(KeyEvent e) {
    }
 
    public void keyReleased(KeyEvent e) {
        String str = cbe.getItem().toString();
        JTextField jtf = (JTextField) cbe.getEditorComponent();
        currPos = jtf.getCaretPosition();
 
        if (e.getKeyChar() == KeyEvent.CHAR_UNDEFINED) {
            if (e.getKeyCode() != KeyEvent.VK_ENTER) {
                cbe.setItem(str);
                jtf.setCaretPosition(currPos);
            }
        } else if (e.getKeyCode() == KeyEvent.VK_ENTER){
            cb.setSelectedIndex(cb.getSelectedIndex());
        } else {
            updateModel(cb.getEditor().getItem().toString());
            cbe.setItem(str);
            jtf.setCaretPosition(currPos);
        }
    }
 
    public void itemStateChanged(ItemEvent e) {
        cbe.setItem(e.getItem().toString());
        cb.setSelectedItem(e.getItem());
    }
}