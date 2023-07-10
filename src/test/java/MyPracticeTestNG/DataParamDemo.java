package MyPracticeTestNG;

import org.testng.annotations.Test;

public class DataParamDemo {
	
	public Object[][] input() {
		
		return new Object[][]
				{{"CBE","BLR"},
				{"BLR","POY"},
				{"POY","BLR"}};
	}
	
	@Test
	public void test(String name,String password) {
		System.out.println("User name is :-"  +name+ "" + "Password is :- " +password);
	}

}
