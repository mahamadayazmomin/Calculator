package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class SwingCalci implements ActionListener
{

	JButton bc,barrow,bmod,bd,b7,b8,b9,bm,b4,b5,b6,bs,b1,b2,b3,ba,boff,b0,bdot,beq;
	JTextField t,tt;
	JFrame f;
	int ch;
	float b,c,a,d,m,n;
	SwingCalci()
	{
		t=new JTextField(40);
	    bc=new JButton("C");
		//barrow=new JButton("<-");
		//bmod=new JButton("%");
		bd=new JButton("/");
		b7=new JButton("7");
		b8=new JButton("8");
        b9=new JButton("9");
		bm=new JButton("*");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		bs=new JButton("-");
		b1=new JButton("1");
		b2=new JButton("2");
	    b3=new JButton("3");
		ba=new JButton("+");
		boff=new JButton("OFF");
		b0=new JButton("0");
		bdot=new JButton(".");
		beq=new JButton("=");
  		tt=new JTextField(0);
  		
  		f=new JFrame();
		f.setVisible(true);
		f.setSize(500,500);
	
		
		bc.setBounds(100, 90, 55, 55);
		//barrow.setBounds(150, 100, 45, 45);
		//bmod.setBounds(200, 100, 45, 45);
		bd.setBounds(280, 90, 55, 55);
		b7.setBounds(100, 150, 55, 55);
		b8.setBounds(160, 150, 55, 55);
		b9.setBounds(220, 150, 55, 55);
		bm.setBounds(280, 150, 55, 55);
		b4.setBounds(100, 210, 55, 55);
		b5.setBounds(160, 210, 55, 55);
		b6.setBounds(220, 210, 55, 55);
		bs.setBounds(280, 210, 55, 55);
		b1.setBounds(100, 270, 55, 55);
		b2.setBounds(160, 270, 55, 55);
		b3.setBounds(220, 270, 55, 55);
		ba.setBounds(280, 270, 55, 55);
		boff.setBounds(100, 330, 55, 55);
		b0.setBounds(160, 330, 55, 55);
		bdot.setBounds(220, 330, 55, 55);
		beq.setBounds(280, 330, 55, 55);
		t.setBounds(100, 50, 235, 30);
		
		f.add(t);
		f.add(bc);
		//f.add(barrow);
		//f.add(bmod);
		f.add(bd);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(bm);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(bs);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(ba);
		f.add(boff);
		f.add(b0);
		f.add(bdot);
		f.add(beq);
		f.add(tt);
		
		 bc.addActionListener(this);
 		 //barrow.addActionListener(this);
 		 //bmod.addActionListener(this);
 		 bd.addActionListener(this);
 		 b7.addActionListener(this);
 		 b8.addActionListener(this);
 		 b9.addActionListener(this);
 		 bm.addActionListener(this);
 		 b4.addActionListener(this);
 		 b5.addActionListener(this);
 		 b6.addActionListener(this);
 		 bs.addActionListener(this);
 		 b1.addActionListener(this);
 		 b2.addActionListener(this);
 		 b3.addActionListener(this);
 		 ba.addActionListener(this);
 		 boff.addActionListener(this);
 		 b0.addActionListener(this);
 		 bdot.addActionListener(this);
 		 beq.addActionListener(this);
	}
	public static void main(String[] args) {
		SwingCalci ob=new SwingCalci();

	}
	
	public void actionPerformed(ActionEvent e) 
	{	
		if(e.getSource()==bc)
		{
		t.setText("");
		}
		
		if(e.getSource()==boff)
		{
			f.dispose();
		}
		
		if(e.getSource()==b1)
		{
			t.setText(t.getText()+"1");
			
		}
		if(e.getSource()==b2)
		{
			t.setText(t.getText()+"2");
			
		}
		if(e.getSource()==b3)
		{
			t.setText(t.getText()+"3");
			
		}
		if(e.getSource()==b4)
		{
			t.setText(t.getText()+"4");
			
		}
		if(e.getSource()==b5)
		{
			t.setText(t.getText()+"5");
			
		}
		if(e.getSource()==b6)
		{
			t.setText(t.getText()+"6");
			
		}
		if(e.getSource()==b7)
		{
			t.setText(t.getText()+"7");
			
		}
		if(e.getSource()==b8)
		{
			t.setText(t.getText()+"8");
			
		}
		if(e.getSource()==b9)
		{
			t.setText(t.getText()+"9");
			
		}
		if(e.getSource()==b0)
		{
			t.setText(t.getText()+"0");
			
		}
		if(e.getSource()==bdot)
		{
			t.setText(t.getText()+".");
			
		}
		
		if(e.getSource()==ba)
		{
			a=Float.parseFloat(t.getText());
			ch=1;
			t.setText("");
		}
		if(e.getSource()==bs)
		{
			a=Float.parseFloat(t.getText());
			ch=2;
			t.setText("");
		}
		if(e.getSource()==bm)
		{
			a=Float.parseFloat(t.getText());
			ch=3;
			t.setText("");
		}
		if(e.getSource()==bd)
		{
			a=Float.parseFloat(t.getText());
			ch=4;
			t.setText("");
		}
		if(e.getSource()==beq)
		{
			b=Float.parseFloat(t.getText());
			if(ch==1)
			     c=a+b;
			if(ch==2)
		         c=a-b;
			if(ch==3)
		         c=a*b;
			if(ch==4)
		         c=a/b;
			if(ch==5);
			    
		
			t.setText(""+c);
			
		}
		
	}

}

