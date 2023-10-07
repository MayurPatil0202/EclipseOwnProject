import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.*;

public class Logindemo extends JFrame implements ActionListener {
	Container cp;
	JLabel lblUser, lblPass;
	JTextField txtUser;
	JPasswordField txtPass;
	JButton btnLogin, btnClear;
	//String U,String P;

	public Logindemo(String t) {
		super(t);

		cp = getContentPane();
		cp.setLayout(new GridLayout(3, 2));

		lblUser = new JLabel("USERNAME");
		lblPass = new JLabel("PASSWORD");

		txtUser = new JTextField();
		txtPass = new JPasswordField();

		btnLogin = new JButton("Login");
		btnClear = new JButton("clear");

		btnLogin.addActionListener(this);
		btnClear.addActionListener(this);
		// 4 lines

		cp.add(lblUser);
		cp.add(txtUser);
		cp.add(lblPass);
		cp.add(txtPass);
		cp.add(btnLogin);
		cp.add(btnClear);

		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Logindemo("Login");
	} 
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnLogin)
		{	
			String U=txtUser.getText();
		String P=txtPass.getText();
		
		if(U.equals("PROFOUND")&& P.equals("PASS@123"))
		JOptionPane.showMessageDialog(this,"Login Sucessfull!!!");
		
		else  
			JOptionPane.showMessageDialog(this,"Invalid crediantal");
	      }
		else if (e.getSource()==btnClear){
	
	{
		txtUser.setText(" ");
		txtPass.setText(" ");
	}
		}

	}
}