package hw;

import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalcTests {
	
	Calc calculator_form;
	CalculatorEngine calcEng;
	
	@BeforeEach
	void setUp() {
		 calculator_form = new Calc();	
		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	@Test
	void testSUM() {
		calculator_form.displayField.setText("");
		calculator_form.button2.doClick();
		calculator_form.buttonPlus.doClick();
		calculator_form.button3.doClick();
		calculator_form.buttonEqual.doClick();	
		assertEquals("5.0", calculator_form.displayField.getText());
	}
	
	@Test
	void testSUB() {
		calculator_form.displayField.setText("");
		calculator_form.button2.doClick();
		calculator_form.buttonMinus.doClick();
		calculator_form.button3.doClick();
		calculator_form.buttonEqual.doClick();	
		assertEquals("-1.0", calculator_form.displayField.getText());
	}
	
	@Test
	void testDiv() {
		calculator_form.displayField.setText("");
		calculator_form.button2.doClick();
		calculator_form.buttonDivide.doClick();
		calculator_form.button0.doClick();
		calculator_form.buttonEqual.doClick();
		assertEquals("На ноль делить нельзя", calculator_form.displayField.getText());
	}
	
	@Test
	void testMul() {
		calculator_form.displayField.setText("");
		calculator_form.button2.doClick();
		calculator_form.buttonMultiply.doClick();
		calculator_form.button0.doClick();
		calculator_form.buttonEqual.doClick();	
		assertEquals("0.0", calculator_form.displayField.getText());
	}
	
	
}
