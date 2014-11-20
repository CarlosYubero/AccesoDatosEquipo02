package ut01.act06;

import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;



	public class Main implements ActionListener {
		Main() {
	    JFrame f = new JFrame("Menu Demo");
	    f.setSize(320, 300);

	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JMenuBar jmb = new JMenuBar();

	    JMenu jmFile = new JMenu("Departamentos");
	    JMenu Dep1 = new JMenu("Dep1");
	    JMenuItem media1= new JMenuItem("Sueldo Medio");
	    JMenuItem num1= new JMenuItem("Numero Empleados");
	    JMenuItem media2= new JMenuItem("Sueldo Medio");
	    JMenuItem num2= new JMenuItem("Numero Empleados");
	    JMenuItem media3= new JMenuItem("Sueldo Medio");
	    JMenuItem num3= new JMenuItem("Numero Empleados");
	    //JMenuItem n=new JMenuItem("");
	    JMenu Dep2 = new JMenu("Dep2");
	    JMenu Dep3 = new JMenu("Dep3");	    
		    
		    Dep1.add(media1);
		    Dep1.add(num1);
		    jmFile.add(Dep1);
		    
		    
		    Dep2.add(media2);
		    Dep2.add(num2);
		    jmFile.add(Dep2);
		    
		    
		    Dep3.add(media3);
		    Dep3.add(num3);
		    jmFile.add(Dep3);
		    
		    //jmFile.addSeparator();
		    jmb.add(jmFile);

	    JMenu jmOptions = new JMenu("Empleados");
	    JMenu a = new JMenu("Lista1");
		    JMenuItem Emp1 = new JMenuItem("Emp1");
		    JMenuItem Emp2 = new JMenuItem("Emp2");
		    JMenuItem Emp3 = new JMenuItem("Emp3");
	    a.add(Emp1);
	    a.add(Emp2);
	    a.add(Emp3);
	    jmOptions.add(a);

	    JMenu e = new JMenu("Lista2");
		    e.add(new JMenuItem("Emp4"));
		    e.add(new JMenuItem("Emp5"));
	    jmOptions.add(e);

	    jmb.add(jmOptions);

	    JMenu jmHelp = new JMenu("Help");
	    JMenuItem jmiAbout = new JMenuItem("About");
	    jmHelp.add(jmiAbout);
	    jmb.add(jmHelp);

	    Dep1.addActionListener(this);
	    Dep2.addActionListener(this);
	    Dep3.addActionListener(this);
	    Emp1.addActionListener(this);
	    Emp2.addActionListener(this);
	    Emp3.addActionListener(this);
	    jmiAbout.addActionListener(this);

	    f.setJMenuBar(jmb);
	    f.setVisible(true);
	    
	    
	    
	  }
	  public void actionPerformed(ActionEvent ae) {
	    String comStr = ae.getActionCommand();
	    System.out.println(comStr + " Selected");
	  }
	  public static void main(String args[]) {
	    new Main();
	  }
	}
