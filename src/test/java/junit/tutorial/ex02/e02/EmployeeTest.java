package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void test() throws UnsupportedEncodingException {
//		文字列で指定
//		String str = "Ichiro,Tanaka,ichiro@example.com";
//		InputStream input = new ByteArrayInputStream(str.getBytes("utf-8"));
		
		try{
			InputStream input = new FileInputStream("./src/main/java/junit/tutorial/ex02/e02/Employee.txt");
			List<Employee> result = Employee.load(input);
			assertEquals("Ichiro",result.get(0).getFirstName(),"Employeeファイルを指定してloadメソッドを実行した場合");
		}catch(FileNotFoundException e){
			e.printStackTrace();
			fail("失敗");
		}
	}

}
