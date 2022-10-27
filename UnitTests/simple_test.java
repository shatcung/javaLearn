package hw;


import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class simple_test {

	simple_task simple;
	
	@BeforeEach
	void setUp() {
		simple = new simple_task();
	}

	@Test
	void testPositive() {
		assertEquals(1, simple_task.maxval(2, 54, 20, 10),"Количество максимальных чисел 1");
		
	}
	@Test
	void testNegative() {
		assertEquals(0,simple_task.maxval(2, 54, 20, 10),"Количество максимальных чисел 0");
	}	

}
