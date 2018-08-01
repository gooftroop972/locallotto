package lotto;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;

//test again
public class FirstGui extends JFrame {
	/**
	 * 
	 */
	// NO idea what this is but Dev Studio says I need it?????
	private static final long serialVersionUID = 1L;
	//
	private JButton button1 = new JButton("Generate!!!");
	private JButton button2= new JButton("Generate!!!");
	private JButton button3= new JButton("Generate!!!");
	private JLabel promptLabel1 = new JLabel("Press button to generate random numbers:");
	private JLabel promptLabel2 = new JLabel("Press button to generate random numbers");
	private JLabel promptLabel3 = new JLabel("Press button to generate random numbers");
	private JLabel b1_1Label  = new JLabel("Ball 1:  ");
	private JLabel b1_2Label  = new JLabel("Ball 1:  ");;
	private JLabel b1_3Label  = new JLabel("Ball 1:  ");;
	private JTextField b1_1textfield = new JTextField(2);
	private JTextField b1_2textfield = new JTextField(2);
	private JTextField b1_3textfield = new JTextField(2);
	private JLabel b2_1Label = new JLabel("Ball 2:  ");
	private JLabel b2_2Label = new JLabel("Ball 2:  ");
	private JLabel b2_3Label = new JLabel("Ball 2:  ");
	private JTextField b2_1textfield = new JTextField(2);
	private JTextField b2_2textfield = new JTextField(2);
	private JTextField b2_3textfield = new JTextField(2);
	private JLabel b3_1Label = new JLabel("Ball 3:  ");
	private JLabel b3_2Label = new JLabel("Ball 3:  ");
	private JLabel b3_3Label = new JLabel("Ball 3:  ");
	private JTextField b3_1textfield = new JTextField(2);
	private JTextField b3_2textfield = new JTextField(2);
	private JTextField b3_3textfield = new JTextField(2);
	private JLabel b4_1Label = new JLabel("Ball 4:  ");
	private JLabel b4_2Label = new JLabel("Ball 4:  ");
	private JLabel b4_3Label = new JLabel("Ball 4:  ");
	private JTextField b4_1textfield = new JTextField(2);
	private JTextField b4_2textfield = new JTextField(2);
	private JTextField b4_3textfield = new JTextField(2);
	private JLabel b5_1Label = new JLabel("Ball 5:  ");
	private JLabel b5_2Label = new JLabel("Ball 5:  ");
	private JLabel b5_3Label = new JLabel("Ball 5:  ");
	private JTextField b5_1textfield = new JTextField(2);
	private JTextField b5_2textfield = new JTextField(2);
	private JTextField b5_3textfield = new JTextField(2);
	private JLabel pb_1Label = new JLabel("Ball P:  ");
	private JLabel pb_2Label = new JLabel("Ball P:  ");
	private JLabel pb_3Label = new JLabel("Ball P:  ");
	private JTextField pb_1textfield = new JTextField(2);
	private JTextField pb_2textfield = new JTextField(2);
	private JTextField pb_3textfield = new JTextField(2);
	
	private  JSeparator sep = new JSeparator(JSeparator.HORIZONTAL);
	private  JSeparator sep1 = new JSeparator(JSeparator.HORIZONTAL);
	
	public FirstGui() {
		//setLayout(new FlowLayout());
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		// True Random Numbers
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 1;
		add(b1_1Label,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 0;
		add(b2_1Label,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 0;
		add(b3_1Label,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 0;
		add(b4_1Label,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 0;
		add(b5_1Label,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 0;
		add(pb_1Label,c);
		
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		add(b1_1textfield,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 1;
		add(b2_1textfield,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 1;
		add(b3_1textfield,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 1;
		add(b4_1textfield,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 1;
		add(b5_1textfield,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 1;
		add(pb_1textfield,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 6;
		add(promptLabel1,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 3;
		add(button1,c);
		
		sep.setPreferredSize(new Dimension(6,2));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 1;
		c.gridx = 0;
		c.gridy = 4;
		add(sep,c);
		
	/*	*/
		// Random numbers based on chosen numbers
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 6;
		c.gridwidth = 1;
		c.weighty = 0;
		add(b1_2Label,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 6;
		add(b2_2Label,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 6;
		add(b3_2Label,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 6;
		add(b4_2Label,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 6;
		add(b5_2Label,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 6;
		add(pb_2Label,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 7;
		add(b1_2textfield,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 7;
		add(b2_2textfield,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 7;
		add(b3_2textfield,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 7;
		add(b4_2textfield,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 7;
		add(b5_2textfield,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 7;
		add(pb_2textfield,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 8;
		c.gridwidth = 6;
		add(promptLabel2,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 9;
		add(button2,c);
		
		sep1.setPreferredSize(new Dimension(6,2));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 1;
		c.gridx = 0;
		c.gridy = 10;
		add(sep1,c);
		
		// Random numbers based on chosen numbers
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 12;
		c.gridwidth = 1;
		c.weighty = 0;
		add(b1_3Label,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 12;
		add(b2_3Label,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 12;
		add(b3_3Label,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 12;
		add(b4_3Label,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 12;
		add(b5_3Label,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 12;
		add(pb_3Label,c);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 13;
		add(b1_3textfield,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 13;
		add(b2_3textfield,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 13;
		add(b3_3textfield,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 13;
		add(b4_3textfield,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 13;
		add(b5_3textfield,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 13;
		add(pb_3textfield,c);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 14;
		c.gridwidth = 6;
		add(promptLabel3,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 15;
		add(button3,c);

		sep1.setPreferredSize(new Dimension(6,2));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 1;
		c.gridx = 0;
		c.gridy = 16;
		add(sep1,c);
		
		
		event1 e1 = new event1();
		button1.addActionListener(e1);
		event2 e2 = new event2();
		button2.addActionListener(e2);
		event3 e3 = new event3();
		button3.addActionListener(e3);
	}
	
	
	public class event1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			ArrayList<Integer> list = new ArrayList<Integer>();
	        for (int i=1; i<70; i++) {
	            list.add(new Integer(i));
	        }
	        Collections.shuffle(list);
			b1_1textfield.setText(Integer.toString(list.get(0)));
			b2_1textfield.setText(Integer.toString(list.get(4)));
			b3_1textfield.setText(Integer.toString(list.get(9)));
			b4_1textfield.setText(Integer.toString(list.get(14)));
			b5_1textfield.setText(Integer.toString(list.get(19)));
			ArrayList<Integer> list1 = new ArrayList<Integer>();
	        for (int i=1; i<27; i++) {
	            list1.add(new Integer(i));
	        }
	        Collections.shuffle(list1);
			pb_1textfield.setText(Integer.toString(list1.get(5)));
		}
		
	}
	
	public class event2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			ArrayList<Integer> list = new ArrayList<Integer>();
	        for (int i=1; i<70; i++) {
	            list.add(new Integer(i));
	        }
	        Collections.shuffle(list);
			b1_2textfield.setText(Integer.toString(list.get(0)));
			b2_2textfield.setText(Integer.toString(list.get(4)));
			b3_2textfield.setText(Integer.toString(list.get(9)));
			b4_2textfield.setText(Integer.toString(list.get(14)));
			b5_2textfield.setText(Integer.toString(list.get(19)));
			ArrayList<Integer> list1 = new ArrayList<Integer>();
	        for (int i=1; i<27; i++) {
	            list1.add(new Integer(i));
	        }
	        Collections.shuffle(list1);
			pb_2textfield.setText(Integer.toString(list1.get(5)));
		}
		
	}
	
	public class event3 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			ArrayList<Integer> list = new ArrayList<Integer>();
	        for (int i=1; i<70; i++) {
	            list.add(new Integer(i));
	        }
	        Collections.shuffle(list);
			b1_3textfield.setText(Integer.toString(list.get(0)));
			b2_3textfield.setText(Integer.toString(list.get(4)));
			b3_3textfield.setText(Integer.toString(list.get(9)));
			b4_3textfield.setText(Integer.toString(list.get(14)));
			b5_3textfield.setText(Integer.toString(list.get(19)));
			ArrayList<Integer> list1 = new ArrayList<Integer>();
	        for (int i=1; i<27; i++) {
	            list1.add(new Integer(i));
	        }
	        Collections.shuffle(list1);
			pb_3textfield.setText(Integer.toString(list1.get(5)));
		}
		
	}
	
}
