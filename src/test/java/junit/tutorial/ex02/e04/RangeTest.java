package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RangeTest {

	@ParameterizedTest
	@ValueSource(doubles = {0.0 ,10.5})
	void test(double num) {
		Range range = new Range(0.0,10.5);
		assertTrue(range.contains(num),"min=0.0、max=10.5のRangeで、引数が0.0と10.5の場合");
	}
	
	@ParameterizedTest
	@ValueSource(doubles = {-0.1 ,10.6})
	void test2(double num) {
		Range range = new Range(0.0,10.5);
		assertFalse(range.contains(num),"min=0.0、max=10.5のRangeで、引数が-0.1と10.6の場合");
	}

	@ParameterizedTest
	@ValueSource(doubles = {-5.1,5.1})
	void test3(double num) {
		Range range = new Range(-5.1,5.1);
		assertTrue(range.contains(num),"min=-5.1、max=5.1のRangeで、引数が-5.1と5.1の場合");
	}
	
	@ParameterizedTest
	@ValueSource(doubles = {-5.2,5.2})
	void test4(double num) {
		Range range = new Range(-5.1,5.1);
		assertFalse(range.contains(num),"min=-5.1、max=5.1のRangeで、引数が-5.2と5.2の場合");
	}
}
