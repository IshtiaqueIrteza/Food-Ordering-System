import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;
import java.io.*;
import java.awt.*;
class Menu extends Homepage
{    
   
    
	 JScrollPane scroll = new JScrollPane();
	JFrame frame = new JFrame("MENU");
	JLabel burger = new JLabel("BURGER");
	JLabel pizza = new JLabel("PIZZA");
    JLabel burger1 = new JLabel("1.Cheese Burger(tk 190/-)");
	JLabel pizza1 = new JLabel("1.Beef and Bacon (Tk 170/-)");
	JLabel burger2 = new JLabel("2.BBQ Cheese Burger(tk 190/-) ");
	JLabel pizza2 = new JLabel("2.Cheesey Carlic Pizza (Tk 200/-)");
    JLabel burger3 = new JLabel("3.Twister (Tk 200/-)");
	JLabel pizza3 = new JLabel("3.Pepproni(Tk 220/-)");
	JLabel burger4 = new JLabel("4.Classic (Tk 220/-)");
	JLabel pizza4 = new JLabel("4.Creamy Prawn(Tk 240/-)");
	JLabel burger5 = new JLabel("5.The Regular (Tk 240/-)");
	JLabel pizza5 = new JLabel("5.Peri Peri Chicken(Tk 250/-)");
	JLabel burger6 = new JLabel("6.Beef & Bacon (Tk 250/-)");
	JLabel pizza6 = new JLabel("6.Grand Supremme(Tk 250/-)");
	JLabel burger7 = new JLabel("7.Counter Burger(Tk 250/-)");
	JLabel pizza7 = new JLabel("7.Garlic Prawn(Tk 260/-)");
	JLabel burger8 = new JLabel("8.Fish Burger(Tk 250/-)");
	JLabel pizza8 = new JLabel("8.BBQ Chicken & Bacon(Tk 280/-)");
	JLabel burger9 = new JLabel("9.Chicken Supremme(Tk 300/-)");
	JLabel pizza9 = new JLabel("9.Vaggie max(Tk 280/-)");
	JLabel burger10 = new JLabel("10.Whopper(Tk 320/-)");
	JLabel pizza10 = new JLabel("10.Bacon & Mushroom(Tk 300/-)");
	JLabel burger11 = new JLabel("11.Chicken Cheese Delight(Tk 340/-)");
	JLabel pizza11 = new JLabel("11.Smoked Chicken Pizza(Tk 300/-)");
	JLabel burger12 = new JLabel("12.Mushroom Caramel(Tk 320/-)");
	JLabel pizza12 = new JLabel("12.Sausage & Bacon(Tk 320/-)");
	JLabel burger13 = new JLabel("13.Tuna Burger(Tk 380/-)");
	JLabel pizza13 = new JLabel("13.Hot & Spicy Beef(Tk 340/-)");
	JLabel burger14 = new JLabel("14.Nutella & Nutty(Tk 400/-)");
	JLabel pizza14 = new JLabel("14.Hot & Twisted(Tk 340/-)");
	JLabel burger15 = new JLabel("15.Half Pounder(Tk 530/-)");
	JLabel pizza15 = new JLabel("15.Spicy Italian Sausage(Tk 340/-)");
	JLabel pastry = new JLabel("PASTRY");
	JLabel drinks = new JLabel("DRINKS");
    JLabel pastry1 = new JLabel("1.Black Forest (Tk 120 /-)");
	JLabel drinks1 = new JLabel("1.Water Bottle 500ml (Tk 15/-)");
	JLabel pastry2 = new JLabel("2.Vanilla Cream  Cake (Tk 120 /-)");
	JLabel drinks2 = new JLabel("2.Soft Drinks in Bottle(Tk 15/-)");
	JLabel pastry3 = new JLabel("3.Coffee Cream Cake  (Tk 130 /-)");
	JLabel drinks3 = new JLabel("3.Soft Drinks in can (Tk 35/-)");
	JLabel pastry4 = new JLabel("4.Strawberry Mousse Cake (Tk 140 /-)");
	JLabel drinks4 = new JLabel("4.Hot Chocolate(Tk 190/-)");
	JLabel pastry5 = new JLabel("5.Chocolate Mousse Cake (Tk 150 /-)");
	JLabel drinks5 = new JLabel("5.Lemonade (Tk 200/-)");
	JLabel pastry6 = new JLabel("6.Chocolate Fudge Cake(Tk 150 /-)");
	JLabel drinks6 = new JLabel("6.Smothie(Tk 220/-)");
	JLabel pastry7 = new JLabel("7.Red Velvet Cake(Tk 150 /-)");
	JLabel drinks7 = new JLabel("7.Flavored Shake(Tk 250/-)");
	JLabel pastry8 = new JLabel("8.Fruints & Nuts Cake(Tk 150 /-)");
	JLabel drinks8 = new JLabel("8.Blue Lagoon (Tk 250/-)");
	JLabel pastry9 = new JLabel("9.Cream Cheese Cake(Tk 160 /-)");
	JLabel drinks9 = new JLabel("9.Gummy Bear Drinks(Tk 300/-)");
	JLabel pastry10 = new JLabel("10.Chocolate Stream Cake(Tk 180 /-)");
	JLabel drinks10 = new JLabel();
	JLabel pastry11 = new JLabel("11.Blueberry Cheese Cake(Tk 180 /-)");
	JLabel drinks11 = new JLabel();
	JLabel pastry12 = new JLabel("12.Strawberry Cheese Cake(Tk 180 /-)");
	JLabel drinks12 = new JLabel();
	JLabel pastry13 = new JLabel("13.Cream Cheese Cake(Tk 160 /-)");
	JLabel drinks13 = new JLabel();
	JLabel pastry14 = new JLabel("14.Cookie & Cream(Tk 200 /-)");
	JLabel drinks14 = new JLabel();
	JLabel pastry15= new JLabel("15.Chocolate Rasberry Mousse Cake(Tk 220 /-)");
	JLabel drinks15 = new JLabel();
	
	
	
	
	
	JPanel p = new JPanel();
	 
	
	
	public Menu()
	{
		frame.setVisible(true);
		frame.setSize(1000,1000);
		p.setLayout(new GridLayout(32,2,5,10));
	    p.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		p.add(burger);
		p.add(pizza);
		p.add(burger1);
		p.add(pizza1);
		p.add(burger2);
		p.add(pizza2);
		p.add(burger3);
		p.add(pizza3);
		p.add(burger4);
		p.add(pizza4);
		p.add(burger5);
		p.add(pizza5);
		p.add(burger6);
		p.add(pizza6);
		p.add(burger7);
		p.add(pizza7);
		p.add(burger8);
		p.add(pizza8);
		p.add(burger9);
		p.add(pizza9);
		p.add(burger10);
		p.add(pizza10);
		p.add(burger11);
		p.add(pizza11);
		p.add(burger12);
		p.add(pizza12);
		p.add(burger13);
		p.add(pizza13);
		p.add(burger14);
		p.add(pizza14);
		p.add(burger15);
		p.add(pizza15);
		p.add(pastry);
		p.add(drinks);
		p.add(pastry1);
		p.add(drinks1);
	    p.add(pastry2);
		p.add(drinks2);
		p.add(pastry3);
		p.add(drinks3);
		p.add(pastry4);
		p.add(drinks4);
		p.add(pastry5);
		p.add(drinks5);
		p.add(pastry6);
		p.add(drinks6);
		p.add(pastry7);
		p.add(drinks7);
		p.add(pastry8);
		p.add(drinks8);
		p.add(pastry9);
		p.add(drinks9);
		p.add(pastry10);
		p.add(drinks10);
		p.add(pastry11);
		p.add(drinks11);
		p.add(pastry12);
		p.add(drinks12);
		p.add(pastry13);
		p.add(drinks13);
		p.add(pastry14);
		p.add(drinks14);
		p.add(pastry15);
		p.add(drinks15);
		
		

		
		//p.add(l14);
			 
	  burger.setFont(new Font("Monotype Corsiva",35,35));
	   pizza.setFont(new Font("Monotype Corsiva",35,35));
	   burger1.setFont(new Font("Monotype Corsiva",25,25));
	   burger2.setFont(new Font("Monotype Corsiva",25,25));
	   burger3.setFont(new Font("Monotype Corsiva",25,25));
	   burger4.setFont(new Font("Monotype Corsiva",25,25));
	   burger5.setFont(new Font("Monotype Corsiva",25,25));
	   burger6.setFont(new Font("Monotype Corsiva",25,25));
	   burger7.setFont(new Font("Monotype Corsiva",25,25));
	   burger8.setFont(new Font("Monotype Corsiva",25,25));
	   burger9.setFont(new Font("Monotype Corsiva",25,25));
	   burger10.setFont(new Font("Monotype Corsiva",25,25));
	   burger11.setFont(new Font("Monotype Corsiva",25,25));
	   burger12.setFont(new Font("Monotype Corsiva",25,25));
	   burger13.setFont(new Font("Monotype Corsiva",25,25));
	   burger14.setFont(new Font("Monotype Corsiva",25,25));
	   burger15.setFont(new Font("Monotype Corsiva",25,25));
	   pizza1.setFont(new Font("Monotype Corsiva",25,25));
	   pizza2.setFont(new Font("Monotype Corsiva",25,25));
	   pizza3.setFont(new Font("Monotype Corsiva",25,25));
	   pizza4.setFont(new Font("Monotype Corsiva",25,25));
	   pizza5.setFont(new Font("Monotype Corsiva",25,25));
	   pizza6.setFont(new Font("Monotype Corsiva",25,25));
	   pizza7.setFont(new Font("Monotype Corsiva",25,25));
	   pizza8.setFont(new Font("Monotype Corsiva",25,25));
	   pizza9.setFont(new Font("Monotype Corsiva",25,25));
	   pizza10.setFont(new Font("Monotype Corsiva",25,25));
       pizza11.setFont(new Font("Monotype Corsiva",25,25));
	   pizza12.setFont(new Font("Monotype Corsiva",25,25));
       pizza13.setFont(new Font("Monotype Corsiva",25,25));
	   pizza14.setFont(new Font("Monotype Corsiva",25,25));
	   pizza15.setFont(new Font("Monotype Corsiva",25,25));
	   pastry.setFont(new Font("Monotype Corsiva",35,35));
	   drinks.setFont(new Font("Monotype Corsiva",35,35));
	    pastry1.setFont(new Font("Monotype Corsiva",25,25));
	   drinks1.setFont(new Font("Monotype Corsiva",25,25));
	     pastry2.setFont(new Font("Monotype Corsiva",25,25));
	   drinks2.setFont(new Font("Monotype Corsiva",25,25));
	    pastry3.setFont(new Font("Monotype Corsiva",25,25));
	   drinks3.setFont(new Font("Monotype Corsiva",25,25));
	   pastry4.setFont(new Font("Monotype Corsiva",25,25));
	   drinks4.setFont(new Font("Monotype Corsiva",25,25));
	   pastry5.setFont(new Font("Monotype Corsiva",25,25));
	   drinks5.setFont(new Font("Monotype Corsiva",25,25));
	   pastry6.setFont(new Font("Monotype Corsiva",25,25));
	   drinks6.setFont(new Font("Monotype Corsiva",25,25));
	   pastry7.setFont(new Font("Monotype Corsiva",25,25));
	   drinks7.setFont(new Font("Monotype Corsiva",25,25));
	   pastry8.setFont(new Font("Monotype Corsiva",25,25));
	   drinks8.setFont(new Font("Monotype Corsiva",25,25));
	   pastry9.setFont(new Font("Monotype Corsiva",25,25));
	   drinks9.setFont(new Font("Monotype Corsiva",25,25));
	   pastry10.setFont(new Font("Monotype Corsiva",25,25));
	   pastry11.setFont(new Font("Monotype Corsiva",25,25));
	   pastry12.setFont(new Font("Monotype Corsiva",25,25));
	   pastry13.setFont(new Font("Monotype Corsiva",25,25));
	   pastry14.setFont(new Font("Monotype Corsiva",25,25));
	   pastry15.setFont(new Font("Monotype Corsiva",25,25));
	  
		frame.add(p);
		scroll = new JScrollPane(p,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	    frame.add(scroll);
		
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
				this.setVisible(false);
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