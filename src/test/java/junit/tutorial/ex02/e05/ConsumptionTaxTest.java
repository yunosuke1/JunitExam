package junit.tutorial.ex02.e05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ConsumptionTaxTest {

	@ParameterizedTest
	@CsvSource({
		"5,100,105",
		"5,3000,3150",
		"10,50,55",
		"5,50,52",
		"3,50,51"
	})
	
	void test(int tax,int price,int expected) {
		ConsumptionTax consumptionTax = new ConsumptionTax(tax);
		assertEquals(expected,consumptionTax.apply(price),"税率と値段と期待値を設定してテスト");
	}

}
