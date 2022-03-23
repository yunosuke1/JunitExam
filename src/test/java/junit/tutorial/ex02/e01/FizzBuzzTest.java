package junit.tutorial.ex02.e01;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	void test() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		List<String> expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11",
				"Fizz", "13", "14", "FizzBuzz", "16");
		
		
		assertIterableEquals(expected,fizzBuzz.createFizzBuzzList(16),"createFizzBuzzメソッドの引数を16にして実行した場合");
	}

}
