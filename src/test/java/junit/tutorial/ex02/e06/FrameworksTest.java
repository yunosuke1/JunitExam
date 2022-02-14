package junit.tutorial.ex02.e06;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FrameworksTest {

	@ParameterizedTest
	@CsvSource({
		"GlassFish,Oracle",
		"GlassFish,DB2",
		"GlassFish,PostgreSQL",
		"GlassFish,MySQL",
		"JBoss,DB2",
		"JBoss,PostgreSQL",
		"Tomcat,MySQL",
	})
	void test1(ApplicationServer appServer,Database db) {
		assertTrue(Frameworks.isSupport(appServer,db));
	}
	
	@ParameterizedTest
	@CsvSource({
		"JBoss,Oracle",
		"JBoss,MySQL",
		"Tomcat,Oracle",
		"Tomcat,DB2",
		"Tomcat,PostgreSQL",
	})
	void test2(ApplicationServer appServer,Database db) {
		assertFalse(Frameworks.isSupport(appServer,db));
	}

}
