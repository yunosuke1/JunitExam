package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ItemStockTest {

	@Test
	void test() {
		ItemStock itemStock = new ItemStock();
		Item book = new Item("book",100);
		assertEquals(0,itemStock.getNum(book),"初期状態でgetNumメソッドを実行した場合");
	}
	
	@Test
	void test2() {
		ItemStock itemStock = new ItemStock();
		Item book = new Item("book",100);
		
		itemStock.add(book);
		assertEquals(1,itemStock.getNum(book),"初期状態でaddメソッドを実行した場合");
	}

	@Test
	void test3() {
		ItemStock itemStock = new ItemStock();
		Item book = new Item("book",100);
		
		itemStock.add(book);
		itemStock.add(book);
		assertEquals(2,itemStock.getNum(book),"Itemが１つ追加されている状態で、addで同じItemオブジェクトを追加してgetNumメソッドを実行した場合");
	}
	
	@Test
	void test4() {
		ItemStock itemStock = new ItemStock();
		Item book = new Item("book",100);
		Item CD = new Item("cd",50);
		
		itemStock.add(book);
		itemStock.add(CD);
		assertEquals(1,itemStock.getNum(book),"Itemが１つ追加されている状態で、addで異なるItemオブジェクトを追加してgetNumメソッドを実行した場合");
	}
}
