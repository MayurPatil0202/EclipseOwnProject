//import java.awt.util.*;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

import java.awt.Container;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class mininotepad extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JMenuBar mbar;
	JMenu File, Edit;
	JMenuItem New, Open, Save, Exit, Cut, Copy, Paste;
	JTextArea ta;
	Container cp;

	public mininotepad(String t) {
		super(t);
		cp = getContentPane();
		ta = new JTextArea();
		cp.add(ta);

		mbar = new JMenuBar();

		File = new JMenu("File");
		Edit = new JMenu("Edit");

		New = new JMenuItem("New");
		Open = new JMenuItem("Open");
		Open.addActionListener(this);

		Save = new JMenuItem("Save");
		Save.addActionListener(this);

		Exit = new JMenuItem("Exit");
		Exit.addActionListener(this);

		File.add(New);
		File.add(Open);
		File.add(Save);
		File.add(Exit);

		Cut = new JMenuItem("Cut");
		Cut.addActionListener(this);

		Copy = new JMenuItem("Copy");
		Copy.addActionListener(this);

		Paste = new JMenuItem("Paste");
		Paste.addActionListener(this);

		Edit.add(Cut);
		Edit.add(Copy);
		Edit.add(Paste);

		mbar.add(File);
		mbar.add(Edit);
		setJMenuBar(mbar);

		// Exit.addActionListener(this);
		// Cut.addActionListener(this);
		// Copy.addActionListener(this);
		// Paste.addActionListener(this);

		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new mininotepad("Notepad");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Cut)
			ta.copy();

		else if (e.getSource() == Copy)
			ta.copy();

		else if (e.getSource() == Paste)
			ta.paste();
		else if (e.getSource() == Exit)
			this.dispose();

		else if (e.getSource() == Open) {
			JFileChooser jc = new JFileChooser();
			if (jc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
				try {
					FileInputStream fis = new FileInputStream(jc.getSelectedFile());
					int i;
					ta.setText(" ");
					while ((i = fis.read()) != -1) {
						ta.append(" " +(char) i);
					}
					fis.close();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		} else if (e.getSource() == Save) {
			JFileChooser jc = new JFileChooser();
			if (jc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
				try {
					FileOutputStream fos = new FileOutputStream(jc.getSelectedFile());
					fos.write(ta.getText().getBytes());
					fos.close();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}//  if Bracket
			}//else Bracket
		}  //catch Bracket
	}
}
