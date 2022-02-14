package junit.tutorial.ex02.e01;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	void test() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("Fizz");
		list.add("4");
		list.add("Buzz");
		list.add("Fizz");
		list.add("7");
		list.add("8");
		list.add("Fizz");
		list.add("Buzz");
		list.add("11");
		list.add("Fizz");
		list.add("13");
		list.add("14");
		list.add("FizzBuzz");
		list.add("16");
		
		assertIterableEquals(list,fizzBuzz.createFizzBuzzList(16),"createFizzBuzzメソッドの引数を16にして実行した場合");
	}

}
