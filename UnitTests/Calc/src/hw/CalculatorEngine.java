package hw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;


public class CalculatorEngine implements ActionListener {
	
	Calc parent; 
	char selectedAction = ' ';
	
	double currentResult =0;

	double displayValue=0;

	CalculatorEngine(Calc parent){
		this.parent = parent;
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		JButton clickedButton = (JButton) e.getSource();
		String dispFieldText=parent.displayField.getText();
		
		if (!(dispFieldText.isEmpty())){			
			displayValue= Double.parseDouble(dispFieldText);
		}
		
		 //Object src = e.getSource();
		
		switch(clickedButton.getText()) {
			case "+" :{
				actionButtonPressed('+');
				break;
			}
			case "-" :{
				actionButtonPressed('-');
				break;
			}
			case "*" :{
				actionButtonPressed('*');
				break;
			}
			case "/" :{
				actionButtonPressed('/');
				break;
			}
			case "=" :{
				if(selectedAction!=' ') {
				equalsPressedButton();
				}				
				break;
			}
			default:
				parent.displayField.setText(parent.displayField.getText().concat(clickedButton.getText()));
				break;
		}
	}
	
	public void perfAction() {
		switch (selectedAction) {
			case '+':{
				actionADD(currentResult, displayValue);
				break;
			}
			case '-':{
				actionSub(currentResult, displayValue);
				break;
			}
			case '*':{
				actionMul(currentResult, displayValue);
				break;
			}
			case '/':{
				actionDiv(currentResult, displayValue);
				break;
			}
			default:
				break;
		}
	}
	
	public void selAction(char action) {
		this.selectedAction = action;
	}
	
	public void setDispVal(double val) {
		this.displayValue = val;
	}
	
	public double getDispVal() {
		return this.displayValue;
	}
	
	public void actionButtonPressed(char action) {
		parent.displayField.setText("");
		this.currentResult = displayValue;
		selAction(action);
	}
	
	public void equalsPressedButton() {		
		perfAction();
	}
	
	//*****************Actions********************
	public void actionADD(double a, double b ) {		
		currentResult= a+b;
		parent.displayField.setText(""+currentResult);
	}
	public void actionSub(double a, double b ) {
		currentResult= a-b;
		parent.displayField.setText(""+currentResult);
	}
	public void actionDiv(double a, double b ) {
		if (b==0) {
			parent.displayField.setText("На ноль делить нельзя");
		}else {currentResult= a/b;parent.displayField.setText(""+currentResult);}
	}
	public void actionMul(double a, double b ) {
		currentResult= a*b;
		parent.displayField.setText(""+currentResult);
	}	
	
}
