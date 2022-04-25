package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Frame extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private Container c;
	private JLabel title;
	private JLabel name;
	private JTextField tname;
	private JLabel mno;
	private JTextField tmno;
	private JLabel gender;
	private JRadioButton male;
	private JRadioButton female;
	private JLabel doc;
	private JRadioButton doc1;
	private JRadioButton doc2;
	private JRadioButton doc3;
	private JRadioButton doc4;
	private ButtonGroup gengp;
	private ButtonGroup docs;
	private JLabel dob;
	private JComboBox<?> date;
	private JComboBox<?> month;
	private JComboBox<?> year;
	private JLabel age;
	private JLabel time;
	private JComboBox<?> hour;
	private JComboBox<?> min;
	private JComboBox<?> meridiem;
	private JTextField tage;
	private JCheckBox term;
	private JButton sub;
	private JButton reset;
	private JTextArea tout;
	private JLabel res;
	private JTextArea resadd;

	private String dates[]	= { "1", "2", "3", "4", "5","6", "7", "8", "9", "10","11", "12", "13", "14", "15","16", "17", "18", "19", "20",
			"21", "22", "23", "24", "25",
			"26", "27", "28", "29", "30",
			"31" };
	private String months[]= { "Jan", "feb", "Mar", "Apr",
			"May", "Jun", "July", "Aug",
			"Sup", "Oct", "Nov", "Dec" };
	
	private String years[]= { "1983", "1984", "1985","1986",
			"1987", "1988", "1989", "1990",
			"1991", "1992", "1994", "1993",
			"1994","1995", "1996", "1997", "1998",
			"1999", "2000", "2001", "2002","2003",
			"2004","2005","2006","2007","2008","2009",
			"2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022"};
	private  String hours[]= {"1","2","3","4","5","6","7","8","9","10","11","12"};
	private  String mins[]= {"00","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17"
			,"18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37",
			"38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59"};
	private String mer[]= {"AM","PM"};
	public Frame()
	{
		JFrame frame  = new JFrame("Register");
		frame.setBackground(Color.black);
		setTitle("Appointment....");
		setBounds(500, 120, 1000, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("Application Form");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 50);
		title.setLocation(250, 30);
		c.add(title);

		name = new JLabel("Name");
		name.setFont(new Font("Arial", Font.PLAIN, 20));
		name.setSize(100, 20);
		name.setLocation(100, 100);
		c.add(name);

		tname = new JTextField();
		tname.setFont(new Font("Arial", Font.PLAIN, 15));
		tname.setSize(190, 20);
		tname.setLocation(200, 100);
		c.add(tname);

		mno = new JLabel("Mobile");
		mno.setFont(new Font("Arial", Font.PLAIN, 20));
		mno.setSize(100, 20);
		mno.setLocation(100, 150);
		c.add(mno);

		tmno = new JTextField();
		tmno.setFont(new Font("Arial", Font.PLAIN, 15));
		tmno.setSize(150, 20);
		tmno.setLocation(200, 150);
		c.add(tmno);
		
		gender = new JLabel("Gender");
		gender.setFont(new Font("Arial", Font.PLAIN, 20));
		gender.setSize(100, 20);
		gender.setLocation(100, 200);
		c.add(gender);

		male = new JRadioButton("Male");
		male.setFont(new Font("Arial", Font.PLAIN, 15));
		male.setSelected(true);
		male.setSize(75, 20);
		male.setLocation(200, 200);
		c.add(male);

		female = new JRadioButton("Female");
		female.setFont(new Font("Arial", Font.PLAIN, 15));
		female.setSelected(false);
		female.setSize(80, 20);
		female.setLocation(275, 200);
		c.add(female);

		gengp = new ButtonGroup();
		gengp.add(male);
		gengp.add(female);

		dob = new JLabel("DOB");
		dob.setFont(new Font("Arial", Font.PLAIN, 20));
		dob.setSize(100, 20);
		dob.setLocation(100, 250);
		c.add(dob);

		date = new JComboBox<Object>(dates);
		date.setFont(new Font("Arial", Font.PLAIN, 15));
		date.setSize(50, 20);
		date.setLocation(200, 250);
		c.add(date);

		month = new JComboBox<Object>(months);
		month.setFont(new Font("Arial", Font.PLAIN, 15));
		month.setSize(60, 20);
		month.setLocation(250, 250);
		c.add(month);

		year = new JComboBox<Object>(years);
		year.setFont(new Font("Arial", Font.PLAIN, 15));
		year.setSize(60, 20);
		year.setLocation(320, 250);
		c.add(year);
		
		age = new JLabel("Age");
		age.setFont(new Font("Arial", Font.PLAIN, 20));
		age.setSize(110, 20);
		age.setLocation(100, 300);
		c.add(age);

		tage = new JTextField();
		tage.setFont(new Font("Arial", Font.PLAIN, 15));
		tage.setSize(190, 20);
		tage.setLocation(200, 300);
		c.add(tage);
		
		doc = new JLabel("Select The doctor");
		doc.setFont(new Font("Arial", Font.PLAIN, 15));
		doc.setSize(250, 20);
		doc.setLocation(100, 350);
		c.add(doc);
		
		doc1 = new JRadioButton("Dr. David ---> Orthopedic");
		doc1.setFont(new Font("Arial", Font.PLAIN, 15));
		doc1.setSelected(true);
		doc1.setSize(250, 20);
		doc1.setLocation(100, 380);
		c.add(doc1);
		
		doc2 = new JRadioButton("Dr. Sabitha ---> Gynecologist");
		doc2.setFont(new Font("Arial", Font.PLAIN, 15));
		doc2.setSelected(true);
		doc2.setSize(250, 20);
		doc2.setLocation(100, 420);
		c.add(doc2);
		
		doc3 = new JRadioButton("Dr. Leona ---> Pharmacist");
		doc3.setFont(new Font("Arial", Font.PLAIN, 15));
		doc3.setSelected(true);
		doc3.setSize(250, 20);
		doc3.setLocation(100, 460);
		c.add(doc3);
		
		doc4 = new JRadioButton("Dr. Sheetal ---> Cardiothoracic");
		doc4.setFont(new Font("Arial", Font.PLAIN, 15));
		doc4.setSelected(true);
		doc4.setSize(250, 20);
		doc4.setLocation(100, 500);
		c.add(doc4);
		
		docs = new ButtonGroup();
		docs.add(doc1);
		docs.add(doc2);
		docs.add(doc3);
		docs.add(doc4);
		
		time = new JLabel("Time");
		time.setFont(new Font("Arial", Font.PLAIN, 20));
		time.setSize(100, 20);
		time.setLocation(100, 550);
		c.add(time);

		hour = new JComboBox<Object>(hours);
		hour.setFont(new Font("Arial", Font.PLAIN, 15));
		hour.setSize(50, 20);
		hour.setLocation(200, 550);
		c.add(hour);

		min = new JComboBox<Object>(mins);
		min.setFont(new Font("Arial", Font.PLAIN, 15));
		min.setSize(60, 20);
		min.setLocation(250, 550);
		c.add(min);
		
		meridiem = new JComboBox<Object>(mer);
		meridiem.setFont(new Font("Arial", Font.PLAIN, 15));
		meridiem.setSize(60, 20);
		meridiem.setLocation(310, 550);
		c.add(meridiem);
		
		sub = new JButton("Submit");
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setSize(100, 20);
		sub.setLocation(150, 650);
		sub.addActionListener(this);
		c.add(sub);

		reset = new JButton("Reset");
		reset.setFont(new Font("Arial", Font.PLAIN, 15));
		reset.setSize(100, 20);
		reset.setLocation(270, 650);
		reset.addActionListener(this);
		c.add(reset);

		tout = new JTextArea();
		tout.setFont(new Font("Arial", Font.PLAIN, 15));
		tout.setSize(300, 400);
		tout.setLocation(500, 100);
		tout.setLineWrap(true);
		tout.setEditable(false);
		c.add(tout);

		res = new JLabel("");
		res.setFont(new Font("Arial", Font.PLAIN, 20));
		res.setSize(500, 25);
		res.setLocation(100, 500);
		c.add(res);

		resadd = new JTextArea();
		resadd.setFont(new Font("Arial", Font.PLAIN, 15));
		resadd.setSize(200, 75);
		resadd.setLocation(580, 175);
		resadd.setLineWrap(true);
		c.add(resadd);
		
		 term = new JCheckBox("Accept Terms And Conditions.");
	     term.setFont(new Font("Arial", Font.PLAIN, 15));
         term.setSize(250, 20);
         term.setLocation(100,580);
	     c.add(term);
	     term.addActionListener(this);
	     c.add(term);
	     
	     c.setLayout(null);
	     setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == sub) {
			if (term.isSelected()) {
				String data1,doctor = null;
				String data= "Name : "+ tname.getText() + "\n"+ "Mobile : "+ tmno.getText() + "\n";
				//String data5="Aadhar :"+tano.getText()+"\n";
				if (male.isSelected())
					data1 = "Gender : Male"+ "\n";
				else
					data1 = "Gender : Female"+ "\n";
				if(doc1.isSelected())
					doctor="Dr. David ---> Orthopedi"+"\n";
				else if (doc2.isSelected())
					doctor="Dr. Sabitha ---> Gynecologist"+"\n";
				else if(doc3.isSelected())
					doctor="Dr. Leona ---> Pharmacist"+"\n";
				else
					doctor="Dr. Sheetal ---> Cardiothoracic surgeon"+"\n";
				String data2= "DOB : "+ (String)date.getSelectedItem()+ "/" + (String)month.getSelectedItem()+"/" + (String)year.getSelectedItem()+ "\n";
				String data4="Age :"+(String)tage.getText()+"\n";
				String data5="Appointment time:"+(String)hour.getSelectedItem()+":"+(String)min.getSelectedItem()+":"+(String)meridiem.getSelectedItem()+"\n";
				tout.setText(data + /*data5+*/ data1 + data2+data4+doctor+data5);
				
				tout.setEditable(false);
			}
			else {
				tout.setText("");
				resadd.setText("");
				term.setAction(null);
			}
		}
			
		else if (e.getSource() == reset) {
			String def = "";
			tname.setText(def);
			tmno.setText(def);
			tage.setText(def);
			res.setText(def);
			tout.setText(def);
			term.setSelected(false);
			date.setSelectedIndex(0);
			month.setSelectedIndex(0);
			year.setSelectedIndex(0);
			resadd.setText(def);
		}
	}
}

// Driver Code
class Registration {

	public static void main(String[] args) throws Exception
	{
		new Frame();
	}
}
