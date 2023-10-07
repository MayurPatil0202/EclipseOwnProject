import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

 class CalculatorDemo extends JFrame implements ActionListener {
	Container cp;
	JLabel lblNo1, lblNo2, lblRes;
	JButton btnAdd, btnSub, btnMul, btnDiv,clear;
	JTextField txtNo1, txtNo2, txtRes;

	public CalculatorDemo(String t) {
		super(t);

		cp = getContentPane();

		cp.setLayout(new GridLayout(6, 2));

		lblNo1 = new JLabel("No1");
		lblNo2 = new JLabel("No2");
		lblRes = new JLabel("Res");

		txtNo1 = new JTextField();
		txtNo2 = new JTextField();
		txtRes = new JTextField();

	 btnAdd = new JButton("+");
		btnAdd.addActionListener(this);
		
		 btnSub = new JButton("-");
		btnSub.addActionListener(this);
		
		 btnMul = new JButton("*");
		btnMul.addActionListener(this);
		
		 btnDiv = new JButton("/");
		btnDiv.addActionListener(this);
		
		 clear = new JButton("Clear");
	clear.addActionListener(this);

		cp.add(lblNo1);
		cp.add(txtNo1);
		cp.add(lblNo2);
		cp.add(txtNo2);
		cp.add(lblRes);
		cp.add(txtRes);

		cp.add(btnAdd);
		btnAdd.addActionListener(this);
		
		cp.add(btnSub);
		btnSub.addActionListener(this);
		
		cp.add(btnMul);
		btnMul.addActionListener(this);
		
		cp.add(btnDiv);
		btnDiv.addActionListener(this);
		
		cp.add(clear);
		clear.addActionListener(this);
		
		setSize(600,500);
		setVisible(true);

	}

	public static void main(String[] args)
	{
		new CalculatorDemo("Calculator demo");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAdd)
		{
			int x=Integer.parseInt(txtNo1.getText());
			int y=Integer.parseInt(txtNo2.getText());
			int z=x+y;
			txtRes.setText(""+z);
		}
		else if(e.getSource()==btnSub)
		{
			int x=Integer.parseInt(txtNo1.getText());
			int y=Integer.parseInt(txtNo2.getText());
			int z=x-y;
			txtRes.setText(""+z);
		}
		else if(e.getSource()==btnMul)
		{
			int x=Integer.parseInt(txtNo1.getText());
			int y=Integer.parseInt(txtNo2.getText());
			int z=x*y;
			txtRes.setText(""+z);
		}
		else if(e.getSource()==btnDiv)
		{
			int x=Integer.parseInt(txtNo1.getText());
			int y=Integer.parseInt(txtNo2.getText());
			int z=x/y;
			txtRes.setText(""+z);
		}
		else if(e.getSource()==clear)
		{
			txtNo1.setText(" ");
			txtNo2.setText(" ");
			txtRes.setText(" ");
		}
	}

}
