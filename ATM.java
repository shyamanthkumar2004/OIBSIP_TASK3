import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class ATM{
	JFrame f=new JFrame();
	JFrame f1=new JFrame();
	JFrame f2=new JFrame();
	JFrame f3=new JFrame();
	String s,s1;
	int n,n1;
	float balance=500,amount,depo,depo1;
	JButton b1=new JButton("1");
	JButton b2=new JButton("2");
	JButton b3=new JButton("3");
	JButton b4=new JButton("4");
	JButton b5=new JButton("5");
	JButton b6=new JButton("6");
	JButton b7=new JButton("7");
	JButton b8=new JButton("8");
	JButton b9=new JButton("9");
	JButton next=new JButton("NEXT");
	JButton next1=new JButton("LOGIN");
	JButton withdraw=new JButton("WITHDRAW");
	JButton enquiry=new JButton("BALANCE ENQUIRY");
	JButton deposit=new JButton("DEPOSIT");
	JButton transfer=new JButton("TRANSFER");
	JButton history=new JButton("HISTORY");
	JButton exit=new JButton("EXIT");
	JButton back=new JButton("BACK");
	JLabel l1=new JLabel("GENERATE ATM PIN");
	JLabel l9=new JLabel("HISTORY");
	JLabel l3=new JLabel("Enter user name");
	JLabel l4=new JLabel("Enter PIN");
	JLabel l7=new JLabel("NEW USER HAVE "+balance+" Rupees");
	JLabel l2=new JLabel();
	JLabel l5=new JLabel();
	JLabel l6=new JLabel();
	JLabel l10=new JLabel();
	JPasswordField pf=new JPasswordField();
	Icon icon =new ImageIcon("C:\\Users\\USER\\Pictures\\download1.jpg");
	JButton image=new JButton(icon);
	JTextArea tf=new JTextArea();
	JTextArea ta=new JTextArea();
	JTextField tf1=new JTextField();
	JLabel l8=new JLabel();
	JTextField tf2=new JTextField();
	ATM(){
		f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);
		f.add(l1);f.add(image);f.add(next);f1.add(tf1);f1.add(tf2);f1.add(pf);f1.add(l3);f1.add(l4);f1.add(next1);f1.add(l5);
		l3.setBounds(10,50,120,20);
		f2.add(withdraw);f2.add(l7);f2.add(l8);f2.add(enquiry);f2.add(exit);f2.add(history);f2.add(deposit);f2.add(transfer);f2.add(l6);
		l8.setForeground(Color.RED);
		f3.add(l9);f3.add(ta);f3.add(back);f3.add(l10);
		ta.setBounds(0,50,500,350);
		ta.setBackground(Color.CYAN);
		l9.setBounds(195,20,100,20);
		back.setBounds(175,400,100,30);
		withdraw.setBounds(75,150,100,30);
		enquiry.setBounds(250,150,150,30);
		deposit.setBounds(75,250,100,30);
		transfer.setBounds(250,250,100,30);
		history.setBounds(75,350,100,30);
		exit.setBounds(250,350,100,30);
		l7.setBounds(150,30,500,30);
		l7.setForeground(Color.RED);
		l4.setBounds(10,80,120,20);
		tf1.setBounds(140,50,100,20);
		pf.setBounds(140,80,100,20);
		next1.setBounds(100,150,100,20);
		next1.setBackground(Color.CYAN);
		image.setBounds(300,70,200,200);
		l1.setBounds(80,10,150,20);
		f.add(tf);
		f1.setBounds(0,0,0,0);
		next.setBounds(150,400,120,50);
		tf.setBounds(50,50,150,20);
		b1.setBounds(50,70,50,50);
		b2.setBounds(100,70,50,50);
		b3.setBounds(150,70,50,50);
		b4.setBounds(50,120,50,50);
		b5.setBounds(100,120,50,50);
		b6.setBounds(150,120,50,50);
		b7.setBounds(50,170,50,50);
		b8.setBounds(100,170,50,50);
		b9.setBounds(150,170,50,50);
		f.add(l2);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				tf.append("1");}});
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				tf.append("2");}});
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				tf.append("3");}});
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				tf.append("4");}});
		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				tf.append("5");}});
		b6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				tf.append("6");}});
		b7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				tf.append("7");}});
		b8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				tf.append("8");}});
		b9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				tf.append("9");}});
		f1.setSize(500,500);
		next.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				s=tf.getText();
				n=Integer.parseInt(s);
				f.setVisible(false);
				f1.setVisible(true);}});
		withdraw.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				String st=JOptionPane.showInputDialog(f2,"ENTER PASSWORD");
				if(st.equals(new String(pf.getPassword()))){
				String s=JOptionPane.showInputDialog(f2,"ENTER AMOUNT");
				amount=Float.parseFloat(s);
				l7.setText("ENJOY ATM");
				if(amount<=balance){
					JOptionPane.showMessageDialog(f2,"AMOUNT WITHDRAWN SUCCESSFULLY");
				balance=balance-amount;
				ta.append(amount+" withdrawn successfully\n");}
				else{
					JOptionPane.showMessageDialog(f2,"INSUFFICIENT BALANCE");}
			}
			else
			JOptionPane.showMessageDialog(f2,"INCORRECT PASSWORD");}});
		enquiry.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				String s=JOptionPane.showInputDialog(f2,"ENTER PASSWORD");
				if(s.equals(new String(pf.getPassword()))){
				JOptionPane.showMessageDialog(f2,"REMAINING BALANCE: "+balance);}
				else
					JOptionPane.showMessageDialog(f2,"INCORRECT PASSWORD");
				}});
		exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				f2.setVisible(false);
				f.setVisible(true);
				tf.setText("");
				}});
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				f3.setVisible(false);
				f2.setVisible(true);
				}});
		history.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				String s=JOptionPane.showInputDialog(f2,"ENTER PASSWORD");
				if(s.equals(new String(pf.getPassword()))){
				f2.setVisible(false);
				f3.setVisible(true);
				ta.setEditable(false);}
				else
					JOptionPane.showMessageDialog(f2,"INCORRECT PASSWORD");
				}});
		deposit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				String s=JOptionPane.showInputDialog(f2,"ENTER AMOUNT TO DEPOSIT");
				JOptionPane.showMessageDialog(f2,"AMOUNT DEPOSITED SUCCESSFULLY");
				depo=Float.parseFloat(s);
				balance+=depo;
				ta.append(depo+" deposited successfully\n");
				}});
		transfer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				String s=JOptionPane.showInputDialog(f2,"ENTER NAME TO TRANSFER");
				String s1=JOptionPane.showInputDialog(f2,"ENTER AMOUNT TO TRANSFER");
				depo1=Float.parseFloat(s1);
				if(depo1<=balance){
				JOptionPane.showMessageDialog(f2,"AMOUNT TRANSFERRED SUCCESSFULLY TO "+s);
				balance-=depo1;
				ta.append(depo1+" transferred sucessfully\n");}
				else
					JOptionPane.showMessageDialog(f2,"INSUFFICIENT BALANCE TO TRANSFER");
				}});
		next1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(tf1.getText().isEmpty() && !(new String(pf.getPassword()).isEmpty()))
					JOptionPane.showMessageDialog(f1,"ENTER USER NAME");
				else if(new String(pf.getPassword()).isEmpty() && !tf1.getText().isEmpty())
					JOptionPane.showMessageDialog(f1,"ENTER ATM PIN");
				else if(!tf1.getText().isEmpty() && !(new String(pf.getPassword()).isEmpty())){
					s1=new String(pf.getPassword());
					n1=Integer.parseInt(s1);
					if(n==n1){
						f1.setVisible(false);
						f2.setVisible(true);
						l8.setBounds(150,70,500,30);
						l8.setText("USER NAME:"+tf1.getText());}
					else
						JOptionPane.showMessageDialog(f1,"INVALID PIN");
					}
				else if(tf1.getText().isEmpty() && new String(pf.getPassword()).isEmpty())
					JOptionPane.showMessageDialog(f1,"ENTER DETAILS");
				}});
		l1.setForeground(Color.RED);
		f.getContentPane().setBackground(Color.BLACK);
		f2.getContentPane().setBackground(Color.BLACK);
		l10.setBounds(0,0,0,0);
		l2.setBounds(0,0,0,0);
		l6.setBounds(0,0,0,0);
		f.setSize(500,500);
		f2.setSize(500,500);
		f3.setSize(500,500);
		f.setVisible(true);
	}
	public static void main(String args[]){
		new ATM();
	}
}