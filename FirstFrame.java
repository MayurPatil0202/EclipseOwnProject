import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FirstFrame extends JFrame {
	Container cp;
	JButton b1, b2;
	JTextField tf;

	public FirstFrame(String t) {
		super(t);
		cp = getContentPane(); // get container refrence

		cp.setLayout(new FlowLayout()); // set layout of container

		b1 = new JButton("click");
		b2 = new JButton("clear");
		tf = new JTextField(20);

		cp.add(b1); // add controls to container
		cp.add(b2);
		cp.add(tf);

		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FirstFrame("My Frame");
	}
}
