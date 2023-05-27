import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.List;

public class a_b extends JFrame {

 private JPanel contentPane;
 private JTextField a;
 private JTextField b;

 public static void main(String[] args) {
 EventQueue.invokeLater(new Runnable() {
 public void run() {
 try {
 a_b frame = new a_b();
 frame.setVisible(true);
 } catch (Exception e) {
 e.printStackTrace();
 }
 }
 });
 }
 public a_b() {
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setBounds(100, 100, 450, 345);
 
 contentPane = new JPanel();
 contentPane.setBackground(Color.GRAY);
 contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
 setContentPane(contentPane);
 contentPane.setLayout(null);
 
 JLabel lblNewLabel = new JLabel("a=");
 lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
 lblNewLabel.setBounds(25, 59, 46, 21);
 contentPane.add(lblNewLabel);
 
 JLabel lblB = new JLabel("b=");
 lblB.setFont(new Font("Tahoma", Font.PLAIN, 20));
 lblB.setBounds(236, 60, 46, 18);
 contentPane.add(lblB);
 
 a = new JTextField();
 a.setBounds(61, 60, 86, 20);
 contentPane.add(a);
 a.setColumns(10);
 
 b = new JTextField();
 b.setColumns(10);
 b.setBounds(271, 60, 86, 20);
 contentPane.add(b);
 
 JLabel lblNewLabel_1 = new JLabel("\u0447\u0435\u0442\u043D\u0438");
 lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
 lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
 lblNewLabel_1.setBounds(61, 118, 86, 21);
 contentPane.add(lblNewLabel_1);
 
 JLabel lblNewLabel_1_1 = new JLabel("\u043D\u0435\u0447\u0435\u0442\u043D\u0438");
 lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
 lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
 lblNewLabel_1_1.setBounds(271, 118, 86, 21);
 contentPane.add(lblNewLabel_1_1);
 
 JComboBox comboBox = new JComboBox();
 comboBox.setBounds(61, 163, 86, 22);
 contentPane.add(comboBox);
 
  JList list = new JList();
 list.setBounds(257, 150, 110, 60);
 contentPane.add(list);
 
 list.setModel(new AbstractListModel() {
 	String[] values = new String[] {};
 	public int getSize() {
 		return values.length;
 	}
 	public Object getElementAt(int index) {
 		return values[index];
 	}
 });
 
 list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
 list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
 list.setVisibleRowCount(-1);
 contentPane.add(list);
 list.setBackground(new Color(224, 255, 255));
 list.setFont(new Font("Tahoma", Font.BOLD, 25));
 
 DefaultListModel n=new DefaultListModel ();
 
 JButton btnNewButton = new JButton("\u043F\u0440\u0435\u043C\u0435\u0441\u0442\u0438");
 btnNewButton.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 int aa,bb;
 aa=Integer.parseInt(a.getText());
 bb=Integer.parseInt(b.getText());
 for (int i=aa;i<=bb;i++) {
 if (i%2==0)comboBox.addItem(i);
 else 
 n.addElement(i+", ");
 list.setModel(n);
 }
 }
 });
 
 btnNewButton.setBounds(163, 231, 99, 23);
 contentPane.add(btnNewButton);
 }
}
