import java.awt.*;
import java.awt.event.*;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
public class Buttondemo extends JFrame implements ActionListener 
{
	
	Container cp;
	JRadioButton btnRed,btnBlue ;
	ButtonGroup grp;

	public Buttondemo(String t) {
		super(t);

		cp = getContentPane();
		cp.setLayout(new FlowLayout());

		btnRed= new JRadioButton("Red");
		btnBlue=new JRadioButton("Blue");
		
		btnRed.addActionListener(this);
		btnBlue.addActionListener(this);
		
		grp=new ButtonGroup();
		grp.add(btnRed);
		grp.add(btnBlue);

		cp.add(btnRed);
		cp.add(btnBlue);
		
		cp.setBackground(Color.orange);

		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {

		new Buttondemo("Radio buttons");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnRed)
           cp.setBackground(Color.RED);
		else
			if(e.getSource()==btnBlue)
		    cp.setBackground(Color.BLUE);
			
	}

}
