package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() throws Exception{
		Calculator calculator = new Calculator();
		assertThrows(IllegalArgumentException.class,() -> calculator.divide(10, 0),"divideメソッドの第二引数が0の場合");
	}

}
