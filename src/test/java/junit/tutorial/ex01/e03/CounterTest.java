package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CounterTest {

	@Test
	void test() {
		Counter counter = new Counter();
		assertEquals(1,counter.increment(),"初期状態でincrementメソッドを実行した場合");
	}
	
	@Test
	void test2() {
		Counter counter = new Counter();
		counter.increment();
		assertEquals(2,counter.increment(),"incrementメソッドを1回実行した状態でincrementメソッドを実行した場合");
	}
	
	@Test
	void test3() {
		Counter counter = new Counter();
		for(int i=1;i<=50;i++) {
			counter.increment();
		}
		assertEquals(51,counter.increment(),"incrementメソッドを51回実行した状態でincrementメソッドを実行した場合");
	}

}
