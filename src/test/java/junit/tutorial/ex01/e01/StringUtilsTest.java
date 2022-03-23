package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@Test
	void test1() {
		assertEquals("aa",StringUtils.toSnakeCase("aaa"),"toSnakeCaseの引数がaaaのケース");
	}
	
	@Test
	void test2() {
		assertEquals("hello_world",StringUtils.toSnakeCase("HelloWorld"),"toSnakeCaseの引数がHelloWorldのケース");
	}
	
	@Test
		void test3() {
			assertEquals("practice_junit",StringUtils.toSnakeCase("practiceJunit"),"toSnakeCaseの引数がHelloWorldのケース");
		}

}