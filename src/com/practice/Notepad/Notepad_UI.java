package com.practice.Notepad;

import java.io.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.Style;

public class Notepad_UI {
	
	JMenuItem newDoc = new JMenuItem("New");
	
	public void initUI() {
		
		//Creating a Frame
	    JFrame f = new JFrame("Demo Notepad");
		
		JLabel DetailsOfFile = new JLabel();
		JPanel BottomPanel = new JPanel();
		JMenuBar menuBar = new JMenuBar();
		
		//Creating the menu option File
		JMenu file = new JMenu("File");
		
		//Creating sub-options of File
		JMenuItem newDoc = new JMenuItem("New");
		//Creating short-cut key for new (Ctrl+N)
		newDoc.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
		
		JMenuItem openDoc = new JMenuItem("Open");
		//Creating short-cut key for open (Ctrl+O)
		openDoc.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
		
		JMenuItem save = new JMenuItem("Save");
		//Creating short-cut key for save (Ctrl+S)
		save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
		
		JMenuItem print = new JMenuItem("Print");
		//Creating short-cut key for print (Ctrl+P)
		print.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
		
		JMenuItem exit = new JMenuItem("Exit");
		//Creating short-cut key for exit (Ctrl+esc)
		exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE,0));
		
		//Creating Menu option Edit
		JMenu edit = new JMenu("Edit");
		
		//Creating sub-options of Edit
		
		JMenuItem copy = new JMenuItem("Copy");
		//Short-Cut key (Ctrl+C)
		copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
		
		JMenuItem cut = new JMenuItem("Cut");
		//Short-Cut key (Ctrl+X)
		cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
		
		JMenuItem paste = new JMenuItem("Paste");
		//Short-Cut key (Ctrl+V)
		paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,ActionEvent.CTRL_MASK));
		
		JMenuItem selectAll = new JMenuItem("Select All");
		//Short-Cut key (Ctrl+A)
		selectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
		
		//Creating Menu option Format
		JMenu format = new JMenu("Format");
		
		//Creating sub-options for Format
		
		JMenuItem fontFamily = new JMenuItem("Font Family");
		JMenuItem fontStyle = new JMenuItem("Font Stlye");
		JMenuItem fontSize = new JMenuItem("Font Size");
		
		String fonts[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		JList<String> familyList = new JList<>(fonts);

		JList styles = new JList();
		JList sizeList = new JList();
		
		//Allowing user to select only one option
	    familyList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    sizeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    styles.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
	    JTextArea textArea = new JTextArea();
	    
	    textArea.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
	    textArea.setLineWrap(true);
	    textArea.setWrapStyleWord(true);
	    textArea.setSize(920,420);
	    
	    JScrollPane scpane = new JScrollPane(textArea);
	    scpane.setBorder(BorderFactory.createEmptyBorder());
	    scpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    
		/*
		 * JSpinner fontSpin = new JSpinner(); fontSpin.setSize(new Dimension(50,20));
		 * fontSpin.setValue(20); fontSpin.addChangeListener(new ChangeListener() {
		 * 
		 * @Override public void stateChanged(ChangeEvent e) { // TODO Auto-generated
		 * method stub textArea.setFont(new Font(textArea.getFont().getFamily(),
		 * Font.PLAIN,(int) fontSpin.getValue())); } });
		 */
	    
	    //Adding sub-options to main menu options
	    file.add(newDoc);
	    file.add(openDoc);
	    file.add(save);
	    file.add(print);
	    file.add(exit);
	    
	    edit.add(copy);
	    edit.add(cut);
	    edit.add(paste);
	    edit.add(selectAll);
	    
	    format.add(fontFamily);
	    format.add(fontStyle);
	    format.add(fontSize);
	    
	    BottomPanel.add(DetailsOfFile);
	  
		//Adding the Menu options to the MenuBar
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(format);
		
		//Adding Menubar to the frame
		f.setJMenuBar(menuBar);

	    //Setting up the size of frame
	    f.setSize(980, 480);
	   
	    //Setting up the layout of frame
	    f.setLayout(new BorderLayout());
	    f.setLocationRelativeTo(null);
	    
	    //Adding panels in frame
	    f.add(scpane, BorderLayout.CENTER);
	    //f.add(fontSpin);
	    
	    f.add(BottomPanel, BorderLayout.SOUTH);
	    //Setting Frame visible to user
	    f.setVisible(true);
	    
	}
	
	public void addActionEvents() {
		newDoc.addActionListener((ActionListener) this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notepad_UI np1 = new Notepad_UI();
		np1.initUI();
	}

}
