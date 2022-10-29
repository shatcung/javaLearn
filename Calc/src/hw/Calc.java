package hw;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Calc {

	JButton button0=new JButton("0");
	JButton button1=new JButton("1");
	JButton button2=new JButton("2");
	JButton button3=new JButton("3");
	JButton button4=new JButton("4");
	JButton button5=new JButton("5");
	JButton button6=new JButton("6");
	JButton button7=new JButton("7");
	JButton button8=new JButton("8");
	JButton button9=new JButton("9");
	
	JButton buttonPoint = new JButton(".");
	JButton buttonEqual=new JButton("=");
	JButton buttonPlus=new JButton("+");
	JButton buttonMinus=new JButton("-");
	JButton buttonDivide=new JButton("/");
	JButton buttonMultiply=new JButton("*");
	JPanel windowContent = new JPanel();
	JTextField displayField = new JTextField(30);

	public CalculatorEngine calcEng;
	
	Calc(){
		
	BorderLayout bl = new BorderLayout();
	
	windowContent.setLayout(bl);
	displayField = new JFormattedTextField();
	displayField.setHorizontalAlignment(SwingConstants.RIGHT);
	
	windowContent.add("North",displayField);
	
	JPanel p1 = new JPanel();
	GridLayout gl =new GridLayout(4,3);
	p1.setLayout(gl);
	
	p1.add(button1);
	p1.add(button2);
	p1.add(button3);
	p1.add(button4);
	p1.add(button5);
	p1.add(button6);
	p1.add(button7);
	p1.add(button8);
	p1.add(button9);
	p1.add(button0);
	p1.add(buttonPoint);
	p1.add(buttonEqual);
	
	windowContent.add("Center",p1);
	
	JPanel p2 = new JPanel();
	GridLayout gl2 =new GridLayout(4,1);
	
	p2.setLayout(gl2);
	p2.add(buttonPlus);
	p2.add(buttonMinus);
	p2.add(buttonMultiply);
	p2.add(buttonDivide);
	
	windowContent.add("East",p2);
	
	JFrame frame = new JFrame("Calc");
	frame.setContentPane(windowContent);
	
	frame.pack();
	
	frame.setVisible(true);

	 	calcEng = new CalculatorEngine(this);
		button0.addActionListener(calcEng);
		button1.addActionListener(calcEng);
		button2.addActionListener(calcEng);
		button3.addActionListener(calcEng);
		button4.addActionListener(calcEng);
		button5.addActionListener(calcEng);
		button6.addActionListener(calcEng);
		button7.addActionListener(calcEng);
		button8.addActionListener(calcEng);
		button9.addActionListener(calcEng);
		
		buttonPoint.addActionListener(calcEng);
		buttonPlus.addActionListener(calcEng);
		buttonMinus.addActionListener(calcEng);
		buttonDivide.addActionListener(calcEng);
		buttonMultiply.addActionListener(calcEng);
		buttonEqual.addActionListener(calcEng);
	}
	
	public static void main(String[] args) {	
	Calc calc = new Calc();
	}
}
