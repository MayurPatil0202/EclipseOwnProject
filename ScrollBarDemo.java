import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JScrollBar;

public class ScrollBarDemo extends JFrame {
	Container cp;
	JScrollBar sbred, sbblue, sbgreen;

	public ScrollBarDemo(String t) {
		super(t);
		cp = getContentPane();
		cp.setLayout(null);

		sbred = new JScrollBar();
		sbred.setBackground(Color.red);

		sbblue = new JScrollBar();
		sbblue.setBackground(Color.blue);

		sbgreen = new JScrollBar();
		sbgreen.setBackground(Color.green);

		sbred.setBounds(50, 50, 50, 200);
		sbblue.setBounds(150, 50, 50, 200);
		sbgreen.setBounds(250, 50, 50, 200);

		cp.add(sbred);
		cp.add(sbblue);
		cp.add(sbgreen);

		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ScrollBarDemo("Scrollbar");
	}
}
