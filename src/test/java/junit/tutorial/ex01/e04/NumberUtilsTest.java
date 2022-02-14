package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class NumberUtilsTest {

	@Test
	void test() {
		assertTrue(NumberUtils.isEven(10),"isEvenメソッドの引数が10の場合");
	}

	@Test
	void test2() {
		assertFalse(NumberUtils.isEven(7),"isEvenメソッドの引数が7の場合");
	}
}
