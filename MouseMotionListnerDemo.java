import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MouseMotionListnerDemo extends JFrame implements MouseMotionListener {
	JLabel lbl;
	JTextField tf;
	Container cp;

	public MouseMotionListnerDemo(String t) {
		super(t);
		cp = getContentPane();
		cp.setLayout(new FlowLayout());

		lbl = new JLabel("co ordinates are..");
		tf = new JTextField(20);

		cp.add(lbl);
		cp.add(tf);

		cp.addMouseMotionListener(this);

		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseMotionListnerDemo("Demo");
	}

	@Override
	public void mouseDragged(MouseEvent e) {

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		String c = (e.getX()+"," + e.getY());
		tf.setText(c);
	}

}
